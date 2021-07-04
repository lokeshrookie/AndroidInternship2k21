package com.example.quizapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public TextView questionTV, questionNumberTV;
    public Button option1Btn, option2Btn, option3Btn,option4Btn;
    private ArrayList<QuizModel> quizModelArrayList;
    Random random;
    int currentScore =0;
    int questionsAttempted = 1, currentPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questionTV = findViewById(R.id.idtvQuestion);
        questionNumberTV=findViewById(R.id.idtvnumberofquestionsAttempted);
        option1Btn = findViewById(R.id.idbutton1);
        option2Btn = findViewById(R.id.idbutton2);
        option3Btn = findViewById(R.id.idbutto3);
        option4Btn = findViewById(R.id.idbutton4);
        quizModelArrayList = new ArrayList<>();
        random = new Random();
        getQuizQuestion(quizModelArrayList);
        currentPos = random.nextInt(quizModelArrayList.size());
        setDataToview(currentPos);

        option1Btn.setOnClickListener(v -> {
            if (quizModelArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option1Btn.getText().toString().trim().toLowerCase())) {
                currentPos++;
            }
            questionsAttempted++;
            currentPos = random.nextInt(quizModelArrayList.size());
            setDataToview(currentPos);
        });
        option2Btn.setOnClickListener(v -> {
            if (quizModelArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option2Btn.getText().toString().trim().toLowerCase())) {
                currentPos++;
            }
            questionsAttempted++;
            currentPos = random.nextInt(quizModelArrayList.size());
            setDataToview(currentPos);

        });
        option3Btn.setOnClickListener(v -> {
            if (quizModelArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option3Btn.getText().toString().trim().toLowerCase())) {
                currentPos++;
            }
            questionsAttempted++;
            currentPos = random.nextInt(quizModelArrayList.size());
            setDataToview(currentPos);
        });
         option4Btn.setOnClickListener(v -> {
             if (quizModelArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option4Btn.getText().toString().trim().toLowerCase())) {
                 currentPos++;
             }
             questionsAttempted++;
             currentPos = random.nextInt(quizModelArrayList.size());
             setDataToview(currentPos);
         });

    }

    public  void setDataToview(int currentPos) {
        questionTV.setText(String.format("Question Attempted : %d/10", questionsAttempted));

        questionTV.setText(quizModelArrayList.get(this.currentPos).getQuestion());
        option1Btn.setText(quizModelArrayList.get(this.currentPos).getOption1());
        option2Btn.setText(quizModelArrayList.get(this.currentPos).getOption2());
        option3Btn.setText(quizModelArrayList.get(this.currentPos).getOption3());
        option4Btn.setText(quizModelArrayList.get(this.currentPos).getOption4());

    }

    private void getQuizQuestion(ArrayList<QuizModel> quizModelArrayList) {
        quizModelArrayList.add(new QuizModel("Which of the following is not a programming language ?", "python",  "c/c++", "java","HTML","HTML"));
        quizModelArrayList.add(new QuizModel("Which of the following are types of computer hardware? Select all that apply. ? ","python",  "c/c++", "java","HTML","HTML"));
        quizModelArrayList.add(new QuizModel("What is software? ", "Clothing designed to be worn by computer users",  "Flexible parts of a computer case", "Any part of the computer that has a physical structure","Instructions that tell the hardware what to do","Instructions that tell the hardware what to do"));
        quizModelArrayList.add(new QuizModel("The computer’s main circuit board is called a ________. ?", "hard drive",  "monitor", "cpu","Motherboard","Motherboard"));



    }
}