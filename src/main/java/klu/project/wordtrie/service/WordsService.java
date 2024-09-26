package klu.project.wordtrie.service;

import java.util.*;
import klu.project.wordtrie.model.Words;

public interface WordsService {
    public String addWord(Words w);
    public List<Words> allWords();
}
