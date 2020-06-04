/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoencapsulation;

import content.Worker;

/**
 *
 * @author Tj_0003
 */
public class DemoEncapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("hi");
        Worker one=new Worker();
        System.out.println(one.getName());
        one.setName("Barney");
    System.out.println(one.getName());
    
    Worker two=new Worker(200);
    System.out.println(one.getNumber());
    System.out.println(two.getNumber());
       // System.out.println(one.name);
        
      
       // one.setName("Barney");
        //System.out.println(one.getName);
        
        
        // TODO code application logic here
    }
    
}
