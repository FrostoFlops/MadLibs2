package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnGenerate;
    private EditText firstName;
    private EditText lastName;
    private EditText nouns;
    private EditText verb;
    private EditText adverb;
    private EditText noun;
    private EditText adjective;
    private EditText favoriteFoodSing;
    private EditText favoriteFoodPlur;
    private EditText favoriteColor;
    private EditText friendsName;
    private EditText daysInYear;
    private EditText amountMoney;
    private EditText wantToWin;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGenerate = findViewById(R.id.btn_generate);


        Intent intentDisplay = new Intent(MainActivity.this, DisplayActivity.class);


        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String story = "";
                story += "\n";
                story += "\n";
                story += "\n";

                startActivity(intentDisplay);


            }
        });


    }
}