

class Volume 
{
	double length;
	double breadth;
	double height;
	Volume()
	{
		length=0;
		breadth=0;
		height=0;
	}
	
	double volume(double length,double breadth,double height)
	{
		return(length*breadth*height);
	}
}
class VVV
{
	
	public static void main(String args[])
	{
	Volume aa=new Volume();
	double v;
	v=aa.volume(10,10,10);
	System.out.println("the volume is:"+v);
	}
}
