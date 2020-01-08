class Box
{
  double width;
  double height;
  double depth;
  
Box(Box obj)
{
	width=obj.width;
    height=obj.height;
    depth=obj.depth;
}

Box(double w,double h,double d)
{
	width=w;
	height=h;
	depth=d;
}

Box()
{
	width=-1;
	height=-1;
	depth=-1;
}
Box(double len)
{
	width=height=depth=len;
}
double Volume()
{
	return width*height*depth;
}
}

class Overloadcons
{
	public static void main(String args[])
	{
	Box mybox1=new Box(10,20,30);
	Box mybox2=new Box();
	Box mycube=new Box(7);
	Box myclone=new Box(mybox1);
	
	double vol;
	vol=mybox1.Volume();
	System.out.println(vol);
	vol=mybox2.Volume();
	System.out.println(vol);
	vol=mycube.Volume();
	System.out.println(vol);
	vol=myclone.Volume();
	System.out.println(vol);
	}
}