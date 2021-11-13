public class Main {
    public static void main(String[] args) {

        int refillsum = 999;

        int accounttotal = 100;
        int bonus = 0;
        if (refillsum >= 1000) {
            bonus = refillsum / 100;
        }
        accounttotal = accounttotal + refillsum + bonus;
        System.out.println(accounttotal);

    }
}
