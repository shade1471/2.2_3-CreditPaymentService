public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double oneYear = service.calculate(9.99, 12, 1_000_000);
        System.out.println("Ваш ежемесячный платеж на 1 год равен- " + (int) oneYear);

        double twoYear = service.calculate(9.99, 24, 1_000_000);
        System.out.println("Ваш ежемесячный платеж на 2 года равен- " + (int) twoYear);

        double threeYear = service.calculate(9.99, 36, 1_000_000);
        System.out.println("Ваш ежемесячный платеж на 3 года равен- " + (int) threeYear);

        // Ставка по кредиту
//        double rate = 9.99;
        // Срок кредита в месяцах
//        int time = 36;
        // Сумма кредита
//        long credit = 1_000_000;

//        double monthlyPayment = service.calculate(rate, time, credit);
//        System.out.println("Ваш ежемесячный платеж равен- " + (int) monthlyPayment);
    }
}
