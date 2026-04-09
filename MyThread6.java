//WAP to create a 2 threads and print even and odd numbers seperately
class MyThread6 extends Thread{
	public static void main(String[] args) throws Exception {
		MyThread6 t1=new MyThread6();
		MyThread6 t2=new MyThread6();
                 t1.setName("evenThread");
		 t2.setName("oddThread");
		t2.start();
		Thread.sleep(200);
		t1.start();

	}
	@Override
	public void run(){
     try{
		for(int i=1; i<=10; i++){
			if(this.getName().equals("oddThread") && (i%2!=0)){
				System.out.println(this.getName()+"  : "+i); 
			}else if(this.getName().equals("evenThread") && (i%2==0)){
				System.out.println(this.getName()+" : "+i); 
			}
		}
	}catch(Exception e){}
	}
}
/*
output:
oddThread  : 1
oddThread  : 3
oddThread  : 5
oddThread  : 7
oddThread  : 9
evenThread : 2
evenThread : 4
evenThread : 6
evenThread : 8
evenThread : 10
*/