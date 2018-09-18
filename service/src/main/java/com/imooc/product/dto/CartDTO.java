package com.imooc.product.dto;

import lombok.Data;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/9/4:21:18
 */
@Data
public class CartDTO {

    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
