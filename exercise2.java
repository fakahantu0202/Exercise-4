/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Fakhruddin
 */


abstract class bank{
    abstract void getBalance();
}
class bankA extends bank{
    void getBalance(){
        System.out.println("Balance Bank A: 100");
    }
}
class bankB extends bank{
    void getBalance(){
        System.out.println("Balance Bank B: 150");
    }
}
class bankC extends bank{
    void getBalance(){
        System.out.println("Balance Bank C: 200");
    }
}
public class exercise2 {
    public static void main(String []args){
    bankA a = new bankA();
    bankB b = new bankB();
    bankC c = new bankC();
    
    a.getBalance();
    b.getBalance();
    c.getBalance();
}
}
