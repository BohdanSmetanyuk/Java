package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface TestAnnotation 
{
	String name();
	int count() default 1;
}
