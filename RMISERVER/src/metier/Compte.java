package metier;
import java.io.Serializable;
import java.util.Date;

public class Compte implements Serializable{
	private int code;
	private double solde;
	private Date dateCreation;
	
	//constructeur par defaut
	public Compte() {}
	//constructeur
	public Compte(int code, double solde, Date dateCreation) {
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}
	
	//Getters & Setters
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public double getSolde() {
		return solde;
	}
	
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public Date getDate() {
		return dateCreation;
	}
	
	public void setDate(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
}
