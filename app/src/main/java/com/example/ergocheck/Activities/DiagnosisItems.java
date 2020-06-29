package com.example.ergocheck.Activities;

public class DiagnosisItems {
	String title;
	String recommendation;
	byte [] image;
	public DiagnosisItems(String title, String recommendation, byte[] image) {
		this.title = title;
		this.recommendation = recommendation;
		this.image = image;
	}
	public String getTitle() {
		return title;
	}
	public String getRecommendation() {
		return recommendation;
	}
	public byte[] getImage() {
		return image;
	}

}
