package com.example.m204tp5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class WordsActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        Intent intent = getIntent();
        ArrayList<String> list = (ArrayList<String>) intent.getExtras().get("words");
        LinearLayout buttonsContainer = (LinearLayout) findViewById(R.id.buttonsContainer);

        for (Object i: list) {
            Button btn = new Button(this);
            btn.setText(i.toString());
            btn.setOnClickListener(this);
            buttonsContainer.addView(btn);
        }

    }

    @Override
    public void onClick(View view) {
        Button btn = (Button) view;
        String url = String.format("https://google.com/search?q=%s", btn.getText());
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}