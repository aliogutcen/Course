package com.ogutcenali;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDosyayaYazma_04 {

	public static void main(String[] args) {

		FileOutputStream fos = null;

		//Dosyaya string yazma

		try {
			
			fos = new FileOutputStream("dosya.txt");
			
			/*
			byte[] array = new byte[word.length()];
			
			for(int i =0 ; i< word.length() ; i++) {
				array[i]= (byte) word.charAt(i);
				
			}*/
			
			String word= "Hello Java";
			byte[]array= word.getBytes();
			fos.write(array);
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı.");
		} catch (IOException e) {
			System.out.println("Yazarken bir hata meydana geldi...");
		} finally {
			if (fos != null) {

				try {
					fos.close();
				} catch (IOException e) {
					System.out.println("Kapatılırken bir hata meydana geldi");
				}

				System.out.println("Hoşçakalın");
			}
		}

	}

	

}
