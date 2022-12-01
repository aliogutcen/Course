package com.ogutcenali;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDosyayaYazma_02 {

	public static void main(String[] args) {

		FileOutputStream fos = null;

		// Dosya Açmak için Yöntemler //

		/*
		 * 1.yol : Açacağım dosyayı bir file nesnesi olarak oluşturabiliriz.
		 * 
		 * File file = new File("dosya.txt");
		 * 
		 * try { fos = new FileOutputStream("dosya.txt"); } catch (FileNotFoundException
		 * e) { System.out.println("Dosya bulunamadı."); }
		 */

		// 2.yol

		try {
			// fos = new FileOutputStream("dosya.txt");
			fos = new FileOutputStream("C:\\test\\dosya.txt",true);

			fos.write(67); // Byte byte yazdığı için ASCII tablosundan yazar.
			fos.write(79);
			fos.write(68);
			fos.write(69);
			
			

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
