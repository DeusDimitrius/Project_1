import static java.lang.System.out;
import java.util.Scanner;

public class ChoiceOfFruit {
    public static void main(String[] args) {

        //Цена килограмма яблок
        final int sApple = 50;
        //Цена килограмма бананов
        final int sBanana = 45;

        Scanner keyboard = new Scanner(System.in);

        out.println("В нашем магазине вы можете купить различные фрукты.");
        out.println("Введите название необходимого фрукта:");

        //Выбор названия фрукта
        //String nameOfFruit = keyboard.next();
        int nameOfFruit = keyboard.nextInt();
        String Apple = "apple";
        int a = 1;
        int b = 2;

        if (nameOfFruit == a) {
            out.println("Ваш выбор - яблоки!");
            out.println("Введите вес пакета фруктов в килограммах");
            //Выбор веса пакета фруктов
            int weightOfFruit = keyboard.nextInt();
            out.println("Вы хотите купить "+weightOfFruit+" килограммов яблок!");
            out.println("Цена килограмма яблок - "+sApple+" рублей.");
            out.println("Ваша покупка на сумму "+weightOfFruit*sApple+" рублей.");
        }

        else if (nameOfFruit == b) {
            out.println("Ваш выбор - бананы!");
            out.println("Введите вес пакета фруктов в килограммах");
            //Выбор веса пакета фруктов
            int weightOfFruit = keyboard.nextInt();
            out.println("Вы хотите купить "+weightOfFruit+" килограммов бананов!");
            out.println("Цена килограмма бананов - "+sBanana+" рублей.");
            out.println("Ваша покупка на сумму "+weightOfFruit*sBanana+" рублей.");
        } else {
            out.println("К сожалению, выбранный товар временно отсутствует.");
        }

        out.println("Спасибо за посещение нашего магазина!");

        keyboard.close();
    }
}
