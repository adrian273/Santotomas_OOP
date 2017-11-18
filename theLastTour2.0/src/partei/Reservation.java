package partei;

import java.io.IOException;
import java.util.List;

public class Reservation {
	
	
	/**
	 * Crea dibujo de bus con los asientos disponibles para reservar.
	 * @param bus
	 * @param patente
	 */
	public void drawBus(List <Bus> bus, String patente){
            bus.forEach((item) -> {
                if(patente.equalsIgnoreCase(item.getPatente()))
                                System.out.println("    ═══════════════════  ");
				System.out.println("   /                   \\  ");
				System.out.println("  /                     \\  ");
				System.out.println(" ╔═══════════════════════╗");
                                int count = 0;
                                for(int i = 1; i <= item.getCapacidad(); i ++)
                                    if(null != item.getAsiento().getReserva() && !item.getAsiento().getReserva().isEmpty())
                                        System.out.println("Asiento disponibles...");
            });
	
        }
}
