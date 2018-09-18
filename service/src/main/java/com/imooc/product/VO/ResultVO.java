package com.imooc.product.VO;

import com.imooc.product.enums.ResultEnum;
import lombok.Data;

/**
 * @Description： http请求返回的最外层对象
 * @Auther： libo
 * @date： 2018/9/2:12:23
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String message;

    /**
     * 具体内容
     */
    private T data;

    public ResultVO() {
    }

    public ResultVO(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
    }
}
