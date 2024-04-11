package CardManager;


import Model.Flashcard;

import java.util.List;


public interface ICardManager {
    //todo turn private
    //List<Flashcard> FLASHCARD_LIST;
    //Map<String, String> BoxByFlashcardId;
    List<Flashcard> getFlashcardForBox(String boxId);
    boolean trySetFlashcardBox(String flashcardId, String boxId);
}
