//using class
//get the states 
//thread life cycle
import java.util.*;
class MyThread3 extends Thread{
         MyThread3(String str){
	super(str);
	}
	 public static void main(String args[]) throws Exception{
		MyThread3 t1=new MyThread3("MyThread-A");
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		Thread.sleep(500);
		System.out.println(t1.getState());
		t1.join();
		System.out.println(t1.getState());


	}
	@Override
	public void run(){
	System.out.println("At present the thread: "+this.getName()+" is running");
		try{
			for(int i=1; i<=3; i++){
				System.out.println("AWaited_time:"+i);
				Thread.sleep(500);
				System.out.println(this.getState());
				}
		}
		catch(Exception e){
			
		}

	}

}
/*
output:
NEW
RUNNABLE
At present the thread: MyThread-A is running
AWaited_time:1
TIMED_WAITING
RUNNABLE
AWaited_time:2
RUNNABLE
AWaited_time:3
RUNNABLE
TERMINATED
*/