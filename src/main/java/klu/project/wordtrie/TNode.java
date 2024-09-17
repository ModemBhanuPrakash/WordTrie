package klu.project.wordtrie;


public class TNode {
    boolean endOfWord;
    TNode children[];
    public TNode(){
        endOfWord = false;
        children = new TNode[26];
    }

}
