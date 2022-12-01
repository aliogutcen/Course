package com.ogutcenali;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResources {

	/*
	 * TRY-WITH-RESOURCES KULLANIMI
	 * 
	 * Closeable interfacesini implements eden herhangi bir sınıfı
	 * trt-with-resources ile kullanabiliriz. Bu şekilde extra finally kod bloğu
	 * yazmak zorunda kalmayız. JAVA-7 ile birlikte geldi.
	 * 
	 */

	public static void main(String[] args) {

		try (FileWriter fw = new FileWriter("markalar.txt")) {

			Scanner sc = new Scanner(System.in);
			String marka = "";

			// Kullanıcıdan marka girmesini isteyin -1 girene kadar marka bilgisini
			// markalar.txt dosyasına yazdırın.

			while (true) {
				System.out.println("Lütfen bir marka giriniz");
				marka = sc.nextLine();

				if (marka.equals("-1")) {
					System.out.println("Programdan çıkılıyor.Lütfen dosyayı kontrol ediniz.");
					break;
				}
				fw.write(marka + "\n");

			}

		} catch (IOException e) {
			System.out.println("I/O Exception aldık");
		}

	}

}
