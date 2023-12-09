package conditions_loop_Functions;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class FileWriter_Example {
	public static void main (String [] args) throws IOException {
		Scanner sc = new Scanner (System.in);
		File f1 =new File(".//Jyothi.txt");
		FileWriter fw=new FileWriter(f1);
		System.out.println("enter the values");
		String s1= sc.nextLine();
		fw.write(s1);
		System.out.println("done");
		fw.close();
		
	}

}
