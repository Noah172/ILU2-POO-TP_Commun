package model;

public class FormulaireHotel extends Formulaire {
    private static int numeroChambre;
	private int nbLitsSimples;
    private int nbLitsDoubles;

    public FormulaireHotel(int jour, int mois, int nbLitsSimples, int nbLitsDoubles) {
        super(jour, mois, numeroChambre);
        this.nbLitsSimples = nbLitsSimples;
        this.nbLitsDoubles = nbLitsDoubles;
    }

    public int getNbLitsSimples() {
        return nbLitsSimples;
    }

    public int getNbLitsDoubles() {
        return nbLitsDoubles;
    }

    @Override
    public String toString() {
        return "Le " + jour + "/" + mois + "\nChambre " + IdentificationEntite + " avec " +
               nbLitsSimples + " lit(s) simple(s) et " + nbLitsDoubles + " lit(s) double(s).";
    }
}