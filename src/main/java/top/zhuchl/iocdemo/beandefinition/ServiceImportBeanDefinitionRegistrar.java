package top.zhuchl.iocdemo.beandefinition;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AssignableTypeFilter;
import top.zhuchl.iocdemo.annotation.ServiceScan;
import top.zhuchl.iocdemo.service.AutowiredDemoService;

import java.util.Map;

/**
 * 自动扫描：扫描指定包
 *
 * @Author AlphaZcl
 * @Date 2022/1/5
 **/
public class ServiceImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        Map<String, Object> serviceScan = importingClassMetadata.getAnnotationAttributes(ServiceScan.class.getName());
        String[] basePackages = (String[])serviceScan.get("basePackages");
        if(basePackages == null || basePackages.length==0){
            String basePackage = null;
            try {
                basePackage =  Class.forName(importingClassMetadata.getClassName()).getPackage().getName();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            basePackages = new String[]{basePackage};
        }

        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(registry, false);
        AssignableTypeFilter typeFilter = new AssignableTypeFilter(AutowiredDemoService.class);
        scanner.addIncludeFilter(typeFilter);
        scanner.scan(basePackages);
    }
}
