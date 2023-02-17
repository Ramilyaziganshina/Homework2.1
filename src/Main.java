public class Main {

    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", 56, 49,38, 50, 87),
                new Gryffindor("Гермиона Грейнджер", 78,34,65,92,43),
                new Gryffindor("Рон Уизли", 23, 54, 87, 38, 100)
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 88, 32,93,69,92),
                new Slytherin("Грэхэм Монтегю", 28, 1, 98, 62, 45),
                new Slytherin("Грегори Гойл", 56, 76, 98, 38, 49)
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 98, 87, 76, 65, 54),
                new Ravenclaw("Падма Патил", 76,65,54,43,32),
                new Ravenclaw("Маркус Белби", 89,78,67,56,45)
        };
        Huffelpuff[] huffelpuffs = {
                new Huffelpuff("Захария Смит", 38, 72, 58, 48, 22),
                new Huffelpuff("Седрик Диггори", 43, 56, 67,78, 34),
                new Huffelpuff("Джастин Финч-Флетчли",56, 90, 67, 34, 87)
        };
        PrintService printService = new PrintService();
        printService.print(gryffindors);
        printService.print(slytherins);
        printService.print(ravenclaws);
        printService.print(huffelpuffs);

        System.out.println(gryffindors[0]);
        System.out.println(slytherins[0]);
        System.out.println(ravenclaws[0]);
        System.out.println(huffelpuffs[0]);
        System.out.println();

        Gryffindor.studentComparison(gryffindors[0], gryffindors[1]);
        Slytherin.studentComparison(slytherins[0], slytherins[1]);
        Ravenclaw.studentComparison(ravenclaws[0], ravenclaws[1]);
        Huffelpuff.studentComparison(huffelpuffs[0],huffelpuffs[1]);
        Hogwarts.studentComparison(gryffindors[0],slytherins[0]);
    }
}