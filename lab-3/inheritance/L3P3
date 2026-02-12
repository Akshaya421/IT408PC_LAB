class L3P1{
	static int view;
	
	public static void display()
	{
         System.out.println(view);
	}	
	public int show(){
	return view;
	}
}

class L3P2 extends L3P1{
	static int neu=5;
		public static void display(){
         System.out.println(view+neu);
	}	
	@Override
	public int show(){
	super.show();
	return (view+neu);
	}
	public void pearl(){
 	super.display();
	System.out.println("Iam B child of A");
	}
}

class L3P3{
	public static void main(String[] args){
	L3P2 p= new L3P2();
	p.setvalues(4);
	p.display();
	p.show();
	p.pearl();
	
	}
}
