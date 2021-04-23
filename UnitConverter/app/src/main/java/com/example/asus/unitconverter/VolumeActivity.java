package com.example.asus.unitconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class VolumeActivity extends AppCompatActivity {
    Spinner spinnerVolumeFrom, spinnerVolumeTo;
    String strVolume1, strVolume2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

        spinnerVolumeFrom = (Spinner) findViewById(R.id.spinnerVolumeFrom);
        spinnerVolumeTo = (Spinner) findViewById(R.id.spinnerVolumeTo);


        List<String> va = new ArrayList<>();
        va.add("Gallon(US)");
        va.add("Gallon(UK)");
        va.add("Litre");
        va.add("Millilitre/CC");
        va.add("Cubic Metre");
        va.add("Cubic Inch");
        va.add("Cubic Foot");


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, va);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerVolumeFrom.setAdapter(dataAdapter);

        spinnerVolumeFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                strVolume1 = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, va);

        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerVolumeTo.setAdapter(dataAdapter2);

        spinnerVolumeTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                strVolume2 = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final EditText editTextFromVolume = (EditText) findViewById(R.id.editTextFromVolume);
        final TextView textViewResultVolume = (TextView) findViewById(R.id.textViewResultVolume);
        Button btnConvertVolume = (Button) findViewById(R.id.btnConvertVolume);

        btnConvertVolume.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                double numFrom = Double.parseDouble(editTextFromVolume.getText().toString());
                double result;
                String finalresult ;


                switch(strVolume1){

                    case "Gallon(US)":
                        switch(strVolume2) {
                            case "Gallon(US)":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Gallon(UK)":
                                result = numFrom * 0.83267418;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Litre":
                                result = numFrom * 3.7854118;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Millilitre/CC":
                                result = numFrom * 3785.411784;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Metre":
                                result = numFrom * 0.0037854118;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Inch":
                                result = numFrom * 231;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Foot":
                                result = numFrom * 0.133680556;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                        }
                    case "Gallon(UK)":
                        switch(strVolume2) {
                            case "Gallon(US)":
                                result = numFrom*1.2009499;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Gallon(UK)":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Litre":
                                result = numFrom*4.54609;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Millilitre/CC":
                                result = numFrom *4546.09;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Metre":
                                result = numFrom * 0.00454609;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Inch":
                                result = numFrom * 277.419432;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Foot":
                                result = numFrom * 0.1605436;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                        }
                    case "Litre":
                        switch(strVolume2) {
                            case "Gallon(US)":
                                result = numFrom*0.26417;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Gallon(UK)":
                                result = numFrom * 0.219969;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Litre":
                                result = numFrom ;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Millilitre/CC":
                                result = numFrom * 1000;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Metre":
                                result = numFrom * 0.001;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Inch":
                                result = numFrom * 61.0237441;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Foot":
                                result = numFrom * 0.035314667;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                        }
                    case "Cubic Metre":
                        switch(strVolume2) {
                            case "Gallon(US)":
                                result = numFrom*264.17205;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Gallon(UK)":
                                result = numFrom * 219.969248;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Litre":
                                result = numFrom*1000 ;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Millilitre/CC":
                                result = numFrom*1000000;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Metre":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Inch":
                                result = numFrom * 61023.744094;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Foot":
                                result = numFrom * 35.314667;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                        }
                    case "Millilitre/CC":
                        switch(strVolume2) {
                            case "Gallon(US)":
                                result = numFrom*0.00026417;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Gallon(UK)":
                                result = numFrom * 0.000219969;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Litre":
                                result = numFrom*0.001 ;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Millilitre/CC":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Metre":
                                result = numFrom * 0.000001;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Inch":
                                result = numFrom * 0.0610237441;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Foot":
                                result = numFrom * 0.000035314667;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                        }
                    case "Cubic Inch":
                        switch(strVolume2) {
                            case "Gallon(US)":
                                result = numFrom*0.004329;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Gallon(UK)":
                                result = numFrom * 0.0036046;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Litre":
                                result = numFrom*0.016387 ;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Millilitre/CC":
                                result = numFrom*16.3871;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Metre":
                                result = numFrom * 0.0000163871;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Inch":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Foot":
                                result = numFrom * 0.0005787;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                        }
                    case "Cubic Foot":
                        switch(strVolume2) {
                            case "Gallon(US)":
                                result = numFrom*7.48052;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Gallon(UK)":
                                result = numFrom *6.2288354;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Litre":
                                result = numFrom*28.31685 ;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Millilitre/CC":
                                result = numFrom*28316.846592;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Metre":
                                result = numFrom * 0.02831684;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Inch":
                                result = numFrom*1728;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                            case "Cubic Foot":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultVolume.setText(finalresult);
                                break;
                        }



                        break;
                }



                }
            });

        }

    }