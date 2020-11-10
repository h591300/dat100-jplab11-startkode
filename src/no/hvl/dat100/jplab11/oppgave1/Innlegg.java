package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	private int idInt, likesInt;
	private String brukerStr, datoStr;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {
		idInt = id;
		likesInt = 0;
		brukerStr = bruker;
		datoStr = dato;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		idInt = id;
		likesInt = likes;
		brukerStr = bruker;
		datoStr = dato;
	}
	
	public String getBruker() {
		
		return brukerStr;

	}

	public void setBruker(String bruker) {
		brukerStr = bruker;
	}

	public String getDato() {
		return datoStr;
		
	}

	public void setDato(String dato) {
		datoStr = dato;
	}

	public int getId() {
		return idInt;

	}

	public int getLikes() {
		return likesInt;

	}
	
	public void doLike () {
		likesInt = likesInt + 1;
	}
	
	public boolean erLik(Innlegg innlegg) {
		if (innlegg.getId() == idInt) {
			return true;
		} else return false;
	}
	
	@Override
	public String toString() {
		String ut = idInt + "\n" + brukerStr + "\n" + datoStr + "\n" + likesInt+ "\n";
		return ut;
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
