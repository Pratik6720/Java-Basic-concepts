class A
{
	int i;
}
class B extends A
{
	int i;    //this i hides i inside A
	B(int a,int b)
	{
	super.i=a; //i inside A
	i=b; //i inside B
    }
	
	void show()
	{
		System.out.println("the value of i inside class A:"+super.i);
		System.out.println("the value of i inside class B:"+i);
	}
}

class usesuper
{
	public static void main(String args[])
	{
		B subobj=new B(2,3);
		subobj.show();
	}
}
		
	