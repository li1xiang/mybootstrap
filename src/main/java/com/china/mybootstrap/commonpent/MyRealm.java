package com.china.mybootstrap.commonpent;

import com.china.mybootstrap.entity.Usr;
import com.china.mybootstrap.service.RoleService;
import com.china.mybootstrap.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class MyRealm extends AuthorizingRealm {
    private final  static Logger log = LoggerFactory.getLogger(MyRealm.class);
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        log.info("用户权限验证开始");
        Usr usr=(Usr)principalCollection.getPrimaryPrincipal();
        if(null != usr){
            SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();


        }
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        log.info("用户登录验证");
        String userName  =(String) authenticationToken.getPrincipal();
        return null;
    }
}
