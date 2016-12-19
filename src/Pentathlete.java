public class Pentathlete extends Athlete implements Running, Swimming {

    public Pentathlete(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void run() {
        System.out.println("I'm running!");
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming");
    }

    public void shoot() {
        System.out.println("I'm shooting");
    }

    public void beginFencing() {
        System.out.println("I'm beggining fencing");
    }

    public void beginHorseRiding() {
        System.out.println("I'm beggining horse riding");
    }


    @Override
    public void fightForMedal() {
        run();
        swim();
        shoot();
        beginFencing();
        beginHorseRiding();

    }
}
