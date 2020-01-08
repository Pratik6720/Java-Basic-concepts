class Test
{
  int a;
  Test(int i)
  {
  a=i;
  }
Test incrByten()
  {
	Test temp=new Test(a+10);
	return temp;
   }
}

class returnobj
{
	public static void main(String args[])
	{
		Test ob1=new Test(2);
		Test ob2;
		ob2=ob1.incrByten();
		System.out.println("ob1.a="+ob1.a);
		System.out.println("ob2.a="+ob2.a);
		ob2=ob2.incrByten();
		System.out.println("after call ob2.a="+ob2.a);
	}
}