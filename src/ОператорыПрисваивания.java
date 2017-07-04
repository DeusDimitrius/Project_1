import static java.lang.System.out;

public class ОператорыПрисваивания {

    public static void main(String[] args) {


        int Apple = 3;
        int Orange = Apple+8;
        int z = Apple+Orange;

        String myString = "Купить фрукты:";

        out.println(myString);

        out.println ("Яблоки - "+Apple++);
        out.println ("Апельсины - "+Orange);
        out.println("Всего купить фруктов - " + z);


    }

}
