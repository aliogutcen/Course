package com.ogutcenali;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		FileWriter fw = null;

		// FileWriter ile direkt dosyaya veriyi byte'a çevirmeden direkt string olarak
		// yazabiliriz.

		try {
			fw = new FileWriter("dosya.txt", true);

			fw.write("Ali Öğütçen\n");
			fw.write("Ahmet Ozan\n");

		} catch (IOException e) {
			System.out.println("Dosya yazılırken bir hata oluştu.");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılırken bir hata oluştu");
				}
			}
			System.out.println("Hoşçakalın");
		}

	}

}
