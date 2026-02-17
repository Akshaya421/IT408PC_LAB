//without try catch
import java.util.Scanner;
class L5P2 {
	public static void main(String[] args) throws Age{
	Scanner s=new Scanner(System.in);
		System.out.println("enter age");
		int age=s.nextInt();
		if(age<18)
			throw new Age("sorry");
		else
			System.out.println("caste your vote");

	}

}
class Age extends java.lang.Exception{

        public Age(String msg){
	super(msg);
	}

}
/*
enter age
10
Exception in thread "main" Age: sorry
        at L5P2.main(L5P2.java:9)
*/