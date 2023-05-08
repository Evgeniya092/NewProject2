public class Main {
    public static void main(String[] args) {

        int balanceStart = 500;
        int payment = 1100;
        int paymentBonus = 1;

        int bonus = payment / 100 * paymentBonus;
        int balanceEnd;
        if (payment > 1000) {
            balanceEnd = balanceStart + payment + bonus;
            System.out.println("Начислено бонусных рублей: " + bonus);
        } else {
            balanceEnd = balanceStart + payment;
            System.out.println("Начислено бонусных рублей: " + 0);
        }

        System.out.println("Баланс: " + balanceEnd);
    }
}