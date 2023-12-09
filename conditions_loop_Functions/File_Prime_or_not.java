package conditions_loop_Functions;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class File_Prime_or_not {
	public static void main (String [] args) throws  IOException {
		FileWriter fw=new FileWriter(".//Jyothi.txt");
		fw.write("");

         for (int num = 2; num <= 1000; num++) {
             boolean cout = true;
             for (int i = 2; i <= Math.sqrt(num); i++) {
                 // condition for non-prime number
                 if (num % i == 0) {
                     cout = false;
                     break;
                 }
             }

             if (cout == true) {
                 fw.write(num + " "); // write this to the file.
             }
         }

         fw.close();
         System.out.println("done");
	}
	
	}
	


