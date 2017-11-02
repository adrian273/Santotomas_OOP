package partei;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Adrian Verdugo
 */
public class Menu {
    
    private final Scanner input;
    private String rut, nombre, apellido, telefono;
    
    private final ArrayList<Cliente> cliente;
    private final ArrayList<Chofer> chofer;
    //private TipoLicencia tipoLicencia;
    private final ArrayList<Azafata> azafata;
    private final ArrayList<Auxiliar> auxiliar;
    
    Menu() {
        this.input = new Scanner(System.in);
        cliente = new ArrayList<>();
        chofer = new ArrayList<>();
        azafata = new ArrayList<>();
        auxiliar = new ArrayList<>();
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
                            case 2: this.addNewDriver(); break;
                            case 3: this.addNewAzafata(); break;
                            case 4: this.addNewAssistant(); break; // auxiliar
                            case 5: break;
                            default: System.out.println("Opcion o valida!");
                        }
                        
                        break;
                    
                    case 2:
                        System.out.println("----------- Buscar -----------");
                        for(String search : optionsMain)
                            System.out.println(search);
                        
                        option = this.input.nextInt();
                        
                        switch(option) {
                            case 1: this.searchClient(); break;
                            case 2: this.searchDriver(); break;
                            case 3: this.searchAzafata(); break;
                            case 4: this.searchAssistant(); break;
                            case 5: break;
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
                            case 2: this.viewDriver(); break;
                            case 3: this.viewAzafata(); break;
                            case 4: this.viewAssistant(); break;
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
                System.out.println("**** " + item.getNombre() + " " + item.getApellido() + " " + item.getCorreo());
            });
            
        }
    }
    
    /**
     * buscador de Cliente.
     */
    private void searchClient() {
        System.out.println("Ingrese rut: ");
        this.rut = this.input.next();
        
        System.out.println("------------- Resultado de Busqueda ------------------");
        System.out.println(this.getSearchClient(rut));
    }
    
    /**
     * 
     * @param rut
     * @return datos del cliente encontrado
     */
    private String getSearchClient(String rut) {
        for(Cliente c : cliente)
            if(rut.equals(c.getRut()))
                return c.getNombre() + " " + c.getApellido() + " " + c.getCorreo();
        return "[Error] Resultado no encontrado";
    }
    
    /**
     * ------------------------------------------------------------------------*
     * |                        Choferes                                       |
     * ------------------------------------------------------------------------*
     */
    
    /**
     * @info Agregar nuevos clientes
     */
    private void addNewDriver() {
        System.out.println("------------ Choferes --------------------");
        System.out.println("Rut: ");
        this.rut = this.input.next();
        
        System.out.println("Nombre: ");
        this.nombre = this.input.next();
        
        System.out.println("Apellido: ");
        this.apellido = this.input.next();
        
        System.out.println("Telefono");
        this.telefono = this.input.next();
        
        System.out.println( "Tipo licencia :" + Arrays.toString(TipoLicencia.values()));
        
        TipoLicencia tipoLicencia = TipoLicencia.valueOf(this.input.next());
        
        Chofer cho = new Chofer(tipoLicencia, this.rut, this.nombre, this.apellido, this.telefono);
        chofer.add(cho);
        
    }
    
    /**
     * @info Lista para ver a los choferes
     */
    
    private void viewDriver() {
        if(chofer.isEmpty()){
            System.out.println("[ERROR]No hay datos que mostrar !");
        }
        else {
            chofer.forEach((item) -> {
                System.out.println("***" + item.getNombre() + " " + item.getApellido() + "[RUT] " + item.getRut());
            });
        }
    }
    
    /**
     * buscador de choferes.
     */
    private void searchDriver() {
        System.out.println("Ingrese rut: ");
        this.rut = this.input.next();
        
        System.out.println("------------- Resultado de Busqueda ------------------");
        System.out.println(this.getSearchDriver(rut));
    }
    
    /**
     * 
     * @param rut
     * @return datos del choferes encontrado
     */
    private String getSearchDriver(String rut) {
        for(Chofer c : chofer)
            if(rut.equals(c.getRut()))
                return c.getNombre() + " " + c.getApellido() + " tipo licencia: " + c.getLicencia().name();
        return "[Error] Resultado no encontrado";
    }
    
    /**
     * |------------------------------------------------------------------|
     * |                    Auxiliar                                      |
     * |------------------------------------------------------------------|
     */
    
    private void addNewAssistant() {
        System.out.println("------------ Auxliar --------------------");
        System.out.println("Rut: ");
        this.rut = this.input.next();
        
        System.out.println("Nombre: ");
        this.nombre = this.input.next();
        
        System.out.println("Apellido: ");
        this.apellido = this.input.next();
        
        System.out.println("Telefono");
        this.telefono = this.input.next();
        
        String telefonoEmergencia = this.input.next();
        
        Auxiliar aux = new Auxiliar(telefonoEmergencia, this.rut, this.nombre, this.apellido, this.telefono);
        auxiliar.add(aux);
        
    }
    
    private void viewAssistant() {
        System.out.println("------------------ Lista de auxiliares -----------------");
        if(auxiliar.isEmpty()) 
            System.out.println("[Error] No hay datos que mostrar");
        else
            auxiliar.forEach((item) -> {
                System.out.println("***" + item.getNombre() + " " + item.getApellido() + "[RUT] " + item.getRut());
            });
    }
    
    /**
     * buscador de Axuliarles.
     */
    private void searchAssistant() {
        System.out.println("Ingrese rut: ");
        this.rut = this.input.next();
        
        System.out.println("------------- Resultado de Busqueda ------------------");
        System.out.println(this.getSearchAssistant(rut));
    }
    
    /**
     * 
     * @param rut
     * @return datos del auxilar encontrado
     */
    private String getSearchAssistant(String rut) {
        for(Auxiliar a : auxiliar)
            if(rut.equals(a.getRut()))
                return a.getNombre() + " " + a.getApellido() + " " + a.getTelefono_E();
        return "[Error] Resultado no encontrado";
    }
    
    /**
     * |-----------------------------------------------------------------------|
     * |                                Azafatas                               |
     * |-----------------------------------------------------------------------|

     */
    
    
    /**
     * @info @agregar nueva azafata
     */
    private void addNewAzafata() {
        System.out.println("------------ Azafata --------------------");
        System.out.println("Rut: ");
        this.rut = this.input.next();
        
        System.out.println("Nombre: ");
        this.nombre = this.input.next();
        
        System.out.println("Apellido: ");
        this.apellido = this.input.next();
        
        System.out.println("Telefono");
        this.telefono = this.input.next();
        
        System.out.println("Edad: ");
        int edad = this.input.nextInt();
        
        if(edad > 21) {
            Azafata aza = new Azafata(edad, this.rut, this.nombre, this.apellido, this.telefono);
            azafata.add(aza);
        }else {
            System.out.println("[Error!]Edad no Apropiada para el trabajo");
        }
    }
    
    /**
     * @info Lista de azafatas.
     */
    private void viewAzafata() {
        System.out.println("---------------------- Lista de Azafatas -----------------------");
        if(azafata.isEmpty()) System.out.println("[Error] No hay datos que mostrar!");
        
        else
        azafata.forEach((item) -> {
            System.out.println("***" + item.getNombre() + " " + item.getApellido() + "[RUT] " + item.getRut());
        });
    }
    
    /**
     * buscador de azafatas.
     */
    private void searchAzafata() {
        System.out.println("Ingrese rut: ");
        this.rut = this.input.next();
        
        System.out.println("------------- Resultado de Busqueda ------------------");
        System.out.println(this.getSearchAzafata(rut));
    }
    
    /**
     * 
     * @param rut
     * @return datos de la azafata encontrada
     */
    private String getSearchAzafata(String rut) {
        for(Azafata a : azafata)
            if(rut.equals(a.getRut()))
                return a.getNombre() + " " + a.getApellido() + " " + a.getEdad();
        return "[Error] Resultado no encontrado";
    }
}
