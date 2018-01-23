/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackboard;

import blackboard.Model.Transaction;
import static java.lang.System.out;
import java.util.Date;

/**
 *
 * @author David_Garcia
 */
public class Blackboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Transaction t = new Transaction();
        
        String payee = " S David   gabriel    garcia         E   ";
        String memo = "  S Dave       is   the cool dude     around   town E ";
        System.out.print("NAME BEFORE: " + payee);
        System.out.print("\nMEMO BEFORE: " + memo);

        t.setMemo(memo);
        t.setPayee(payee);
        t.setDate(new Date());                
        t.setTransactionAmount(12.456);

       
        System.out.print("\nNAME AFTER: " + t.getPayee());
        System.out.print("\nMEMO AFTER: " + t.getMemo());
        System.out.println("\n" + t.getDate().toString());
        System.out.println(t.getTransactionAmount().toString());
        
        System.out.print("\n\n");
    }
    
}
