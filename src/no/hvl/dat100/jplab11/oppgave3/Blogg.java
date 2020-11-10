package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}

	public Innlegg[] getSamling() {
		return innleggtabell;

	}

	public int finnInnlegg(Innlegg innlegg) {
		int n = -1;
		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				n = i;
			}
		}
		return n;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean f = false;
		for (Innlegg i : innleggtabell) {
			if (i != null && i.erLik(innlegg)) {
				f = true;
			}
		}
		return f;
	}

	public boolean ledigPlass() {
		boolean ledigPlass = false;
		if (innleggtabell[innleggtabell.length-1] == null && innleggtabell.length >= 0) {
			ledigPlass = true;
		}

		return ledigPlass;
	}

	public boolean leggTil(Innlegg innlegg) {
		boolean inserted = false;

		if (finnes(innlegg) == false && ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			inserted = true;
		}
		return inserted;
	}

	public String toString() {
		String ut = "" + nesteledig + "\n";
		for (int i = 0; i < nesteledig; i++) {
			ut += innleggtabell[i].toString();
		}
		return ut;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}