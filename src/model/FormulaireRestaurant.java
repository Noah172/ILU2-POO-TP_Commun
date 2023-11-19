package model;

public class FormulaireRestaurant extends Formulaire {

	private static int numeroTable;
	private int nbPersonnes;
    private int numService;

    public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int numService) {
        super(jour, mois, numeroTable);
        this.nbPersonnes = nbPersonnes;
        this.numService = numService;
    }

    public int getNombrePersonnes() {
        return nbPersonnes;
    }

    public int getNumService() {
        return numService;
    }

    @Override
    public String toString() {
        return "Le " + jour + "/" + mois + "\nTable " + IdentificationEntite + " pour le service " + numService + ".";
    }
}
