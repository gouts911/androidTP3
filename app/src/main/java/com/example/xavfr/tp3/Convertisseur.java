package com.example.xavfr.tp3;

/**
 * Created by xavfr on 2015-11-25.
 */
public class Convertisseur {

    private static final int[] IMAGE_DRAPEAU = {R.drawable.canada,R.drawable.euro,R.drawable.mexique};
    private static final double[] TAB_TX_CANADA = {1 , 0.71 , 12.44};
    private static final double[] TAB_TX_EURO = {1.41 , 1 , 17.57};
    private static final double[] TAB_TX_MEXIQUE = {0.08 , 0.06 , 1};

    //variable d'instance
    private double tauxDeChange;
    private double montantAChanger;
    private int DeviseEntrante;
    private int DeviseSortante;

    public Convertisseur() {
    }
    public Convertisseur(double tauxDeChange, double montantAChanger, int deviseEntrante, int deviseSortante) {
        this.tauxDeChange = tauxDeChange;
        this.montantAChanger = montantAChanger;
        DeviseEntrante = deviseEntrante;
        DeviseSortante = deviseSortante;
    }

    public double getTauxDeChange() {
        return tauxDeChange;
    }

    public double getMontantAChanger() {
        return montantAChanger;
    }

    public int getDeviseEntrante() {
        return DeviseEntrante;
    }

    public int getDeviseSortante() {
        return DeviseSortante;
    }
    public static int[] getImageDrapeau() {
        return IMAGE_DRAPEAU;
    }

    public static double[] getTabTxCanada() {
        return TAB_TX_CANADA;
    }

    public static double[] getTabTxEuro() {
        return TAB_TX_EURO;
    }

    public static double[] getTabTxMexique() {
        return TAB_TX_MEXIQUE;
    }

    public void setTauxDeChange(double tauxDeChange) {
        this.tauxDeChange = tauxDeChange;
    }

    public void setMontantAChanger(double montantAChanger) {
        this.montantAChanger = montantAChanger;
    }

    public void setDeviseEntrante(int deviseEntrante) {
        DeviseEntrante = deviseEntrante;
    }

    public void setDeviseSortante(int deviseSortante) {
        DeviseSortante = deviseSortante;
    }










}
