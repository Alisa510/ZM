package com.zm.erp.config;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

@Component
public class MyRealm extends AuthorizingRealm {
	
//	@Autowired
//	private AccountService accountService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// 授权类
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		
//		// 获取user信息
//		String userName = (String) principals.getPrimaryPrincipal();
//		User user = accountService.getUserByName(userName);
//		if (user == null) {
//			return null;
//		}
//		
//		// 获取角色信息，配合页面标签，确定不同角色访问不同的资源
//		List<Role> roles = accountService.getRolesByUserId(user.getUserId());
//		for (Role role : roles) {
//			authorizationInfo.addRole(role.getRoleName());
//			List<Resource> resources = accountService.getResourcesByRoleId(role.getRoleId());
//			for (Resource resource : resources) {
//				authorizationInfo.addStringPermission(resource.getPermission());
//			}
//		}
		
		return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//		String userName = (String) token.getPrincipal();
//		User user = accountService.getUserByName(userName);
//		if (user == null) {
//			throw new UnknownAccountException("The account do not exist.");
//		}
		
		// realmName: 当前 realm 对象的唯一名字. 调用父类的 getName() 方法
//		return new SimpleAuthenticationInfo(userName, user.getPassword(), getName());
		return new SimpleAuthenticationInfo("admin", "admin", getName());
	}

}
