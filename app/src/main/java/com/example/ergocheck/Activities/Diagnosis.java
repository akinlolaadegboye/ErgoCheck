package com.example.ergocheck.Activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ergocheck.HelperClass.AppUtilityClass;
import com.example.ergocheck.R;

import java.util.ArrayList;

public class Diagnosis extends Activity {

<<<<<<< HEAD
    GridView ViewStockGridview;
    ArrayList<DiagnosisItems> arraylist11,arraylist12,arraylist13,arraylist14,arraylist15,arraylist31,arraylist32;
    DiagnosisCustomAdapter adapter;
    String machineUsed,from;
    int number;
    TextView questionTextView;
    Button previousButton,nextButton;
    public static String[] title11,title12,title13,title14,title15,title31,title32,recommendation11,recommendation12,recommendation13,recommendation14,recommendation15,recommendation31,recommendation32;


=======
    int number;
    GridView ViewStockGridview;
    ArrayList<DiagnosisItems> arraylist11, arraylist12, arraylist13, arraylist14, arraylist15, arraylist31, arraylist32;
    DiagnosisCustomAdapter adapter;
    String machineUsed, from;
    TextView questionTextView;
    Button previousButton, nextButton;
    public static String[] title11, title12, title13, title14, title15, title31, title32, recommendation11, recommendation12,
            recommendation13, recommendation14, recommendation15, recommendation31, recommendation32;
>>>>>>> version2

    int[] image11 = {
            R.drawable.body_pain,
            R.drawable.muscle_pain,
            R.drawable.fatigue,
            R.drawable.headache
    };


    int[] image12 = {
            R.drawable.hour_5,
            R.drawable.hour_7,
            R.drawable.hour_9
    };

    int[] image13 = {
            R.drawable.sitting,
            R.drawable.standing,
            R.drawable.bending
    };

    int[] image14 = {
<<<<<<< HEAD

=======
>>>>>>> version2
            R.drawable.neck_pain,
            R.drawable.wrist_pain,
            R.drawable.lower_hand,
            R.drawable.upper_arm,
            R.drawable.back_pain,
            R.drawable.shoulder_pain,
            R.drawable.waist_pain
    };

    int[] image15 = {
            R.drawable.yes,
            R.drawable.no,
    };


    int[] image31 = {
            R.drawable.kg20,
            R.drawable.kg40,
    };


    int[] image32 = {
            R.drawable.slip,
            R.drawable.fall
    };


<<<<<<< HEAD


=======
>>>>>>> version2
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_diagnosis);
<<<<<<< HEAD

        init();
        displayLogic();
        listenerMethod();

    }

    void listenerMethod(){
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number < 5 & machineUsed.equalsIgnoreCase("Sealing machine")){

                    Intent intent = new Intent(Diagnosis.this, Diagnosis.class);
                    intent.putExtra("machineUsed",machineUsed);

                    if(number == 3 ){
                        intent.putExtra("number",String.valueOf(5));
                    }
                    else  if(number != 3 ){
                        intent.putExtra("number",String.valueOf(number+1));
                    }

                    startActivity(intent);
                    finish();
                }

                else if(number == 5 && machineUsed.equalsIgnoreCase("Sealing machine")){

                    Toast.makeText(Diagnosis.this,"End of Question",Toast.LENGTH_SHORT).show();
                }

                if(number < 2 && machineUsed.equalsIgnoreCase("Loading")){
                    Intent intent = new Intent(Diagnosis.this, Diagnosis.class);
                    intent.putExtra("machineUsed",machineUsed);
                    intent.putExtra("number",String.valueOf(number+1));
                    startActivity(intent);
                    finish();
                }
                else if(number == 3 && machineUsed.equalsIgnoreCase("Sealing machine")){
                    Toast.makeText(Diagnosis.this,"End of Question",Toast.LENGTH_SHORT).show();
=======
        init();
        displayLogic();
        listenerMethod();
    }
    void listenerMethod() {
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number < 5 & machineUsed.equalsIgnoreCase("Sealing machine")) {
                    Intent intent = new Intent(Diagnosis.this, Diagnosis.class);
                    intent.putExtra("machineUsed", machineUsed);
                    if (number == 3) intent.putExtra("number", String.valueOf(5));
                    else intent.putExtra("number", String.valueOf(number + 1));
                    startActivity(intent);
                    finish();
                } else if (number == 5 && machineUsed.equalsIgnoreCase("Sealing machine")) {
                    Toast.makeText(Diagnosis.this, "End of Question", Toast.LENGTH_SHORT).show();
                } else if (number < 2 && machineUsed.equalsIgnoreCase("Loading")) {
                    Intent intent = new Intent(Diagnosis.this, Diagnosis.class);
                    intent.putExtra("machineUsed", machineUsed);
                    intent.putExtra("number", String.valueOf(number + 1));
                    startActivity(intent);
                    finish();
                } else if (number == 3 && machineUsed.equalsIgnoreCase("Sealing machine")) {
                    Toast.makeText(Diagnosis.this, "End of Question", Toast.LENGTH_SHORT).show();
>>>>>>> version2
                }


            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

