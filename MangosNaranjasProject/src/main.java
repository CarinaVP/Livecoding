import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MangosNaranjas mangonar;
		int mangos, naranjas;
		
		System.out.println("Ingrese numero de Mangos\n");
		mangos = sc.nextInt();
		System.out.println();
		System.out.println("Ingrese numero de Naranjas\n");
		naranjas = sc.nextInt();
		
		sc.close();
		
		mangonar = new MangosNaranjas(mangos,naranjas);
		
		System.out.println(mangonar.mcd());
	}//

}//
