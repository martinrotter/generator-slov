package eu.rotterovi.martin.generatorslov;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

  private WordGenerator speechGenerator;
  private WordGenerator drawingGenerator;
  private WordGenerator pantomimeGenerator;
  private TextView txtWord;
  private Word currentWord;

  @Override
  protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);

    if (currentWord != null) {
      outState.putSerializable("current_word", currentWord);
    }
  }

  private void getNextWord(WordGenerator generator) {
    currentWord = generator.getNextWord();
  }

  private void displayCurrentWord() {
    displayWord(currentWord);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    // Set fullscreen.
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

    // Setup content view.
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button btnSpeech = (Button) findViewById(R.id.btn_speech);
    Button btnDrawing = (Button) findViewById(R.id.btn_drawing);
    Button btnPantomime = (Button) findViewById(R.id.btn_pantomime);

    txtWord = (TextView) findViewById(R.id.txt_word);
    speechGenerator = new WordGenerator(getResources().openRawResource(R.raw.words_speech));
    drawingGenerator = new WordGenerator(getResources().openRawResource(R.raw.words_drawing));
    pantomimeGenerator = new WordGenerator(getResources().openRawResource(R.raw.words_pantomime));

    if (savedInstanceState != null) {
      // We are recreating activity.
      currentWord = (Word) savedInstanceState.getSerializable("current_word");
      displayCurrentWord();
    }

    btnSpeech.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        getNextWord(speechGenerator);
        displayCurrentWord();
      }
    });
    btnDrawing.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        getNextWord(drawingGenerator);
        displayCurrentWord();
      }
    });
    btnPantomime.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        getNextWord(pantomimeGenerator);
        displayCurrentWord();
      }
    });
  }

  private void displayWord(Word word) {
    txtWord.setText(word.getWord());
  }
}