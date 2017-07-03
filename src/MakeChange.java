import static java.lang.System.out;

public class MakeChange {

    public static void main(String[] args) {
        int total = 248;
        int quarters = total/25;
        int whatsLeft = total % 25;

        int dimes = whatsLeft/ 10;
        whatsLeft = whatsLeft % 10;

        int nickels = whatsLeft / 5;
        whatsLeft = whatsLeft % 5;

        int cents = whatsLeft;

        out.println("Сумма "+ total +
        " центов может быть выдана следующими монетами:");
        out.println(quarters + " монет достоинством 25 центов");
        out.println(dimes + " монет достоинством 10 центов");
        out.println(nickels + " монет достоинством 5 центов");
        out.println(cents + " монет достоинством 1 цент");
    }
}
