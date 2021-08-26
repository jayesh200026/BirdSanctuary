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
			if(item.canfly) {
			//((Flyable)item).fly();
				//Flyable flyable= (Flyable)item;
				//flyable.fly();
				item.fly();
			}

		}
	}
	
	public void printswimmable() {
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		for (Bird item : birdSanctuaryRepository.getAllBirds() ) {
			if(item.canSwimm) {
			//((Swimmable)item).swim();
				item.swim();
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
