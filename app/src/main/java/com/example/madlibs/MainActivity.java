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
    private EditText friendsYear;
    private EditText amountMoney;
    private EditText wantToWin;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.edit_fn);
        lastName = findViewById(R.id.edit_ln);
        nouns = findViewById(R.id.edit_nouns);
        verb = findViewById(R.id.edit_verb);
        adverb = findViewById(R.id.edit_adverb);
        noun = findViewById(R.id.edit_noun);
        adjective = findViewById(R.id.edit_adjective);
        favoriteFoodSing = findViewById(R.id.edit_ffs);
        favoriteFoodPlur = findViewById(R.id.edit_ffp);
        favoriteColor = findViewById(R.id.edit_favcol);
        friendsName = findViewById(R.id.edit_favcol);
        daysInYear = findViewById(R.id.edit_diy);
        friendsYear = findViewById(R.id.edit_friendsy);
        amountMoney = findViewById(R.id.edit_aom);
        wantToWin = findViewById(R.id.edit_win);

        btnGenerate = findViewById(R.id.btn_generate);


        Intent intentDisplay = new Intent(MainActivity.this, DisplayActivity.class);


        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String story = "";
                story += "\nHi, my name is " + firstName.getText() + " " + lastName.getText() + ".";
                story += "\nI have a friend named " + friendsName.getText();
                story += "\n, me and " + friendsName.getText() + " have been friends for " + friendsYear.getText() + " years.";
                story += "\n";
                story += "\n";
                story += "\n";
                story += "\n";
                story += "\n";
                story += "\n";
                story += "\n";
                story += "\n";
                story += "\n";
                story += "\n";
                story += "\n";
                story += "\n";
                story += "\n";

                startActivity(intentDisplay);


            }
        });


    }
}