package partei;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Adrian Verdugo
 */
public class Menu {
    
    private final Scanner input;
    private String rut, nombre, apellido, telefono;
    
    private final ArrayList<Cliente> cliente;
    
    Menu() {
        this.input = new Scanner(System.in);
        cliente = new ArrayList<>();
    }
    
    public void Main() {
        String[] options = {"1.. Agregar", "2.. Buscar", "3.. Reserva", "4.. Ver", "5.. Salir"};
        String[] optionsMain = {"1.. Cliente", "2.. Chofer", "3.. Azafata", "4.. Auxiliar", "5.. Buses"};
        int option;
        Boolean exit = false;
        
        while(!exit){
            try {
                System.out.println("----------------The Last Tour--------------------");
                for(String op : options)
                    System.out.println(op);
                
                System.out.println("Ingresa tu opcion");
                option = this.input.nextInt();
                
                switch(option){
                    /**
                     * @info menu para agregar datos
                     */
                    case 1: 
                        System.out.println("------- AGREGAR -----------");
                        for(String addOp : optionsMain)
                            System.out.println(addOp);
                        option = this.input.nextInt();
                        
                        switch(option) {
                            case 1: this.addNewClient(); break;
                            case 2: break;
                            case 3: break;
                            case 4: break;
                            case 5: break;
                            default: System.out.println("Opcion o valida!");
                        }
                        
                        break;
                        
                    /**
                     * @info para ver los datos 
                     */
                    case 4: 
                        System.out.println("--------- Ver ----------------");
                        for(String viewOp : optionsMain)
                            System.out.println(viewOp);
                        
                        option = this.input.nextInt();
                        
                        switch(option) {
                            case 1: this.viewClient(); break;
                            case 2: break;
                            case 3: break;
                            case 4: break;
                            case 5: break;
                            default: System.out.println("Opcion no valida"); break;
                        }
                        
                        break;
                    /***
                     *@info para Salir XD
                     */
                    case 5:
                        exit = true;
                        break;
                }
                
            } catch(Exception error){
                System.out.println("A ocurrido el siguiente error : " + error);
                break;
            }
            
        }
    }
    
    /*
        ------------------------------------------------------------------
        |               Clientes                                         |
        ------------------------------------------------------------------
    */
    
    /**
     * @info Agregar nuevos clientes
     */
    private void addNewClient() {
        System.out.println("------------ Clientes --------------------");
        
        System.out.println("Rut: ");
        this.rut = this.input.next();
        
        System.out.println("Nombre: ");
        this.nombre = this.input.next();
        
        System.out.println("Apellido: ");
        this.apellido = this.input.next();
        
        System.out.println("Telefono");
        this.telefono = this.input.next();
        
        System.out.println("Correo: ");
        String correo = this.input.next();
        
        Cliente cli = new Cliente(correo, this.rut, this.nombre, this.apellido, this.telefono);
        cliente.add(cli);
    }
   
    /**
     * @info Lista de clientes
     */
    private void viewClient() {
        System.out.println("------- Listas de Clientes ----------------------");
        if(cliente.isEmpty()) {
            System.out.println("[Lista vacia]No ahi datos que mostrar !");
        } else {
            cliente.forEach((item) -> {
                System.out.println("**** " + item.getNombre() + " " + item.getApellido());
            });
            
        }
    }
    
}
