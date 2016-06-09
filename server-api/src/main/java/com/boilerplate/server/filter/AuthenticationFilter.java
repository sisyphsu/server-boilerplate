package com.boilerplate.server.filter;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 权限过滤，替换shiro默认的权限过滤，返回json
 * Created by sulin on 16/6/8.
 */
public class AuthenticationFilter extends FormAuthenticationFilter {

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        // TODO 输出错误json数据
        return super.onAccessDenied(request, response, mappedValue);
    }
}
