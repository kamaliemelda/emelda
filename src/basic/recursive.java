package basic;

public class recursive {
	int a=1,n=0;
	void print()
	{
		a++;
		if(a<=5)
		n=n+a;
		
		{
			print();
		}
		System.out.println(n);
		
	}

	public static void main(String[] args) {
		recursive r=new recursive();
		r.print();
		
		
		// TODO Auto-generated method stub

	}

}
