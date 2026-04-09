//create 2 threads for deposit and withdraw 
import java.util.*;
class MyThread7 extends Thread{
	 double bal=2000;
	public static void main(String[] args) throws Exception {
		MyThread6 t1=new MyThread6();
		MyThread6 t2=new MyThread6();
                 t1.setName("depositThread");
		 t2.setName("withdrawThread");
		t2.start();
		t1.start();

	}
	public  void run(){
			double amt=1500;
			if(this.getName().equals("depositThread") ){
				deposit(amt);
			}else if(this.getName().equals("withdrawThread")){
                                 withdraw(amt);
			}
		}
	public   void deposit(double amt){
		bal+=amt;
		//System.out.println(Thread.currentThread().getName()+"deposit: "+this.getName());
		System.out.println("Bal after deposit :"+bal);
	}
	public   void withdraw(double amt){
		if(amt<=bal){
		//System.out.println(Thread.currentThread().getName()+" withdraw: "+this.getName());
		System.out.println("Bal after withdraw :"+bal);
		}else{
		System.out.println("Insufficient bal");
		}
	}
	
}
