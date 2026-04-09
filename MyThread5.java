//WAP to create a 2 threads and print even and odd numbers
class MyThread5 extends Thread{
	public static void main(String[] args) {
		MyThread5 t1=new MyThread5();
		MyThread5 t2=new MyThread5();
                 t1.setName("evenThread");
		 t2.setName("oddThread");
		t2.start();
		t1.start();

	}
	@Override
	public void run(){
     try{
		for(int i=1; i<=10; i++){
			if(this.getName().equals("oddThread")){
			if(i%2!=0)
			System.out.println(this.getName()+"  : "+i); 
			Thread.sleep(500); 
				
			}else{
				if(i%2==0)
			System.out.println(this.getName()+" : "+i); 
			Thread.sleep(500);
			     
			}
		}
	}catch(Exception e){}
	}
}
/*
output:
oddThread  : 1
evenThread : 2
oddThread  : 3
evenThread : 4
oddThread  : 5
evenThread : 6
oddThread  : 7
evenThread : 8
oddThread  : 9
evenThread : 10
*/