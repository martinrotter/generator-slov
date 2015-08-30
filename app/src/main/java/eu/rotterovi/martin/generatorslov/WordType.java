package eu.rotterovi.martin.generatorslov;

public enum WordType {
  Drawing, Speech, Pantomime;

  @Override
  public String toString() {
    switch (this) {
      case Drawing:
        return "Kreslení";

      case Pantomime:
        return "Pantomima";

      case Speech:
        return "Mluvení";
    }

    return super.toString();
  }
}
