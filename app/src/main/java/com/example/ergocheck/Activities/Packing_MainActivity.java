package com.example.ergocheck.Activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ergocheck.R;

import java.util.ArrayList;
import java.util.List;

public class Packing_MainActivity extends AppCompatActivity
       {

    Spinner machineUsed;
    Button workRecommendationButton,accidentReccommendationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main_packing);
        initialisation();
        listenerMethod();
        machineSpinnerMethod();
    }

    void initialisation(){
        workRecommendationButton = (Button) findViewById(R.id.workRecommendationButton);
        accidentReccommendationButton = (Button) findViewById(R.id.accidentReccommendationButton);
        machineUsed = (Spinner)findViewById(R.id.machineUsedSpinner);
    }
    void listenerMethod(){
        machineUsed.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String machineUsedString = machineUsed.getSelectedItem().toString();
                if(!machineUsedString.equalsIgnoreCase("--Select machine--")){
                    Intent intent = new Intent(Packing_MainActivity.this, Diagnosis.class);
                    intent.putExtra("machineUsed",machineUsedString);
                    intent.putExtra("number","1");
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        workRecommendationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Packing_MainActivity.this, WorkRecommendation.class);
                startActivity(intent);
            }
        });

        accidentReccommendationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Packing_MainActivity.this, AccidentRecommendation.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onResume() {
        machineUsed.setSelection(0);
        super.onResume();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_exit) {
            exitApplicationMethod();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private void machineSpinnerMethod() {
        List<String> categories = new ArrayList<String>();
        categories.add("--Select machine--");
        categories.add("Sealing machine");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(Packing_MainActivity.this,R.layout.customized_list_items, R.id.name,categories);
        dataAdapter.setDropDownViewResource(R.layout.customized_list_items);
        machineUsed.setAdapter(dataAdapter);

    }
    public void exitApplicationMethod(){
        AlertDialog.Builder al =new AlertDialog.Builder(this);
        al.setMessage("Would you like to exit ErgoCheck ?");
        al.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        al.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alyes=al.create();
        alyes.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialog) {
                Button positiveButton = ((AlertDialog) dialog).getButton(DialogInterface.BUTTON_POSITIVE);
                positiveButton.setTypeface(Typeface.DEFAULT_BOLD);
                positiveButton.invalidate();
                Button negativeButton = ((AlertDialog) dialog).getButton(DialogInterface.BUTTON_NEGATIVE);
                negativeButton.setTypeface(Typeface.DEFAULT_BOLD);
                negativeButton.invalidate();
            }
        });
        alyes.show();
    }
}
