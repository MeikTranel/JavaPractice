package edu.meiktranel.javapractice.practices;

import edu.meiktranel.javapractice.framework.BaseUebung;
import edu.meiktranel.javapractice.framework.IUebung;
import edu.meiktranel.javapractice.framework.TableBuilder;

/**
 *
 * @author meiktranel
 */
public class U170317 extends BaseUebung implements IUebung{

    public void StartUp() {
        GA1(125f, 0.1f,0.02f, 6.5);
    }
    
    public void GA1(final double listPrice,final double rebate, final double cashDiscount, final double shippingCost){
        TableBuilder TB = new TableBuilder(new String[]{"",""}, 10);
        TB.AddRow(new String[]{"Listenpreis",Conv.ToGermanCurrency(listPrice)});
        TB.AddRow(new String[]{"Rabatt ("+String.format("%.2f",(rebate*100))+"%)",Conv.ToGermanCurrency(listPrice*rebate)});
        double targetPrice = listPrice * (1-rebate);
        TB.AddRow(new String[]{"Zieleinkaufspreis",Conv.ToGermanCurrency(targetPrice)});
        TB.AddRow(new String[]{"Skonto("+String.format("%.2f",(cashDiscount*100))+"%)",Conv.ToGermanCurrency(targetPrice*cashDiscount)});
        double cashPrice = targetPrice * (1-cashDiscount);
        TB.AddRow(new String[]{"Bareinkaufspreis",Conv.ToGermanCurrency(cashPrice)});
        TB.AddRow(new String[]{"Versandkosten",Conv.ToGermanCurrency(shippingCost)});
        TB.AddRow(new String[]{"Bezugspreis",Conv.ToGermanCurrency(shippingCost+cashPrice)});
        System.out.print(TB.toString());
    }
    
}
