package top.zhuchl.iocdemo.beandefinition;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 自动装配：通过注册进行类型装配设置
 *
 * @Author AlphaZcl
 * @Date 2021/12/31
 **/
public class AutowiredRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //获取目标beanDefinitions
        GenericBeanDefinition pBeanDefinitions = (GenericBeanDefinition) registry.getBeanDefinition("p1");

        //设置自动装配方式
        pBeanDefinitions.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);

        //重新注册到spring容器中
        registry.registerBeanDefinition("p1",pBeanDefinitions);

    }
}
