package top.zhuchl.iocdemo.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import top.zhuchl.iocdemo.dao.IndexDao;

/**
 * 自定义选择器
 * 由于使用了ImportSelector所以就不需要放到Spring容器中了
 * 使用@Import这个注解注入进去
 *
 * @Author AlphaZcl
 * @Date 2021/12/30
 **/
public class MyImportSelect implements ImportSelector {

    /**
     * 这个方法的返回值是一个字符串数组，只要在配置类被引用了，这里返回的字符串数组中的类名就会被Spring容器new出来，
     * 然后再把这些对象放到工厂容器当中去
     *
     * @param annotationMetadata
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{IndexDao.class.getName()} ;
    }
}
