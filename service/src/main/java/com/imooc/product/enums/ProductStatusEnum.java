package com.imooc.product.enums;

import lombok.Getter;

/**
 * @Description： 商品上下架状态
 * @Auther： libo
 * @date： 2018/9/2:11:41
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
