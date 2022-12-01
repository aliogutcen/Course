package com.ogutcenali;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Ogrenci> ogrenciListesi = new ArrayList<>();
		// satır satır okumayı sağlayacak.
		try (Scanner sc = new Scanner(new FileReader("liste.txt"))) {
			while (sc.hasNextLine()) {

				String okunanSatir = sc.nextLine();
				String[] arr = okunanSatir.split(",");
				Ogrenci ogr = new Ogrenci(arr[0], Integer.parseInt(arr[1].trim()));
				ogrenciListesi.add(ogr);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Dosya Bulunamadı..");
		}

		for (Ogrenci ogrenci : ogrenciListesi) {
			System.out.println(ogrenci);
		}
	}

}
