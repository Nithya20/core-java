package com.heraizen.cj.day6_Instrument;

import java.util.Random;

public class Instruments_Asignment1 {
	public static void main(String[] args) {
		Instrument[] instruments = new Instrument[10];

		Random rand = new Random();

	    for (int i = 0; i < 10; i++) {
	    	int randomNum = rand.nextInt((3 - 1) + 1) + 1;
	    	if (randomNum == 1)
	    		instruments[i] = new Piano();
	    	else if (randomNum == 2)
	    		instruments[i] = new Flute();
	    	else if (randomNum == 3)
	    		instruments[i] = new Guitar();

	    	instruments[i].play();
	    }

	   

	}
	

}



