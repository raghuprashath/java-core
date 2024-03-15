package com.learning.core.day10;
import java.io.*;
import java.util.*;


public class D10P05 {
	public static void writefile(File f,String str)
	{
		try
		{
			FileWriter fw=new FileWriter(f);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(str);
			bw.flush();
			bw.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void size(File f)
	{
		System.out.println("Size:"+f.length()); 
	}
	public static void readfile(File f)
	{
		try
		{
			FileReader fw=new FileReader(f);
			BufferedReader bw=new BufferedReader(fw);
			String str=bw.readLine();
			while(str!=null)
			{
				System.out.println(str);
				str=bw.readLine();
			}
			bw.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deletefile(File f)
	{
		f.delete();
		System.out.println("The file input.txt has been deleted");
	}
	public static void main(String[] args)
	{
		File f=new File("input.txt");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to write");
		String str=sc.nextLine();
		writefile(f,str);
		size(f);
		readfile(f);
		deletefile(f);
	}

}
