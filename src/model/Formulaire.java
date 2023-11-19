package model;

public abstract class Formulaire {
    protected int jour;
    protected int mois;
    protected int IdentificationEntite;

    protected Formulaire(int jour, int mois, int IdentificationEntite) {
        this.jour = jour;
        this.mois = mois;
        this.IdentificationEntite = IdentificationEntite;
    }

    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getIdentificationEntite() {
        return IdentificationEntite;
    }

    public void setIdentificationEntite(int IdentificationEntite) {
        this.IdentificationEntite = IdentificationEntite;
    }

    public abstract String toString();
}
