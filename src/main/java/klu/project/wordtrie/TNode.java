package klu.project.wordtrie;


public class TNode {
    boolean endOfWord;
    TNode children[];
    String meaning;
    String antonym;
    String synonym;
    String example;
    public TNode(){
        endOfWord = false;
        children = new TNode[26];
        meaning = "";
        antonym = "";
        synonym = "";
        example = "";
    }

}
