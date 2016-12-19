public class Swimmer extends Athlete implements Swimming {

    public Swimmer(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming!");
    }

    @Override
    public void fightForMedal() {
        swim();
    }
}
