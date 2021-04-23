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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DataActivity extends AppCompatActivity  {
    Spinner spinnerDataFrom, spinnerDataTo;
    String strData1, strData2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        spinnerDataFrom = (Spinner) findViewById(R.id.spinnerDataFrom);
        spinnerDataTo = (Spinner) findViewById(R.id.spinnerDataTo);


        List<String> da = new ArrayList<>();
        da.add("Bit");
        da.add("Byte(B)");
        da.add("Kilobyte(KB)");
        da.add("Megabyte(MB)");
        da.add("Gigabyte(GB)");
        da.add("Terabyte(TB)");


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, da);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerDataFrom.setAdapter(dataAdapter);

        spinnerDataFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                strData1 = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, da);

        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerDataTo.setAdapter(dataAdapter2);

        spinnerDataTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                strData2 = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final EditText editTextFromData = (EditText) findViewById(R.id.editTextFromData);
        final TextView textViewResultData = (TextView) findViewById(R.id.textViewResultData);
        Button btnConvertData = (Button) findViewById(R.id.btnConvertData);

        btnConvertData.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                double numFrom = Double.parseDouble(editTextFromData.getText().toString());
                double result;
                String finalresult ;


                switch(strData1){

                    case "Bit":
                        switch(strData2) {
                            case "Bit":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Byte(B)":
                                result = numFrom/8;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Kilobyte(KB)":
                                result = numFrom/8192;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Megabyte(MB)":
                                result = numFrom/8388608;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Gigabyte(GB)":
                                result = numFrom/1073741824;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Terabyte(TB)":
                                result = numFrom/8796093022208L;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;

                        }
                        break;
                    case "Byte":
                        switch(strData2) {
                            case "Bit":
                                result = numFrom*8;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Byte(B)":
                                result = numFrom*0.001;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Kilobyte(KB)":
                                result = numFrom*0.000001;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Megabyte(MB)":
                                result = numFrom*1E-09;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Gigabyte(GB)":
                                result = numFrom*1E-12;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Terabyte(TB)":
                                result = numFrom/8796093022208L;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;

                        }
                        break;
                    case "Kilobyte":
                        switch(strData2) {
                            case "Bit":
                                result = numFrom*8000;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Byte(B)":
                                result = numFrom*1000;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Kilobyte(KB)":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Megabyte(MB)":
                                result = numFrom*0.001;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Gigabyte(GB)":
                                result = numFrom*0.000001;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Terabyte(TB)":
                                result = numFrom*1E-9;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;

                        }
                        break;
                    case "Megabyte":
                        switch(strData2) {
                            case "Bit":
                                result = numFrom*0.125;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Byte(B)":
                                result = numFrom*1000000;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Kilobyte(KB)":
                                result = numFrom*1000;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Megabyte(MB)":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Gigabyte(GB)":
                                result = numFrom*0.001;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Terabyte(TB)":
                                result = numFrom*0.000001;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;

                        }
                        break;
                    case "Gigabyte":
                        switch(strData2) {
                            case "Bit":
                                result = numFrom*8E+9;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Byte(B)":
                                result = numFrom*1E+9;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Kilobyte(KB)":
                                result = numFrom*1000000;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Megabyte(MB)":
                                result = numFrom*1000;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Gigabyte(GB)":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Terabyte(TB)":
                                result = numFrom*0.001;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;

                        }
                        break;
                    case "Teraabyte":
                        switch(strData2) {
                            case "Bit":
                                result = numFrom*8E+12;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Byte(B)":
                                result = numFrom*1E+12;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Kilobyte(KB)":
                                result = numFrom*1E+9;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Megabyte(MB)":
                                result = numFrom*1000000;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Gigabyte(GB)":
                                result = numFrom*1000;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;
                            case "Terabyte(TB)":
                                result = numFrom;
                                finalresult = new Double(result).toString();
                                textViewResultData.setText(finalresult);
                                break;

                        }
                        break;




                }
            }
        });

    }

}