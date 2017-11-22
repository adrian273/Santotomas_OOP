package crudpersona;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Helpers {

    private final Scanner input;
    private Map<String, Persona> dataMap;

    public Helpers() {
        this.dataMap = new HashMap<>();
        this.input = new Scanner(System.in);
    }
    
    /**
     * @info agregar nuevas personas
     */
    public void addNewPerson() {
        System.out.println("|------------------------------------------------|");
        System.out.println("|              << Ingreso Personas               |");
        System.out.println("|------------------------------------------------|");
        String rut, nombre;
        int edad;
        System.out.println(">> Rut : ");
        rut = this.input.next();
        System.out.println(">> Nombre: ");
        nombre = this.input.next();
        System.out.println(">> Edad: ");
        edad = this.input.nextInt();
        Persona ps = new Persona(rut, nombre, edad);
        this.dataMap.put(rut, ps);
    }
    
    /**
     * @info Listar Todas Las personas registradas
     */
    public void viewPerson() {
        System.out.println("|------------------------------------------------|");
        System.out.println("|               << Lista Personas                |");
        System.out.println("|            | RUT | NOMBRE | EDAD |             |");
        System.out.println("|------------------------------------------------|");
        if(this.dataMap.isEmpty()){
            System.out.println("[ERROR]>> No hay registros!");
        }
        else {
            this.dataMap.forEach((k, v) -> {
                System.out.println("-> " + k + " * " + v.getNombre() + " * " + v.getEdad());
            });
        }
    }
    
    /**
     * @info para eliminar personas
     */
    public void deletePerson() {
        System.out.println("|------------------------------------------------|");
        System.out.println("|              << Eliminar Personas               |");
        System.out.println("|------------------------------------------------|");
        viewPerson();
        System.out.println(">> Rut: ");
        String rut = this.input.next();
        if(this.dataMap.containsKey(rut)){
            this.dataMap.remove(rut);
            viewPerson();
            System.out.println("[SUCCESS]>> Eliminado Correctamente!");
        }
        else{
            System.out.println("[ERROR]>> Rut no encontrado");
        }
    }
    
    public void updatePerson() {
        
    }
    
}
