package model;

public class CalendrierAnnuel {
	private Mois[] calendrier;
	
	public CalendrierAnnuel() {
        calendrier = new Mois[13];
        
        calendrier[0] = new Mois("Erreur mois 0",0);
        calendrier[1] = new Mois("janvier", 31);
        calendrier[2] = new Mois("fevrier", 28);
        calendrier[3] = new Mois("mars", 31);
        calendrier[4] = new Mois("avril", 30);
        calendrier[5] = new Mois("mai", 31);
        calendrier[6] = new Mois("juin", 30);
        calendrier[7] = new Mois("juillet", 31);
        calendrier[8] = new Mois("aout", 31);
        calendrier[9] = new Mois("septembre", 30);
        calendrier[10] = new Mois("octobre", 31);
        calendrier[11] = new Mois("novembre", 30);
        calendrier[12] = new Mois("decembre", 31);
        
        
    }
	
//	private String convertirChiffreEnNom(int mois) {
//        String[] nomsDesMois = {"janvier", "f�vrier", "mars", "avril", "mai", "juin", "juillet", "ao�t", "septembre", "octobre", "novembre", "d�cembre"};
//        return nomsDesMois[mois];
//    }
//	
//	private static int convertirNomEnChiffre(String nom) {
//        String[] nomsDesMois = {"janvier", "f�vrier", "mars", "avril", "mai", "juin", "juillet", "ao�t", "septembre", "octobre", "novembre", "d�cembre"};
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
		
		private Mois(String nom,int nbJours) {
			jours= new boolean[nbJours+1];
			for (int i = 0; i <= nbJours; i++) 
				jours[i]=false;
			
			this.nom=nom;
			
		}

		private boolean estLibre(int jour) {
			return !jours[jour];
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
		return calendrier[mois].estLibre(jour);
		
	}

	public boolean reserver(int jour, int mois) {
		return calendrier[mois].reserver(jour);
	}

}
