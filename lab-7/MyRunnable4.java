//using runnable interface
//get the states 
//thread life cycle
import java.util.*;
class MyRunnable4 implements Runnable{
	 public static void main(String args[]) throws Exception{
		MyRunnable4 r1=new MyRunnable4();
		Thread t1=new Thread(r1, "Epson");
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		Thread.sleep(500);
		System.out.println(t1.getState());
		t1.join();
		System.out.println(t1.getState());


	}
	public void run(){
	String name=Thread.currentThread().getName();
	System.out.println("At present the thread: "+name+" is running");
		try{
			for(int i=1; i<=3; i++){
				System.out.println("AWaited_time:"+i);
				Thread.sleep(500);
				System.out.println(name);
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
At present the thread: Epson is running
AWaited_time:1
TIMED_WAITING
Epson
AWaited_time:2
Epson
AWaited_time:3
Epson
TERMINATED
*/