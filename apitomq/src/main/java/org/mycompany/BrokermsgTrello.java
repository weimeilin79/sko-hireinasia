package org.mycompany;

public class BrokermsgTrello {

	/**
	 * {		
	 		"TITLE": "Senior Consultant - Business Automation",
			"LOCATION": "Singapore",
			"CATEGORY" : "Services",
			"TYPE" : "Consulting",
			"DESCRIPTION" : "Lead BRMS and BPM development projects at some of our most strategic customers in Singapore.",
			"URL" : "http://jobapply/job.js",
			"JOB_ID": "111",
			"NAME": "John Smith",
			"SALARY_ASK": "11000",
			"PHOTO_URL": "100000",
			"RESUME": "10 years experience in BRMS and BPM in APAC.",
			"STATUS": "PENDING"
		}
	 * 
	 * {
		"idList":"5a9e17341917329e13af2954",
		"apiKey":"41acc9e1c7e215685f6ee3aca7de88b0",
		"token":"5fc357e404c37037b8a510587ab29425acf3b79ecd2018bc740b697ede81b488",
		"cardname":" Christina Lin",
		"description":"Job Application by John Smith",
		"imageurl":"https://lh3.googleusercontent.com/oKsgcsHtHu_nIkpNd-mNCAyzUD8xo68laRPOfvFuO0hqv6nDXVNNjEMmoiv9tIDgTj8=w170",
		"due":"null"
		}
	**/
	
	
	String idList;
	String apiKey;
	String token;
	String cardname;
	String description;
	String imageurl;
	String due;
	public String getIdList() {
		return idList;
	}
	public void setIdList(String idList) {
		this.idList = idList;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getCardname() {
		return cardname;
	}
	public void setCardname(String cardname) {
		this.cardname = cardname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public String getDue() {
		return due;
	}
	public void setDue(String due) {
		this.due = due;
	}
	
	
	
}
