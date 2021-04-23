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

public class TemperatureActivity extends AppCompatActivity {
    Spinner spinnerTempFrom, spinnerTempTo;
    String strTemp1,strTemp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        spinnerTempFrom = (Spinner) findViewById(R.id.spinnerTempFrom);
        spinnerTempTo = (Spinner) findViewById(R.id.spinnerTempTo);


        List<String> ta = new ArrayList<>();
        ta.add("Celsius");
        ta.add("Farenheit");
        ta.add("Kelvin");


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ta);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerTempFrom.setAdapter(dataAdapter);

        spinnerTempFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                strTemp1 = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ta);

        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerTempTo.setAdapter(dataAdapter2);

        spinnerTempTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                strTemp2 = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        final EditText editTextFromTemp = (EditText) findViewById(R.id.editTextFromTemp);
        final TextView textViewResultTemp = (TextView) findViewById(R.id.textViewResultTemp);
        Button btnConvertTemp = (Button) findViewById(R.id.btnConvertTemp);

        btnConvertTemp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                double numFrom = Double.parseDouble(editTextFromTemp.getText().toString());
                double result;
                String finalresult ;


                switch(strTemp1){

                    case "Celsius":
                        switch(strTemp2) {
                            case "Celsius":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultTemp.setText(finalresult);
                                break;
                            case "Farenheit":
                                result = numFrom* 1.8 + 32;
                                finalresult = new Double(result).toString();
                                textViewResultTemp.setText(finalresult);
                                break;
                            case "Kelvin":
                                result = numFrom+273.15;
                                finalresult = new Double(result).toString();
                                textViewResultTemp.setText(finalresult);
                                break;

                        }
                        break;
                    case "Farenheit":
                        switch(strTemp2) {
                            case "Celsius":
                                result = (numFrom - 32) / 1.8;
                                finalresult = new Double(result).toString();
                                textViewResultTemp.setText(finalresult);
                                break;
                            case "Farenheit":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultTemp.setText(finalresult);
                                break;
                            case "Kelvin":
                                result = (numFrom - 32) / 1.8 + 273.15;
                                finalresult = new Double(result).toString();
                                textViewResultTemp.setText(finalresult);
                                break;

                        }
                        break;
                    case "Kelvin":
                        switch(strTemp2) {
                            case "Celsius":
                                result = numFrom - 273.15;
                                finalresult = new Double(result).toString();
                                textViewResultTemp.setText(finalresult);
                                break;
                            case "Farenheit":
                                result = (numFrom - 273.15)* 1.8000 + 32.00;
                                finalresult = new Double(result).toString();
                                textViewResultTemp.setText(finalresult);
                                break;
                            case "Kelvin":
                                result = numFrom ;
                                finalresult = new Double(result).toString();
                                textViewResultTemp.setText(finalresult);
                                break;

                        }
                        break;




                }
            }
        });

    }







}