<<<<<<< HEAD
                if(number <= 1){

                    Toast.makeText(Diagnosis.this,"End of Question",Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(Diagnosis.this, Diagnosis.class);
                    intent.putExtra("machineUsed",machineUsed);

                    if(number == 5  ){
                        intent.putExtra("number",String.valueOf(3));
                    }
                    else{
                        intent.putExtra("number",String.valueOf(number-1));
                    }

                    startActivity(intent);
                    finish();

                }

            }
        });
    }
    void PopulateDiagnosisListView11(){
        arraylist11 = new ArrayList<DiagnosisItems>();
        for(int i=0; i<title11.length ;i++){
            arraylist11.add(new DiagnosisItems(title11[i],recommendation11[i], AppUtilityClass.getBytes(BitmapFactory.decodeResource(getResources(),image11[i]))));//RepRegistration.productImages[i]
=======
                if (number <= 1)
                    Toast.makeText(Diagnosis.this, "End of Question", Toast.LENGTH_SHORT).show();
                else {
                    Intent intent = new Intent(Diagnosis.this, Diagnosis.class);
                    intent.putExtra("machineUsed", machineUsed);
                    if (number == 5) intent.putExtra("number", String.valueOf(3));
                    else intent.putExtra("number", String.valueOf(number - 1));
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
    void PopulateDiagnosisListView11() {
        arraylist11 = new ArrayList<DiagnosisItems>();
        for (int i = 0; i < title11.length; i++) {
            arraylist11.add(new DiagnosisItems(title11[i], recommendation11[i], AppUtilityClass.getBytes(BitmapFactory.decodeResource(getResources(), image11[i]))));//RepRegistration.productImages[i]
>>>>>>> version2
        }
        adapter = new DiagnosisCustomAdapter(Diagnosis.this, arraylist11);
        ViewStockGridview.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
<<<<<<< HEAD
    void PopulateDiagnosisListView12(){

        arraylist12 = new ArrayList<DiagnosisItems>();
        for(int i=0; i<title12.length ;i++){
            arraylist12.add(new DiagnosisItems(title12[i],recommendation12[i], AppUtilityClass.getBytes(BitmapFactory.decodeResource(getResources(),image12[i]))));//RepRegistration.productImages[i]
=======
    void PopulateDiagnosisListView12() {
        arraylist12 = new ArrayList<DiagnosisItems>();
        for (int i = 0; i < title12.length; i++) {
            arraylist12.add(new DiagnosisItems(title12[i], recommendation12[i], AppUtilityClass.getBytes(BitmapFactory.decodeResource(getResources(), image12[i]))));//RepRegistration.productImages[i]
>>>>>>> version2
        }
        adapter = new DiagnosisCustomAdapter(Diagnosis.this, arraylist12);
        ViewStockGridview.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
<<<<<<< HEAD
    void PopulateDiagnosisListView13(){

        arraylist13 = new ArrayList<DiagnosisItems>();
        for(int i=0; i<title13.length ;i++){
            arraylist13.add(new DiagnosisItems(title13[i],recommendation13[i], AppUtilityClass.getBytes(BitmapFactory.decodeResource(getResources(),image13[i]))));//RepRegistration.productImages[i]
=======
    void PopulateDiagnosisListView13() {
        arraylist13 = new ArrayList<DiagnosisItems>();
        for (int i = 0; i < title13.length; i++) {
            arraylist13.add(new DiagnosisItems(title13[i], recommendation13[i], AppUtilityClass.getBytes(BitmapFactory.decodeResource(getResources(), image13[i]))));//RepRegistration.productImages[i]
>>>>>>> version2
        }
        adapter = new DiagnosisCustomAdapter(Diagnosis.this, arraylist13);
        ViewStockGridview.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
<<<<<<< HEAD
    void PopulateDiagnosisListView14(){

        arraylist14 = new ArrayList<DiagnosisItems>();
        for(int i=0; i<title14.length ;i++){
            arraylist14.add(new DiagnosisItems(title14[i],recommendation14[i], AppUtilityClass.getBytes(BitmapFactory.decodeResource(getResources(),image14[i]))));//RepRegistration.productImages[i]
=======
    void PopulateDiagnosisListView14() {
        arraylist14 = new ArrayList<DiagnosisItems>();
        for (int i = 0; i < title14.length; i++) {
            arraylist14.add(new DiagnosisItems(title14[i], recommendation14[i], AppUtilityClass.getBytes(BitmapFactory.decodeResource(getResources(), image14[i]))));//RepRegistration.productImages[i]
>>>>>>> version2
        }
        adapter = new DiagnosisCustomAdapter(Diagnosis.this, arraylist14);
        ViewStockGridview.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
<<<<<<< HEAD
    void PopulateDiagnosisListView15(){

        arraylist15 = new ArrayList<DiagnosisItems>();
        for(int i=0; i<title15.length ;i++){
            arraylist15.add(new DiagnosisItems(title15[i],recommendation15[i], AppUtilityClass.getBytes(BitmapFactory.decodeResource(getResources(),image15[i]))));//RepRegistration.productImages[i]
=======
    void PopulateDiagnosisListView15() {
        arraylist15 = new ArrayList<DiagnosisItems>();
        for (int i = 0; i < title15.length; i++) {
            arraylist15.add(new DiagnosisItems(title15[i], recommendation15[i], AppUtilityClass.getBytes(BitmapFactory.decodeResource(getResources(), image15[i]))));//RepRegistration.productImages[i]
>>>>>>> version2
        }
        adapter = new DiagnosisCustomAdapter(Diagnosis.this, arraylist15);
        ViewStockGridview.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
<<<<<<< HEAD
    void PopulateDiagnosisListView31(){

        arraylist31 = new ArrayList<DiagnosisItems>();
        for(int i=0; i<title31.length ;i++){
            arraylist31.add(new DiagnosisItems(title31[i],recommendation31[i], AppUtilityClass.getBytes(BitmapFactory.decodeResource(getResources(),image31[i]))));//RepRegistration.productImages[i]
=======
    void PopulateDiagnosisListView31() {
        arraylist31 = new ArrayList<DiagnosisItems>();
        for (int i = 0; i < title31.length; i++) {
            arraylist31.add(new DiagnosisItems(title31[i], recommendation31[i], AppUtilityClass.getBytes(BitmapFactory.decodeResource(getResources(), image31[i]))));//RepRegistration.productImages[i]
>>>>>>> version2
        }
        adapter = new DiagnosisCustomAdapter(Diagnosis.this, arraylist31);
        ViewStockGridview.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
<<<<<<< HEAD
    void PopulateDiagnosisListView32(){

        arraylist32 = new ArrayList<DiagnosisItems>();
        for(int i=0; i<title32.length ;i++){
            arraylist32.add(new DiagnosisItems(title32[i],recommendation32[i], AppUtilityClass.getBytes(BitmapFactory.decodeResource(getResources(),image32[i]))));//RepRegistration.productImages[i]
=======
    void PopulateDiagnosisListView32() {
        arraylist32 = new ArrayList<DiagnosisItems>();
        for (int i = 0; i < title32.length; i++) {
            arraylist32.add(new DiagnosisItems(title32[i], recommendation32[i], AppUtilityClass.getBytes(BitmapFactory.decodeResource(getResources(), image32[i]))));//RepRegistration.productImages[i]
>>>>>>> version2
        }
        adapter = new DiagnosisCustomAdapter(Diagnosis.this, arraylist32);
        ViewStockGridview.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
<<<<<<< HEAD
    void displayLogic(){
=======
    void displayLogic() {
>>>>>>> version2
        Intent intent = getIntent();
        machineUsed = intent.getStringExtra("machineUsed");
        from = intent.getStringExtra("from");
        number = Integer.parseInt(intent.getStringExtra("number"));
<<<<<<< HEAD

        if(number == 4 && from.equalsIgnoreCase("adapter")){
=======
        if (number == 4 && from.equalsIgnoreCase("adapter")) {
>>>>>>> version2
            nextButton.setVisibility(View.GONE);
            previousButton.setVisibility(View.GONE);
        }

<<<<<<< HEAD


        if(number == 5 && machineUsed.equalsIgnoreCase("Sealing machine")){
            nextButton.setVisibility(View.GONE);
        }
        else if(number == 1 && machineUsed.equalsIgnoreCase("Sealing machine")){
            previousButton.setVisibility(View.GONE);
        }


        if(number == 2 && machineUsed.equalsIgnoreCase("Loading")){
            nextButton.setVisibility(View.GONE);
        }
        else if(number == 1 && machineUsed.equalsIgnoreCase("Loading")){
            previousButton.setVisibility(View.GONE);
        }

        if(machineUsed.equalsIgnoreCase("Sealing machine")){
            if(number == 1){
                questionTextView.setText("What discomfort do you normally experience as a result of production operation?");
                PopulateDiagnosisListView11();
            }
            else if(number == 2){
                questionTextView.setText("What is the duration of operation per day?");
                PopulateDiagnosisListView12();
            }

            else if(number == 3){
                questionTextView.setText("What is the operation posture?");
                PopulateDiagnosisListView13();
            }

            else if(number == 4){
                questionTextView.setText("Which part of the body do you frequently experience pain?");
                PopulateDiagnosisListView14();
            }

            else if(number == 5){
                questionTextView.setText("Do you use drugs or analgesic before operation?");
                PopulateDiagnosisListView15();
            }
        }

        else if(machineUsed.equalsIgnoreCase("Loading")) {
=======
        if (number == 5 && machineUsed.equalsIgnoreCase("Sealing machine")) {
            nextButton.setVisibility(View.GONE);
        } else if (number == 1 && machineUsed.equalsIgnoreCase("Sealing machine")) {
            previousButton.setVisibility(View.GONE);
        }

        if (number == 2 && machineUsed.equalsIgnoreCase("Loading")) {
            nextButton.setVisibility(View.GONE);
        } else if (number == 1 && machineUsed.equalsIgnoreCase("Loading")) {
            previousButton.setVisibility(View.GONE);
        }

        if (machineUsed.equalsIgnoreCase("Sealing machine")) {
            if (number == 1) {
                questionTextView.setText("What discomfort do you normally experience as a result of production operation?");
                PopulateDiagnosisListView11();
            } else if (number == 2) {
                questionTextView.setText("What is the duration of operation per day?");
                PopulateDiagnosisListView12();
            } else if (number == 3) {
                questionTextView.setText("What is the operation posture?");
                PopulateDiagnosisListView13();
            } else if (number == 4) {
                questionTextView.setText("Which part of the body do you frequently experience pain?");
                PopulateDiagnosisListView14();
            } else if (number == 5) {
                questionTextView.setText("Do you use drugs or analgesic before operation?");
                PopulateDiagnosisListView15();
            }
        } else if (machineUsed.equalsIgnoreCase("Loading")) {
>>>>>>> version2
            if (number == 1) {
                questionTextView.setText("What is the weight of load you ofter carry?");
                PopulateDiagnosisListView31();
            }

            if (number == 2) {
                questionTextView.setText("What are the most accident encountered ?");
                PopulateDiagnosisListView32();
            }
        }
    }
<<<<<<< HEAD
    void init(){
=======
    void init() {
>>>>>>> version2
        title11 = getResources().getStringArray(R.array.title11);
        title12 = getResources().getStringArray(R.array.title12);
        title13 = getResources().getStringArray(R.array.title13);
        title14 = getResources().getStringArray(R.array.title14);
        title15 = getResources().getStringArray(R.array.title15);

        title31 = getResources().getStringArray(R.array.title31);
        title32 = getResources().getStringArray(R.array.title32);

        recommendation11 = getResources().getStringArray(R.array.recommendation11);
        recommendation12 = getResources().getStringArray(R.array.recommendation12);
        recommendation13 = getResources().getStringArray(R.array.recommendation13);
        recommendation14 = getResources().getStringArray(R.array.recommendation14);
        recommendation15 = getResources().getStringArray(R.array.recommendation15);
        recommendation31 = getResources().getStringArray(R.array.recommendation31);
        recommendation32 = getResources().getStringArray(R.array.recommendation32);

<<<<<<< HEAD
        questionTextView = (TextView)findViewById(R.id.questionTextView);
=======
        questionTextView = (TextView) findViewById(R.id.questionTextView);
>>>>>>> version2
        ViewStockGridview = (GridView) findViewById(R.id.ViewStockGridview);
        previousButton = (Button) findViewById(R.id.previousButton);
        nextButton = (Button) findViewById(R.id.nextButton);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
<<<<<<< HEAD

=======
>>>>>>> version2
    }

}
