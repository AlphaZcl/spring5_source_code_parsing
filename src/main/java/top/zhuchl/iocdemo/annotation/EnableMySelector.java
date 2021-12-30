package top.zhuchl.iocdemo.annotation;

import org.springframework.context.annotation.Import;
import top.zhuchl.iocdemo.selector.MyImportSelect;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 控制开关：控制选择器是否加载指定类进容器中
 *
 * @Author AlphaZcl
 * @Date 2021/12/30
 **/
@Retention(RetentionPolicy.RUNTIME)//运行时加载
@Import(MyImportSelect.class)
public @interface EnableMySelector {
}
