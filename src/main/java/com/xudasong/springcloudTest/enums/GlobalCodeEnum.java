package com.xudasong.springcloudTest.enums;

/**
 * 全局code
 */
public enum GlobalCodeEnum {

    GL_SUCC_0(0,"成功"),
    GL_FAIL_DEFAULT(-1,"失败"),
    GL_FAIL_9994(9994,"业务处理失败"),
    GL_FAIL_9995(9995,"依赖服务异常"),
    GL_FAIL_9996(9996,"不支持的HttpMethod"),
    GL_FAIL_9997(9997,"HTTP错误"),
    GL_FAIL_9998(9998,"参数错误"),
    GL_FAIL_9999(9999,"系统异常"),

    ;

    /**
     * 编码
     */
    private Integer code;

    /**
     * 描述
     */
    private String desc;

    GlobalCodeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据编码获取枚举类型
     * @return
     */
    public static GlobalCodeEnum getByCode(Integer code){
        if (code == null) return null;
        GlobalCodeEnum[] values = GlobalCodeEnum.values();
        for (GlobalCodeEnum value : values){
            if (value.getCode().equals(code)) return value;
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
