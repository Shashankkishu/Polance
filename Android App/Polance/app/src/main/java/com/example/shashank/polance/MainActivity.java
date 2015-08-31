package com.example.shashank.polance;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by shashank on 30/8/15.
 */
public class MainActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        TextView name = (TextView)findViewById(R.id.name);
        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        name.setTypeface(type);
        Intent i = new Intent(getBaseContext(), login.class);

        new Timer().schedule(man(i), 5000)
        ;

    }

    private TimerTask man(Intent i) {
        startActivity(i);
        return null;
    }

}
