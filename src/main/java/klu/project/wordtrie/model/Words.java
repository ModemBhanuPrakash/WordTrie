package klu.project.wordtrie.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Words")
public class Words {
    @Id
    String word;
    @Column
    String meaning;
    @Column
    String antonym;

    @Override
    public String toString() {
        return "Words{" +
                "word='" + word + '\'' +
                ", meaning='" + meaning + '\'' +
                ", antonym='" + antonym + '\'' +
                ", synonym='" + synonym + '\'' +
                ", example='" + example + '\'' +
                '}';
    }

    @Column
    String synonym;
    @Column
    String example;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getAntonym() {
        return antonym;
    }

    public void setAntonym(String antonym) {
        this.antonym = antonym;
    }

    public String getSynonym() {
        return synonym;
    }

    public void setSynonym(String synonym) {
        this.synonym = synonym;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}
