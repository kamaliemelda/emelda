package basic;

public class loop_f {

	public static void main(String[] args) {
		int a=152,n;
		int sum=0;
		int temp;
		temp=a;
		while(a>0)
		{
			n=a%10;
			sum=(sum*10)+n;
			a=a/10;
			
		}
			if(temp==sum)
			{
				System.out.println("palindrom");
			}
			else
			{
				System.out.println("not palindrom");

	 
	 
			
		}
		
		
		
			
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
