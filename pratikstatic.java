class pratikstatic
{
  static int a=2;
  static int b;
  static void meth(int x)
  {
	  System.out.println("x="+x);
	  System.out.println("a="+a);
	  System.out.println("b="+b);
  }
  static
  {
	  System.out.println("static initialized");
	  b=a*2;
  }
  public static void main(String args[])
  {
	  meth(42);
  }
}