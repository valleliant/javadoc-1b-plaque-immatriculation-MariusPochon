package ch.emf.atelierpo.wrk;

import java.util.ArrayList;

/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class Worker {

    /**
     * Cette méthode contrôle si la plaque d'immatriculation est correcte.
     *
     * @param canton         doit etre egal a une abreviation de canton en MAJ
     *                       uniquement
     * @param numeroDePlaque doit etre un numero
     * @return true si la plaque est correcte, sinon false
     */
    public boolean controlePlaqueImmatriculation(String canton, String numeroDePlaque) {
        boolean valeurDeRetour = false;
        ArrayList<String> cantons = new ArrayList<>() {
            {
                add("AG");
                add("AI");
                add("AR");
                add("BE");
                add("BL");
                add("BS");
                add("FR");
                add("GE");
                add("GL");
                add("JU");
                add("LU");
                add("LU");
                add("NE");
                add("NW");
                add("OW");
                add("SG");
                add("SH");
                add("SO");
                add("SZ");
                add("TG");
                add("TI");
                add("UR");
                add("VD");
                add("VS");
                add("ZG");
                add("ZH");
            }
        };
        try {
            for (String cant : cantons) {
                if (canton.contains(cant) && numeroDePlaque.matches("\\d+") && !numeroDePlaque.contains("0")) {
                    valeurDeRetour = true;
                    break;
                }
            }
        } catch (Exception nulException) {
            
        }
        return valeurDeRetour;
    }
    
}
