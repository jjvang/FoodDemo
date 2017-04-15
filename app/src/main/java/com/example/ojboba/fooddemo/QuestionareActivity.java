package com.example.ojboba.fooddemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by OjBoba on 4/15/2017.
 */

public class QuestionareActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionare_new);

//        Button nextButton = (Button) findViewById(R.id.next_button);
//        nextButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Create a new intent to open the {@link PhrasesActivity}
//                Intent foodIntent = new Intent(QuestionareActivity.this, FoodActivity.class);
//                // Start the new activity
//                startActivity(foodIntent);
//            }
//        });

        final ArrayList<String> wordsOne = new ArrayList<String>();
        wordsOne.add("Snacky");
        wordsOne.add("Diet");
        wordsOne.add("CHEAP");
        wordsOne.add("CLOSE");
        wordsOne.add("QUICK");


        final ArrayList<String> wordsTwo = new ArrayList<String>();
        wordsTwo.add("Hungry");
        wordsTwo.add("Normal");
        wordsTwo.add("AVERAGE");
        wordsTwo.add("NEARISH");
        wordsTwo.add("OKAY");


        final ArrayList<String> wordsThree = new ArrayList<String>();
        wordsThree.add("Hangry");
        wordsThree.add("YOLO");
        wordsThree.add("PREMIUM");
        wordsThree.add("DAYUM");
        wordsThree.add("I GOT TIME");

        final ArrayList<String> question = new ArrayList<String>();
        question.add("LEVEL OF HUNGRY?");
        question.add("HOW HEALTHY?");
        question.add("PRICE RANGE?");
        question.add("DISTANCE?");
        question.add("TIME TO ORDER");


        final int icons[] = {R.drawable.hungry, R.drawable.healthy, R.drawable.money, R.drawable.distance, R.drawable.time};



        final ArrayList<String> progressNumber = new ArrayList<String>();
        progressNumber.add("1/5");
        progressNumber.add("2/5");
        progressNumber.add("3/5");
        progressNumber.add("4/5");
        progressNumber.add("5/5");

        final TextView questionText = (TextView) findViewById(R.id.question_text);
        final SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        final TextView answerOne = (TextView) findViewById(R.id.easy);
        final TextView answerTwo = (TextView) findViewById(R.id.medium);
        final TextView answerThree = (TextView) findViewById(R.id.hard);
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        final TextView progressView = (TextView) findViewById(R.id.progressNumber);
        Button backButton = (Button) findViewById(R.id.back_button);
        Button nextButton = (Button) findViewById(R.id.next_button);
        final ImageView questionImage = (ImageView) findViewById(R.id.questionare_image);


        questionImage.setImageResource(icons[count]);
        answerOne.setText(wordsOne.get(count));
        answerTwo.setText(wordsTwo.get(count));
        answerThree.setText(wordsThree.get(count));
        progressView.setText(progressNumber.get(count));
        questionText.setText(question.get(count));

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count+1;
                if (count <5) {
                    seekBar.setProgress(50);
                    questionText.setText(question.get(count));
                    answerOne.setText(wordsOne.get(count));
                    answerTwo.setText(wordsTwo.get(count));
                    answerThree.setText(wordsThree.get(count));
                    questionImage.setImageResource(icons[count]);
                    progressBar.setProgress(count + 1);
                    progressView.setText(progressNumber.get(count));
                }

                if (count == 5){
                    Intent foodIntent = new Intent(QuestionareActivity.this, FoodActivity.class);
                    // Start the new activity
                    startActivity(foodIntent);
                }
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count == 0){
                    Toast.makeText(QuestionareActivity.this, "NYAAAAAA, No BACK", Toast.LENGTH_SHORT).show();
                }
                if (count > 0){
                    count = count - 1;
                    seekBar.setProgress(50);
                    questionText.setText(question.get(count));
                    answerOne.setText(wordsOne.get(count));
                    answerTwo.setText(wordsTwo.get(count));
                    answerThree.setText(wordsThree.get(count));
                    questionImage.setImageResource(icons[count]);
                    progressBar.setProgress(count + 1);
                    progressView.setText(progressNumber.get(count));
                }
            }
        });

    }


}
