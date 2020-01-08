import java.util.Scanner;
class Stack{
    int v,i;
	int tos;
	Scanner s1=new Scanner(System.in);
	int getsize(){
	  System.out.println("give the size of the stack");
	  v=s1.nextInt();
	  return v;
	  }
	  
	  void stack()
	  {
	    tos=-1;
	  }
		int s[]=new int[getsize()];
		int j=s.length;
		void push(int a)
		{
			if(tos==j)
			{
				System.out.println("stack is overflow");
				return;
			}
			else
			{
				s[++tos]=a;
				System.out.println(a+" is inserted");
			}
		}
		
		int pop()
		{
			int v;
			if(tos==-1)
			{
				System.out.println("Stack is underflow");
			}
			else
			{
				--tos;
			}
			v=s[tos+1];
			System.out.println(v+ " is popped");
			return v;
		}
}

class Stackpratik
{
	public static void main(String args[])
	{
		Stack st=new Stack();
		Scanner sc=new Scanner(System.in);
		int x,y,z,v;
		boolean b=true;
		do{
			System.out.println("----------MENU--------");
			System.out.println("1.push \n2.pop\n3.exit");
			System.out.println("select any one option:");
			z=sc.nextInt();
			switch(z)
			{
				case 1:System.out.println("enter the number");
				       x=sc.nextInt();
					   st.push(x);
					   break;
			    
				case 2:st.pop();
					  break;
			    case 3:b=false;
				       break;
					   
				default:System.out.println("enter the valid choice");
			}
		}while(b);
	}
}
				