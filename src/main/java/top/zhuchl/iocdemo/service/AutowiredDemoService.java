package top.zhuchl.iocdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zhuchl.iocdemo.dao.AutowiredDemoDao;
import top.zhuchl.iocdemo.dao.AutowiredDemoDaoImpl;

import javax.annotation.Resource;
import java.util.List;

/**
 * 自动装配注解方式：@Autowired
 *
 * @Author AlphaZcl
 * @Date 2022/1/4
 **/
@Service
public class AutowiredDemoService {

    @Autowired
//    @Resource
    private List<AutowiredDemoDao> demoDaos;

    public void doTest(){
        demoDaos.forEach(AutowiredDemoDao::test);
    }
}
