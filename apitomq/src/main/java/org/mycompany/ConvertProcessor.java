package org.mycompany;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("convertProcessor")
public class ConvertProcessor{
	
	@Autowired
	DemoConfig democonfig;

	public BrokermsgTrello convertoTrelloMsg(Map<String,String> input) {
		/**
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
			
		 * */
		BrokermsgTrello trellomsg = new BrokermsgTrello();
		//System.out.println("democonfig Apikey-> "+democonfig.getApikey());
		//System.out.println("democonfig IdList-> "+democonfig.getIdList());
		//System.out.println("democonfig Token-> "+democonfig.getToken());
		
		trellomsg.setApiKey(democonfig.getApikey());
		trellomsg.setIdList(democonfig.getIdList());
		trellomsg.setToken(democonfig.getToken());
		trellomsg.setCardname(input.get("NAME"));
		trellomsg.setDescription(
			 "**Job Applied For:**"+ input.get("TITLE") +"  "
			+"**Job Location:**"+ input.get("LOCATION") +"  "
			+"**Expected Salary ($):**"+ input.get("SALARY_ASK")+"  "
			+"**Resume:**"+ input.get("RESUME") +"  "
		);
		
		trellomsg.setDue("null");
		trellomsg.setImageurl(input.get("PHOTO_URL"));
		
		return trellomsg;
	}
	
	public BrokermsgTwitter convertoTwitterMsg(Map<String,String> input) {
		
		BrokermsgTwitter twittermsg = new BrokermsgTwitter();
		
		twittermsg.setTitle("@hireinasia "+input.get("TITLE")+",");
		twittermsg.setLocation(input.get("LOCATION")+": unmissable opportunity. See ");
		twittermsg.setJobURL(input.get("URL"));
		
		
		return twittermsg;
	}

}
