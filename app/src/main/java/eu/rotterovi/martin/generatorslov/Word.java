package eu.rotterovi.martin.generatorslov;

import java.io.Serializable;

public class Word implements Serializable {
  private String word;
  private Boolean isForEverybody;

  private WordType type;

  public Word(String word, Boolean isForEverybody, WordType type) {
    this.word = word;
    this.isForEverybody = isForEverybody;
    this.type = type;
  }

  public WordType getType() {
    return type;
  }


  public Boolean getIsForEverybody() {
    return isForEverybody;
  }

  public String getWord() {
    return word;
  }
}
