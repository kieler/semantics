package de.cau.cs.kieler.synccharts.dsl.outline;

import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target( { METHOD })
public @interface myAnnotation {
	String aStringValue() default "ozgun";
}