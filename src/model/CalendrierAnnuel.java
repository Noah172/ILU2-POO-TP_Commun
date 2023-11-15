package model;

public class CalendrierAnnuel {
	private Mois[] calendrier;
	
	public CalendrierAnnuel() {
        calendrier = new Mois[12];
        for (int i = 0; i < 12; i++) {
            calendrier[i] = new Mois(i, 30);
        }
    }
	
//	private String convertirChiffreEnNom(int mois) {
//        String[] nomsDesMois = {"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre"};
//        return nomsDesMois[mois];
//    }
//	
//	private static int convertirNomEnChiffre(String nom) {
//        String[] nomsDesMois = {"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre"};
//        for (int i = 0; i < 12; i++) {
//            if (nomsDesMois[i].equals(nom)) {
//                return i;
//            }
//        }
//        return -1;
//    }

	

	private static class Mois {
		private String nom;
		private boolean jours[] ;
		
		private Mois(int nom,int nbJours) {
			for (int i = 0; i < nbJours; i++) {
			}
			jours= new boolean[nbJours];
		}

		private boolean estLibre(int jour) {
			return jours[jour];
		}
		private boolean reserver(int jour) {
			if (estLibre(jour)) {
				jours[jour]=true;
				return true;
			} else {
				return false;
			}
		}


	}
	public boolean estLibre(int jour, int mois) {
		return moisClass.estLibre(jour);
		
	}

	public boolean reserver(int jour, int mois) {
		return moisClass.reserver(jour);
	}

}
