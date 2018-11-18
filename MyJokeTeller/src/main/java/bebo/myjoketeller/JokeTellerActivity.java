package bebo.myjoketeller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import bebo.Jokes.Joke;


public class JokeTellerActivity extends AppCompatActivity {
    TextView mtextView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_teller);
        intent = getIntent();
        String recievedJoke = intent.getStringExtra("key");
        mtextView = findViewById(R.id.joke_tv);
        mtextView.setText(recievedJoke);
    }
}
