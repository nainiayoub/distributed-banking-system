import java.net.InetAddress;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import rmi.BanqueRmiService;
import rmi.IBanqueRemote;


public class ServeurRMI {

	public static void main(String[] args) {
		

		try {
		
			//Demarrage de rmiregistry
			LocateRegistry.createRegistry(1099);
			
			//Creation de l'objet distant
			BanqueRmiService od = new BanqueRmiService();
			
			//Afficher la ref de l'objet distant avant de la publier
			System.out.println(od.toString());
			
			
			
			//URL
			//String url = "rmi://" + InetAddress.getLocalHost().getHostAddress() + "/TestRMI";
			
			//Publier la reference de l'objet distant dans l'annuaire
			
			Naming.bind("rmi://localhost:1099/BK", od);
			//Naming.rebind(url, od);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
