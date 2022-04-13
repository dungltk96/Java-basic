package exercise.lab_09;
/*
Racing animal with builder design pattern (adding attribute flyable)
Eagle, Falcon, Tiger, Snake....
Animal tiger = new Animal.Builder().withWings(false).....build();
Animal falcon = new Animal.Builder().withWings(true).....build();
*/

public class Animal {
    protected String name;
    protected int speed;
    protected boolean flyAble;

    public Animal() {
    }

    protected Animal (Builder builder){
        name = builder.name;
        speed = builder.speed;
        flyAble = builder.flyAble;
    }

    // READ ONLY
    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyAble() {
        return flyAble;
    }

    // WRITE ONLY
    public static class Builder {
        protected String name;
        protected int speed;
        protected boolean flyAble;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setFlyAble(boolean flyAble) {
            this.flyAble = flyAble;
            return this;
        }

        // BUILDER
        public Animal build() {
            return new Animal(this);
        }
    }

}
