package br.usp.icmc.ssc01032015.competitors.id415484;

import br.usp.icmc.ssc01032015.Competitor;
import br.usp.icmc.ssc01032015.competitors.AbstractCompetitor;


public class CompetitorType01 extends AbstractCompetitor {

	double lastDonation;

	public CompetitorType01() {
	}

	@Override
	public double declareDonationTo(Competitor s) {
		return 0.1*lastDonation;
	}

	@Override
	public void informDonationFrom(Competitor s, double donation) {
		lastDonation = donation;
	}
}
