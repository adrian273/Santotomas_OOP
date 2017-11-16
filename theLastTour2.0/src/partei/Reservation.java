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
                
            });
		for (Bus bus2 : bus) {
			if(patente.equalsIgnoreCase(bus2.getPatente())){
				
				System.out.println("    ═══════════════════  ");
				System.out.println("   /                   \\  ");
				System.out.println("  /                     \\  ");
				System.out.println(" ╔═══════════════════════╗");
			
				String print = "";
				int cont =0;
				for (int i = 1; i <= bus2.getCapacidad(); i++) {
					if(null != bus2.getAsiento().getReservados() && !bus2.getAsiento().getReservados().isEmpty()){
						
					boolean res = obtieneReservados(bus2.getAsiento().getReservados(), i);
					
						if(res){
							if(print.isEmpty()){
								print = " ║ -";
							}else{
								if(cont == 2){
									
									String lar1 = String.valueOf(i);
									if(lar1.length() == 1){
										print = print + "            -";
									}else{
										print = print + "          --";
									}
								}else{
									String lar = String.valueOf(i);
									if(lar.length() == 1){
										print = print + "   -";
									}else{
										if(i == 10){
											print = print + "   --";
										}else{
											print = print + "  --";
										}
									}
								}
							}
						}else{
							if(print.isEmpty()){
								print = " ║ "+i;
							}else{
								if(cont == 2){
									
									String lar1 = String.valueOf(i);
									if(lar1.length() == 1){
										print = print + "            "+i;
									}else{
										print = print + "          "+i;
									}
								}else{
									String lar = String.valueOf(i);
									if(lar.length() == 1){
										print = print + "   "+i;
									}else{
										if(i == 10){
											print = print + "   "+i;
										}else{
											print = print + "  "+i;
										}
									}
								}
							}
						}
						
					}else{
						if(print.isEmpty()){
							print = " ║ "+i;
						}else{
							if(cont == 2){
								
								String lar1 = String.valueOf(i);
								if(lar1.length() == 1){
									print = print + "            "+i;
								}else{
									print = print + "          "+i;
								}
							}else{
								String lar = String.valueOf(i);
								if(lar.length() == 1){
									print = print + "   "+i;
								}else{
									if(i == 10){
										print = print + "   "+i;
									}else{
										print = print + "  "+i;
									}
								}
							}
						}
					}
					
					if(cont == 3){
						cont = 0;
						System.out.println(print+"║");
						print = "";
					}else{
						cont++;
					}
				}
				
				/* if para determinar el ancho del dibujo, para cerralo y que quede todo cuadrado  */
				if(!print.isEmpty()){
					
					if(print.length() == 5){
						System.out.println(print+ "                    ║");
					}
					if(print.length() == 9){
						System.out.println(print+ "                ║");
					}
					if(print.length() == 21){
						System.out.println(print+ "    ║");
					}
				}
				
				System.out.println(" ╚═══════════════════════╝");
			}
		}
		
		
	}
	
	
	public boolean obtieneReservados(String reservados, int nAsiento){
		boolean res = false;
		String [] arrAsientos = reservados.split(";");
		
		String sNAsiento = String.valueOf(nAsiento);
		
		
		for (String asien : arrAsientos) {
			if (asien.equals(sNAsiento)) {
				res = true;
				break;
			}
		}
		return res;
	}
	
}
