public class Gryffindor extends Hogwarts {
    // Всем Гриффиндорцам присущи благородство, честь и храбрость.
private final int nobility;
private final int honor;
private final int bravery;
private final int griffQuality;
    public Gryffindor(String name, int apparition, int magic, int nobility, int honor, int bravery) {
        super(name, apparition, magic);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        this.griffQuality = nobility + honor + bravery;
    }
    public int getNobility() {
        return nobility;
    }
    public int getHonor() {
        return honor;
    }
    public int getBravery() {
        return bravery;
    }

    public int getGriffQuality() {
        return griffQuality;
    }
    public String toString() {
        return "Имя " + this.name +
                ", трансгрессия: " + this.apparition +
                ", сила магии: " + this.magic +
                ", благородство: " + this.nobility +
                ", честь: " + this.honor +
                ", храбрость: " + this.bravery;
    }
    public static void studentComparison(Gryffindor gryffindor1, Gryffindor gryffindor2) {
        if (gryffindor1.getGriffQuality() > gryffindor2.getGriffQuality()) {
            System.out.println(gryffindor1.getName() + " лучший гриффиндорец, чем " + gryffindor2.getName());
        } else if (gryffindor2.getGriffQuality() > gryffindor1.getGriffQuality()) {
            System.out.println(gryffindor2.getName() + " лучший гриффиндорец, чем " + gryffindor1.getName());
        } else {
            System.out.println(gryffindor1.getName() + " и " + gryffindor2.getName() + " равны");
        }
    }

}
