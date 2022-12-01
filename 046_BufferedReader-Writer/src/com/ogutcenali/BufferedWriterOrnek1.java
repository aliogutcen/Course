package com.ogutcenali;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterOrnek1 {

	
	
	
	
	public static void main(String[] args) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt",true))){
			
			writer.write("Özgür Öz,443\n");
			writer.write("Ali Öz,443\n");
			
		} catch (IOException e) {
			System.out.println("Yazma hatası.");
		}
		
		
	}

}
