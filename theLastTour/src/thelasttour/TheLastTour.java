package thelasttour;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Adrian Verdugo
 * @since 23-10-2017
 * @version 0.3
 * 
 */
public class TheLastTour {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int op, telefono;
        String rut, nombre, apellido;
        
        ArrayList<Cliente> cliente = new ArrayList<>();
        ArrayList<Chofer> chofer = new ArrayList<>();
        ArrayList<Azafata> azafata = new ArrayList<>();
        ArrayList<Auxiliar> auxiliar = new ArrayList<>();
        ArrayList<Bus> bus = new ArrayList<>();
        
        
        Boolean salir = false;
        
        while(!salir){
            try {
                
                String[] options = {"1.. Agregar", "2.. Buscar",
                                    "3.. Reservar", "4.. Ver", "5.. Salir"};
                System.out.println("------------ the last Tour ---------------");
                for(String o : options)
                    System.out.println(o);
                
                System.out.println("Ingresa opcion: ");
                op = input.nextInt();
                
                switch(op) {
                    
                    case 1 :
                        System.out.println("---------- 1. AGREGAR ------------");
                        String[] addOptions = {"1.. Cliente", "2.. Chofer", 
                                                "3.. Azafata", "4.. Auxiliar", "5.. Bus"};
                        for(String addOp : addOptions)
                            System.out.println(addOp);
                        System.out.println("Ingrese su opcion: ");
                        op = input.nextInt();
                        switch(op) {
                            
                            case 1:
                                String correo;
                                System.out.println("Rut: ");
                                rut = input.next();
                                System.out.println("Nombre: ");
                                nombre = input.next();
                                System.out.println("Apellido: ");
                                apellido = input.next();
                                System.out.println("Telefono: ");
                                telefono = input.nextInt();
                                System.out.println("Correo: ");
                                correo = input.next();
                                
                                Cliente cli = new Cliente(correo, rut, nombre, apellido, telefono);
                                cliente.add(cli);
                            
                            case 2 :
                                String tipoLicencia;
                                
                                System.out.println("Rut: ");
                                rut = input.next();
                                System.out.println("Nombre: ");
                                nombre = input.next();
                                System.out.println("Apellido: ");
                                apellido = input.next();
                                System.out.println("Telefono: ");
                                telefono = input.nextInt();
                                System.out.println("Tipo licencia: ");
                                tipoLicencia = input.next();
                                
                                Chofer cho = new Chofer(tipoLicencia, rut, nombre, apellido, telefono);
                                chofer.add(cho);
                                
                            case 3: 
                                int edad;
                                
                                System.out.println("Rut: ");
                                rut = input.next();
                                System.out.println("Nombre: ");
                                nombre = input.next();
                                System.out.println("Apellido: ");
                                apellido = input.next();
                                System.out.println("Telefono: ");
                                telefono = input.nextInt();
                                System.out.println("Edad: ");
                                edad = input.nextInt();
                                
                                Azafata aza = new Azafata(edad, rut, nombre, apellido, telefono);
                                azafata.add(aza);
                             
                            case 4: 
                                
                                String telefonoEmergencia;
                                
                                System.out.println("Rut: ");
                                rut = input.next();
                                System.out.println("Nombre: ");
                                nombre = input.next();
                                System.out.println("Apellido: ");
                                apellido = input.next();
                                System.out.println("Telefono: ");
                                telefono = input.nextInt();
                                System.out.println("Telefono Emergencia: ");
                                telefonoEmergencia = input.next();
                                
                                Auxiliar aux = new Auxiliar(telefonoEmergencia, rut, nombre, apellido, telefono);
                                auxiliar.add(aux);
                                
                                
                        }
                        break;
                        
                        
                    case 2 :
                        
                        break;
                    case 3 :
                        break;
                    case 4 :
                        System.out.println("---------- 1. VEr ------------");
                        String[] viewOptions = {"1.. Cliente", "2.. Chofer", 
                                                "3.. Azafata", "4.. Auxiliar", "5.. Bus"};
                        for(String viewOp : viewOptions)
                            System.out.println(viewOp);
                        
                        System.out.println("Ingrese su opcion: ");
                        op = input.nextInt();
                        
                        switch(op) {
                            
                            case 1 :
                                for(Cliente cli : cliente)
                                    System.out.println("Nombre : " + cli.getNombre() + "Rut: " + cli.getRut());
                            
                            case 2:
                                for(Chofer cho : chofer)
                                    System.out.println("Nombre: " + cho.getNombre() + "Rut: " + cho.getRut());
                            
                            case 3:
                                for(Azafata aza : azafata)
                                    System.out.println("Nombre: " + aza.getNombre() + "Rut: " + aza.getRut());
                            
                            case 4:
                                for(Auxiliar aux : auxiliar)
                                    System.out.println("Nombre: " + aux.getNombre() + "Rut: " + aux.getRut());
                        
                        }
                        break;
                        
                    case 5 : 
                        System.out.println("Ejercucion Terminada...");
                        salir = true;
                        break;
                    
                    default :
                        System.out.println("Opcion no valida!");
                        break;
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
}
