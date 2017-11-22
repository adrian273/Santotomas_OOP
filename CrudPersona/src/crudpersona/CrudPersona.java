package crudpersona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Adrian Verdugo
 */
public class CrudPersona {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Map<String, Persona> dataMap;
        dataMap = new HashMap<>();
        Helpers help = new Helpers();
       
        
        
        boolean exit = false;
        int option;
        String [] options = {"1.. Agregar", "2.. Modificar", "3.. Eliminar", "4.. Listar", "5.. Salir"};
        
        while(!exit) {
            System.out.println("|------------------------------------------------|");
            System.out.println("|                 >>> Menu                       |");
            System.out.println("|------------------------------------------------|");
            for(Object op : options)
                System.out.println(op);
            System.out.println("Ingrese opcion");
            option = input.nextInt();
            
            switch (option) {
                case 1: 
                        help.addNewPerson();
                        break;
                        
                case 2: 
                    break;
                    
                case 3: 
                    help.deletePerson();
                    break;
                
                case 4: 
                    help.viewPerson();break;
                
                case 5: 
                    exit = true; 
                    break;
            }
        }
        
    }
    
}
