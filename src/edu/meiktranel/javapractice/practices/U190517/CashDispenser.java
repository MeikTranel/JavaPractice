package edu.meiktranel.javapractice.practices.U190517;

import java.util.Iterator;

/**
 * Created by meiktranel on 19.05.2017.
 */
public class CashDispenser {

    private DenominationContainer[] denominations;
    private Currency currency;

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


    public CashDispenser(){
        this.denominations = new DenominationContainer[0];
    }

    public void Fill(Currency currency,double denomination, int amount){
        if
    }

    private boolean doesDenominationExist(double denomination){
        for(DenominationContainer denom : denominations){
            if(denom.getDenomination() == denomination)
                return true;
        }
        return false;
    }

}
