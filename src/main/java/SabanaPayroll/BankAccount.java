package SabanaPayroll;

public abstract class BankAccount {

    public static final int TAX_4_1000 = 4;

    private double balance;

    /**
     * Inicializa una cuenta.
     */
    public BankAccount() {
        this.balance = 0;
    }

    /**
     * Obtiene el porcentaje del deposito.
     *
     * @return
     */
    public abstract double getDepositDiscount();

    /**
     * Depositar una cantidad de dinero en la cuenta.
     * <br><br>
     * - El dinero a depositar debe ser mayor que el descuento que aplica el banco por defecto, de no ser así, la
     * operación no puede realizarse.<br>
     * - Si el monto a depositar es correcto, debe realizar el descuento y cambiar el valor del balance.
     * <br><br>
     *
     * @param amount El monto a depositar.
     * @return Si la operación fue exitosa.
     */
    public boolean deposit(double amount) {
        if (amount>0) {
            setBalance(this.balance + amount);
            return true;
        }
        return false;
    }

    /**
     * Realizar un retiro.
     * <br><br>
     * - Si el monto a retirar sumado al impuesto del 4 x 1000 es inferior al balance de la cuenta, la operación no
     * puede realizarse. <br>
     * - De ser posible, debe realizarse el descuento del balance del monto a retirar y del impuesto.
     * <br><br>
     *
     * @param amount El monto a retirar.
     * @return Si la operación fue exitosa.
     */
    public boolean withdraw(double amount) {
        if (amount<this.balance) {
            if(amount + calculateTax(amount)<=balance) {
                this.balance = balance- (amount+calculateTax(amount));
                return true;
            }
        }
        return false;
    }

    /**
     * Devuelve el balance de la cuenta
     *
     * @return El balabce
     */
    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public double calculateTax(double amount){
        return (amount*TAX_4_1000)/1000;
    }
}
