package Persistence;

import Model.Flashcard;

import java.util.List;

public interface IPersistence {
    boolean tryPersist(List<Flashcard> flashcards);

}
