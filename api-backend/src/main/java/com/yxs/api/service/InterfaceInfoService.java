package com.yxs.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yxs.api.model.entity.InterfaceInfo;

/**
* @author YIN
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-08-23 14:59:40
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}
