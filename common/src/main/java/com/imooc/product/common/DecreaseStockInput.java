package com.imooc.product.common;

import lombok.Data;

/**
 * @Description： 减库存入参
 * @Auther： libo
 * @date： 2018/9/5:21:48
 */
@Data
public class DecreaseStockInput {

    private String productId;

    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
