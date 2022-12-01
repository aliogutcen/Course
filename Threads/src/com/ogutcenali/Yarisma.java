package com.ogutcenali;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Yarisma implements Runnable {

	private String name;
	
	public Yarisma(String name) {
		
		this.name = name;
	}

	public void run() {
		
		System.out.println( name+"yarışa başladı");
		for(int i = 0 ; i<=5 ; i+=10) {
			System.out.println(name +"--- " + i);
		}
		System.out.println(name +"yarışı bitirdi");
	}
	
	
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(10);
		for(int i = 0 ; i<=10 ; i++) {
			es.submit(new Yarisma("Yarışmacı."+i+" "));
		}
		es.shutdown();
	}

}
