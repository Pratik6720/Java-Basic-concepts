class test
{ 
   int a,b;
   test(int i,int j)
   {
	   a=i;
	   b=j;
   }
  
void meth(test o)
{
	o.a*=2;
	o.b/=2;
}
}

class callbyref
{
	public static void main(String args[])
	{
		test ob=new test(15,20);
		System.out.println("the values of a and b before call are a="+ob.a+" and b="+ob.b);
		ob.meth(ob);
		System.out.println("the values of a and b after call are a="+ob.a+" and b="+ob.b);
	}
}