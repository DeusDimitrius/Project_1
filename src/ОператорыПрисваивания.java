import static java.lang.System.out;

public class ОператорыПрисваивания {

    public static void main(String[] args) {


        int Apple = 3;
        int Orange = Apple+8;
        int Melon = 1;

        Melon +=2;

        int Fruits = Apple+Orange+Melon;

        String myString = "Купить фрукты:";

        out.println(myString);

        out.println ("Яблоки - "+Apple++);
        out.println ("Апельсины - "+Orange);
        out.println("Дыни - "+Melon);
        out.println("Всего купить фруктов - " + Fruits);

    }

}
