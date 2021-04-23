package com.example.asus.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LengthActivity  extends AppCompatActivity {
    Spinner spinnerLengthFrom, spinnerLengthTo;
    String strLength1,strLength2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        spinnerLengthFrom = (Spinner) findViewById(R.id.spinnerLengthFrom);
        spinnerLengthTo = (Spinner) findViewById(R.id.spinnerLengthTo);


        List<String> la = new ArrayList<>();
        la.add("Millimetre");
        la.add("Centimetre");
        la.add("Metre");
        la.add("Kilometre");
        la.add("Inch");
        la.add("Foot");
        la.add("Yard");
        la.add("Mile");
        la.add("Nautical Mile");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, la);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        spinnerLengthFrom.setAdapter(dataAdapter);
        // Spinner click listener
        spinnerLengthFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //The item is selected
                strLength1 = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, la);
        // Drop down layout style - list view with radio button
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        spinnerLengthTo.setAdapter(dataAdapter2);
        // Spinner click listener
        spinnerLengthTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                strLength2 = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        final EditText editTextFromLength = (EditText) findViewById(R.id.editTextFromLength);
        final TextView textViewResultLength = (TextView) findViewById(R.id.textViewResultLength);
        Button btnConvertLength = (Button) findViewById(R.id.btnConvertLength);

        btnConvertLength.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                double numFrom = Double.parseDouble(editTextFromLength.getText().toString());
                double result;
                String finalresult ;


                switch(strLength1){

                    case "Millimetre":
                        switch(strLength2) {
                            case "Millimetre":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Centimetre":
                                result = numFrom*0.1;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Metre":
                                result = numFrom*0.001;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Kilometre":
                                result = numFrom*0.000001;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Inch":
                                result = numFrom*0.03937;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Foot":
                                result = numFrom*0.003281;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Yard":
                                result = numFrom*0.0010936;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Mile":
                                result = numFrom*0.0000006214;
                                textViewResultLength.setText((int) result);
                                break;
                            case "Nautical Mile":
                                result = numFrom*0.000000054;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;

                        }
                        break;

                    case "Centimetre":
                        switch(strLength2) {
                            case "Millimetre":
                                result = numFrom*10;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Centimetre":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Metre":
                                result = numFrom*0.01;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Kilometre":
                                result = numFrom*0.00001;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Inch":
                                result = numFrom*0.3937;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Foot":
                                result = numFrom*0.032808;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Yard":
                                result = numFrom*0.010936;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Mile":
                                result = numFrom*0.000006214;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Nautical Mile":
                                result = numFrom*0.00000054;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;

                        }
                        break;


                    case "Metre":
                        switch(strLength2) {
                            case "Millimetre":
                                result = numFrom*1000;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Centimetre":
                                result = numFrom*100;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Metre":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Kilometre":
                                result = numFrom*0.001;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Inch":
                                result = numFrom*39.37007;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Foot":
                                result = numFrom*3.28084;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Yard":
                                result = numFrom*1.093613;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Mile":
                                result = numFrom*0.00062137;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Nautical Mile":
                                result = numFrom*0.0005399;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;

                        }
                        break;
                    case "Kilometre":
                        switch(strLength2) {
                            case "Millimetre":
                                result = numFrom*1000000;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Centimetre":
                                result = numFrom*100000;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Metre":
                                result = numFrom*1000;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Kilometre":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Inch":
                                result = numFrom*39370.078;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Foot":
                                result = numFrom*3280.839;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Yard":
                                result = numFrom*1093.613;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Mile":
                                result = numFrom*0.62137;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Nautical Mile":
                                result = numFrom*0.53995;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;

                        }
                        break;
                    case "Inch":
                        switch(strLength2) {
                            case "Millimetre":
                                result = numFrom*25.4;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Centimetre":
                                result = numFrom*2.54;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Metre":
                                result = numFrom*0.0254;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Kilometre":
                                result = numFrom*0.0000254;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Inch":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Foot":
                                result = numFrom*0.08333;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Yard":
                                result = numFrom*0.027778;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Mile":
                                result = numFrom*0.00001578;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Nautical Mile":
                                result = numFrom*0.00001371;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;

                        }
                        break;
                    case "Foot":
                        switch(strLength2) {
                            case "Millimetre":
                                result = numFrom*304.8;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);

                                break;
                            case "Centimetre":
                                result = numFrom*30.48;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Metre":
                                result = numFrom*.3048;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Kilometre":
                                result = numFrom*.0003048;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Inch":
                                result = numFrom*12;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Foot":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Yard":
                                result = numFrom*0.3333;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Mile":
                                result = numFrom*0.0001894;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Nautical Mile":
                                result = numFrom*0.0001646;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;

                        }
                        break;
                    case "Yard":
                        switch(strLength2) {
                            case "Millimetre":
                                result = numFrom*914.4;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Centimetre":
                                result = numFrom*91.44;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Metre":
                                result = numFrom*0.9144;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Kilometre":
                                result = numFrom*0.0009144;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Inch":
                                result = numFrom*36;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Foot":
                                result = numFrom*3;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Yard":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Mile":
                                result = numFrom*0.0005681;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Nautical Mile":
                                result = numFrom*0.0004937;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;

                        }
                        break;
                    case "Mile":
                        switch(strLength2) {
                            case "Millimetre":
                                result = numFrom*1609344;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Centimetre":
                                result = numFrom*160934.4;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Metre":
                                result = numFrom*1609.344;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Kilometre":
                                result = numFrom*63360;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Inch":
                                result = numFrom*5280;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Foot":
                                result = numFrom*1760;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Yard":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Mile":
                                result = numFrom*0.62137;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Nautical Mile":
                                result = numFrom*0.86897;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Mil":
                                result = numFrom*63360000;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                        }
                        break;
                    case "Nautical Mile":
                        switch(strLength2) {
                            case "Millimetre":
                                result = numFrom*1852000;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Centimetre":
                                result = numFrom*185200;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Metre":
                                result = numFrom*1852;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Kilometre":
                                result = numFrom*10852;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Inch":
                                result = numFrom*72913.385;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Foot":
                                result = numFrom*6076.115;
                                textViewResultLength.setText((int) result);
                                break;
                            case "Yard":
                                result = numFrom*2025.371;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Mile":
                                result = numFrom*1.1507;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Nautical Mile":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;

                        }
                        break;
                    case "Mil":
                        switch(strLength2) {
                            case "Millimetre":
                                result = numFrom*0.0254;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Centimetre":
                                result = numFrom*0.00254;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Metre":
                                result = numFrom*0.0000254;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Kilometre":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Inch":
                                result = numFrom*39370.078;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Foot":
                                result = numFrom*3280.839;
                                textViewResultLength.setText((int) result);
                                break;
                            case "Yard":
                                result = numFrom*1093.613;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Mile":
                                result = numFrom*0.62137;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;
                            case "Nautical Mile":
                                result = numFrom*0.53995;
                                finalresult = new Double(result).toString();
                                textViewResultLength.setText(finalresult);
                                break;

                        }
                        break;



                }
            }
        });

    }







}

