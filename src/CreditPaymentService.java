public class CreditPaymentService {
    public double calculate(double rate,int time,long credit) {
        // Расчет для аннуитетных платежей //

        // Месячная процентная ставка (= ставка по кредиту /100*12)
        double mRate = rate / (100 * 12);

        // Размер ежемесячного платежа
        double monthlyPayment = credit*mRate/(1-Math.pow((1+mRate),-time));

        return monthlyPayment;
    }
}
