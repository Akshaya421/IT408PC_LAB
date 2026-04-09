//start thread
import java.util.*;
class MyThread2 extends Thread{
	 public static void main(String args[]){
		MyThread2 t1=new MyThread2();
		t1.start();
	}
	@Override
	public void run(){
	System.out.println("Hello world");
	}

}