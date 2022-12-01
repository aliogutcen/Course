package com.ogutcenali;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class DosyaKopyalayici {

	private static ArrayList<Integer> dosyaIcerigiList = new ArrayList<>();

	private static void dosyayiOku() {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("1.jpg");
			int okunan;
			while ((okunan = fis.read()) != -1) {
				dosyaIcerigiList.add(okunan);

			}

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası");
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılırken bir hata oluştu");
				}
			}
		}

	}

	private static void dosyaKopyala() {

		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("C:\\test\\2.jpg");

			for (int deger : dosyaIcerigiList) {
				fos.write(deger);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		} catch (IOException e) {
			System.out.println("Yazarken hata oluştu");
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					System.out.println("Kapatılırken bir hata meydana geldi");
				}
			}
		}

	}

	public static void main(String[] args) {

		dosyayiOku();
		dosyaKopyala();
		

	}

}
