package basic;

public class large {

	public static void main(String[] args) {
		int a=10,b=9,c=15;
		if(a>=b && a>=c)
		{
			if(b>=c)
			{
				System.out.println(b);
			}
			else
			{
				System.out.println(c);
			}
		}
		else if(b>=a && b>=c )
		{
			if(a>=c)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(c);
			}
		}
		else if(a>=b)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
		
	
	
		
		
		
			
		
		
		
		
		// TODO Auto-generated method stub

	}

}
