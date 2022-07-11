public class PrintService {
    public void print(HogwartsStudent[] hogwartsStudents) {
        System.out.println("hogwartsStudents.length = " + hogwartsStudents.length);
        for (int i = 0; i < hogwartsStudents.length; i++) {
            HogwartsStudent hogwartsStudent = hogwartsStudents[i];
            System.out.println(" Имя " + hogwartsStudent.getName()
                    + " , Магия  " + hogwartsStudent.getMagic()
                    + " , Расстояние  " + hogwartsStudent.getTransgression());
        }
    }
    public void print(GryffindorStudent[] gryffindorStudents) {
        System.out.println("gryffindorStudents.length = " + gryffindorStudents.length);
        for (int i = 0; i < gryffindorStudents.length; i++) {
            GryffindorStudent gryffindorStudent = gryffindorStudents[i];
            System.out.println(" Имя " + gryffindorStudent.getName()
                    + " , Магия  " + gryffindorStudent.getMagic()
                    + " , Расстояние  " + gryffindorStudent.getTransgression()
                    + " , Благородство  " + gryffindorStudent.getNobility()
                    + " , Честность  " + gryffindorStudent.getHonor()
                    + " , Храбрость  " + gryffindorStudent.getBravery());
        }
    }
    public void print(SlytherinStudent[] slytherinStudents) {
        System.out.println("slytherinStudents.length = " + slytherinStudents.length);
        for (int i = 0; i < slytherinStudents.length; i++) {
            SlytherinStudent slytherinStudent = slytherinStudents[i];
            System.out.println(" Имя " + slytherinStudent.getName()
                    + " , Магия  " + slytherinStudent.getMagic()
                    + " , Расстояние  " + slytherinStudent.getTransgression()
                    + " , Хитрость  " + slytherinStudent.getCunning()
                    + " , Решительность  " + slytherinStudent.getDetermination()
                    + " , Амбициозность  " + slytherinStudent.getAmbition()
                    + " , Находчивость  " + slytherinStudent.getIngenuity()
                    + " , Жажда власти  " + slytherinStudent.getThirstForPower());
        }
    }
    public void print(HufflepuffStudent[] hufflepuffStudents) {
        System.out.println("hufflepuffStudents.length = " + hufflepuffStudents.length);
        for (int i = 0; i < hufflepuffStudents.length; i++) {
            HufflepuffStudent hufflepuffStudent = hufflepuffStudents[i];
            System.out.println(" Имя " + hufflepuffStudent.getName()
                    + " , Магия  " + hufflepuffStudent.getMagic()
                    + " , Расстояние  " + hufflepuffStudent.getTransgression()
                    + " , Трудолючие   " + hufflepuffStudent.getDiligence()
                    + " , Верность  " + hufflepuffStudent.getLoyalty()
                    + " , Честность  " + hufflepuffStudent.getHonesty());
        }
    }
    public void print(RavenclawStudent[] ravenclawStudents){
        System.out.println("ravenclawStudents.length = " + ravenclawStudents.length);
        for (int i = 0; i < ravenclawStudents.length; i++) {
            RavenclawStudent ravenclawStudent = ravenclawStudents[i];
            System.out.println(" Имя " + ravenclawStudent.getName()
                    + " , Магия  " + ravenclawStudent.getMagic()
                    + " , Расстояние  " + ravenclawStudent.getTransgression()
                    + " , Ум  " + ravenclawStudent.getCleverness()
                    + " , Мудрость  " + ravenclawStudent.getWisdom()
                    + " , Остроумие  " + ravenclawStudent.getWit()
                    + " , Креативность  " + ravenclawStudent.getCreativity());
        }
    }
}
