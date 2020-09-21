package com.sentence;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
//import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SentenceGeneratorTest {
	String[] article = {"the", "a", "one", "some", "any"};
	String[] noun = {"boy", "girl", "dog", "town","car"};
	String[] verb = {"drove", "jumped", "ran", "walked","skipped"};
	String[] preposition = {"to", "from", "over", "under", "on"};
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		for(int i=0; i<20; i++)
			System.out.println(generateSentence());
	}

	
	String generateSentence() {
		StringBuilder sentence = new StringBuilder();
		String space = " ";
		Random indexGenerator = new Random();
		int index = indexGenerator.nextInt(article.length);
		String word = article[index];
		Character firstLetter = Character.toUpperCase(word.charAt(0));
		word = word.replace(word.charAt(0), firstLetter);
		sentence.append(word);
		sentence.append(space);
		
		// add article
		index = indexGenerator.nextInt(article.length);
		word = noun[index];
		sentence.append(word);
		sentence.append(space);
		
		// add noun
		word = verb[index];
		sentence.append(word);
		sentence.append(space);
		
		// add verb
		index = indexGenerator.nextInt(article.length);
		word = noun[index];
		sentence.append(word);
		sentence.append(space);
		
		// add preposition
		index = indexGenerator.nextInt(article.length);
		word = noun[index];
		sentence.append(word);
		sentence.append(space);
		
		// add article
		index = indexGenerator.nextInt(article.length);
		word = noun[index];
		sentence.append(word);
		sentence.append(space);
				
		// add noun
		word = verb[index];
		sentence.append(word);
		//sentence.append(space);
		sentence.append(".");
		
		return sentence.toString();
	}
	

}
