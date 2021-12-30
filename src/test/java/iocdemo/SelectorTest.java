package iocdemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.zhuchl.iocdemo.config.MyConfig;
import top.zhuchl.iocdemo.dao.IndexDao;

/**
 * 选择器测试类
 *
 * @Author AlphaZcl
 * @Date 2021/12/30
 **/
@DisplayName("选择器测试")
public class SelectorTest {

    @Test
    public void testSelector(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        context.getBean(IndexDao.class).query();
    }
}
