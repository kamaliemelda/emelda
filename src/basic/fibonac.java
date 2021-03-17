package basic;

public class fibonac {

	public static void main(String[] args) {
		int n1=0,n2=1,n3;
		int i=1;
		{
		System.out.println(n1);
		System.out.println(n2);
		}
		while(i<=4)
		{
			System.out.println(n1+n2);
			 n3=n1+n2;
			n1=n2;
			n2=n3;
			i++;
		}
		
		// TODO Auto-generated method stub

	}

}
