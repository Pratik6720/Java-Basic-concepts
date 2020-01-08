class box
{
  double h;
  double w;
  double d;
  box(double w,double h,double d)
  {
  this.w=w;
  this.h=h;
  this.d=d;
  }
  double vol()
  {
   return(w*h*d);
   }
  }
   class Pratikthis
   {
   public static void main(String args[])
   {
    box a=new box(10,20,30);
	double vol=a.vol();
	System.out.println(vol);
	}
   }