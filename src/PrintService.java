public class PrintService {
    public void print(Gryffindor[] gryffindors) {
        System.out.println("Учащиеся Гриффиндора " + gryffindors.length);
        for (Gryffindor gryffindor : gryffindors) {
            System.out.println("" + gryffindor.getName() +
                    " трансгрессия: " + gryffindor.getApparition() +
                    " сила магии: " + gryffindor.getMagic() +
                    " благородство: " + gryffindor.getNobility() +
                    " честь: " + gryffindor.getHonor() +
                    " храбрость: " + gryffindor.getBravery());
        }
        System.out.println();
    }
    public void print(Slytherin[] slytherins) {
        System.out.println("Учащиеся Слизерина " + slytherins.length);
        for (Slytherin slytherin : slytherins) {
            System.out.println("" + slytherin.getName() +
                    " трансгрессия: " + slytherin.getApparition() +
                    " сила магии: " + slytherin.getMagic() +
                    " хитрость: " + slytherin.getCunning() +
                    " решительность: " + slytherin.getDetermination() +
                    " амбициозность: " + slytherin.getAmbition());
        }
        System.out.println();
    }
    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("Учащиеся Когтеврана " + ravenclaws.length);
        for (Ravenclaw ravenclaw : ravenclaws) {
            System.out.println("" + ravenclaw.getName() +
                    " трансгрессия: " + ravenclaw.getApparition() +
                    " сила магии: " + ravenclaw.getMagic() +
                    " ум: " + ravenclaw.getMind() +
                    " мудрость: " + ravenclaw.getWisdom() +
                    " творчество: " + ravenclaw.getCreation());
        }
        System.out.println();
    }
    public void print(Huffelpuff[] huffelpuffs) {
        System.out.println("Учащиеся Хуффельпуфа " + huffelpuffs.length);
        for (Huffelpuff huffelpuff : huffelpuffs) {
            System.out.println("" + huffelpuff.getName() +
                    " трансгрессия: " + huffelpuff.getApparition() +
                    " сила магии: " + huffelpuff.getMagic() +
                    " трудолюбие: " + huffelpuff.getIndustriousness() +
                    " верность: " + huffelpuff.getLoyalty() +
                    " честь: " + huffelpuff.getHonesty());
        }
        System.out.println();
    }
}
