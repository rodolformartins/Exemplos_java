package contaBancaria;

public class Account {
    //Atributos da classe
    int number;
    String holder;
    double balance;
    double withdrawLimit;


    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }







    //Métodos getters and setters de todos os atributos
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    //Métodos da classe
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        validaSaque(amount);
        this.balance -= amount;
    }


    private void validaSaque(double valorSaque){
        if(valorSaque > getWithdrawLimit()){
            throw new BusinessException("Erro de saque: A quantia excede o limite de saque");
        }
        if (valorSaque > getBalance()){
            throw new BusinessException("Erro de saque: Saldo insuficiente");
        }
    }





}
