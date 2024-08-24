package javaFileHandelings;

import java.io.File;

public class DeleteFile {
	
public static void main(String[] args) {
	
	File myObj = new File("C:\\Users\\Shyam\\git\\Test123\\Test123\\Files\\filename.txt"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the file: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 
}

}
