package hello;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14  {
	 public static void main(String[] args) throws IOException
	 {
		 try {
	File file = new File("C:/Users/SrijataDatta/Downloads/file1.txt");
	boolean fStatus = file.createNewFile();
	if(fStatus) {
        System.out.println("File created successfully!");
    } else {
        System.out.println("File already exists at this path.");
    }
	File filegetfileobject = FileUtils.getFile("C:/Users/SrijataDatta/Downloads/file1.txt");
	System.out.println("Data in file: " + FileUtils.readFileToString(filegetfileobject, "UTF8"));
	 File destDir = new File("C:/Users/SrijataDatta/Downloads/destinationfolder2.txt");
	 FileUtils.copyFileToDirectory(file, destDir);
	 File newFile = FileUtils.getFile(destDir, "file1.txt");
	 String newFileData = FileUtils.readFileToString(newFile, "UTF8");
	 System.out.println("Data in new file: " + newFileData);
	 }
	 
	 catch(IOException errMessage) {
         System.out.println(errMessage);
     }
 
	 }
}

