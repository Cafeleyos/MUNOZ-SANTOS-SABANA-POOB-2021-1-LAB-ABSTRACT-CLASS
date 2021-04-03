package SabanaPayroll;

import java.time.LocalDate;

public class Checking extends BankAccount {

    public final static double DEPOSIT_DISCOUNT = 5000;

    public double getDepositDiscount() {
        return DEPOSIT_DISCOUNT;
    }


    public boolean processCheck(Check check){
        if (LocalDate.now().isBefore(check.getExpirationDate())){
            if(check.getAmount()>DEPOSIT_DISCOUNT) {
                super.deposit(check.getAmount());
                return true;
            }
        }
        return false;
    }



}
