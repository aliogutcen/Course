package com.ogutcenali;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class YuzMetreKosu implements Runnable {

	//run methodu içeirisnde 100 metro kosu yaptrırıcaz 0-100 arası her sayıde mesamiz bir artacak
	//her 10 metrede bir çıktı verelim koşucu şu mesafede diye
	// methodun çalışma süresini hesaplayalım
	// daha sonra 2 tane method oluşturalım
	
	private String name;
	private static long sure;
	public YuzMetreKosu(String name) {

	this.name = name;
	
	}

	
	
	public void yaris() {
		ExecutorService es = Executors.newFixedThreadPool(10);
		for(int i = 0 ; i<=10 ; i++) {
			es.submit(new YuzMetreKosu("Yarışmacı"+i));
		}
		es.shutdown();
			
		System.out.println("Yarışa başladı"+ name);
		for(int i = 0 ; i<=100 ; i+=10) {
			System.out.println(name +"--- " + i);
		}
		System.out.println(name +"yarışı bitirdi");
	}
	

	
}
