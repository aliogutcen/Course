package com.ogutcenali;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("dosya.txt"))
		{
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		} catch (IOException e) {
			System.out.println("I/O hatası.");
		}

	}

}
