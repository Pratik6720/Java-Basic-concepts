class figure
{
	double dim1;
	double dim2;
	
	figure(double a,double b)
	{
		dim1=a;
		dim2=b;
	}
	
	double area()
	{
		System.out.println("the area is undefined");
        return 0;
	}
}

class rectangle extends figure
{
	rectangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("the area of rectangle is:");
		return dim1*dim2;
	}
}

class triangle extends figure
{
	triangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("the area of triangle is:");
		return (dim1*dim2)/2;
	}
}

class methodoverride
{
	public static void main(String args[])
	{
		figure f=new figure(10,10);
	    rectangle r=new rectangle(9,5);
	    triangle t=new triangle(10,8);
	    
		figure figuref;
		figuref=r;
	    System.out.println("area is:"+figuref.area());
		figuref=t;
	    System.out.println("area is:"+figuref.area());
		figuref=f;
	    System.out.println("area is:"+figuref.area());
    }
}
	