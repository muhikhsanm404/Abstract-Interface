/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author Muh Ikhsan M
 */
public class Kalkulus extends Matematika {
    
    public static void main(String[] args) {
        Kalkulus kalkulus = new Kalkulus();
        kalkulus.methodA();
        kalkulus.methodB();
    }

    @Override
    void methodB() {
         System.out.println("Ini method B di override");
    }
    
    @Override
    void methodA() {
        System.out.println("Method A");
    }
    
}


