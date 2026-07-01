package br.com.trabalho.SmartChefAi;

import dev.langchain4j.service.Result;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/assistant")
@CrossOrigin(origins = "*")
public class AssistantController {

    private final AssistenteService assistenteService;

    public AssistantController(AssistenteService assistenteService) {
        this.assistenteService = assistenteService;
    }

     @PostMapping
     public String gerarReceita(@RequestBody String ingredientes) {

    System.out.println("Recebi: " + ingredientes);

    Result<String> result = assistenteService.headQuest(ingredientes);

    System.out.println("Resposta: " + result.content());

    return result.content();
}

}
