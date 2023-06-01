package com.project.travel.api.DTO;

public class StatisticDataDTO {
	
			private String mostVisitedCity;
			private double totalEarnings;
			private int numPeople;
			private String mostInsertedDate;
			private String mostTicketCompanyBought;
			
			
			
			public StatisticDataDTO(String mostVisitedCity, double totalEarnings, int numPeople, String dataMaisInserida, String mostTicketCompanyBought) {
				
				this.mostVisitedCity = mostVisitedCity;
				this.totalEarnings = totalEarnings;
				this.numPeople = numPeople;
				this.mostInsertedDate = dataMaisInserida;
				this.mostTicketCompanyBought = mostTicketCompanyBought;
			}



			public String getMostVisitedCity() {
				return mostVisitedCity;
			}



			public void setMostVisitedCity(String mostVisitedCity) {
				this.mostVisitedCity = mostVisitedCity;
			}



			public double getTotalEarnings() {
				return totalEarnings;
			}



			public void setTotalEarnings(double totalEarnings) {
				this.totalEarnings = totalEarnings;
			}



			public int getNumPeople() {
				return numPeople;
			}



			public void setNumPeople(int numPeople) {
				this.numPeople = numPeople;
			}



			public String getMostInsertedDate() {
				return mostInsertedDate;
			}



			public void setMostInsertedDate(String mostInsertedDate) {
				this.mostInsertedDate = mostInsertedDate;
			}



			public String getMostTicketCompanyBought() {
				return mostTicketCompanyBought;
			}



			public void setMostTicketCompanyBought(String mostTicketCompanyBought) {
				this.mostTicketCompanyBought = mostTicketCompanyBought;
			}
			
			
			
}
