package id_fa8fd019405b205a90b1ad86be19fb9d;

public class CompetitorTitForTat extends LastDonationListingCompetitor{
	
	public double declareDonationTo(Competitor c) {
		try{
			return lastDonation.elementAt(competidores.indexOf(c));
		}catch(ArrayIndexOutOfBoundsException ioobe){
			return 10.0;
		}
	}
}