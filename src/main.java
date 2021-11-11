public class main {
    public static void main(String[] args) {

        int RefillSum = 999;

        int AccountTotal = 100;
        int Bonus = 0;
        if (RefillSum >= 1000) {
            Bonus = RefillSum / 100;
        }
        AccountTotal = AccountTotal + RefillSum + Bonus;
        System.out.println(AccountTotal);

    }
}
