package klu.project.wordtrie.repository;

import klu.project.wordtrie.model.Words;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordsRepository extends JpaRepository<Words,String> {
}
