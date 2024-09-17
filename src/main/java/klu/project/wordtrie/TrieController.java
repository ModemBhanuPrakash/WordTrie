package klu.project.wordtrie;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TrieController {

    @Autowired
    private Trie trie;

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @PostMapping("/insertPage")
    public ModelAndView insertPage(){
       ModelAndView mv = new ModelAndView("insertPage");
       return mv;
    }

    @PostMapping("/insertWord")
    public ModelAndView insertWord(HttpServletRequest req){
        String word = req.getParameter("word");
        ModelAndView mv = new ModelAndView("insertPage");
        if(trie.insertWord(word)){
            mv.addObject("message","Word Inserted Successfully");
        }
        else{
            mv.addObject("message","Word already present in the dictionary");
        }
        return mv;
    }


    @PostMapping("/searchPage")
    public ModelAndView searchPage(){
        ModelAndView mv = new ModelAndView("searchPage");
        return mv;
    }

    @PostMapping("/searchWord")
    public ModelAndView searchWord(HttpServletRequest req){
        String word = req.getParameter("searchword");
        ModelAndView mv = new ModelAndView("searchPage");
        if(trie.searchWord(word)){
            mv.addObject("message","The word : "+word+" is present in the dictionary");
        }
        else{
            mv.addObject("message","The word : "+word+" is not present in the dictionary");
        }
        return mv;
    }

}
