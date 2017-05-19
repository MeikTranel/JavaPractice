package edu.meiktranel.javapractice.practices.U190517;

/**
 * Created by meiktranel on 19.05.2017.
 */
public class DenominationContainer {
    private final Currency currency;
    private final double denomination;
    private int remainingAmount;

    public DenominationContainer(Currency currency, double denomination){
        this.currency = currency;
        this.denomination = denomination;
    }

    public DenominationContainer(Currency currency, double denomination, int remainingAmount){
        this(currency, denomination);
        this.remainingAmount = remainingAmount;
    }


    public int getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(int remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public double getDenomination() {
        return denomination;
    }

    public Currency getCurrency() {
        return currency;
    }
}
