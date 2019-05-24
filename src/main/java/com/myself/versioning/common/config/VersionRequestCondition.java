package com.myself.versioning.common.config;

import org.springframework.web.servlet.mvc.condition.RequestCondition;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类名称：VersionRequestCondition<br>
 * 类描述：<br>
 * 创建时间：2019年05月21日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
public class VersionRequestCondition implements RequestCondition<VersionRequestCondition> {
    private final static Pattern VERSION_PREFIX_PATTERN = Pattern.compile("v(\\d+)/");
    private int version;

    public VersionRequestCondition(int version) {
        this.version = version;
    }

    @Override
    public VersionRequestCondition combine(VersionRequestCondition versionCondition) {
        return new VersionRequestCondition(versionCondition.getVersion());
    }

    @Override
    public VersionRequestCondition getMatchingCondition(HttpServletRequest httpServletRequest) {
        Matcher m = VERSION_PREFIX_PATTERN.matcher(httpServletRequest.getRequestURI());
        if (m.find()) {
            int version = Integer.parseInt(m.group(1));
            if (version >= this.version) {
                return this;
            }
        }
        return null;
    }

    @Override
    public int compareTo(VersionRequestCondition versionCondition, HttpServletRequest httpServletRequest) {
        return versionCondition.getVersion() - this.version;
    }

    public int getVersion() {
        return version;
    }
}
