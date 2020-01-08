import java.util.Scanner;
 class Area{
  public static void main(String args[]){
   

    int area;
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the value of l:");
	int l=Sc.nextInt();
	System.out.println("enter the value if b:");
	int b=Sc.nextInt();
	area=l*b;
	System.out.println("the area is:"+area);
  }
 }
	