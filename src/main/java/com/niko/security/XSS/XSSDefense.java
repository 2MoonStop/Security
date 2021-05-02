package com.niko.security.XSS;

import java.security.Policy;

/**
 * XSS防御
 */
public class XSSDefense {
    //1.httpOnly   -> begin IE 6
        //response.setHeader("Set-Cookie","cookiename=values;Path=/;Domain=domainvalue;Max_age=secods;HttpOnly); //最后一个属性为httpOnly

    //2.输入检查   主要使用XSS Filter
        //见XSS Filter
    //3.输出检查  在OWASP ESAPI中有一个安全的JavaScriptEncode的实现 非常严格
        //String safe = ESAPI.encoder().encodeForURL(request.getParameter("input"));

    //4.处理富文本
        //Policy policy = Policy.getInstance(POLICY_FILE_LOCATION);
        //AntiSamy as = new AntiSamy();
        //CleanResults cr = as.scan(dirtyInput, policy);
        //MyUserDao.storeUserProfile(cr.getCleanHTML()); //some custom function
}
