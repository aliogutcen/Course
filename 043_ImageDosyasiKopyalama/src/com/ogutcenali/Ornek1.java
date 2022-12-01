package com.ogutcenali;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Ornek1 {

	public static ArrayList<Integer> yeniList = new ArrayList<>();
	
	
	public static void fotografiOku() {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("aa.jpg");
			
			int okunan = fis.read();
		
			
			while(okunan!= -1) {
				yeniList.add(okunan);
				
			}
			

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fis!= null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılırken hata ile karşılaşıldı..");
				}
			}
		}
		
		
		
		
		
	}
	
	
	
	public static void fotografiKopyala() {
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("bb.jpg");
			
			
				for (int integer : yeniList) {
					fos.write(integer);
				}
	
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fos!= null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		fotografiOku();
		fotografiKopyala();
		
		

	}

}
