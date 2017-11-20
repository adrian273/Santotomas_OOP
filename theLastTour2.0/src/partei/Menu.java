package partei;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    
    private final ArrayList<Bus> bus;
    
    private Chofer cho;
    private Azafata aza;
    private Auxiliar aux;
    
    Menu() {
        this.input = new Scanner(System.in);
        cliente = new ArrayList<>();
        chofer = new ArrayList<>();
        azafata = new ArrayList<>();
        auxiliar = new ArrayList<>();
        bus = new ArrayList<>();
    }
    
    public void Main() {
        Reservation reserva = new Reservation();
        DatoAplicacion dato = new DatoAplicacion();
        dato.setDato(cliente, chofer, azafata, bus, auxiliar);
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
                            case 5: this.addNewBus(); break;
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
                            case 5: this.searchBus(); break;
                        }
                        break;
                    
                    case 3:
                        System.out.println("-------------- Reservacion -----------------------");
                        System.out.println("********Buses disponibles******");
                        this.viewBus();
                        System.out.println("Patente: ");
                        String patente = input.next();
                        reserva.dibujarAsiento(bus, patente);
                        reservarAsientos(bus,patente);
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
                            case 5: this.viewBus(); break;
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
     * @info buscador de Cliente.
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
        
        cho = new Chofer(tipoLicencia, this.rut, this.nombre, this.apellido, this.telefono);
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
     * @info buscador de choferes.
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
    
    /**
     * @info agregar nuevo auxiliar
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
        
        System.out.println("Telefono de Emergencia: ");
        String telefonoEmergencia = this.input.next();
        
        Auxiliar aux = new Auxiliar(telefonoEmergencia, this.rut, this.nombre, this.apellido, this.telefono);
        auxiliar.add(aux);
        
    }
    
    /**
     * @info ver lista de auxliar
     */
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
     * @info buscador de Axuliarles.
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
     * @info buscador de azafatas.
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
    
    /**
     * |-----------------------------------------------------------------------|
     * |                            Buses                                      |
     * |-----------------------------------------------------------------------|
     */
    
    /**
     * @info agregar nuevo bus al sistema XD--
     */
    private void addNewBus() {
        System.out.println("----------------- Buses -------------------------");
        
        if(chofer.isEmpty() && azafata.isEmpty() && auxiliar.isEmpty()){
            System.out.println("[ERRROR] Bus no agregado!");
            System.out.println("[ERROR] Ingresar [chofer, azafata i/o auxiliar correspondiente]°");
        }
        else {
            Bus b = new Bus();
            String patente, ciudadSalida, ciudadDestino, horaSalida, rutChofer, rutAzafata, rutAuxiliar;
            int capacidad;

            System.out.println("Patente: ");
            patente = this.input.next();
            System.out.println("Capacidad Bus: ");
            capacidad = this.input.nextInt();
            System.out.println("Ciudad Salida: ");
            ciudadSalida = this.input.next();
            System.out.println("Ciudad Destino: ");
            ciudadDestino = this.input.next();
            System.out.println("Hora Salida: ");
            horaSalida = this.input.next();
            // @add :chofer
            System.out.println("Rut Chofer: ");
            rutChofer = this.input.next();
            // @info :reviso si estan vacios primero
            if(chofer.isEmpty())
                System.out.println("[Error] No hay choferes ingresados!");
            else
                chofer.forEach((item) -> {
                    if(item.getRut().equals(rutChofer))
                      cho = item;
                    else
                        System.out.println("[ERROR]Este rut no existe");
                });
            // @add :azafata
            System.out.println("Rut Azafata: ");
            rutAzafata = this.input.next();
            if(azafata.isEmpty())
                System.out.println("[Error] No hay azafatas ingresadas!");
            else
                azafata.forEach((item) -> {
                    if(item.getRut().equals(rutAzafata))
                        aza = item;
                    else 
                        System.out.println("[ERROR]Este rut no existe");
                });
            // @add auxiliar
            System.out.println("Rut Axuliar: ");
            rutAuxiliar = this.input.next();

            if(auxiliar.isEmpty())
                System.out.println("[Error] No hay auxiliares ingresados!");
            else
                auxiliar.forEach((item) -> {
                    if (item.getRut().equals(rutAuxiliar))
                        aux = item;
                    else
                        System.out.println("[ERROR]Este rut no existe");
                });
            
            b.setPatente(patente);
            b.setCapacidad(capacidad);
            b.setCiudadSalida(ciudadSalida);
            b.setCiudadDestino(ciudadDestino);
            b.setHoraSalida(horaSalida);
            b.settChofer(cho);
            b.settAzafata(aza);
            b.settAuxiliar(aux);
            NuevoAsiento nA = new NuevoAsiento();
            nA.setReserva("");
            b.setNuevoAsiento(nA);
            
            bus.add(b);
            System.out.println("Bus agregado correctamente");
        }
    }
    
    /**
     * @info ver los datos de los busses
     */
    private void viewBus() {
        bus.forEach((item) -> {
            System.out.println("Patente: " + item.getPatente() + 
                    " \nChofer: " + item.gettChofer().getNombre() + " " + item.gettChofer().getApellido() +
                    " \nAzafata: " + item.gettAzafata().getNombre() + " " + item.gettAzafata().getApellido() +
                    " \nAuxiliar: " + item.gettAuxiliar().getNombre() + " " + item.gettAuxiliar().getApellido() +
                    " \nCapacidad: " + item.getCapacidad());
                    System.out.println("----------------------------------------------------------------------");
        });
    }
    
    /**
     * @ para buscar el bus correspondiente°
     */
    private void searchBus() {
        if(bus.isEmpty())
            System.out.println("[ERROR] no hay buses ingresados!");
        else{
            String patenteB = this.input.next();
            bus.forEach((item) -> {
                if(item.getPatente().equals(patenteB))
                    System.out.println(item.getCapacidad() + "Patente: " + item.getPatente() + 
                        " \nChofer: " + item.gettChofer().getNombre() + " " + item.gettChofer().getApellido() +
                        " \nAzafata: " + item.gettAzafata().getNombre() + " " + item.gettAzafata().getApellido() +
                        " \nAuxiliar: " + item.gettAuxiliar().getNombre() + " " + item.gettAuxiliar().getApellido() +
                        " \nCapacidad: " + item.getCapacidad());
                else
                    System.out.println("[ERROR] registro no encontrado!");
            });
        }
    }
    
    
    public static void reservarAsientos(List<Bus> bus, String patente) {
        System.out.println("Ingresar asiento: ");
        Scanner sc = new Scanner(System.in);
        int numeroAsiento = sc.nextInt();
        bus.forEach((elemento) -> {
            if(elemento.getPatente().equalsIgnoreCase(patente)) {
                String r = elemento.getAsiento().getReserva();
                if(r.isEmpty()){
                    r = numeroAsiento + "";
                }
                else {
                    r = r + ";" + numeroAsiento;
                }
                elemento.getAsiento().setReserva(r);
            }
        });
        System.out.println("Asiento seleccionado: " + numeroAsiento);
        
    }
}
