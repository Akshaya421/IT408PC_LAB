//with try and catch
import java.lang.reflect.Method;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface Bullet{
 String str();
 double dbl();
}
class L5P4 {
	@Bullet(str="Akshaya",dbl=26.89)
 public static void anyMethod(){
	try{
	Method mtd=L5P4.class.getMethod("anyMethod");

	Bullet b=mtd.getAnnotation(Bullet.class);
	
	System.out.println("string:"+b.str());
	System.out.println("double:"+b.dbl());
	}
	catch(NoSuchMethodException e){
	e.printStackTrace();
	}

}
public static void main(String[] args){
anyMethod();
}
}

//string:Akshaya
//double:26.89