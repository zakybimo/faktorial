/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Asisten
 */
public class NewClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);    
        int inputan=scan.nextInt();
        
        int i, tot=1;
        for(i=1;i<inputan;i++){
            tot=tot*i;
            //branch ini namanya branch
            
        }
        System.out.println("faktorial : "+tot);
    }
}
