public class Main {
    public static void main(String[] args) {
        // 1 задача
        System.out.println( " Задача 1 ");
        double dog = 3;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper  = 763789;
        System.out.println(paper);

        // 2 задача
        System.out.println( " Задача 2 ");
        dog += 4;
        System.out.println(dog);
        cat += 4;
        System.out.println(cat);
        paper +=4;
        System.out.println(paper);

        // 3 задача
        System.out.println( " Задача 3 ");
        dog -= 3.5; // dog = dog - 3.5
        System.out.println(dog);
        cat -= 1.6;
        System.out.println(cat);
        paper -= 7639;
        System.out.println(paper);

        // 4 задача
        System.out.println(" Задача 4 ");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend /=3;
        System.out.println(friend);

        // Задача 5
        System.out.println( " Задача 5 ");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        // Задача 6
        System.out.println( " Задача 6 ");
        var boxer1Weight =78.2;
        var boxer2Weight =82.7;
        System.out.println( " Общий вес двух бойцов " + (boxer1Weight + boxer2Weight) );
        System.out.println( " Разница между весами двух бойцов" + ( boxer2Weight - boxer1Weight ));

        // Задача 7
        System.out.println( " Задача 7 ");
        System.out.println(" из большего меньшее " + ( boxer2Weight - boxer1Weight ));
        System.out.println( " остаток от деления " + ( boxer2Weight % boxer1Weight));

        // Задача 8
        var totalWorkingHours = 640;
        var hourForEmployee = 8;
        System.out.println(" Всего работников в компании " + (totalWorkingHours / hourForEmployee) + " человек");
        var totalEmployees = totalWorkingHours / hourForEmployee;
        totalEmployees += 94;
        System.out.println( " Если в компании работает " + totalEmployees + " человек, то всего " + ( totalEmployees * hourForEmployee ) + " часа работы может быть" +
                "  поделено между сотрудниками" );


    }
}
