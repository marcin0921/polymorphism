public class TestAthlete {

    public static void main(String[] args) {
        Athlete runner = new Runner("Adam", "Kowalski");
        Athlete swimmer = new Swimmer("Paweł", "Zabrodzki");
        Athlete pentathlete = new Pentathlete("Robert", "Trok");

        Athlete [] athletes = new Athlete[3];
        athletes[0] = runner;
        athletes[1] = swimmer;
        athletes[2] = pentathlete;

        for (Athlete athlete : athletes) {
            athlete.show();
            athlete.fightForMedal();
            System.out.println("--------------------------");
        }
    }
}
