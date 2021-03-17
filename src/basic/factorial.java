package basic;

public class factorial {
	
	int n=5;
	int fact=n;
	void print()
	
	{
	n--;
	fact=fact*n;
	if(n>1)
		System.out.println(fact);
		{
			print();
		}
		
	}

	public static void main(String[] args) {
		factorial obj1=new factorial();
		obj1.print();
		// TODO Auto-generated method stub

	}

}
