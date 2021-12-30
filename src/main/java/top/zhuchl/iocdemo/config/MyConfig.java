package top.zhuchl.iocdemo.config;

import org.springframework.context.annotation.ComponentScan;
import top.zhuchl.iocdemo.annotation.EnableMySelector;

/**
 * 配置类
 *
 * @Author AlphaZcl
 * @Date 2021/12/30
 **/
@ComponentScan("top.zhuchl.iocdemo")
@EnableMySelector
public class MyConfig {
}
