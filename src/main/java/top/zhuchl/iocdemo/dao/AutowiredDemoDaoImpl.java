package top.zhuchl.iocdemo.dao;

import org.springframework.stereotype.Repository;

/**
 * 自动装配注解方式：@Autowired 被依赖类
 *
 * @Author AlphaZcl
 * @Date 2022/1/4
 **/
@Repository
public class AutowiredDemoDaoImpl implements AutowiredDemoDao{

    @Override
    public void test() {
        System.out.println("AutowiredDemoDaoImpl test 1111111111111");
    }
}
