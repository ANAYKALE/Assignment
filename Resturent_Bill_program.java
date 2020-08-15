/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturent_bill_program;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Resturent_Bill_program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        double price1,price2,price3,Tax_amount,Tax_percent;
        double Final_amount;
        int i=1;
        while(i<3)
        {
        System.out.println("Enter Input "+i);
        System.out.print("Price 1:");
        price1=input.nextDouble();
        System.out.print("price 2:");
        price2=input.nextDouble();
        System.out.print("Price 3:");
        price3=input.nextDouble();
        System.out.print("tax%:");
        Tax_percent=input.nextDouble();
        System.out.println();
        System.out.println("Output:");
        Tax_amount=Tax_percent/100*(price1+price2+price3);
        Final_amount=(price1+price2+price3)+Tax_amount;
        System.out.println("Final Amount:"+Final_amount);
        i++;
        }
        
    }
    
}
