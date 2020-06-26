package rmi;

import metier.Compte;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import metier.Compte;

public class BanqueRmiService extends UnicastRemoteObject implements IBanqueRemote{
	
	/**
	 * 
	 */
	

	public BanqueRmiService() throws RemoteException{}
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public double convertion(double mt) throws RemoteException{
		System.out.println("Conversion du montant"+mt);
		return mt*11.3;
	}
	
	@Override
	public Compte consulterCompte(int code) throws RemoteException{
		System.out.println("Consultation du compte"+code);
		Compte cp = new Compte(code, Math.random()*9000, new Date());
		 return cp;
	}
	
	@Override
	public List<Compte> listComptes(List<Compte>cpts, Compte c)throws RemoteException{
		
		System.out.println("Consultation des comptes");
		cpts.add(c);
		return cpts;
	}
	
	public static void main(String[]args) {
		
		
		
	}


	
}
