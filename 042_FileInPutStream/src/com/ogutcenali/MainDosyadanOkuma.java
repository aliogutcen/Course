package com.ogutcenali;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.annotation.processing.AbstractProcessor;

public class MainDosyadanOkuma {
	
	
public static void dosyadanTekBirByteOkuma() {
		
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("dosya.txt");
			 
			char c = (char) fis.read(); 
			System.out.println(c);
			char c2 = (char) fis.read();
			System.out.println(c2);
		
		} catch (FileNotFoundException e) {
			System.out.println("Dosya Bulunamadı..");
		} catch (IOException e) {
			System.out.println("Okuma Hatası Aldık..");
		}finally {
			if(fis!= null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılırken hata oluştu..");
				}
			}
		}
		
	}

	
public static void dosyadanOrtasindanByteOkuma() {
	
	FileInputStream fis = null;

	try {
		fis = new FileInputStream("dosya3.txt");
		 
		fis.skip(8);
		System.out.println((char)fis.read());
		
	
	} catch (FileNotFoundException e) {
		System.out.println("Dosya Bulunamadı..");
	} catch (IOException e) {
		System.out.println("Okuma Hatası Aldık..");
	}finally {
		if(fis!= null) {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println("Dosya kapatılırken hata oluştu..");
			}
		}
	}
	
}
	
	
public static void dosyaninTumunuOkuma() {
	FileInputStream fis =null;
	int okunan;
	String s= " ";
	
	
	try {
		fis= new FileInputStream("dosya4.txt");
		
		while((okunan= fis.read()) != -1) 
		{
			
			s+= (char) okunan;
			
		}
		System.out.println(s);
		
	} catch (FileNotFoundException e) {
		System.out.println("Dosya bulunamadı..");
	} catch (IOException e) {
		System.out.println("Okuma hatası..");
	}
	
}
	

public static void dosyaninBelirtilenKisminiOku(int n, int m) {
	
	FileInputStream fis = null;
	int okunan;
	String s= "";
	
	
	try {
		
		fis =new FileInputStream("dosya3.txt");
		fis.skip(n);
		int sayac=0;
		while((okunan= fis.read()) != -1) 
		{
			
			s+= (char) okunan;
			sayac++;
			if(sayac== m) {
				break;
			}
		}
		System.out.println(s);
		
	} catch (FileNotFoundException e) {
		System.out.println("Dosya bulunamadı..");
	} catch (IOException e) {
		System.out.println("IO hatası");
	}
	
	
}




public static void main(String[] args) {

		dosyadanTekBirByteOkuma();
		System.out.println("****");
		dosyadanOrtasindanByteOkuma();
		System.out.println("***");
		dosyaninTumunuOkuma();
		System.out.println("****");
		dosyaninBelirtilenKisminiOku(4, 6);
		//Soru
		//Bir Method yazın . bir dosyanın n. karakterinden başlayıp m tane karakter okusun ve ekrana yazsın.
		
		
		System.out.println("Hoşçakalın");

	}

}
