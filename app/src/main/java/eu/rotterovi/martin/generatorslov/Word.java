package eu.rotterovi.martin.generatorslov;

import java.io.Serializable;

public class Word implements Serializable {
  private String word;
  private Boolean isForEverybody;

  public Word(String word, Boolean isForEverybody) {
    this.word = word;
    this.isForEverybody = isForEverybody;
  }

  public Boolean getIsForEverybody() {
    return isForEverybody;
  }

  public String getWord() {
    return word;
  }
}
