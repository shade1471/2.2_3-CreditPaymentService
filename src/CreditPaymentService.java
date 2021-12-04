public class CreditPaymentService {
    public double calculate(double rate, int time, long credit) {
        // Расчет для аннуитетных платежей //
        // Месячная процентная ставка (= ставка по кредиту /100*12)
        double monthlyRate = rate / (100 * 12);

        // Размер ежемесячного платежа
        double monthlyPayment = credit * monthlyRate / (1 - Math.pow((1 + monthlyRate), -time));

        return monthlyPayment;

    }
}
