package eu.rotterovi.martin.generatorslov;

public class Word {
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

  private String word;
  private Boolean isForEverybody;
}
