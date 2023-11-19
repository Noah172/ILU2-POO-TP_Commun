package model;

public class ReservationHotel extends Reservation {
	private int nombreLitSimple;
	private int nombreLitDouble;
	private int numeroChambre;

	public ReservationHotel(int jour, int mois, int nombreLitSimple, int nombreLitDouble, int numeroChambre) {
		super(jour, mois);
		this.nombreLitSimple = nombreLitSimple;
		this.nombreLitDouble = nombreLitDouble;
		this.numeroChambre = numeroChambre;
	}

	@Override
	public String toString() {
		return "Le " + jour + "/" + mois + "\nChambre " + numeroChambre + " avec " + nombreLitSimple
				+ " lits simples et " + nombreLitDouble + " lits doubles.";
	}

}
