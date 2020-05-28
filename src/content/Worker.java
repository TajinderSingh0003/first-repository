/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package content;

/**
 *
 * @author Tj_0003
 */
public class Worker {
    private  String name="Fred";
    private int number;
    
    public String getName()
    {
        return this.name;
    }
 public void setName(String name)
 {
 this.name=name;
 }
 public Worker()
 {
 this(100);
 }
 public Worker(int number)
 {
 this.number=number;
 }
 /**
  * This method returns the worker's number
  * @return Worker's number
  */
  public int getNumber()
    {
        return this.number;
    }
  
}