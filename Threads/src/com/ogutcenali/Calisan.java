package com.ogutcenali;

public class Calisan  extends Thread{
//run metodumuz 10 kere dönsün her dönüşte çalışanın ismini yazn çalışıyor yazın ve her çalışmada gecikmekli gelsin ve mainde thread oluşturup
	
	
	private String name;

	public Calisan(String name) {

	this.name = name;
}

@Override
public void run() {
	for(int i = 0 ; i<=10 ; i++) {
		System.out.println(name+" çalışıyor.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
	
	
}
