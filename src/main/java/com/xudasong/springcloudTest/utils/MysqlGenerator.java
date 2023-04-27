package com.xudasong.springcloudTest.utils;



import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;

import java.sql.SQLException;
import java.util.Collections;

public class MysqlGenerator {

    public static void main(String[] args) throws SQLException {

        FastAutoGenerator.create("jdbc:postgresql://localhost:5432/mytest?useSSL=false", "postgres", "root")//数据库配置
                .globalConfig(builder -> {
                    builder.author("tingdian") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .dateType(DateType.ONLY_DATE)// 日期类型
                            .outputDir("E:\\spring-cloud-test\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.xudasong.springcloudTest") // 设置父包名
                            //.moduleName("sys") // 设置父包模块名
                            .controller("controller")
                            .mapper("mapper")
                            .service("service")
                            .serviceImpl("service.impl")
                            .entity("entity")
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "E:\\spring-cloud-test\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder
                            .addInclude(new String[] {"employee","dept","user_db"}) // 设置需要生成的表名
//                            .addTablePrefix("test_") // 设置过滤表前缀
                            //entity配置
                            .entityBuilder()
                            .enableLombok()
                            //.superClass(com.cloud.model.common.BaseDataEntity.class)//继承父类
                            //.logicDeleteColumnName("del_flag")//逻辑删除字段
                            .enableTableFieldAnnotation()
                            //controller配置
                            .controllerBuilder()
                            .formatFileName("%sController")
                            .enableRestStyle()
                            //service配置
                            .serviceBuilder()
                            .formatServiceFileName("I%sService")
                            .formatServiceImplFileName("%sServiceImpl")
                            //dao配置
                            .mapperBuilder()
                            .formatMapperFileName("%sDao")
                            .formatXmlFileName("%sMapper")
                            .enableMapperAnnotation();
                })

                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new VelocityTemplateEngine())
                .execute();
    }
}