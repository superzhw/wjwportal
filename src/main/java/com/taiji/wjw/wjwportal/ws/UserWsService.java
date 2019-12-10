package com.taiji.wjw.wjwportal.ws;


import com.taiji.wjw.wjwportal.entity.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace="http://service.ws.com/")
public interface UserWsService {
    @WebMethod//标注该方法为webservice暴露的方法,用于向外公布，它修饰的方法是webservice方法，去掉也没影响的，类似一个注释信息。
    public User getUser(@WebParam(name = "id") String userId);
}
