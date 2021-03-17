package basic;

public class partten_space {

	public static void main(String[] args) {
		for(int i=0;i<=3;i++)
		{
			for(int k=0;k<=2-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
