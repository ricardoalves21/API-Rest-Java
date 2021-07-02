package ricardo.rest.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController { // Classe responsável para fazer uma consulta de status pra saber se a aplicação está online

    @GetMapping(path = "/api/status")
    public String check() {

        return "OnLine";

    }

}
