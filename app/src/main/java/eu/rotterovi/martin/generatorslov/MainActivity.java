package eu.rotterovi.martin.generatorslov;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

public class MainActivity extends ActionBarActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    // Set fullscreen.
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

/*
    InputStream raw = getResources().openRawResource(R.raw.words_speech);

    StringWriter writer = new StringWriter();

    try {
      IOUtils.copy(raw, writer, "UTF-8");
      raw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    String theString = writer.toString();*/
  }
}
