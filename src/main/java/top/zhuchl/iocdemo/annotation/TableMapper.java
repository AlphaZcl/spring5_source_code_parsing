package top.zhuchl.iocdemo.annotation;

import java.lang.annotation.*;

/**
 * @Author AlphaZcl
 * @Date 2022/1/5
 **/
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TableMapper {

    /**
     * 要返回的值
     * @return
     */
    public String value() default "";
}
