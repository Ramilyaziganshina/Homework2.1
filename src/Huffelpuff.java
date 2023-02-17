public class Huffelpuff extends Hogwarts {
   // Студенты Пуффендуя трудолюбивы, верны, честны.
    private final int industriousness;
    private final int loyalty;
    private final int honesty;
    private final int huffQuality;
    public Huffelpuff(String name, int apparition, int magic, int industriousness, int loyalty, int honesty) {
        super(name, apparition, magic);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
        this.huffQuality = industriousness + loyalty + honesty;
    }
    public int getIndustriousness() {
        return industriousness;
    }
    public int getLoyalty() {
        return loyalty;
    }
    public int getHonesty() {
        return honesty;
    }

    public int getHuffQuality() {
        return huffQuality;
    }
    public String toString() {
        return "Имя " + this.name +
                ", трансгрессия: " + this.apparition +
                ", сила магии: " + this.magic +
                ", трудолюбие: " + this.industriousness +
                ", верность: " + this.loyalty +
                ", честь: " + this.honesty;
    }
    public static void studentComparison(Huffelpuff huffelpuff1, Huffelpuff huffelpuff2) {
        if (huffelpuff1.getHuffQuality() > huffelpuff2.getHuffQuality()) {
            System.out.println(huffelpuff1.getName() + " лучший хуффельпуфец, чем " + huffelpuff2.getName());
        } else if (huffelpuff2.getHuffQuality() > huffelpuff1.getHuffQuality()) {
            System.out.println(huffelpuff2.getName() + " лучший хуффельпуфец, чем " + huffelpuff1.getName());
        } else {
            System.out.println(huffelpuff1.getName() + " и " + huffelpuff2.getName() + " равны");
        }
    }
}
