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
		} catch (FileNotFoundException e) {
			mld = "Katalogen finnes ikkje.";
			skriven = false;
		} //catch (NullPointerException e) {
			//mld = "Feil i ein klasse.";
			//skriven = false;
		//}
		System.out.print(mld);
		return skriven;
	}
}
