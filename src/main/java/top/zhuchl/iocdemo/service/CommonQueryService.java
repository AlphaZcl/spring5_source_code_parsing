package top.zhuchl.iocdemo.service;

import top.zhuchl.iocdemo.annotation.TableMapper;

/**
 * 自定义注解：服务类
 *
 * @Author AlphaZcl
 * @Date 2022/1/5
 **/
public class CommonQueryService {

    public static String query(Object object){
        Class<?> clazz = object.getClass();
        String sql = "";
        if(clazz.isAnnotationPresent(TableMapper.class)){
            TableMapper annotation = clazz.getAnnotation(TableMapper.class);
            sql = "SELECT * FROM " + annotation.value();
        }
        return  sql;
    }
}
