package com.learning.core.day10;

import java.io.*;


public class D10P06 {
	public static void main(String[] args)
	{
		File eng=new File("DavidEnglish.txt");
		File sci=new File("DavidScience.txt");
		File cs=new File("DavidComputer.txt");
		englishNotes(eng);
		scienceNotes(sci);
		computerNotes(cs);
		readfile(eng);
		readfile(sci);
		readfile(cs);
		
	}
	
	public static void englishNotes(File f)
	{
		try
		{
			FileWriter fw=new FileWriter(f);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("English language learning will allow you to communicate effectively ");
			bw.newLine();
			bw.write("with people from all over the world.");
			bw.flush();
			bw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void scienceNotes(File f)
	{
		try
		{
			FileWriter fw=new FileWriter(f);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("Science is the study of the nature and behaviour of natural things and");
			bw.newLine();
			bw.write("the knowledge we obtain about them.");
			bw.flush();
			bw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void computerNotes(File f)
	{
		try
		{
			FileWriter fw=new FileWriter(f);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("A computer is an electrical Device.");
			bw.newLine();
			bw.write("This machine takes in data as input, process it, and gives output.");
			bw.flush();
			bw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void readfile(File f)
	{
		try
		{
			FileReader fw=new FileReader(f);
			BufferedReader bw=new BufferedReader(fw);
			String line=bw.readLine();
			while(line!=null)
			{
				System.out.println(line);
				line=bw.readLine();
			}
			bw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}