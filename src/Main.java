public class Main {
    public static void main(String[] args) {

        int a = 500;
        int b = 1100;
        int c = 1;

        int d = b / 100 * c;
        int e;
        if (b > 1000) {
            e = a + b + d;
            System.out.println("Начислено бонусных рублей: " + d);
        } else {
            e = a + b;
            System.out.println("Начислено бонусных рублей: " + 0);
        }

        System.out.println("Баланс: " + e);
    }
}