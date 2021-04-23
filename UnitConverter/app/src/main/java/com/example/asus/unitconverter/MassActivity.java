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

public class MassActivity extends AppCompatActivity {
    Spinner spinnerMassFrom, spinnerMassTo;
    String strMass1, strMass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);

        spinnerMassFrom = (Spinner) findViewById(R.id.spinnerMassFrom);
        spinnerMassTo = (Spinner) findViewById(R.id.spinnerMassTo);


        List<String> ma = new ArrayList<>();
        ma.add("Ton");
        ma.add("Ton(UK)");
        ma.add("Ton(US)");
        ma.add("Pound");
        ma.add("Ounce)");
        ma.add("Kilogram(Kg)");
        ma.add("Gram");


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ma);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerMassFrom.setAdapter(dataAdapter);

        spinnerMassFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                strMass1 = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ma);

        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerMassTo.setAdapter(dataAdapter2);

        spinnerMassTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                strMass2 = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final EditText editTextFromMass = (EditText) findViewById(R.id.editTextFromMass);
        final TextView textViewResultMass = (TextView) findViewById(R.id.textViewResultMass);
        Button btnConvertMass = (Button) findViewById(R.id.btnConvertMass);

        btnConvertMass.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            // TODO Auto-generated method stub
            double numFrom = Double.parseDouble(editTextFromMass.getText().toString());
            double result;
            String finalresult ;

            switch(strMass1) {

                case "Ton":
                    switch (strMass2) {
                        case "Ton":
                            result = numFrom;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ton(UK)":
                            result = numFrom*0.98420652;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ton(US)":
                            result = numFrom*1.1023113;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Pound":
                            result = numFrom*2204.6226;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ounce)":
                            result = numFrom *35273.96194;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Kilogram(Kg)":
                            result = numFrom *1000;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Gram":
                            result = numFrom *1000000;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;

                    }
                    break;
                case "Ton(UK)":
                    switch (strMass2) {
                        case "Ton":
                            result = numFrom*1.0160469;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ton(UK)":
                            result = numFrom;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ton(US)":
                            result = numFrom*1.12;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Pound":
                            result = numFrom*2204;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ounce)":
                            result = numFrom *35840;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Kilogram(Kg)":
                            result = numFrom *1016.04691;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Gram":
                            result = numFrom *1016046.9088;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;

                    }
                    break;
                case "Ton(US)":
                    switch (strMass2) {
                        case "Ton":
                            result = numFrom*0.90718474;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ton(UK)":
                            result = numFrom*0.8928571;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ton(US)":
                            result = numFrom;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Pound":
                            result = numFrom*2000;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ounce)":
                            result = numFrom *32000;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Kilogram(Kg)":
                            result = numFrom *907.18474;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Gram":
                            result = numFrom *907184.74;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;

                    }
                    break;
                case "Pound":
                    switch (strMass2) {
                        case "Ton":
                            result = numFrom*0.0004535924;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ton(UK)":
                            result = numFrom*0.0004484286;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ton(US)":
                            result = numFrom*0005;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Pound":
                            result = numFrom;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ounce)":
                            result = numFrom *16;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Kilogram(Kg)":
                            result = numFrom *0.45359237;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Gram":
                            result = numFrom *453.59237;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;

                    }
                    break;
                case "Ounce":
                    switch (strMass2) {
                        case "Ton":
                            result = numFrom*0.0000283495;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ton(UK)":
                            result = numFrom*0.0000279017;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ton(US)":
                            result = numFrom*0.00003125;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Pound":
                            result = numFrom*0.0625;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ounce)":
                            result = numFrom ;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Kilogram(Kg)":
                            result = numFrom *0.0283495;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Gram":
                            result = numFrom *28.3495231;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;

                    }
                    break;
                case "Kilogram":
                    switch (strMass2) {
                        case "Ton":
                            result = numFrom*0.001;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ton(UK)":
                            result = numFrom*0.00098421;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ton(US)":
                            result = numFrom*0.0011023;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Pound":
                            result = numFrom*2.2046226;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ounce)":
                            result = numFrom*35.273962 ;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Kilogram(Kg)":
                            result = numFrom *0.0283495;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Gram":
                            result = numFrom *1000;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;

                    }
                    break;
                case "Gram":
                    switch (strMass2) {
                        case "Ton":
                            result = numFrom*0.000001;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ton(UK)":
                            result = numFrom*0.0000009842;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ton(US)":
                            result = numFrom*0.0000011023;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Pound":
                            result = numFrom*0.0022046226;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Ounce)":
                            result = numFrom*0.035273962 ;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Kilogram(Kg)":
                            result = numFrom *.001;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;
                        case "Gram":
                            result = numFrom;
                            finalresult = new Double(result).toString();
                            textViewResultMass.setText(finalresult);
                            break;

                    }
                    break;






            }
        }
    });

}

}






