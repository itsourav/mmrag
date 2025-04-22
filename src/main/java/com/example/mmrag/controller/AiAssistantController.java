package com.example.mmrag.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mmrag.agent.MMRagAiAgent;

import reactor.core.publisher.Flux;

@RestController
public class AiAssistantController {
	
	private MMRagAiAgent mmRagAiAgent;

    public AiAssistantController(MMRagAiAgent mmRagAiAgent) {
        this.mmRagAiAgent = mmRagAiAgent;
    }

    @GetMapping("/askAgent")
    public Flux<String> chat(@RequestParam(defaultValue = "Bonjour") String question){
        return mmRagAiAgent.chat(question);
    }

}
