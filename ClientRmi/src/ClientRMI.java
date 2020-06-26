import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import metier.Compte;
import rmi.IBanqueRemote;

public class ClientRMI {
	
static Scanner s = new Scanner(System.in);
	
	public static int menu() {
		int choix;
		System.out.println("\n1	:	Conversion.");
		System.out.println("2	:	Consultation compte.");
		System.out.println("3	:	Creation du compte.");
		System.out.println("4	:	Liste des comptes.");
		System.out.println("0	:	Quitter.");
		
		System.out.println("Donner votre choix: ");
		choix = s.nextInt();
		
		return choix;
	}
	
	
	
	public static void main(String[]args) {
		//Je me connecte a l'annuaire
		//La methode lookup permet de retourner une reference de l'objet de type Remote
		
		
		try {
			//if (System.getSecurityManager() == null) {
			  //    System.setSecurityManager(new RMISecurityManager());
			//}
			
			IBanqueRemote stub = (IBanqueRemote) Naming.lookup("rmi://localhost:1099/BK");
			
			int choix;
			List<Compte>comptes = new ArrayList<Compte>();
			do {
				
				choix = menu();
				switch(choix){
				
					case 1:
						double montant, converted;
						System.out.println("\nDonner le montant en dh a convertir en euro: ");
						montant = s.nextInt();
						converted = stub.convertion(montant);
						System.out.println("Montant converti: "+converted );
						
						break;
						
					case 2:
						int code;
						System.out.println("\nDonner le code du compte a consulter");
						code = s.nextInt();
						Compte cp = stub.consulterCompte(code);
						
						//Affichage
						
						System.out.println("\tCode : "+cp.getCode());
						System.out.println("\tSolde : "+cp.getSolde());
						System.out.println("\tDate : "+cp.getDate());
						
						break;
						
					case 3:
						int num; double solde; 
						System.out.println("Donner l'identifiant du compte: ");
						num = s.nextInt();
						System.out.println("Saisir le solde du compte: ");
						solde = s.nextDouble();
						
						Compte c = new Compte(num, solde, new Date());
						comptes = stub.listComptes(comptes, c);
						break;
					case 4:
						
						System.out.println("\n*****Liste de compte*****");
						
						for(Compte cpt:comptes) {
							System.out.println("\tCode : "+cpt.getCode());
							System.out.println("\tSolde : "+cpt.getSolde());
							System.out.println("\tDate : "+cpt.getDate());
							System.out.println("------------------------");
						}
						
						break;	
					default:
						System.out.println("Vous avez quitter!");
						break;
				
				}
			}while(choix!=0);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
