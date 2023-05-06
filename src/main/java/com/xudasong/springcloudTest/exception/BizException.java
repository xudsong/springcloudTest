package com.xudasong.springcloudTest.exception;

import com.xudasong.springcloudTest.enums.GlobalCodeEnum;
import lombok.Data;

/**
 * 自定义业务异常
 */
@Data
public class BizException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    private Integer errCode;

    /**
     * 错误内容
     */
    private String errMessage;

    private BizException(){
        super();
    }


    public BizException(String errMessage){
        super(errMessage);
        this.errCode = GlobalCodeEnum.GL_FAIL_9994.getCode();
        this.errMessage = errMessage;
    }

    public BizException(Integer errCode, String errMessage){
        super(errMessage);
        this.errMessage = errMessage;
        this.errCode = errCode;
    }

    public BizException(GlobalCodeEnum codeEnum){
        super(codeEnum.getDesc());
        this.errMessage = codeEnum.getDesc();
        this.errCode = codeEnum.getCode();
    }

    public BizException(GlobalCodeEnum codeEnum, String errMessage){
        super(errMessage);
        this.errMessage = errMessage;
        this.errCode = codeEnum.getCode();
    }

}
