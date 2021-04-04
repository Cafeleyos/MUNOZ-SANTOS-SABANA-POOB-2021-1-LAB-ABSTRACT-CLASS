package SabanaPayroll;

public class Savings extends BankAccount {

    public final static double DEPOSIT_DISCOUNT = 2000;
    public final static double ANNUAL_INTEREST_RATE  = 0.01;
    private double annualInterests =0;


    @Override
    public double getDepositDiscount() {
        return DEPOSIT_DISCOUNT;
    }

    @Override
    public boolean deposit(double amount){

        if(amount>DEPOSIT_DISCOUNT) {
            if (super.deposit(amount-DEPOSIT_DISCOUNT)){
                annualInterests = annualInterests+ (amount-DEPOSIT_DISCOUNT)*ANNUAL_INTEREST_RATE;
                return true;
            }
        }
        return false;
    }
    
    public double getAnnualInterests() {
        return this.annualInterests;
    }
     /**
     * Calcula el porcentaje de intereses y los deposita en la cuenta sin ningun descuento.
     * <br><br>
     * @return el porcentaje depositado en la cuenta.
     */
    public double depositMonthlyInterest(){
        if (super.deposit(annualInterests/12)){
            return annualInterests/12;
        }
        return 0;
    }



}
