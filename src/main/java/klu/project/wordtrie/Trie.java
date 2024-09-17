package klu.project.wordtrie;

import org.springframework.stereotype.Service;

@Service
public class Trie {

    TNode root;
    public Trie(){
        root = new TNode();
    }

    public boolean insertWord(String word){
        int n = word.length();
        TNode temp = root;
        for(int i=0;i<n;i++){
            int idx = word.charAt(i) - 'a';
            if(temp.children[idx]==null){
                TNode nn = new TNode();
                temp.children[idx] = nn;
            }
            temp = temp.children[idx];
        }
        if(temp.endOfWord==false){
            temp.endOfWord = true;
            return true;
        }
        else return false;
    }

    public boolean searchWord(String word){
        int n = word.length();
        TNode temp = root;
        for(int i=0;i<n;i++){
            int idx = word.charAt(i)-'a';
            if(temp.children[idx]==null) return false;
            temp = temp.children[idx];
        }
        return temp.endOfWord;
    }

}
