package com.imooc.product.enums;

import lombok.Getter;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/9/2:12:51
 */
@Getter
public enum ResultEnum {
    OK(0,"成功"),
    PRODUCT_NOT_EXIT(1,"成功"),
    PRODUCT_STOCK_ERROR(2,"商品库存错误"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
