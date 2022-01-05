package iocdemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.zhuchl.iocdemo.config.MyConfig;
import top.zhuchl.iocdemo.dao.ImportTestDao;
import top.zhuchl.iocdemo.dao.IndexDao;
import top.zhuchl.iocdemo.pojo.NameClazz;
import top.zhuchl.iocdemo.pojo.PersonClazz;
import top.zhuchl.iocdemo.service.AutowiredDemoService;
import top.zhuchl.iocdemo.service.ImportTestService;

/**
 * 选择器测试类
 *
 * @Author AlphaZcl
 * @Date 2021/12/30
 **/
@DisplayName("IOC过程测试")
public class IOCTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    public void before(){
        applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
    }

    @Test
    @DisplayName("自定义选择器测试")
    public void testSelector(){
        applicationContext.getBean(IndexDao.class).query();
    }

    @Test
    @DisplayName("自定义注册器")
    public void testImportRegistrar(){
        Object aaa = applicationContext.getBean("aaa");
        System.out.printf("代理对象%s",aaa.getClass().getName()+"\n");
        applicationContext.getBean(ImportTestService.class).find();
    }

    @Test
    @DisplayName("自动装配(非注解方式)")
    public void testAutowireNoAnnot(){
        NameClazz nameClazz = applicationContext.getBean(PersonClazz.class).getNameClazz();
        System.out.println(nameClazz);
    }

    @Test
    @DisplayName("自动装配(注解方式)")
    public void testAutowireAnnot(){
        applicationContext.getBean(AutowiredDemoService.class).doTest();
    }
}
