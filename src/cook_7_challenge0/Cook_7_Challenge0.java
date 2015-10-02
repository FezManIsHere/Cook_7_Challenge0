/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cook_7_challenge0;

/**
 *
 * @author Ramborux
 */
public class Cook_7_Challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        
        for (int i = 0; i < 502; i++) {
           if (isDivisiblebytwo (i) & isDivisiblebythree (i) & isDivisiblebyfive (i)) {
               System.out.println("Team Building");
           }else {
               if (isDivisiblebytwo (i) & isDivisiblebythree (i)) {
                   System.out.println("chismé");
               }else {
                   if (isDivisiblebythree (i) & isDivisiblebyfive (i)) {
                       System.out.println("Old School");
                   }else {
                       if (isDivisiblebyeleven (i) & isDivisiblebyfive (i)) {
                           System.out.println("Animate this!");
                       }else {
                           if (isDivisiblebyeleven (i) & isDivisiblebythree (i)) {
                               System.out.println("Herr Direktor");
                           }else {
                               if (isDivisiblebyeleven (i) & isDivisiblebytwo (i)) {
                                   System.out.println("ninja");
                               }else {
                                   if (isDivisiblebyfive (i)) {
                                       System.out.println("Vidal");
                                   }else {
                                       if (isDivisiblebythree (i)) {
                                           System.out.println("Claughton");
                                       }else {
                                           if (isDivisiblebytwo (i)) {
                                               System.out.println("Davis");
                                           }
                                       }
                                   }
                           }
                       }
                   }
               }
           }
    
    
    
    
}
    }
    }
    static boolean isDivisiblebytwo(int somenumber) {
        return(somenumber % 2 ==0);
    }
    static boolean isDivisiblebythree(int somenumber) {
        return(somenumber % 3 == 0);
    }
    static boolean isDivisiblebyfive(int somenumber) {
        return(somenumber % 5 == 0);
    }
    static boolean isDivisiblebyeleven(int somenumber) {
        return (somenumber % 11 == 0);
    }
}

