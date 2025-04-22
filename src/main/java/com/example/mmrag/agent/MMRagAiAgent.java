package com.example.mmrag.agent;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;
import reactor.core.publisher.Flux;

@AiService
public interface MMRagAiAgent {
	
	 @SystemMessage("""
	            You are a good assistant that can answer the user's question based on the provided context.If you don't know answer, just tell it.
	            If your response contains the path of the images source in the context, use this format to present images in a list of items like: 
	             - SOURCE_IMAGE(Path1)=>
	             - SOURCE_IMAGE(Path2)=> 
	            """)
	    Flux<String> chat(String question);

	 
}
