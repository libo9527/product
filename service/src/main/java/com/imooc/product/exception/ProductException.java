package com.imooc.product.exception;

import com.imooc.product.enums.ResultEnum;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/9/4:21:42
 */
public class ProductException extends RuntimeException {

    private Integer code;

    private String message;

    public ProductException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
