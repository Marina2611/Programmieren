package datentypen;

import edu.bielefeld.io.EAM;

public class Datenbanken_II {
    public static void main(String[] args) {

        int startzeitStunden;
        int startzeitmin;
        int startzeitsek;
        int getstartsek;

        System.out.println("Bitte geben Sie von der Startzeit die ganzen Stunden ein:");
        System.out.print("Startzeit Stunden: ");
        startzeitStunden = EAM.rInt();
        System.out.println("Bitte geben Sie von der Startzeit die ganzen Minuten ein:");
        System.out.print("Startzeit Minuten: ");
        startzeitmin = EAM.rInt();
        System.out.println("Bitte geben Sie von der Startzeit die ganzen Sekunden ein:");
        System.out.print("Startzeit Sekunden: ");
        startzeitsek = EAM.rInt();

        getstartsek = startzeitStunden*3600+startzeitmin*60+startzeitsek;

        int dauerStunden;
        int dauerMin;
        int dauerSek;
        int getdauersek;

        System.out.println("Bitte geben Sie von der Dauer die ganzen Stunden ein:");
        System.out.print("Dauer Stunden: ");
        dauerStunden = EAM.rInt();
        System.out.println("Bitte geben Sie von der Dauer die ganzen Minuten ein:");
        System.out.print("Dauer Minuten: ");
        dauerMin = EAM.rInt();
        System.out.println("Bitte geben Sie von der Dauer die ganzen Sekunden ein:");
        System.out.print("Dauer Sekunden: ");
        dauerSek = EAM.rInt();

        getdauersek = dauerStunden*3600+dauerMin*60+dauerSek;

        int dauerTage;

        dauerTage = (getstartsek+getdauersek/86400);

        int ankunftszeitStunden;
        int ankunftszeitMinuten;
        int ankunftszeitSekunden;

        ankunftszeitStunden = ((getstartsek+getdauersek)- dauerTage*86400) / 3600;
        ankunftszeitMinuten = (((getstartsek+getdauersek)- dauerTage*86400) - 3600 * ankunftszeitStunden)/60;
        ankunftszeitSekunden = (((getstartsek+getdauersek)- dauerTage*86400) - 3600 * ankunftszeitStunden)-(ankunftszeitMinuten*60);

        System.out.println("Dauer: " + dauerStunden + "Stunden "+ dauerMin + "Minuten und"+  dauerSek + "Sekunden");
        System.out.println("Ankunft am" + (dauerTage+1) + "Tag gegen" + ankunftszeitStunden+ ":" + ankunftszeitMinuten+ ":"+ ankunftszeitSekunden + "Uhr." );
    }
}
