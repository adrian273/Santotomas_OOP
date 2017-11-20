
package partei;

import java.util.List;

/**
 *
 * @author juaan pablo maraboli
 */
public class DatoAplicacion {
    
    /**
     * 
     * @param cliente lista de clientes
     * @param chofer lista de choferes
     * @param azafata lista de azafatas
     * @param bus lista de buses
     * @param auxiliar  lista de auxiliares
     */
    public void setDato(List<Cliente> cliente , List<Chofer> chofer ,List <Azafata> azafata,List <Bus> bus, List <Auxiliar> auxiliar ){
		
		/*Datos cliente*/
		Cliente cli = new Cliente();
		cli.setNombre("JP");
		cli.setApellido("Maraboli");
		cli.setRut("98");
		cli.setTelefono("4564");
		cli.setCorreo("mail@mail.com");
		cliente.add(cli); 
		
		/*Datos Chofer*/
		Chofer cho = new Chofer();
		cho.setNombre("alan");
		cho.setApellido("verdugo");
		cho.setRut("12");
		cho.setTelefono("1234");
		String lista = "B";
		cho.setLicencia(TipoLicencia.valueOf(lista));
		chofer.add(cho);
		
		/*Datos Azafata*/
		Azafata oAza = new Azafata();
		oAza.setNombre("catalina");
		oAza.setApellido("rojas");
		oAza.setRut("123");
		oAza.setTelefono("1234");
		oAza.setEdad(22);
		azafata.add(oAza); 
		
		/*Datos Auxiliar*/
		Auxiliar auxs = new Auxiliar();
		auxs.setNombre("adrian");
		auxs.setApellido("rokefeler");
		auxs.setRut("56");
		auxs.setTelefono("684654");
		auxs.setTelefono_E("45562");
		auxiliar.add(auxs); 

		/*Datos Bus*/
		Bus microUno = new Bus();
		microUno.setPatente("2589");
		microUno.setCapacidad(25);
		microUno.setCiudadSalida("Contitucion");
		microUno.setCiudadDestino("Talca");
		microUno.setHoraSalida("13:00");
		microUno.settChofer(cho);
		microUno.settAzafata(oAza);
		microUno.settAuxiliar(auxs);
		NuevoAsiento n1 = new NuevoAsiento();
		n1.setReserva("");
		microUno.setNuevoAsiento(n1);
		bus.add(microUno);
		
		
		/*Datos Bus*/
		Bus microDos = new Bus();
		microDos.setPatente("273ka");
		microDos.setCapacidad(10);
		microDos.setCiudadSalida("Talca");
		microDos.setCiudadDestino("Arica");
		microDos.setHoraSalida("15:00");
		microDos.settChofer(cho);
		microDos.settAzafata(oAza);
		microDos.settAuxiliar(auxs);
		NuevoAsiento n2 = new NuevoAsiento();
		n2.setReserva("");
		microDos.setNuevoAsiento(n2);
		bus.add(microDos);
		
		
	}
    
}
