class A
{
	int i,j;
	 void showij()
	 {
		 System.out.println("the values are i="+i+" and j="+j);
	 }
}

class B extends A
{
	int k;
	void showk()
	{
		System.out.println("the value of k is"+k);
	}
	
	void sum()
	{
		System.out.println("i+j+k="+(i+j+k));
	}
}

class simpleinheritance
{
	public static void main(String args[])
	{
		A superobj=new A();
		B subobj=new B();
		
		superobj.i=2;
		superobj.j=3;
		System.out.println("the contents of superobj are");
		superobj.showij();
		
		subobj.i=100;
		subobj.j=200;
		subobj.k=300;
		System.out.println("the contents of subobj are");
		subobj.showij();
		subobj.showk();
		System.out.println("the addition of subobj are");
		subobj.sum();
	}
}
