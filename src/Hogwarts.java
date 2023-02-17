public class Hogwarts {
    protected String name;
    protected int apparition;
    protected int magic;
    private final int hogQuality;
    public Hogwarts(String name, int apparition, int magic) {
        this.name = name;
        this.apparition = apparition;
        this.magic = magic;
        this.hogQuality = apparition + magic;
    }
    public String getName() {
        return name;
    }
    public int getApparition() {
        return apparition;
    }
    public int getMagic() {
        return magic;
    }

    public int getHogQuality() {
        return  hogQuality;
    }
    public static void studentComparison(Hogwarts hogwarts1, Hogwarts hogwarts2) {
        if (hogwarts1.getHogQuality() > hogwarts2.getHogQuality()) {
            System.out.println(hogwarts1.getName() + " лучший чародей, чем " + hogwarts2.getName());
        } else if (hogwarts2.getHogQuality() > hogwarts1.getHogQuality()) {
            System.out.println(hogwarts2.getName() + " лучший чародей, чем " + hogwarts1.getName());
        } else {
            System.out.println(hogwarts1.getName() + " и " + hogwarts2.getName() + " равны");
        }
    }
}
