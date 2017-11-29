/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 *
 * @author Claudio Díaz Pacheco
 */
public class Menu {
    /**
     * Map que almacenara los datos de los trabajadores
     */
    private HashMap<String, Trabajador> Lista = new HashMap<String, Trabajador>();
    
    public Menu(){
    }
    /**
     * Muestra las opciones principales del Menu
     * @throws IOException 
     */
    public void Principal() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int option = 0;
        while (option !=5){
            System.out.println("Menu Principal");
            System.out.println("1.- Agregar Trabajador");
            System.out.println("2.- Modificar Trabajador");
            System.out.println("3.- Eliminar Trabajador");
            System.out.println("4.- Listar Trabajador");
            System.out.print("\n Ingrese su opcion: ");
            option = Integer.parseInt(br.readLine());
            switch (option) {
                case 1: this.AgregarTrabajador();
                        break;
                case 2: if (this.Lista.isEmpty())
                            System.out.println("Lista Vacia");
                        else
                            this.ModificarTrabajador();
                        break;
                case 3: if (this.Lista.isEmpty())
                            System.out.println("Lista Vacia");
                        else
                            this.EliminarTrabajador();
                        break;
                case 4: this.ListarTrabajadores();
                        break;                        
            }
        }
    }
    /**
     * Permite Agregar un nuevo Trabajador a la Lista
     * @throws IOException 
     */
    private void AgregarTrabajador() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese rut del Trabajador: ");
        String nRut = br.readLine();
        if (!this.Lista.containsKey(nRut)) {
            System.out.println("Ingrese el nombre: ");
            String nNombre = br.readLine();
            System.out.println("Ingrese el apellido: ");
            String nApellido = br.readLine();
            Trabajador T = new Trabajador(nRut, nNombre, nApellido);
            this.Lista.put(nRut, T);
        }
        else
            System.out.println("Trabajador esta Ingresado!!");
    }
    /**
     * Metodo que medifica un trabajador de la Lista
     * @throws IOException 
     */
    private void ModificarTrabajador() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese rut del Trabajador: ");
        String nRut = br.readLine();
        if (!this.Lista.containsKey(nRut)) 
            System.out.println("El Trabajador NO Existe!!!");
        else {
            System.out.println("Ingrese el nuevo nombre: ");
            String nNombre = br.readLine();
            System.out.println("Ingrese el nuvevo apellido: ");
            String nApellido = br.readLine();
            Trabajador T = new Trabajador(nRut, nNombre, nApellido);
            this.Lista.replace(nRut, T);
            System.out.println("Trabajador Modificado!!");
        }
    }
    /**
     * Metodo que lista el contenido de la Lista
     */
    private void ListarTrabajadores(){
        if(!this.Lista.isEmpty()){
        this.Lista.values().forEach((T) -> {
            System.out.println(T.Fullname());
        });
        }
        else
            System.out.println("Lista Vacia");
    }
    /**
     * Elimina un trabajador de la lista
     * @throws IOException 
     */
    private void EliminarTrabajador() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el Rut del Trabajador a Eliminar: ");
        String nRut = br.readLine();
        if (!this.Lista.containsKey(nRut)) 
            System.out.println("El Trabajador NO Existe!!!");
        else {
            this.Lista.remove(nRut);
            System.out.println("Trabajador Eliminado");
        }
    }
    
    private void SearchLastName() throws IOException {
        
    }
}
