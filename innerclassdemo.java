class outer
{
    int outer_x=100;
	
	void test()
	{
		Inner inner=new Inner();
		inner.display();
	}
	class Inner
	{
	    void display()
	   {
		System.out.println("display:outer_x="+outer_x);
	   }
    }
}
class innerclassdemo
{
	public static void main(String args[])
	{
		outer o=new outer();
		o.test();
	}
}
		