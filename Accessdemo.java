class Access
{
    int a;
	public int b;
	private int c;
	void setc(int x)
	{
		c=x;
	}
	int getc()
	{
		return c;
	}
}
class Accessdemo
{
	public static void main(String args[])
	{
		Access ob1=new Access();;
		ob1.a=10;
		ob1.b=15;
		ob1.setc(20);
		System.out.println("a="+ob1.a+"b="+ob1.b+"c="+ob1.getc());
	}
}