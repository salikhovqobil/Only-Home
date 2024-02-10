package Boshi;

import java.util.Scanner;
public class language_class implements language {
    static Scanner scannerForNumber = new Scanner(System.in);
    static Scanner scannerForString = new Scanner(System.in);

    @Override
    public void til() {
        System.out.println("==== Xush kelibsiz ====");
        System.out.println(" 1.Mamlakatingizni kiriting : O'zbekiston \n 2.Введите свою страну : Россия \n 3. Enter your country : USA");
        System.out.print("Kiriting , Введите, Enter : ");
        int kiriting = scannerForNumber.nextInt();
        switch (kiriting) {
            case 1: {
                System.out.println(" 1.O'zbek tili \n 2.Rus tili \n 3.Ingiliz tili \n 4.Ortga qaytish");
                System.out.print("Tilni kiriting : ");
                int language = scannerForNumber.nextInt();
            }
        }
    }
}
