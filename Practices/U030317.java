package Practices;

import Framework.BaseUebung;
import Framework.IUebung;
import java.util.Locale;

public class U030317 extends BaseUebung implements IUebung {
    public void A1(final double total){
        final double discount = .1f;
        final double minimumForDiscount = 10.00f;
        double totalAfterDiscount;
        if(total > minimumForDiscount){
            totalAfterDiscount = total * (1 - discount);
        } else {
            totalAfterDiscount = total;
        }
        System.out.print("Preis nach Discount:" + Conv.ToGermanCurrency(totalAfterDiscount) + '\n');
    }    

    public void A2(final int bolts,final int nuts,final int washers){
        final double boltPrice = 0.03f;
        final double nutPrice = 0.05f;
        final double washerPrice = 0.01f;
        if( nuts != bolts ){
            throw new IllegalArgumentException("Kontrollieren Sie Ihre Bestellung!");
        }
        double boltsTotal = boltPrice * bolts;
        double nutsTotal = nutPrice * nuts;
        double washersTotal = washerPrice * washers;
        double finalTotal = boltsTotal+nutsTotal+washersTotal;
        System.out.format("Gesamtpreis: %s" + '\n',Conv.ToGermanCurrency(finalTotal));
    }
    
    public void A3(final double litercapacity, final int percentage,final double consumption){
        if(percentage < 0 || percentage > 100){
            throw new IllegalArgumentException("Something's not quite right with your tank percentage");
        }
        double GallonCapacity = Conv.LiterToGallon(litercapacity);
        double RemainingGallons = GallonCapacity * (percentage / 100f);
        double EstimatedRemainingMileage = RemainingGallons * consumption;
        if(EstimatedRemainingMileage >= 200){
            System.out.format("Weiterfahren!" + '\n');
        } else {
            System.out.format("Tanken!"+ '\n');
        }
        System.out.format("Verbleibende Tankfüllung reicht für %f Meilen." + '\n',EstimatedRemainingMileage);  
    }   
    
    public void StartUp() {        
        A3(70f,60,60f);
        A1(123.12f);
        A2(235,23,88);
    }
}
