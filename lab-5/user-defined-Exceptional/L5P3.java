import java.lang.reflect.Method;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface Bullet{
 String str();
 double dbl();
}
class L5P3 {
	@Bullet(str="Akshaya",dbl=26.89)
 public static void anyMethod() extends Exception{
	
	Method mtd=L5P3.class.getMethod("anyMethod");

	Bullet b=mtd.getAnnotation(Bullet.class);
	
	System.out.println("string:"+b.str());
	System.out.println("double:"+b.dbl());
	}
public static void main(String[] args)throws NoSuchMethodException{
anyMethod();
}
}

//string:Akshaya
//double:26.89