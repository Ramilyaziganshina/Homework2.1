public class Slytherin extends Hogwarts {
    // Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int slyQuality;
    public Slytherin(String name, int apparition, int magic, int cunning, int determination, int ambition) {
        super(name, apparition, magic);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.slyQuality = cunning + determination + ambition;
    }
    public int getCunning() {
        return cunning;
    }
    public int getDetermination() {
        return determination;
    }
    public int getAmbition() {
        return ambition;
    }

    public int getSlyQuality() {
        return slyQuality;
    }
    public String toString() {
        return "Имя " + this.name +
                ", трансгрессия: " + this.apparition +
                ", сила магии: " + this.magic +
                ", хитрость: " + this.cunning +
                ", решительность: " + this.determination +
                ", амбициозность: " + this.ambition;
    }
    public static void studentComparison(Slytherin slytherin1, Slytherin slytherin2) {
        if (slytherin1.getSlyQuality() > slytherin2.getSlyQuality()) {
            System.out.println(slytherin1.getName() + " лучший слизеринец, чем " + slytherin2.getName());
        } else if (slytherin2.getSlyQuality() > slytherin1.getSlyQuality()) {
            System.out.println(slytherin2.getName() + " лучший слизеринец, чем " + slytherin1.getName());
        } else {
            System.out.println(slytherin1.getName() + " и " + slytherin2.getName() + " равны");
        }
    }
}
