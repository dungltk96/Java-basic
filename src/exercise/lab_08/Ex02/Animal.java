package exercise.lab_08.Ex02;

import java.security.SecureRandom;

/*
This is the first simple version racing contest problem

Horse: Max 75 km/h
Tiger: Max 100 Km/h
Dog: Max 60 KM/h*

Create an Animal class with a method speed() which return a random speeds
Create 3 objects for those 3 animal type
Run and see which animal is winner for racing
Bonus: Default name with Class variable
Format: Winner is <Animal name>, with speed: <speed>
Hints:* * Class name can get from: object.getClass().getSimpleName();
int randomSpeed = new SecureRandom().nextInt(50);
*/
public class Animal {
    protected int speed;

    public int getSpeed() {
        return speed;
    }

    protected int generateRandomsPeed(int maxSpeed){
        return new SecureRandom().nextInt(maxSpeed);
    }
}
