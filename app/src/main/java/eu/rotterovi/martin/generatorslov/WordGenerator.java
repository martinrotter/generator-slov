package eu.rotterovi.martin.generatorslov;

import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class WordGenerator {
  private String[] words;
  private Stack<Integer> indexes = new Stack<Integer>();
  private Random everyoneGenerator = new Random(System.nanoTime());

  public WordGenerator(InputStream textResource) {
    loadWords(textResource);
  }

  public Word getNextWord() {
    if (indexes.isEmpty()) {
      // No indexes? Generate these.
      generateIndexes();
    }

    return new Word(words[indexes.pop()], everyoneGenerator.nextInt(100) < 17);
  }

  private void loadWords(InputStream textResource) {
    StringWriter writer = new StringWriter();

    try {
      IOUtils.copy(textResource, writer, "UTF-8");
      textResource.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    words = writer.toString().split("\n");
  }

  private void generateIndexes() {
    List<Integer> notImmutable = new ArrayList<Integer>();

    notImmutable.addAll(ContiguousSet.create(com.google.common.collect.Range.closedOpen(0, words.length), DiscreteDomain.integers()).asList());
    Collections.shuffle(notImmutable, new Random(System.nanoTime()));

    indexes.clear();
    indexes.addAll(notImmutable);
  }
}
