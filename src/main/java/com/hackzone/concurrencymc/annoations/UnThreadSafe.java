package com.hackzone.concurrencymc.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE) // 不会编译进class文件
public @interface UnThreadSafe {
	String value() default "";
}
