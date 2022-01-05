package top.zhuchl.iocdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import top.zhuchl.iocdemo.annotation.EnableMySelector;
import top.zhuchl.iocdemo.annotation.MyScaner;
import top.zhuchl.iocdemo.beandefinition.AutowiredRegistrar;
import top.zhuchl.iocdemo.beandefinition.MyImportDBR;

/**
 * 配置类
 *
 * @Author AlphaZcl
 * @Date 2021/12/30
 **/
@ComponentScan("top.zhuchl.iocdemo")
@EnableMySelector
//@Import({AutowiredRegistrar.class})
@MyScaner
public class MyConfig {
}
