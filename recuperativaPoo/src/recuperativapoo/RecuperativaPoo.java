
package recuperativapoo;
import java.util.Scanner;
import java.util.HashMap;


/**
 *
 * @author Adrian Verdugo
 * @version 1.0
 * @since 06-12-2017
 */
public class RecuperativaPoo {

    
    public static void main(String[] args) {
        
        HashMap<String, Persona> data = new HashMap<>();
        Scanner input = new Scanner(System.in);
        
        String rut, name, lastName;
        int valueHour, workHour;
        
        boolean exit = false;
        
        while(!exit) {
            String [] options = {"1.Agregar", "2.Modificar", "3.Eliminar", "4.Ver", "5.Listar", "6.Salir"};
            for(String o : options)
                System.out.println(o);
            int option = input.nextInt();
            
            switch(option) {
                case 1:
                    System.out.println("---------- 1.Agregar ----------");
                    System.out.println("Rut: ");
                    rut = input.next();
                    if(!data.containsKey(rut)) {
                        System.out.println("Nombre: ");
                        name = input.next();
                        System.out.println("Apellido: ");
                        lastName = input.next();
                        System.out.println("Valor Hora: ");
                        valueHour = input.nextInt();
                        System.out.println("Horas Trabajadas: ");
                        workHour = input.nextInt();
                        Persona p = new Persona(rut, name, lastName, valueHour, workHour);
                        data.put(rut, p);
                        System.out.println("[SUCCESS] >> Agregado Correctamente");
                    } else {
                        System.out.println("[ERROR] >> Rut Existente!");
                    }       
                    break;
                    
                case 2 :
                    System.out.println("---------- 2.Modificar ----------");
                    System.out.println("Rut: ");
                    rut = input.next();
                    if(!data.containsKey(rut)) {
                        System.out.println("[ERROR] >> Rut no existe!");
                    } else {
                        System.out.println("Nombre: ");
                        name = input.next();
                        System.out.println("Apellido: ");
                        lastName = input.next();
                        System.out.println("Valor Hora: ");
                        valueHour = input.nextInt();
                        System.out.println("Horas Trabajadas: ");
                        workHour = input.nextInt();
                        Persona p = new Persona(rut, name, lastName, valueHour, workHour);
                        data.replace(rut, p);
                        System.out.println("[SUCCESS] >> Modificado Correctamente!");
                    }
                    break;
                    
                case 3:
                    System.out.println("---------- 3.Eliminar ----------");
                    System.out.println("Rut: ");
                    rut = input.next();
                    if(!data.containsKey(rut))
                        System.out.println("[ERROR] >> Rut no existe!");
                    else {
                        data.remove(rut);
                        System.out.println("[SUCCESS] >> Eliminado Correctamente!");
                    }
                    break;
                    
                case 4:
                    System.out.println("--------- 4.Ver Sueldo ----------");
                    System.out.println("Rut: ");
                    rut = input.next();
                    if(!data.containsKey(rut))
                        System.out.println("[ERROR] >> Rut no existe!");
                    else {
                        for(Persona o : data.values())
                            if(o.getRut().equals(rut))
                                System.out.println(o.getFullName());
                    }
                    break;
                    
                case 5:
                    System.out.println("---------- Lista de Persona ----------");
                    data.values().forEach((item) -> {
                        System.out.println(item.getFullName());
                    });
                    break;
                
                case 6:
                    exit = true;
                    System.out.println("[WARNING] >> FIN");
                    break;
                    
            }
        }
        
    }
    
}
