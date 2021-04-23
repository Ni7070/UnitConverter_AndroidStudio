package com.example.asus.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button about = (Button)findViewById(R.id.about);
        Button area = (Button)findViewById(R.id.area);
        Button volume = (Button)findViewById(R.id.volume);
        Button length = (Button)findViewById(R.id.length);
        Button mass = (Button)findViewById(R.id.mass);
        Button weight = (Button)findViewById(R.id.weight);
        Button data = (Button)findViewById(R.id.data);
        Button history = (Button)findViewById(R.id.history);

        about.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intentAbout = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(intentAbout);
            }

        });
        area.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intentArea = new Intent(MainActivity.this,AreaActivity.class);
                startActivity(intentArea);
            }

        });
        volume.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intentVolume = new Intent(MainActivity.this,VolumeActivity.class);
                startActivity(intentVolume);
            }

        });
        length.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intentLength = new Intent(MainActivity.this,LengthActivity.class);
                startActivity(intentLength);
            }

        });
        mass.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intentMass = new Intent(MainActivity.this,MassActivity.class);
                startActivity(intentMass);
            }

        });
        weight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intentWeight = new Intent(MainActivity.this,TemperatureActivity.class);
                startActivity(intentWeight);
            }

        });
        data.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intentData = new Intent(MainActivity.this,DataActivity.class);
                startActivity(intentData);

            }

        });
        history.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intentHistory = new Intent(MainActivity.this,HistoryActivity.class);
                startActivity(intentHistory);
            }

        });
    }


}