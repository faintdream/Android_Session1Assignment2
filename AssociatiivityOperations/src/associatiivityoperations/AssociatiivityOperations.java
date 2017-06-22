/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associatiivityoperations;

/**
 *
 * @author FLAdmin
 */
public class AssociatiivityOperations {
    
    
    
    void calc(){
        int a=20;
        int b=10;
        b= a-- - --a;// here     10=19 - 18 , so 
                        // 20-=18, result 2                     
        System.out.println("int b= a-- - --a; : "+b);
        int c=a--; // since c is just created we assign postfix a-- ?=18--, so
                    //c=18 ( & ais again decremented by 1, so a=17
        System.out.println("int c=a--; : "+c);
        
        int d=a>>2; // here we are shifting 2 bits to right
                    // converting a =17 to binary by dividing a by half and ignoring reminder
                    //                              1 2 4 8 17
                    // put 1 for odd and
                    //0 for even                    1 0 0 0 1 
                    // add 0 to left to make 
                    // it 8 bits                    0 0 0 1 0 0 0 1
                     // shift 2 bits from right     0 0 0 0 0 1 0 0         
                     // if we were shifting
                     // 2 bits from left
                     // result will be              0 1 0 0 0 1 0 0
                     //anyways, d is now 4
        System.out.println("d=a>>2; : "+d);
        int e=a&b;  // let's first get binary for a & b
                    // a=17 -> 0 0 0 1 0 0 0 1
                    // b=2 ->  0 0 0 0 0 0 1 0
                    // &
                    //         ------------
                    //e=       0 0 0 0 0 0 0 0  
                    // convert binary to int e=0
        System.out.println("int e=a&b; : "+e);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AssociatiivityOperations AO;
        AO = new AssociatiivityOperations();
        AO.calc();
    }
    
}
