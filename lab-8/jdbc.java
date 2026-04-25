import java.sql.*;
import java.util.Scanner;
class Jdbc{
	public static void main(String[] args){
	int choice;
	Scanner sc=new Scanner(System.in);
	try{
		//load driver
 		Class.forName("com.mysql.cj.jdbc.Driver");
		//2 get connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/college","root","Akshaya");
 		do{
			System.out.println("--Menu--");
			System.out.println("1.insert");
			System.out.println("2.display");
			System.out.println("3.delete");
			System.out.println("4.update");
			System.out.println("5.exit");	
			System.out.println("enter your choice:");
 			    choice=sc.nextInt();
				switch(choice){
					case 1:
						System.out.println("enter id");
						int id=sc.nextInt();
						sc.nextLine();
						System.out.println("enter Name");
						String name=sc.nextLine();
						PreparedStatement ps1=con.prepareStatement("insert into student values(?,?)");
						ps1.setInt(1,id);
						ps1.setString(2,name);
						ps1.executeUpdate();
						System.out.println("record inserted successfully");
						break;
					case 2:
						Statement stmt=con.createStatement();
						System.out.println("\nId Name");
						ResultSet rs=stmt.executeQuery("select * from student");
						while(rs.next()){
						 System.out.println(rs.getInt(1)+" " +rs.getString(2));
						}
						break;
					case 3:
						System.out.println("eneter id to delete");
						int did=sc.nextInt();
						PreparedStatement ps3=con.prepareStatement("delete from student where id=?");
						ps3.setInt(1,did);
						int d=ps3.executeUpdate();
						if(d>0)
							System.out.println("deleted");
						else
							System.out.println("Record not found");
						break;
					case 4:
						System.out.println("enter update id");
						int uid=sc.nextInt();
						sc.nextLine();
						System.out.println("enter Name");
						String newname=sc.nextLine();
						PreparedStatement ps4=con.prepareStatement("update student set name=? where id=?");
						ps4.setString(1,newname);
						ps4.setInt(2,uid);
						int u=ps4.executeUpdate();
						if(u>0){
							System.out.println("updated");
						}else{
							System.out.println("record not found");
						}
						break;
					case 5:
						System.out.println("existing ");
						break;
					default:System.out.println("invalid choice");
						
				}

		}while(choice!=5);
                 con.close();
	}
	catch(Exception e){
		System.out.println(e);	
	}
}

}
