/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evennumberprogram;

/**
 *
 * @author Dell
 */
public class Evennumberprogram {

    public static void main(String[] args) {
        int number =20;
        System.out.println("list of even number from 1 to 100"+number+":");
        for(int i=1;i<=number;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+" ");
            }
        }
    }
}
