package Lab_8;

import java.util.ArrayList;
import java.util.List;

public class Lab_8_2 {
    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(horse);
        animalList.add(tiger);
        animalList.add(dog);
        int max = animalList.get(0).getSpeed();
        String winner = "Horse";
        for (Animal list : animalList) {
            if (max < list.getSpeed()) {
                max = list.getSpeed();
                winner = list.getClass().getSimpleName();
            }
        }
        System.out.println("Winner is: " + winner);
    }
}
