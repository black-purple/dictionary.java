package com.example.m204tp5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button ab, bb, cb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ab = findViewById(R.id.a_button);
        bb = findViewById(R.id.b_button);
        cb = findViewById(R.id.c_button);
        ab.setOnClickListener(this);
        bb.setOnClickListener(this);
        cb.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        ArrayList<String> a_words = new ArrayList<>();
        a_words.add("Actor");
        a_words.add("Almond");
        a_words.add("Allow");


        ArrayList<String> b_words = new ArrayList<>();
        b_words.add("Bachelor");
        b_words.add("Bark");
        b_words.add("Bow");

        ArrayList<String> c_words = new ArrayList<>();
        c_words.add("Cast");
        c_words.add("Call");
        c_words.add("Cargo");

        Button btn = (Button) view;
        String btnText = btn.getText().toString();
        Intent intent = new Intent(this, WordsActivity.class);

        switch (btnText){
            case "A":
                intent.putExtra("words", a_words);
                break;
            case "B":
                intent.putExtra("words", b_words);
                break;
            case "C":
                intent.putExtra("words", c_words);
                break;

        }
        startActivity(intent);
    }
}
