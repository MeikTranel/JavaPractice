/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import java.util.Scanner;
import Framework.Converter;

/**
 *
 * @author bbsuser
 */
public abstract class BaseUebung {
    protected final Scanner SC;
    protected Converter Conv;
    public BaseUebung(){
        this.SC = new Scanner(System.in);
        this.Conv = new Converter();
    }
}
