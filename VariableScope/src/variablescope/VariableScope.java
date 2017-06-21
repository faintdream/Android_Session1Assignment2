/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablescope;

/**
 *
 * @author FLAdmin
 */
public class VariableScope {
    static int y=100; 
    public int x=5;
    void setLocalVar(){
        int x=10;
        System.out.println("I am local var x: "+ x);
    }
    
    void getInstanceVar(){
        System.out.println("I am instance var x: "+ x);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here                 
        VariableScope vs = new VariableScope();
        vs.setLocalVar();
        vs.getInstanceVar();
        System.out.println("I am a static var y: " +VariableScope.y);
        vs.y=200;
        System.out.println("After editing static var the value of y: "+vs.y);
    }
    
}
