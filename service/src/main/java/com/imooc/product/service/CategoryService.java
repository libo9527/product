package com.imooc.product.service;

import com.imooc.product.dataobject.ProductCategory;

import java.util.List;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/9/2:12:18
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
