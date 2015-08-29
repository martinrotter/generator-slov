package eu.rotterovi.martin.generatorslov;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

public class MainActivity extends ActionBarActivity {

  private WordGenerator speechGenerator;
  private WordGenerator drawingGenerator;
  private WordGenerator pantomimeGenerator;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    // Set fullscreen.
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button btnSpeech = (Button) findViewById(R.id.btn_speech);

    btnSpeech.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        // TODO: todo
      }
    });
  }

  private void displayWord(Word word) {
    // TODO: todo
  }
}
