package fr.uvsq.tod;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WebController {

    @RequestMapping("/")
    public String index() {
        return "Salut c'est idir et thomas!";
    }

}









