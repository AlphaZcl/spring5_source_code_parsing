package top.zhuchl.iocdemo.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 自动装配：探究自动装配原理的类
 *
 * @Author AlphaZcl
 * @Date 2021/12/31
 **/
@Component("p1")
//@Data
public class PersonClazz {

    private String str;

    /**
     * 依赖对象
     */
//    private NameClazz nameClazz;

    public NameClazz getNameClazz(){
        return null;
    }

    public void setNameClazz(NameClazz nameClazz){
        System.out.println("Spring 上当了");
    }
}
