package com.ogutcenali;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDosyayaYazma_03 {

	public static void main(String[] args) {

		FileOutputStream fos = null;

		//Byte [] array ile yazmak

		try {
			
			fos = new FileOutputStream("dosya.txt");
			byte [] array = {74,65,86,65};
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
