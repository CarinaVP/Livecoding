import java.util.ArrayList;

public class MangosNaranjas {
	private int mangos;
	private int naranjas;
	
	public MangosNaranjas(int mangos, int naranjas) {
		this.mangos = mangos;
		this.naranjas = naranjas;
	}

	public int getMangos() {
		return mangos;
	}

	public void setMangos(int mangos) {
		this.mangos = mangos;
	}

	public int getNaranjas() {
		return naranjas;
	}

	public void setNaranjas(int naranjas) {
		this.naranjas = naranjas;
	}
	
	public String mcd() {
		
		ArrayList <Integer> cajaMan = new ArrayList<>();
		ArrayList <Integer> cajaNar = new ArrayList<>();
		int cajaMayor = 0;
		
		for (int i = 2; i <= mangos; i++) { 
			if(mangos % i == 0) {
				cajaMan.add(i);
			}else if(mangos % i !=0) {
				cajaMan.add(i);
			}//if mangos
		}//for mangos
		
		for (int i = 2; i <= naranjas; i++) { 
			if(naranjas % i == 0) {
				cajaNar.add(i);
			}else if(naranjas % i !=0) {
				cajaMan.add(i);
			}//if naranjas
		}//for naranjas
		

		for (Integer caja : cajaNar) {
			for (Integer cajaMa : cajaMan) {
				if(caja == cajaMa && caja > cajaMayor) {
					cajaMayor = cajaMa;
				}
			}
		}		
		
		int numMango = mangos /  cajaMayor ;
		int numNara =  naranjas /  cajaMayor ;
		
		return "El numero de cajas es: " + cajaMayor + "\nEl numero de mangos en caja es de: " + numMango +
				"\nEl numero de Naranjas en caja es de: " + numNara;
	}// mcd
}
