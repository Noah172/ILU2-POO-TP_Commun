package model;

public abstract class EntiteReservable {
	protected CarnetClientele carnet;
	protected int numero;
	

	public EntiteReservable(CarnetClientele carnet, int numero) {
		super();
		this.carnet = carnet;
		this.numero = numero;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean estLibre(Formulaire formulaire) {
		carnet.
	}
	
	public abstract boolean compatible(Formulaire formulaire);
	
	public abstract Reservation reserver(Formulaire formulaire);
	
	

	

}
