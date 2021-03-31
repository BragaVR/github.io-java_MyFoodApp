package progetti;                             // made by Braga Giulio
import java.util.Scanner;
public class project_1 {

	public static void main(String[] args) {
		
		System.out.println("ciao benvenuto a MyFoodApp ,l'app per ricevere a casa i tuoi piatti preferiti!");
		System.out.println("Digita una password:  ");
		Scanner scan = new Scanner (System.in);
		String pass1 = scan.next();
		System.out.println("la tua password adesso è   " + pass1);
		
		System.out.println(" inserisci la tua password:   ");
		String pass = scan.next();
		
		while (!pass.equals(pass1) ) {
			System.out.println("la password immessa non è corretta,riprova");
			pass = scan.next();
						
		}
		
		System.out.println("accesso autorizzato");
		System.out.println("desideri ordinare da MyFoodApp? Si/No");
		String Risp1 = scan.next();
		
		if (Risp1.equals("Si")) {
			System.out.println("Scegli da quale categoria ordinare tra :\n Antipasti \n Pizze  \n Primi \n Secondi \n Dessert");
			String Risp2 = scan.next();
			
			while (!Risp2.equals("Antipasti") && !Risp2.equals("Pizza") && !Risp2.equals("Primi") && !Risp2.equals("Secondi") && !Risp2.equals("Dessert")) {
			System.out.println("siamo spiacenti,il prodotto al momento non è disponibile,la invitiamo a ordinare un altro tra i prodotti elencati");
			Risp2 = scan.next();
			}
			
			if (Risp2.equals("Antipasti")||Risp2.equals("Pizza")|| Risp2.equals("Primi")||Risp2.equals("Secondi")||Risp2.equals("Dessert")) {
				System.out.println("Desidera qualcosa da bere? Si/No");
				String Risp3 = scan.next();				
				
				while (!Risp3.equals("Si") && !Risp3.equals("No")) {
					System.out.println("Risposta non valida, riprova");
					Risp3 = scan.next();
				}
				
				if (Risp3.equals("Si")) {
					System.out.println("gradisce dell'Acqua o una Bibita?");
					String Risp4 = scan.next();
					
					while (!Risp4.equals("Acqua") && !Risp3.equals("Bibita")) {
						System.out.println("Risposta non valida, riprova");
						Risp4 = scan.next();					
				}
					if (Risp4.equals("Acqua") || Risp4.equals("Bibita")) {
						System.out.println("Il tuo ordine e confermato per    " + Risp2 + " e   " + Risp4 );
											
					}
					
					System.out.println("Inserisci la password:");
					pass = scan.next();
					
					
					while (!pass.equals(pass1) ) {
						System.out.println("la password immessa non è corretta,riprova");
						pass = scan.next();
									
					}
					
					System.out.println("L'ordine è stato confermato e in attesa di essere spedito!");
				
				
			}else {
				System.out.println("hai ordinato "+Risp2);
			}
			
		} else { System.out.println(" grazie per aver scelto MyFoodApp");
			
		}
		System.out.println("Inserisci la password:");
		pass = scan.next();
		}
			
		while (!pass.equals(pass1) ) {
			System.out.println("la password immessa non è corretta,riprova");
			pass = scan.next();
		}
								
	    
		System.out.println("Grazie per aver usato MyFoodApp!");
		System.exit(0);
		

	}                                       //made by Braga Giulio

}
