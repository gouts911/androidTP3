/**
 * Auteurs : TODO et Soti
 * Fichier : Pret.java
 * Date    : 8 décembre 2015
 * Cours   : 420-254-MO (TP3 Android)
 */

/**
 * Classe contenant les données et les méthodes pour un prêt.
 *
 * Cette classe implémente l'interface Parcelable. Pour pouvoir passer un objet personnalisé
 * entre les activités. L'objet sera transformé en Parcel.
 *
 * C’est l’équivalent de la sérialisation pour le passage d’objet entre différentes activités.
 */

package com.example.xavfr.tp3;

import android.os.Parcel;
import android.os.Parcelable;

public class Pret implements Parcelable {

    // Variables d'instances.
    private double montant;
    private double interet;
    private int duree;

    // Constructeur de base.
    public Pret() {
        this( 0, 0, 0 );
    }

    // Constructeur avec des valeurs.
    public Pret( double montant, double interet, int duree ) {
        this.setMontant( montant );
        this.setInteret( interet );
        this.setDuree( duree );
    }

    // Accesseur, mutateur pour le montant.

    public double getMontant() {
        return montant;
    }

    public void setMontant( double montant ) {
        this.montant = montant;
    }

    // Accesseur, mutateur pour l'intérêt.

    public double getInteret() {
        return interet;
    }

    public void setInteret( double interet ) {
        this.interet = interet;
    }

    // Accesseur, mutateur pour la durée du prêt.

    public int getDuree() {
        return duree;
    }

    public void setDuree( int duree ) {
        this.duree = duree;
    }

    // Calculer et retourner le versement mensuel.
    public double calculerVersement() {

        double versement = 0;

		// TODO À COMPLÉTER. Voir page 8 de l'énoncé du TP3.
		
        return versement;
    }

    // Calculer le prêt total.
    public double calculerPretTotal() {
        double pretTotal = 0;

		// TODO À COMPLÉTER. Voir page 8 de l'énoncé du TP3.

        return pretTotal;
    }

    // Calculer l'intérêt total.
    public double calculerInteretTotal() {
        double interetTotal = 0;

		// TODO À COMPLÉTER. Voir page 8 de l'énoncé du TP3.

        return interetTotal;
    }


    //==============================================================================
    // Ce qui suit concerne tout ce qui faut implémenter pour l'interface Parcelable.

    // Implémentation de la méthode qui précise si l'objet contient des objets spéciaux de type
    // File Descriptor (descripteur de fichier).

    @Override
    public int describeContents() {
        return 0;
    }

    // Implémentation de la méthode qui sert à écrire le contenu de l'objet dans un Parcel.

    @Override
    public void writeToParcel( Parcel dest, int flags ) {
        dest.writeDouble( this.getMontant() );
        dest.writeDouble( this.getInteret() );
        dest.writeInt( this.getDuree() );
    }

    // Constructeur interne prenant comme argument un Parcel pour notre Pret.
    // Permet de reconstruire l’objet à partir d’un Parcel.
    // Pour construire une instance de Pret à partir d’un Parcel.

    protected Pret( Parcel in ) {
        // Les valeurs sont lues dans le même ordre que celui défini dans la méthode writeToParcel.
        this.setMontant( in.readDouble() );
        this.setInteret( in.readDouble() );
        this.setDuree( in.readInt() );
    }

    // Création d'un objet CREATOR permettant de créer une instance de l'objet Pret depuis
    // un Parcel. Correspond à la conversion Parcel vers l'objet personnalisé.
    // Le CREATOR permet d’indiquer comment l'objet de type Parcelable sera créé.

    public static final Creator<Pret> CREATOR = new Creator<Pret>() {

        // Implémentation de la méthode qui permet de créer un objet Pret depuis un Parcel.
        @Override
        public Pret createFromParcel( Parcel in ) {
            return new Pret( in );
        }

        // Implémentation de la méthode qui permet de créer un tableau de Pret dont la
        // taille est spécifiée en paramètre.
        @Override
        public Pret[] newArray( int size ) {
            return new Pret[size];
        }
    };
}
