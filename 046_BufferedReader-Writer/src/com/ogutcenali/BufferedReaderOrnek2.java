package com.ogutcenali;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BufferedReaderOrnek2 {

	public static void oku() {
		
		
		try (BufferedReader read = new BufferedReader(new FileReader("ogrenciler.txt"))){
			
			String s=null ;
			
			while((s= read.readLine())!= null) {
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Ogrenci> ogrenciListesi = new ArrayList<>();
		
		
		try(Scanner sc = new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")))) {
			
			
			while(sc.hasNextLine()) {
				
				String okunan = sc.nextLine();
				System.out.println(okunan);
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı..");
		}

	}

}
