package Lab_8;

import java.security.SecureRandom;

public class Animal {
    private int speed;
    private int maxspeed;

    public Animal(int maxspeed) {
        this.maxspeed = maxspeed;
        this.speed = new SecureRandom().nextInt(maxspeed);
    }

    public int getSpeed() {
        return speed;
    }
}

