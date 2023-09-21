package com.yxs.apiinterface.controller;

import com.yxs.apiclientsdk.model.User;
import com.yxs.apiclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: yxs
 * @create: 2023-08-24 13:45
 **/
@RestController
@RequestMapping("name")
public class NameController {

    @GetMapping("/")
    public String getNameByGet(String name){
        return "Get的名字是" + name;
    }

    @PostMapping ("/")
    public String getNameByPost(@RequestParam String name){
        return "Post的名字是" + name;
    }

    @PostMapping ("/user")
    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request){
        // 1.拿到这五个我们可以一步一步去做校验,比如 accessKey 我们先去数据库中查一下
        // 从请求头中获取参数
        String accessKey = request.getHeader("accessKey");
//        String secretKey = request.getHeader("secretKey");
        String sign = request.getHeader("sign");
        String body = request.getHeader("body");
//        String secretKey = request.getHeader("secretKey");

        // 2.校验权限,这里模拟一下,直接判断 accessKey 是否为"yxs",实际应该查询数据库验证权限
        if (!accessKey.equals("yxs")){
            throw new RuntimeException("无权限");
        }
        String genSign = SignUtils.genSign(body, "abcdefg");
        if (!genSign.equals(sign)){
            throw new RuntimeException("无权限");
        }
        return "POST 用户名字是" + user.getName();
    }
}
