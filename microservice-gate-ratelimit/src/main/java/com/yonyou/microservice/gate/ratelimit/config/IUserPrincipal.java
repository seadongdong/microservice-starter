package com.yonyou.microservice.gate.ratelimit.config;

import javax.servlet.http.HttpServletRequest;

/**
 * @author joy
 * Created on 2017/9/23.
 * 
 */
public interface IUserPrincipal {
	/**
     * 从请求jwt中解析出用户登录账号(唯一)
     * 
     * @param request 请求对象
     * @return 登录账号
     */	
    String getName(HttpServletRequest request);
}
