package com.example.quizapp;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Random;
//import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    public TextView questionTV, questionNumberTV;
    public Button option1Btn, option2Btn, option3Btn,option4Btn;
    private ArrayList<QuizModel> quizModelArrayList;
    Random random;
    int currentScore =0, questionsAttempted = 1, currentPos;

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

      private void showbottomsheet() {
           BottomSheetDialog  bottomSheetDialog = new BottomSheetDialog(MainActivity.this);
           View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.scorebottomsheet, (LinearLayout)findViewById(R.id.idLLScore));
           TextView scoreTV = bottomSheetView.findViewById(R.id.idTVScore);
           Button restartQuizBtn = bottomSheetView.findViewById(R.id.idbtnRestart);
           scoreTV.setText("YOur Score is \n" + currentPos + "/10");
           restartQuizBtn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   currentPos = random.nextInt(quizModelArrayList.size());
                   setDataToview(currentPos);
                   questionsAttempted = 1;
                   currentScore = 0;
                   bottomSheetDialog.dismiss();

               }
           });
           bottomSheetDialog.setCancelable(false);
           bottomSheetDialog.setContentView(bottomSheetView);
           bottomSheetDialog.show();
       }

    private void setDataToview(int currentPos) {
        questionNumberTV.setText("Question Attempted : " + questionsAttempted + "/10");
        if(questionsAttempted == 10) {
            showbottomsheet();
        }
        else

        questionTV.setText(quizModelArrayList.get(this.currentPos).getQuestion());
        option1Btn.setText(quizModelArrayList.get(this.currentPos).getOption1());
        option2Btn.setText(quizModelArrayList.get(this.currentPos).getOption2());
        option3Btn.setText(quizModelArrayList.get(this.currentPos).getOption3());
        option4Btn.setText(quizModelArrayList.get(this.currentPos).getOption4());

    }

    private void getQuizQuestion(ArrayList<QuizModel> quizModelArrayList) {
        quizModelArrayList.add(new QuizModel("What is an activity in Android?","Activity performs the actions on the screen",  "Manage the Application content", "Screen UI","None of the above", "Activity performs the actions on the screen"));
        quizModelArrayList.add(new QuizModel("What are the layouts availabe in Android?", "Linear Layout",  "Table Layout", "Relative Layout","All of the above","All of the above"));
        quizModelArrayList.add(new QuizModel("What is the lifecycle of broadcast receivers in android?", "send intent()",  "on Receive()", "implicit Broadcast()", "sendBroadcast(), sendOrderBroadcast(), and sendStickyBroadcast","on Receive()"));
        quizModelArrayList.add(new QuizModel("How to get current location in android?", "Using GPRS", "Using locaiton provider", "A & B","SQlite","A & B"));
        quizModelArrayList.add(new QuizModel("In which technique, we can refresh the dynamic content in android?", "Java",  "Ajax", "Android","None of the above","Ajax"));
        quizModelArrayList.add(new QuizModel("What is JSON exception in android?", "JSON Exception",  "Json Not found exception", "input not found exception","None of the above","JSON Exception"));
        quizModelArrayList.add(new QuizModel("What is a thread in Android", "Same as services",  "Background activity", "Broadcast Receiver","independent dis-patchable unit is called Thread","independent dis-patchable unit is called Thread"));
        quizModelArrayList.add(new QuizModel("Which component is NOT a part of Android Architecture?", "Android Framework",  "libraries", "Linux Kernal","Android Document","Android Document"));
        quizModelArrayList.add(new QuizModel("What is APTT?", "Android Asset Processing Tool",  "Android Asset Providing Tool", "Android Asset Packing Tool","Android Asset Packing Technique","Android Asset Packing Tool"));
        quizModelArrayList.add(new QuizModel("Adb stands for?", "Android Drive Bridge",  "Android Debug Bridge", "Android Destroy Bridge","Android Destroy Bridge","Android Drive Bridge"));
        //we can add even more questions. Only 10 question will be randomly selected for the qiuiz everything.
    }
}