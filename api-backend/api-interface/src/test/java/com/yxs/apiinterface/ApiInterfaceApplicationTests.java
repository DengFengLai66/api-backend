package com.yxs.apiinterface;

import com.yxs.apiclientsdk.client.ApiClient;
import com.yxs.apiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ApiInterfaceApplicationTests {

    @Resource
    ApiClient apiClient;

    @Test
    void contextLoads() {
        // 调用ApiClient的getNameByGet方法，并传入参数"getyxs"，将返回的结果赋值给result变量
        String result = apiClient.getNameByGet("getyxs");
        // 创建一个User对象
        User user = new User();
        // 设置User对象的username属性为"postuseryxs"
        user.setName("postuseryxs");
        // 调用yuApiClient的getUserNameByPost方法，并传入user对象作为参数，将返回的结果赋值给usernameByPost变量
        String usernameByPost = apiClient.getUserNameByPost(user);
        // 打印result变量的值
        System.out.println(result);
        // 打印usernameByPost变量的值
        System.out.println(usernameByPost);
    }

}
