package partei;

import java.util.List;

public class Reservation {
	
	
	/**
	 * Crea dibujo de bus con los asientos disponibles para reservar.
	 * @param bus
	 * @param patente
	 */
	public void dibujarAsiento(List <Bus> bus, String patente){
            bus.forEach((Bus item) -> {
                if(patente.equalsIgnoreCase(item.getPatente())) {
                                System.out.println("    *******************");
                                System.out.println("   *                   **  ");
                                System.out.println("  *                     **  ");
                                System.out.println(" ╔═══════════════════════╗");
                                String escribir = "";
                                int contar = 0;
                                for(int i = 1; i <= item.getCapacidad(); i ++){
                                    String largoUno = String.valueOf(i);
                                    if(null != item.getAsiento().getReserva() && !item.getAsiento().getReserva().isEmpty()){
                                         boolean resultado = obtenerAsientoReservado(item.getAsiento().getReserva(), i);
                                         if(resultado) {
                                             if(escribir.isEmpty()) {
                                                 escribir = " ║ -";
                                             }
                                             else {
                                                 if(contar == 2){
                                                     
                                                     if(largoUno.length() == 1){
                                                         escribir = escribir + "            -";
                                                     }
                                                     else {
                                                         escribir = escribir + "            --";
                                                     }
                                                 }
                                                 else {
                                                    
                                                     if(largoUno.length() == 1) {
                                                         escribir = escribir + "   -";
                                                     }
                                                     else {
                                                        if(i == 10){
                                                            escribir = escribir + "   --";
                                                        }
                                                        else{
                                                            escribir = escribir + "   --";
                                                        }
                                                     }
                                                 }
                                             }
                                         } // fin de resultado = true
                                         else {
                                             if(escribir.isEmpty()) {
                                                 escribir = escribir + " || " + i;
                                             }
                                             else {
                                                 if(contar == 2) {
                                                     if(largoUno.length() == 1) {
                                                         escribir = escribir + "   " + i;
                                                     }
                                                     else {
                                                         if(i == 10)
                                                            escribir = escribir + "  " + i;
                                                     }
                                                 }
                                             }
                                         } // resltado false
                                         
                                         if (contar == 3) {
                                            contar = 0;
                                            System.out.println(escribir + "||");
                                            escribir = "";
                                         }
                                         else{ 
                                             contar++;
                                         }
                                    }
                                }
                                
                                if(!(escribir.isEmpty())) {
                                    if(escribir.length() == 5) {
                                        System.out.println(escribir + "                   ║");
                                    }
                                    if(escribir.length() == 9){
					System.out.println(escribir + "                ║");
                                    }
                                    if(escribir.length() == 21){
					System.out.println(escribir + "    ║");
                                    }
                                }
                                System.out.println(" ╚═══════════════════════╝");
                }
                                       
            });
	
        } // fin de de dibujar los asientos disponibles del bus
        
        /**
         * 
         * @param reserva
         * @param nAsiento
         * @return resultado de asiento disponible [true or false]
         */
        public boolean obtenerAsientoReservado(String reserva, int nAsiento){
            boolean result = false;
            String [] arregloAsiento = reserva.split(";");
            String asiento = String.valueOf(nAsiento);
            
            for(String a : arregloAsiento)
                if(a.equals(asiento)){
                    result = true;
                    break;
                }
            return result;
            
        }
        
}
