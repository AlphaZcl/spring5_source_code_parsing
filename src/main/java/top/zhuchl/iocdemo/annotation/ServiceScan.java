package top.zhuchl.iocdemo.annotation;

import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AliasFor;
import top.zhuchl.iocdemo.beandefinition.ServiceImportBeanDefinitionRegistrar;

import java.lang.annotation.*;

/**
 * 自动扫描注解：扫描业务包
 *
 * @Author AlphaZcl
 * @Date 2022/1/5
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(ServiceImportBeanDefinitionRegistrar.class)
public @interface ServiceScan {

    @AliasFor("value")
    String[] basePackages() default {};

    @AliasFor("basePackages")
    String[] value() default {};
}
