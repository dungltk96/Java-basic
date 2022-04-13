package exercise.lab_09;

import java.util.ArrayList;
import java.util.List;

public class AnimalRacing {
    public Animal getWinner(List<Animal> animalList) {
        if (animalList == null || animalList.isEmpty()) {
            throw new IllegalArgumentException("Animal list can't be null or empty!");
        }
        Animal winner = null;

        // Filter | !FlyAble
        List<Animal> notFlyAbleAnimals = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.isFlyAble()){
                notFlyAbleAnimals.add(animal);
            }
        }

        // Race | FlyAble
        if (notFlyAbleAnimals.isEmpty()) {
            throw new IllegalArgumentException("No eligible animal to race");
        }
        if (notFlyAbleAnimals.size() == 1) {
            return notFlyAbleAnimals.get(0);
        } else {
            for (Animal animal : notFlyAbleAnimals) {
                if (winner == null){
                    winner = animal;
                }else if (animal.getSpeed() > winner.speed){
                    winner = animal;
                }
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        Animal.Builder animal = new Animal.Builder();
        List<Animal> animalList = new ArrayList<>();

        Animal eagle = animal.setName("Eagle").setSpeed(50).setFlyAble(true).build();
        Animal dog = animal.setName("Dog").setSpeed(60).setFlyAble(false).build();
        Animal tiger = animal.setName("Tiger").setSpeed(70).setFlyAble(false).build();
        Animal sanke = animal.setName("Snake").setSpeed(30).setFlyAble(false).build();

        animalList.add(eagle);
        animalList.add(dog);
        animalList.add(tiger);
        animalList.add(sanke);

        Animal winner = new AnimalRacing().getWinner(animalList);
        System.out.printf("Winner is %s with speed %d", winner.getName(), winner.getSpeed());
    }
}
