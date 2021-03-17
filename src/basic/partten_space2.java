package basic;

public class partten_space2 {

	public static void main(String[] args) {
		int n=1,r=10;
		for(int i=1;i<=r;i++)
		{
			for(int k=1;k<=r-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
				
			}
			n++;
			n++;
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
