package top.zhuchl.iocdemo.factorybean;

import org.springframework.beans.factory.FactoryBean;
import top.zhuchl.iocdemo.dao.ImportTestDao;

import java.lang.reflect.Proxy;

/**
 * 工厂bean：定制生成ImportTestDao接口的代理对象
 *
 * @Author AlphaZcl
 * @Date 2021/12/31
 **/
public class MyFactoryBean implements FactoryBean {

    private Class clazz;

    public MyFactoryBean(Class clazz){
        this.clazz = clazz;
    }

    @Override
    public Object getObject() throws Exception {
        Object proxyInstance = Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{this.clazz},
                (proxy, method, args) -> {
                    System.out.println("This is a proxy of ImportTestDao");
                    return null;
                });
        return proxyInstance;
    }

    @Override
    public Class<?> getObjectType() {
        return ImportTestDao.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
