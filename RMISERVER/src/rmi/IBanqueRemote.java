package rmi;
import java.rmi.*;
import metier.Compte;
import java.util.List;

public interface IBanqueRemote extends Remote{
	public double convertion(double mt) throws RemoteException;
	public Compte consulterCompte(int code) throws RemoteException;
	public List<Compte> listComptes(List<Compte> cpts, Compte c) throws RemoteException;
}
