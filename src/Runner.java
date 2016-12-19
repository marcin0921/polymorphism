public class Runner extends Athlete implements Running {

    public Runner(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void run() {
        System.out.println("I'm running!");
    }

    @Override
    public void fightForMedal() {
        run();
    }
}
