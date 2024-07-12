package entities;

public class Account {
    private int number;
    private String name;
    private double deposit;

    public Account(){

    }
    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Account(int number, String name, double deposit) {
        this.number = number;
        this.name = name;
        this.deposit = deposit;
    }

    public void addDeposit(double deposit){
        this.deposit = this.deposit + deposit;
    }

    public void  removeDeposit(double deposit){
        if (deposit == 0){
            this.deposit = this.deposit;
        } else{
            this.deposit = this.deposit - (5+deposit);
        }
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }
}
