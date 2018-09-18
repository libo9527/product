package com.imooc.product.service;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.dto.CartDTO;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/9/2:11:44
 */
@Component
public class ProductServiceTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() {
        List<ProductInfo> result = productService.findUpAll();
        Assert.assertTrue(result.size() > 0);
    }

    @Test
    public void decreaseStock(){
        CartDTO cartDTO = new CartDTO("157875196366160022", 2);
        productService.decreaseStock(Arrays.asList(cartDTO));
    }
}