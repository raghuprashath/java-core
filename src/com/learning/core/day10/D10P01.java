package com.learning.core.day10;

import java.io.*;

import java.util.*;

public class D10P01{

   public static void main(String[] args) throws IOException {
       if (args.length != 2) {
           System.out.println("Please Provide command line input for source and destination files");
           return;
       }

       File source = new File(args[0]);
       File destination = new File(args[1]);

       if (!source.exists()) {
           System.out.println("The Source File Does Not exists");
           return;
       }

       if (destination.exists()) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Whether You want to overwrite (Yes/No)");
           System.out.println("Enter your choice");
           String answer = scanner.nextLine().toLowerCase();
           if (answer.equals("no")) {
               System.out.println("The file will  not be Overridden");
               return;
           }
       }
       else {
    	   destination.createNewFile();
       }
       try{
    	   FileInputStream inputStream = new FileInputStream(source);
    	   FileOutputStream outputStream = new FileOutputStream(destination);
           byte[] buffer = new byte[1024];
           int bytesRead;
           while ((bytesRead = inputStream.read(buffer)) > 0) {
               outputStream.write(buffer, 0, bytesRead);
           }
       }catch (Exception e) {
    	   System.out.println("Information Overridden");
	}
   }
}