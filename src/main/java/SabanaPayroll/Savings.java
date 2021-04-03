package SabanaPayroll;

public class Savings extends BankAccount {

    public final static double DEPOSIT_DISCOUNT = 2000;
    public final static double ANNUAL_INTEREST_RATE  = 0.01;


    @Override
    public double getDepositDiscount() {
        return 0;
    }

     /**
     * Calcula el porcentaje de intereses y los deposita en la cuenta sin ningun descuento.
     * <br><br>
     * @return el porcentaje depositado en la cuenta.
     */
    public double depositMontlyInterest(){
        return 0;
    }

}
