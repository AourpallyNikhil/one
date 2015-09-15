package edu.asu.diging.tutorial.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;

@Service
public class MoodService implements IMoodService {
	
	private List<String> moods = new ArrayList<String>();
	private HashMap<String,String> explanation = new HashMap<String,String>();
    private Random random;
    
	@PostConstruct
	public void init(){
		
		moods.add("happy");
		moods.add("Sad");
		moods.add("cranky");
		moods.add("excited");
		
		explanation.put("happy", "I got a good grade in Computation Humanities");
		explanation.put("Sad", "I missed my flight");
		explanation.put("Cranky","My GF is mad at me");
		explanation.put("excited","It's a weekend");
		
		random = new Random();	
	}
	
	@Override
	public Mood getCurrentMood(){
		return new Mood(moods.get(random.nextInt(moods.size())));
	}	
	
	@Override
	public String getExplanation(String mood){	
		return explanation.get(mood);
	}	
}