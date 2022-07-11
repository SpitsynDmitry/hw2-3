import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        PrintService printService = new PrintService();


        System.out.println("Задача ООП");
        HogwartsStudent[] hogwartsStudents = {

                new HogwartsStudent(1,"Harry Potter", 12, 20),
                new HogwartsStudent(2,"Драго Малфой", 11, 25),
                new HogwartsStudent(3,"Джастин Финч-Флетчли", 12, 22),
                new HogwartsStudent(4,"Чжоу Чанг", 11, 30),

        };

        printService.print(hogwartsStudents);


        System.out.println("Гриффиндорф");
        GryffindorStudent[] gryffindorStudents = {
                new GryffindorStudent(5,"Garry Potter", 12, 20, 30, 40, 50),
                new GryffindorStudent(6,"Гермиона Грейнджер ", 12, 20, 30, 40, 50),
                new GryffindorStudent(7,"Рон Уизли ", 12, 20, 30, 40, 50),
        };
        printService.print(gryffindorStudents);


        System.out.println("Слизерин");
        SlytherinStudent[] slytherinStudents = {
                new SlytherinStudent(8,"Драко Малфой", 12, 20, 30, 40, 50, 20, 50),
                new SlytherinStudent(9,"Грэхэм Монтегю", 12, 20, 30, 40, 50, 20, 50),
                new SlytherinStudent(10,"Грегори Гойл ", 12, 20, 30, 40, 50, 20, 50),

        };
        printService.print(slytherinStudents);


        System.out.println("Пуффендуй");
        HufflepuffStudent[] hufflepuffStudents = {
                new HufflepuffStudent(11,"Джастин Финч-Флетчли", 11, 26, 31, 47, 51),
                new HufflepuffStudent(12,"Захария Смит", 15, 21, 36, 42, 57),
                new HufflepuffStudent(13,"Седрик Диггори", 14, 22, 35, 40, 58),
        };
        printService.print(hufflepuffStudents);

        System.out.println("Когтевранцы");
        RavenclawStudent[] ravenclawStudents = {
                new RavenclawStudent(14,"Чжоу Чанг", 21, 46, 21, 27, 41, 70),
                new RavenclawStudent(15,"Падма Патил ", 31, 56, 11, 37, 51, 60),
                new RavenclawStudent(16,"Маркус Белби", 41, 66, 41, 47, 61, 50),
        };
        printService.print(ravenclawStudents);

        System.out.println(Arrays.toString(hogwartsStudents));
        System.out.println(Arrays.toString(gryffindorStudents));


            System.out.println("hogwartsStudents.length = " + hogwartsStudents.length);
            for (int i = 0; i < hogwartsStudents.length; i++) {
                HogwartsStudent hogwartsStudent = hogwartsStudents[i];
                System.out.println(" id "+ hogwartsStudent.getId() +" Имя " + hogwartsStudent.getName()
                        + " , Магия  " + hogwartsStudent.getMagic()
                        + " , Расстояние  " + hogwartsStudent.getTransgression());
            }
        hogwartsStudents[0].compareHogwarts(hogwartsStudents[1]);
        }
    }


