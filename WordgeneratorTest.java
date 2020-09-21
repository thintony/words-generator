package com.sentence;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

//import javax.annotation.processing.Generated;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WordgeneratorTest {
	String[] noun = {"office", "bank", "station","church", "school"};
	String[]  mammal = {"monkey", "dog", "goat","cow", "sheep"};
	String[]  bird = {"ostrich", "duck", "agricfowl","guineafowl", "quail"};
	String[] reptile = {"tortois", "snake", "lizard","python", "crokodie"};

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
      @Test
	void test() {
    	  for(int i = 1; i <= 20; i++) 
    		  System.out.println(generateStatements());
    	  }
      
    		  String generateStatements() {
    			  StringBuilder sentence = new StringBuilder();
    			  String space = (" ");
    			  Random indexWord = new Random();
    			  int index = indexWord.nextInt(bird.length);
    			  String word = bird[index];
    			 
    			  Character firstLetter = Character.toUpperCase(word.charAt(0));
    			  word = word.replace(word.charAt(0), firstLetter);
    			  sentence.append(word);
    			  sentence.append(space);
    			 
    			   
    		/* index = indexWord.nextInt(bird.length);
    				word = noun[index];
    				sentence.append(word);
    				sentence.append(space);
    				
    				 index = indexWord.nextInt(bird.length);
     				word = mammal[index];
     				sentence.append(word);
     				sentence.append(space);
     				
     				 index = indexWord.nextInt(bird.length);
     				word = bird[index];
     				sentence.append(word);
     				sentence.append(space);
     				
     				 index = indexWord.nextInt(bird.length);
     				word = reptile[index];
     				sentence.append(word);
     				sentence.append(space);*/
    				return sentence.toString();
    		    }
    	  }


