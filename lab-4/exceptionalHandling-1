import java.util.InputMismatchException;
import java.util.*;
import java.io.IOException;
import java.io.*;
public class First{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader s=new BufferedReader(isr);
		try{
			System.out.println("Enter the number");
			int x=Integer.parseInt(s.readLine());
			int y=Integer.parseInt(s.readLine());
			System.out.println(x/y);
		}
		catch(InputMismatchException e){
			System.out.println(e.getMessage());
			}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			}
		finally{
			System.out.println("Exception handled");
		
		}
	
	}

}
