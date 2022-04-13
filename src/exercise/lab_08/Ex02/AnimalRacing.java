package exercise.lab_08.Ex02;

import java.util.ArrayList;
import java.util.List;

public class AnimalRacing {
    public Animal getWinner(List<Animal> animalList){
        if (animalList == null || animalList.isEmpty()){
            throw new IllegalArgumentException("Animal list can't be null or empty!");
        }

        if (animalList.size() == 1)
            return animalList.get(0);

        Animal winner = null;
        for (Animal animal : animalList) {
            if (winner == null){
                winner = animal;
            } else if (animal.getSpeed() > winner.speed){
                winner = animal;
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Dog());
        animalList.add(new Horse());
        animalList.add(new Tiger());

        Animal winner = new AnimalRacing().getWinner(animalList);
        System.out.printf("Winner is %s with speed %d", winner.getClass().getSimpleName(), winner.speed);
//        new AnimalRacing().getWinner(null);
//        new AnimalRacing().getWinner(new ArrayList<>());
//        Animal winner1 = new AnimalRacing().getWinner(Arrays.asList(new Tiger()));
//        System.out.printf("Winner is %s with speed %d", winner1.getClass().getSimpleName(), winner1.speed);
    }
}
