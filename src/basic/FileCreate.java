package basic;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreate {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("create your file:");
		try {
			String filepath = "C:\\Task\\";
			  filepath= filepath+input.nextLine();
		      File myObj = new File(filepath+".txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println( myObj.getName()+"File already exists.");
		      }
		      System.out.println("Enter the command: ");
		      StringBuffer buffer=new StringBuffer(input.nextLine());
		      String s = input.next();
		      FileWriter myWriter = null;
		     // if( s.equalsIgnoreCase("delete")) {
		    	//  myObj.delete();
		    	//  System.out.println("delteted****");
		    //  } else if (s.equalsIgnoreCase("overwrite")){
		    	//   myWriter = new FileWriter("C:\\Task\\File1.txt");
		    	//   myWriter.append(buffer);
				 //     myWriter.close();
		     // } else {
		            myWriter = new FileWriter(filepath+".txt",true);
		           //          myWriter.write(s);
		             myWriter.append(buffer);
				      myWriter.close();
		      
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}

}
