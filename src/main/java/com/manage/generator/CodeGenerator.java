package com.manage.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class CodeGenerator {

    public static void main(String[] args) {
        // 1. 创建代码生成器
        AutoGenerator generator = new AutoGenerator();

        // 2. 全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        globalConfig.setAuthor("yourname");  // 设置作者
        globalConfig.setOpen(false);
        globalConfig.setFileOverride(true);  // 是否覆盖文件
        globalConfig.setServiceName("%sService");  // 设置 Service 接口名称
        generator.setGlobalConfig(globalConfig);

        // 3. 数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/mis?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("3271149877mm");
        dataSourceConfig.setDbType(DbType.MYSQL);
        generator.setDataSource(dataSourceConfig);

        // 4. 包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.manage");
        packageConfig.setMapper("mapper");
        packageConfig.setEntity("entity");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        packageConfig.setController("controller");
        generator.setPackageInfo(packageConfig);

        // 5. 策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);  // 表名生成策略
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);  // 字段名生成策略
        strategyConfig.setEntityLombokModel(true);  // 使用 Lombok
        strategyConfig.setRestControllerStyle(true);  // 使用 @RestController
        strategyConfig.setInclude("students", "teachers", "courses", "course_choosing", "users");  // 设置要生成的表
        generator.setStrategy(strategyConfig);

        // 6. 模板配置（可选）
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setXml(null);  // 如果不需要 XML 配置文件
        generator.setTemplate(templateConfig);

        // 7. 执行代码生成
        generator.execute();
    }
}
