package top.zhuchl.iocdemo.pojo;

import lombok.Data;
import top.zhuchl.iocdemo.annotation.TableMapper;

/**
 * Spring自定义注解：实体类
 *
 * @Author AlphaZcl
 * @Date 2022/1/5
 **/
@Data
@TableMapper("USER_INFO")
public class UserEntity {

    private String id;

    private String name;
}
