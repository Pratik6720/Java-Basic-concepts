class test
{
      void meth(int i,int j)
        {
          i*=2;
          j/=2;
        }
}


class callbyvalue
{
    public static void main(String args[])
	{
       test ob=new test();
        int a,b;
         a=15;
         b=20;
			System.out.println("the values of a and b before calling a="+a+" b="+b);
			ob.meth(a,b);
			System.out.println("the values of a and b after calling a="+a+" b="+b);
	}
}