

package fr.uvsq.tod;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import java.util.ArrayList;

@RestController
public class WebController{
	
	      //~ @RequestMapping("/")
      //~ public String index()
      //~ { 
		  //~ return "salut idir et thomas";
//~ }

	//Q4
	private static final String a = "titre et : %s.";
	private final AtomicLong nbredetache = new AtomicLong();
	private List<tache> ltaches = new ArrayList<tache>();
	
	
	
    @RequestMapping(method=RequestMethod.GET)
     public List<tache> affiche()
    {
		System.out.println("Afficher la liste\n");
        return ltaches;
    }
    
   

}


