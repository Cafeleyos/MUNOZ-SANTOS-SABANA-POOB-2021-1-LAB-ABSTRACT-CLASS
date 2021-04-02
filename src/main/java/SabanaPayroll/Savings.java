package SabanaPayroll;

public class Savings extends BankAccount {


    @Override
    public double getDepositDiscount() {
        return 0;
    }

    @Override
    public boolean deposit(double amount){

        return false;
    }
    /**
     * Calcula el porcentaje de intereses y los deposita en la cuenta sin ningñun descuento.
     * <br><br>
     * @return el porcentaje depositado en la cuenta.
     */
    public double depositMontlyInterest(){
        return 0;
    }

}
