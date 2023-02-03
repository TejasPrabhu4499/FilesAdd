package com.auriopro.test;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest{
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("D:\\SwabhavTechlabs\\test.txt");
			fw.write("Welcome To Swabhav Techlabs.");
			fw.close();
		} catch (Exception e) 
		{
			System.out.println(e);
		}
		System.out.println("Success..");
	}
}