package com.yxs.api.model.dto.interfaceInfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 调用接口请求
 *
 * @TableName product
 */
@Data
public class InterfaceInfoInvokeRequest implements Serializable {

    private static final long serialVersionUID = 6255596906276309854L;
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户请求参数
     */
    private String userRequestParams;



}