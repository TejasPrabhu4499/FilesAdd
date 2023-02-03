package com.auriopro.test;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String args[])
		throws Exception {
		FileReader fr = new FileReader("D:\\SwabhavTechlabs\\test.txt");
		int i;
		while ((i = fr.read()) != -1)
			System.out.print((char) i);
		fr.close();
	}
}