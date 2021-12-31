package top.zhuchl.iocdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.zhuchl.iocdemo.dao.ImportTestDao;

/**
 * 业务类，依赖被注册的dao接口
 * @see  ImportTestDao
 *
 * @Author AlphaZcl
 * @Date 2021/12/31
 **/
@Component
public class ImportTestService {

    @Autowired
    private ImportTestDao importTestDao;

    public void find(){
        System.out.println("ImportTestService improtTestDao.query()");
        System.out.println("importTestDao" + importTestDao.getClass().getName());
        importTestDao.query();
    }

}
