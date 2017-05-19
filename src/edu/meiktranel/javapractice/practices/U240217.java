
package edu.meiktranel.javapractice.practices;

import edu.meiktranel.javapractice.framework.BaseUebung;
import edu.meiktranel.javapractice.framework.IUebung;

/**
 *
 * @author meiktranel
 */
public class U240217 extends BaseUebung implements IUebung{
    public void DoWhileSample(int nenner, int teiler){        
        System.out.format("n = %d" + '\n',nenner);
        int n = nenner;
        do{            
            System.out.format("Subtrahiere Teiler %d von n %d" + '\n',teiler,n);
            n -= teiler;
        }while(n>=teiler);
        System.out.format("%d mod %d ist gleich %d"+ '\n',nenner,teiler,n);
    }

    @Override
    public void StartUp() {
        DoWhileSample(123,2);
    }
}
