package com.imooc.product.utils;

import com.imooc.product.VO.ResultVO;
import com.imooc.product.enums.ResultEnum;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/9/2:12:50
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO<Object> resultVO = new ResultVO<>(ResultEnum.OK);
        resultVO.setData(object);
        return resultVO;
    }
}
