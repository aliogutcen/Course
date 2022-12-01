package com.ogutcenali;

import java.util.ArrayList;



public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Otomobil> otomobilListesi = new ArrayList<>();
		otomobilListesi.add(new Otomobil("bmw", "x5", 2022));
		otomobilListesi.add(new Otomobil("audi", "a5", 2022));
		otomobilListesi.add(new Otomobil("merco", "e180", 2020));
		otomobilListesi.add(new Otomobil("toyota", "corolla", 1980));
		
		
		//Soru
		//Audi a5 otomobili index kullanmadan for döngüsü içinde index kullanmadan silmeye calısın
		
		
		java.util.Iterator<Otomobil> iterator = otomobilListesi.iterator();
		
			for (java.util.Iterator iterator2 = otomobilListesi.iterator(); iterator2.hasNext();) {
					Otomobil otomobil = (Otomobil) iterator2.next();
		 if(otomobil.getMarka().equalsIgnoreCase("Audi") && otomobil.getModel().equalsIgnoreCase("a5")) {
			 iterator.remove();
		 }
	}
		
		
		
	}

}
