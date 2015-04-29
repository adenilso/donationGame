package br.usp.icmc.ssc01032015.competitors.id9055752;

import br.usp.icmc.ssc01032015.Competitor;
import br.usp.icmc.ssc01032015.competitors.AbstractCompetitor;


public class CompetitorType05 extends AbstractCompetitor {

	double lastDonation;

	public CompetitorType05() {
	}

	@Override
	public double declareDonationTo(Competitor s) {
		return 0.5*lastDonation;
	}

	@Override
	public void informDonationFrom(Competitor s, double donation) {
		lastDonation = donation;
	}
}
