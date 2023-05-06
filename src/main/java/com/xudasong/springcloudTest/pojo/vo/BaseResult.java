package com.xudasong.springcloudTest.pojo.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.xudasong.springcloudTest.enums.GlobalCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 通用返回结果
 * @param <T>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"code","message","data"})
public class BaseResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 返回的对象
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    /**
     * 返回的编码
     */
    private Integer code;

    /**
     * 返回的信息
     */
    private String message;

    /**
     * @return 响应结果
     */
    public static BaseResult<String> OK() {
        return packageObject("", GlobalCodeEnum.GL_SUCC_0);
    }

    /**
     * @param data 返回的数据
     * @param <T>  返回的数据类型
     * @return 响应结果
     */
    public static <T> BaseResult<T> OK(T data) {
        return packageObject(data, GlobalCodeEnum.GL_SUCC_0);
    }

    /**
     * 对返回的消息进行打包
     *
     * @param data           返回的数据
     * @param globalCodeEnum 自定义的返回码枚举类型
     * @param <T>            返回的数据类型
     * @return 响应结果
     */
    public static <T> BaseResult<T> packageObject(T data, GlobalCodeEnum globalCodeEnum) {
        BaseResult<T> baseResult = new BaseResult<>();
        baseResult.setCode(globalCodeEnum.getCode());
        baseResult.setMessage(globalCodeEnum.getDesc());
        baseResult.setData(data);
        return baseResult;
    }

    /**
     * 对返回的消息进行打包
     *
     * @param data    返回的数据
     * @param code    返回的状态码
     * @param message 返回的消息
     * @param <T>     返回的数据类型
     * @return 响应结果
     */
    public static <T> BaseResult<T> packageObject(T data, Integer code, String message) {
        BaseResult<T> baseResult = new BaseResult<>();
        baseResult.setCode(code);
        baseResult.setMessage(message);
        baseResult.setData(data);
        return baseResult;
    }

    /**
     * 系统服务不可用
     *
     * @param globalCodeEnum Feign依赖服务不可用的返回码枚举类型
     * @param <T>            返回的数据类型
     * @return 响应结果
     */
    public static <T> BaseResult<T> systemError(GlobalCodeEnum globalCodeEnum) {
        return packageObject(null, globalCodeEnum);
    }

    /**
     * 系统异常（使用默认的异常返回码）
     *
     * @param <T> 返回的数据类型
     * @return 响应结果
     */
    public static <T> BaseResult<T> systemException(GlobalCodeEnum globalCodeEnum, String message) {
        return packageObject(null, globalCodeEnum.getCode(), message);
    }

    /**
     * 系统异常（使用默认的异常返回码）
     *
     * @param <T> 返回的数据类型
     * @return 响应结果
     */
    public static <T> BaseResult<T> systemException() {
        return packageObject(null, GlobalCodeEnum.GL_FAIL_9999);
    }

    /**
     * 系统异常
     *
     * @param globalCodeEnum 异常返回码枚举类型
     * @param <T>            返回的数据类型
     * @return 响应结果
     */
    public static <T> BaseResult<T> systemException(GlobalCodeEnum globalCodeEnum) {
        return packageObject(null, globalCodeEnum);
    }

    /**
     * 自定义系统异常信息
     *
     * @param code
     * @param message 自定义消息
     * @param <T>
     * @return
     */
    public static <T> BaseResult<T> systemException(Integer code, String message) {
        return packageObject(null, code, message);
    }

}
