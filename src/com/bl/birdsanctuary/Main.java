package com.bl.birdsanctuary;

import java.util.EnumSet;
import java.util.Scanner;

public class Main {
	BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();

	public static void main(String[] args) {
		Main main=new Main();
		main.showUserMenu();

		/*
		 * Duck duck = new Duck(); Ostrich ostrich = new Ostrich(); Parrot parrot = new
		 * Parrot(); Penguin penguin = new Penguin(); Peacock peacock = new Peacock();
		 * Penguin penguin1 = new Penguin();
		 * 
		 * duck.id = "d001"; ostrich.id = "o001"; parrot.id = "p001"; penguin.id =
		 * "pn001"; penguin1.id = "pn001"; peacock.id = "pc001";
		 * 
		 * 
		 * 
		 * BirdSanctuaryRepository birdSanctuaryRepository = new
		 * BirdSanctuaryRepository();
		 * 
		 * birdSanctuaryRepository.add(duck); birdSanctuaryRepository.add(ostrich);
		 * birdSanctuaryRepository.add(parrot); birdSanctuaryRepository.add(penguin);
		 * birdSanctuaryRepository.add(peacock); birdSanctuaryRepository.add(penguin1);
		 * 
		 * 
		 * birdSanctuaryRepository.print();
		 * 
		 * birdSanctuaryRepository.remove(peacock);
		 * 
		 * System.out.println("after deleting peacock");
		 * 
		 * birdSanctuaryRepository.print();
		 */
		
		System.out.println("Goodbye fellas");
	}

	public void showUserMenu() {
		int choice=0;
		final int EXIT_VALUE=13;
		String birdName;
		Scanner reader = new Scanner(System.in);
		Scanner reader1 = new Scanner(System.in);
		
		while (choice!=EXIT_VALUE) {
			System.out.println("Enter your choice");
			System.out.println("1 to add bird\n2 to remove bird\n3 to print bird\n4 Print swimmable\n5 Print Flyable\n6 Print "
					+ "Eatable\n7 Edit bird\n"+EXIT_VALUE+" to exit");
			choice = reader.nextInt();
			ViewLayer viewLayer=new ViewLayer();
			switch (choice) {
				case 1:
						Bird bird = new Bird();
						Scanner r=new Scanner(System.in);
						System.out.println("Enter the bird id");
						String id=r.nextLine();
						bird.id=id;
						System.out.println("Enter the bird name");
						String name=r.nextLine();
						bird.name=name;
						System.out.println("Enter the bird color");
						int count=1;
						for(Bird.Color color : EnumSet.allOf(Bird.Color.class)){
							System.out.println(""+count+" "+color);
							count++;
						}
						int colorChoice=r.nextInt();
						int count1=1;
						for(Bird.Color color : EnumSet.allOf(Bird.Color.class)){
							if(colorChoice==count1) {
								bird.color=color;
								break;
							}
							count1++;
						}
						System.out.println("Can bird fly");
						boolean fly=r.nextBoolean();
						bird.canfly=fly;
						System.out.println("Can bird swim");
						boolean swim=r.nextBoolean();
						bird.canSwimm=swim;
						
						BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
						birdSanctuaryRepository.add(bird);
					
					//Duck duck = new Duck(); 
					   //Ostrich ostrich = new Ostrich(); 
					   //Parrot parrot = new Parrot(); 
					   //Penguin penguin = new Penguin(); 
					   //Peacock peacock = new Peacock();
					   //Penguin penguin1 = new Penguin();
					   
					  // BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
						 
					   //duck.id = "d001";
					  // ostrich.id = "o001"; 
					   //parrot.id = "p001"; 
					   //penguin.id ="pn001";
					   //penguin1.id = "pn001"; 
					   //peacock.id = "pc001";
						  
					  // birdSanctuaryRepository.add(duck); 
					  // birdSanctuaryRepository.add(ostrich);
					  // birdSanctuaryRepository.add(parrot);
					  // birdSanctuaryRepository.add(penguin);
					  // birdSanctuaryRepository.add(peacock); 
					  // birdSanctuaryRepository.add(penguin1);
					   break;
				case 2:birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
						System.out.println("Enter the birdname to remove");
						birdName=reader1.nextLine();
						Bird removeBird=birdSanctuaryRepository.getBird(birdName);
						birdSanctuaryRepository.remove(removeBird);
						break;
				case 3:
						viewLayer.print();
						break;
				case 4:
						viewLayer.printswimmable();
						break;
				case 5:
						viewLayer.printflyable();;
						break;
				case 6:
						viewLayer.printeatable();
						break;
				case 7:
						editBird();
						
						break;
				//default:System.exit(0);
					
			}
		}

	}

	private void editBird() {
		Scanner r2=new Scanner(System.in);
		System.out.println("Enter the bird name that you want to edit");
		String birdName1=r2.nextLine();
		
		
		//Scanner r3=new Scanner(System.in);
		Bird bird = BirdSanctuaryRepository.getInstance().getBird(birdName1);
		while(true) {
		System.out.println("Enter 1 to change Name\n2 to change ID\n3 to change color\n4 Go back");
		int choice=r2.nextInt();
		switch(choice)
		{
		case 1:r2.nextLine();
				System.out.println("Enter the new Name of the bird");
				String newName=r2.nextLine();
				bird.name=newName;
				break;
		case 2:r2.nextLine();
				System.out.println("Enter the new ID of the bird");
				String newId=r2.nextLine();
				bird.id=newId;
		
				break;
		case 3:
				System.out.println("Choose the color that you wanna change to");
				int count=1;
				//EnumSet.allOf(Bird.Color.class)
	            //.forEach(season) -> 
	            //{
	            //	System.out.println(season);
	            //});
				for(Bird.Color color : EnumSet.allOf(Bird.Color.class)){
					System.out.println(""+count+" "+color);
					count++;
				}
				int colorChoice=r2.nextInt();
				int count1=1;
				for(Bird.Color color : EnumSet.allOf(Bird.Color.class)){
					if(colorChoice==count1) {
						bird.color=color;
						break;
					}
					count1++;
				}
				
				break;
		case 4: return;
			
		}
		}
	}

}
