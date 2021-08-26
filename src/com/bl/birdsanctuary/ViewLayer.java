package com.bl.birdsanctuary;

public class ViewLayer {
	public void print() {
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		for (Bird item : birdSanctuaryRepository.getAllBirds() ) {
			System.out.println(item);

		}
	}
	 
	public void printflyable() {
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		for (Bird item : birdSanctuaryRepository.getAllBirds() ) {
			if(item instanceof Flyable) {
			//((Flyable)item).fly();
				Flyable flyable= (Flyable)item;
				flyable.fly();
			}

		}
	}
	
	public void printswimmable() {
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		for (Bird item : birdSanctuaryRepository.getAllBirds() ) {
			if(item instanceof Swimmable) {
			((Swimmable)item).swim();
			}

		}
	}
	
	public void printeatable() {
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		for (Bird item : birdSanctuaryRepository.getAllBirds() ) {
			item.eat();

		}
	}

}
