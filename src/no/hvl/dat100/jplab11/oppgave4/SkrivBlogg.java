package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.Innlegg;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		PrintWriter skriver = null;
		String mld = "Fila blei lagra.";
		boolean skriven = false;
		try {
			skriver = new PrintWriter(mappe + filnavn);
			skriver.print(samling.toString());
			skriver.close();
			skriven = true;
		} catch (FileNotFoundException e) {
			mld = "Katalogen finnes ikkje.";
			skriven = false;
		} //catch (NullPointerException e) {
			//mld = "Feil i ein klasse.";
			//skriven = false;
		//}
		System.out.print(mld);
		return skriven;
		
		//Alternativ løsning 
		
		/*  
		boolean skriveren = false;
        File output = new File(mappe + filnavn);              // opprett filen et sted med et navn
        try {
            FileWriter writer = new FileWriter(output);       // funksjon/metode som skriver ting i filen
            writer.write(samling.toString());                 // skriv innholdet fra samling til filen
            writer.close();                                   // lukke writer etter den er ferdig å skrive til filen
            skriveren = true;                                 // sett til true når writer har skrevet til filen
        } catch (IOException e) {                             //throw exception hvis noe feiler
            e.printStackTrace();
            System.out.println("FILE PATH NOT FOUND");
        }

        return skriveren;*/                                     // returner true hvis filen ble opprettet og skrevet inn med innhold
		
	}
}
