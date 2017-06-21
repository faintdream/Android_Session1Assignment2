/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addvarwithoutplus;

import java.util.Scanner;

/**
 *
 * @author FLAdmin
 */
public class AddVarWithoutPlus {
    
    int num1=0;
    int num2=0;
    int adder=0;

    void getNum(){
      System.out.println("num1 :"+num1);
      System.out.println("num2 :"+num2);
        
    }
    void setNum(){
        Scanner s=new Scanner (System.in);
        System.out.print("Please input num1: ");
        num1=Math.abs(s.nextInt());
        System.out.print("Please input num2: ");
        num2=Math.abs(s.nextInt());
        adder();
    }
    
    void adder(){
        adder=num1-(-num2);
        System.out.println("Addition : " +adder);
    }
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AddVarWithoutPlus av=new AddVarWithoutPlus();
        av.getNum();
        av.setNum();
        
    }
    
}
