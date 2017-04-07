package com.meiktranel.practice;

import com.meiktranel.practiceframework.BaseUebung;
import com.meiktranel.practiceframework.IUebung;

public class U120217 extends BaseUebung implements IUebung{    
    public void A1() {
        int a, b;
        a = b = 10;
        System.out.println("Beide Zahlen haben jetzt den Wert 10");
    }    
    public void A2(){
        final int a = 12;
        final int b = 4;
        int Sum = a + b;
        int Product = a * b;
        int Diff = a - b;
        float Quote = a / b;
        System.out.format("Summe : %d"+'\n',Sum);
        System.out.format("Produkt : %d"+'\n',Product);   
        System.out.format("Differenz: %d"+'\n', Diff);
        System.out.format("Quotient: %f"+'\n', Quote);
    }    
    public void A3() {
        int x = 1;
        x++;
        ++x;
        x += 1;
    }    
    public void A4() {
        int d = 1,e = 2;
        System.out.format("d: %d | e: %d"+'\n',d,e);
        d *= e;
        System.out.format("d: %d | e: %d"+'\n',d,e);
        d += e++;
        System.out.format("d: %d | e: %d"+'\n',d,e);
        d -= 3 - 2 * e;
        System.out.format("d: %d | e: %d"+'\n',d,e);
        e /= (d + 1); 
        System.out.format("d: %d | e: %d"+'\n',d,e);
    } 
    
    
    
    public void BuchSubtraktion(){
        System.out.print("Subtraktion zweier ganzer Zahlen:"+ '\n');
        System.out.print("Zahl1: ");
        int Zahl1 = this.SC.nextInt();
        System.out.print("Zahl2: ");
        int Zahl2 = this.SC.nextInt();
        int result = Zahl1 - Zahl2;
        System.out.format("Das Ergebnis der Subtraktion %d - %d ist %d." + '\n',Zahl1,Zahl2,result);
    }

    @Override
    public void StartUp() {
        A1();
        A2();
        A3();
        A4();
        BuchSubtraktion();
    }
}
