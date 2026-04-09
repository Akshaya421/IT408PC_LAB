/*import java.util.*;
class MyThread1 extends Thread{
	public static void main(String[] args){
		MyThread1 t1=new MyThread1();
		t1.setName("Thread1");
		System.out.println(t1.getName());
	}
}
*/
//method 2 : to create a thread name
import java.util.*;
class MyThread1 extends Thread{
	MyThread1(String str){
	super(str);
	}
	public static void main(String[] args){
		MyThread1 t1=new MyThread1("Hello");
				System.out.println(t1.getName());
	}
}
//hello