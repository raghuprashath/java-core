package com.learning.core.day10;

import java.io.*;


public class D10P04 {
	public static void main(String[] args)
	{
		try
		{
			File inputfile= new File("mydetails.txt");
			File outputfile= new File("mydetailsdisplay.txt");
			inputfile.createNewFile();
			outputfile.createNewFile();
			
			FileInputStream f=new FileInputStream(inputfile);
			FileOutputStream o=new FileOutputStream(outputfile);
			int c;
			while((c=f.read())!=-1)
			{
				o.write(c);
				o.flush();
			}
			f.close();
			o.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}