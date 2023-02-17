public class Ravenclaw extends Hogwarts {
//    Когтевранцы умны, мудры, остроумны и полны творчества.
    private final int mind;
    private final int wisdom;
    private final int creation;
    private final int ravQuality;
    public Ravenclaw(String name, int apparition, int magic, int mind, int wisdom, int creation) {
        super(name, apparition, magic);
        this.mind = mind;
        this.wisdom = wisdom;
        this.creation = creation;
        this.ravQuality = mind + wisdom + creation;
    }
    public int getMind() {
        return mind;
    }
    public int getWisdom() {
        return wisdom;
    }
    public int getCreation() {
        return creation;
    }

    public int getRavQuality() {
        return ravQuality;
    }
    public String toString() {
        return "Имя " + this.name +
                ", трансгрессия: " + this.apparition +
                ", сила магии: " + this.magic +
                ", ум: " + this.mind +
                ", мудрость: " + this.wisdom +
                ", творчество: " + this.creation;
    }
    public static void studentComparison(Ravenclaw ravenclaw1, Ravenclaw ravenclaw2) {
        if (ravenclaw1.getRavQuality() > ravenclaw2.getRavQuality()) {
            System.out.println(ravenclaw1.getName() + " лучший когтевранец, чем " + ravenclaw2.getName());
        } else if (ravenclaw2.getRavQuality() > ravenclaw1.getRavQuality()) {
            System.out.println(ravenclaw2.getName() + " лучший когтевранец, чем " + ravenclaw1.getName());
        } else {
            System.out.println(ravenclaw1.getName() + " и " + ravenclaw2.getName() + " равны");
        }
    }
}
