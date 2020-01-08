class A
{
	final int a=5;
	void change()
	{
		a=a+10;
		System.out.println(+a);
	}
}

class finalexample
{
	public static void main(String args[])
	{
		A superobj=new A();
		superobj.change();
	}
}
