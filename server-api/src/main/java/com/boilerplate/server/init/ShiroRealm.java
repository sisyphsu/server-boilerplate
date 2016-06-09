package com.boilerplate.server.init;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * 权限认证具体实现
 * Created by sulin on 16/6/6.
 */
public class ShiroRealm extends AuthorizingRealm {

    /**
     * 获取用户角色及其可访问的资源
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String loginName = SecurityUtils.getSubject().getPrincipal().toString();
        if (loginName == null) {
            // TODO
        }
        return null;
    }

    /**
     * 获取指定用户的认证信息，shiro需要拿着它与login信息比对
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // TODO
        return null;
    }

}
