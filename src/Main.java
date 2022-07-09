

public class Main {
    public static void main(String[] args) {

        PrintService printService = new PrintService();


        System.out.println("Задача ООП");
        HogwartsStudent[] hogwartsStudents = {

                new HogwartsStudent("Гарри Поттер", 12, 20),
                new HogwartsStudent("Драго Малфой", 11, 25),
                new HogwartsStudent("Джастин Финч-Флетчли", 12, 22),
                new HogwartsStudent("Чжоу Чанг", 11, 30),

        };
        printService.print(hogwartsStudents);


        System.out.println("Гриффиндорф");
        GryffindorStudent[] gryffindorStudents = {
                new GryffindorStudent("Гарри Поттер", 12, 20, 30, 40, 50),
                new GryffindorStudent("Гермиона Грейнджер ", 12, 20, 30, 40, 50),
                new GryffindorStudent("Рон Уизли ", 12, 20, 30, 40, 50),
        };
        printService.print(gryffindorStudents);


        System.out.println("Слизерин");
        SlytherinStudent[] slytherinStudents = {
                new SlytherinStudent("Драко Малфой", 12, 20, 30, 40, 50, 20, 50),
                new SlytherinStudent("Грэхэм Монтегю", 12, 20, 30, 40, 50, 20, 50),
                new SlytherinStudent("Грегори Гойл ", 12, 20, 30, 40, 50, 20, 50),

        };
        printService.print(slytherinStudents);


        System.out.println("Пуффендуй");
        HufflepuffStudent[] hufflepuffStudents = {
                new HufflepuffStudent("Джастин Финч-Флетчли", 11, 26, 31, 47, 51),
                new HufflepuffStudent("Захария Смит", 15, 21, 36, 42, 57),
                new HufflepuffStudent("Седрик Диггори", 14, 22, 35, 40, 58),
        };
        printService.print(hufflepuffStudents);

        System.out.println("Когтевранцы");
        RavenclawStudent[] ravenclawStudents = {
                new RavenclawStudent("Чжоу Чанг", 21, 46, 21, 27, 41,70),
                new RavenclawStudent("Падма Патил ", 31, 56, 11, 37, 51,60),
                new RavenclawStudent("Маркус Белби", 41, 66, 41, 47, 61,50),
        };
        printService.print(ravenclawStudents);
    }
}

