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

public class AreaActivity extends AppCompatActivity {
    Spinner spinnerAreaFrom, spinnerAreaTo;
    String strArea1, strArea2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        spinnerAreaFrom = (Spinner) findViewById(R.id.spinnerAreaFrom);
        spinnerAreaTo = (Spinner) findViewById(R.id.spinnerAreaTo);


        List<String> aa = new ArrayList<>();
        aa.add("Acre");
        aa.add("Are");
        aa.add("Hectare");
        aa.add("Square Centimetre");
        aa.add("Square Foot");
        aa.add("Square Inch");
        aa.add("Metre");


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, aa);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerAreaFrom.setAdapter(dataAdapter);

        spinnerAreaFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //The item is selected
                strArea1 = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, aa);

        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerAreaTo.setAdapter(dataAdapter2);

        spinnerAreaTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                strArea2 = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final EditText editTextFromArea = (EditText) findViewById(R.id.editTextFromArea);
        final TextView textViewResultArea = (TextView) findViewById(R.id.textViewResultArea);
        Button btnConvertArea = (Button) findViewById(R.id.btnConvertArea);

        btnConvertArea.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                double numFrom = Double.parseDouble(editTextFromArea.getText().toString());
                double result;
                String finalresult;

                switch(strArea1){

                    case "Acre":
                        switch(strArea2) {
                            case "Acre":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Are":
                                result = numFrom * 40.46854;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Hectare":
                                result = numFrom * 0.404685;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Centimetre":
                                result = numFrom * 40468564.224;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Foot":
                                result = numFrom * 43560;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Inch":
                                result = numFrom * 6272640;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Metre":
                                result = numFrom * 4046.8564;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;

                        }
                        break;

                    case "Are":
                        switch(strArea2) {
                            case "Acre":
                                result = numFrom*0.0247105;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Are":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Hectare":
                                result = numFrom*0.01;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Centimetre":
                                result = numFrom*1000000;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Foot":
                                result = numFrom*1076.391;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square inch":
                                result = numFrom*155000.31000062;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Metre":
                                result = numFrom*100;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;

                        }
                        break;


                    case "Hectare":
                        switch(strArea2) {
                            case "Acre":
                                result = numFrom*2.47105;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Are":
                                result = numFrom*100;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Hectare":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Centimetre":
                                result = numFrom*100000000;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Foot":
                                result = numFrom*107639.104167;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Inch":
                                result = numFrom*15500031.000062;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Metre":
                                result = numFrom*10000;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;

                        }
                        break;
                    case "Square Centimetre":
                        switch(strArea2) {
                            case "Acre":
                                result = numFrom*0.000000024710538146717;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Are":
                                result = numFrom*0.000001;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Hectare":
                                result = numFrom*0.00000001;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Centimetre":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Foot":
                                result = numFrom*0.001076391;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Inch":
                                result = numFrom*0.15500031;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Metre":
                                result = numFrom*0.0001;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;

                        }
                        break;
                    case "Square Foot":
                        switch(strArea2) {
                            case "Acre":
                                result = numFrom*0.0000229568;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Are":
                                result = numFrom*0.00092903;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Hectare":
                                result = numFrom*0.0000092903;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Centimetre":
                                result = numFrom*929.0304;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Foot":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Inch":
                                result = numFrom*144;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Metre":
                                result = numFrom*0.092903;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;

                        }
                        break;
                    case "Square Inch":
                        switch(strArea2) {
                            case "Acre":
                                result = numFrom*0.00000015942250790736;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Are":
                                result = numFrom*0.0000064516;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Hectare":
                                result = numFrom*0.0000000645;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Centimetre":
                                result = numFrom*6.4516;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Foot":
                                result = numFrom*0.0069444;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Inch":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Metre":
                                result = numFrom*0.00064516;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;

                        }
                        break;
                    case "Square Metre":
                        switch(strArea2) {
                            case "Acre":
                                result = numFrom*0.0002471;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Are":
                                result = numFrom*0.01;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Hectare":
                                result = numFrom*0.0001;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Centimetre":
                                result = numFrom*10000;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Foot":
                                result = numFrom*10.7639;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Inch":
                                result = numFrom*1550.0031;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;
                            case "Square Metre":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultArea.setText(finalresult);
                                break;

                        }
                        break;



                }
            }
        });

    }







}