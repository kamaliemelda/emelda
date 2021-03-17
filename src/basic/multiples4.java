package basic;

public class multiples4 {
	int x=1;
	
		void table()
		{
			int a=4;
		System.out.println(x*a);
		x++;
		if(x<=10)
		{
			table();
		}
		
	}
		

	public static void main(String[] args) {
		multiples4 m=new multiples4();
		m.table();
		// TODO Auto-generated method stub

	}

}
