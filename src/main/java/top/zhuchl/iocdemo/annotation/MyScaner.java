package top.zhuchl.iocdemo.annotation;

import org.springframework.context.annotation.Import;
import top.zhuchl.iocdemo.beandefinition.MyImportDBR;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 自定义扫描注解：
 *
 * @Author AlphaZcl
 * @Date 2021/12/31
 **/
@Retention(RetentionPolicy.RUNTIME)
@Import(MyImportDBR.class)
public @interface MyScaner {
}
