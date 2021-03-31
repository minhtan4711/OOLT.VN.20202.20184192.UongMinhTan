package hust.soict.hedspi.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NoGarbage {
	public static void main(String[] args) {
		 File myFile = new File("../../test.txt");
	     long start = System.currentTimeMillis();
	     Scanner readFile = null;
	     try {
	    	 readFile = new Scanner(myFile);
	    	 StringBuffer strContent = new StringBuffer();
	    	 while(readFile.hasNextLine()) {
	    		 strContent.append(readFile.nextLine() + "\n");
	    	 }
	    	 System.out.println(System.currentTimeMillis() - start);
	    	 readFile.close();
	     } catch (FileNotFoundException e) {
	    	 System.out.println(e);
	     }
	}
}
