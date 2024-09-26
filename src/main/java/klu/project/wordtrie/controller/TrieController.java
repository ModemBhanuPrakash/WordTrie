package klu.project.wordtrie.controller;

import java.util.*;
import jakarta.servlet.http.HttpServletRequest;
import klu.project.wordtrie.Trie;
import klu.project.wordtrie.model.Words;
import klu.project.wordtrie.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TrieController {

    @Autowired
    private Trie trie;

    @Autowired
    private WordsService ws;

    @GetMapping("/")
    public ModelAndView index(){
        List<Words> li = ws.allWords();
        for(Words word:li){
            trie.insertWord(word.getWord(),word.getMeaning(),word.getAntonym(), word.getSynonym(), word.getExample());
        }
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
        String word = req.getParameter("newWord");
        String meaning = req.getParameter("meaning");
        String antonym = req.getParameter("antonym");
        String synonym = req.getParameter("synonym");
        String exampleSentence = req.getParameter("exampleSentence");
        ModelAndView mv = new ModelAndView("insertPage");
        if(trie.insertWord(word,meaning,antonym,synonym,exampleSentence)){
            Words w = new Words();
            w.setWord(word);
            w.setMeaning(meaning);
            w.setAntonym(antonym);
            w.setSynonym(synonym);
            w.setExample(exampleSentence);
            String msg = ws.addWord(w);
            mv.addObject("message",msg);
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
