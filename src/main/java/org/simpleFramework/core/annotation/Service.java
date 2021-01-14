package org.simpleFramework.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : sean
 * @version V1.0
 * @Project: simpleFramework
 * @Package org.simpleFramework.core.annotation
 * @Description: TODO
 * @date Date : 2021年01月14日 13:58
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Service {
}
