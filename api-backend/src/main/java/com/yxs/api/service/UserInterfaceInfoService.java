package com.yxs.api.service;

import com.yxs.api.model.entity.UserInterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author YIN
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-08-26 16:19:37
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean b);

    /**
     *
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean incokeCount(long interfaceInfoId,long userId);
}
