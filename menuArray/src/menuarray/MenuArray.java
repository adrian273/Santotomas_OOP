/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuarray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kdr
 */
public class MenuArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int op;
        ArrayList<Spray> spray= new ArrayList<Spray>();
        boolean exit = false;
        
        while(!exit){
            try {
                System.out.println("1.. Agregar");
                System.out.println("2.. Ver");
                System.out.println("3.. Salir");
                op = input.nextInt();
            switch(op){
                case 1:
                    System.out.println("marca");
                    String marca = input.next();
                    System.out.println("color");
                    String color = input.next();
                    Spray mtn = new Spray(marca, color);
                    spray.add(mtn);
                    break;
                case 2:
                    for(Spray s : spray)
                        System.out.println(s.getColor());
                    
                    break;
                case 3:
                    
                    exit = true;
                    break;
                }
            } 
            catch(Exception e) {
                System.out.println("Error");
            }
            
        }
    }
    
}
