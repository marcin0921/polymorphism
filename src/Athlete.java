abstract public class Athlete {

    private String name;
    private String surname;

    public Athlete(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void show() {
        System.out.println("Name: " + name + ", Surname: " + surname);
    }

    public abstract void fightForMedal();
}
