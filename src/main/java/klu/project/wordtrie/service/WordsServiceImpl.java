package klu.project.wordtrie.service;

import java.util.*;
import klu.project.wordtrie.model.Words;
import klu.project.wordtrie.repository.WordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordsServiceImpl implements WordsService{

    @Autowired
    private WordsRepository wr;

    @Override
    public String addWord(Words w) {
        wr.save(w);
        return "Word added successfully";
    }


    public List<Words> allWords(){
        return wr.findAll();
    }
}
