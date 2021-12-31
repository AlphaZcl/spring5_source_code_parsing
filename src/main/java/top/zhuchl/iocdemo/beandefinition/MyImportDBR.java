package top.zhuchl.iocdemo.beandefinition;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import top.zhuchl.iocdemo.dao.ImportTestDao;
import top.zhuchl.iocdemo.factorybean.MyFactoryBean;

/**
 * 自定义BeanDefinitions注册
 * 以注册的方法将目标类实例化生成到容器中
 *
 * @Author AlphaZcl
 * @Date 2021/12/31
 **/
public class MyImportDBR implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //获取目标接口的BeanDefinitions建造者
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(ImportTestDao.class);
        //获取对应的beanDefinitions
        AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();

        //给我们的beanDefinition添加一个构造方法，并且传入我们需要的bean名字
        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(beanDefinition.getBeanClassName());
        //把代理对象赋给BeanDefinition
        beanDefinition.setBeanClass(MyFactoryBean.class);

        //将目标beanDefinitions注册到容器中
        registry.registerBeanDefinition("aaa",beanDefinition);
    }
}
