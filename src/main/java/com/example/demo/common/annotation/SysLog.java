package com.example.demo.common.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 *
 * @author  heyongjie
 * @date  2018/5/2
 * @updater
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

	String value() default "";
}

