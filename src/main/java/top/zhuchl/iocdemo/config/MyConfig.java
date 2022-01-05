package top.zhuchl.iocdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import top.zhuchl.iocdemo.annotation.EnableMySelector;
import top.zhuchl.iocdemo.annotation.MyScaner;
import top.zhuchl.iocdemo.annotation.ServiceScan;
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
@ServiceScan("top.zhuchl.iocdemo.service")
@MyScaner
public class MyConfig {
}
