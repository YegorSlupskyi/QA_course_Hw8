package src;

import src.AirTransport.Plane;
import src.Bird.Eagle;
import src.Bird.Penguin;
import src.EarthTransport.Car;
import src.Fish.Carp;
import src.Fish.Pike;
import src.Pet.Cat;
import src.Pet.Dog;
import src.Pet.Hamster;
import src.WaterTransport.Barge;


public class Main {
    public static void main(String[] args) {
        fish();
        pet();
        bird();
        waterTransport();
        airTransport();
        earthTransport();
    }

    public static void fish() {
        Carp theFirstCarp = new Carp("Vasya");
        theFirstCarp.Swim();
        System.out.println(theFirstCarp.getVictimName());
        theFirstCarp.Hide();
        Pike theFirstPike = new Pike("Klavdia");
        theFirstPike.Hunt(theFirstCarp);
        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println();
    }

    public static void pet() {
        Hamster theFirstHamster = new Hamster("Bonbon", "Jungar hamster");
        theFirstHamster.makeSound();
        System.out.println();
        Cat theFirstCat = new Cat("Syrax", "Sfinx");
        theFirstCat.makeSound();
        System.out.println();
        Dog theFirstDog = new Dog("Mike", "Dalmatian");
        theFirstDog.HangAround();
        theFirstDog.makeSound();
        theFirstDog.Hunt(theFirstCat);
        theFirstCat.Hide();
        System.out.println();
        theFirstCat.Hunt(theFirstHamster);
        theFirstHamster.Hide();
        System.out.println("------------------------------------------------------");
        System.out.println();
    }

    public static void bird() {
        Hamster theFirstHamster = new Hamster("Bonbon", "Jungar hamster");
        Eagle theFirstBird = new Eagle("Eagle", "Felix");
        theFirstBird.Fly();
        theFirstBird.Hunt(theFirstHamster);
        System.out.println();
        Penguin theFirstPenguin = new Penguin("Penguin", "Piter");
        theFirstPenguin.Swim();
        theFirstPenguin.Fly();
        System.out.println("------------------------------------------------------");
        System.out.println();
    }

    public static void waterTransport() {
        Barge theFirstBarge = new Barge("Barge");
        theFirstBarge.IsDrivenBy();
        theFirstBarge.Swim();
        System.out.println("------------------------------------------------------");
        System.out.println();
    }

    public static void airTransport() {
        Plane theFirstPlane = new Plane("Plane");
        theFirstPlane.IsDrivenBy();
        theFirstPlane.Fly();
        System.out.println("------------------------------------------------------");
        System.out.println();
    }

    public static void earthTransport() {
        Car theFirstCar = new Car("Range Rover", "Velar");
        theFirstCar.IsDrivenBy();
        System.out.println("------------------------------------------------------");
        System.out.println();
    }
}
