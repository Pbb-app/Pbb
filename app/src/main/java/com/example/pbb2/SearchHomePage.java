package com.example.pbb2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class SearchHomePage extends AppCompatActivity {

    Spinner destination,sport;
    List<String> namesDest,namesSport;
    Button searchButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_home_page);
        destination=findViewById(R.id.destination);
        sport=findViewById(R.id.sport);


        namesDest=new ArrayList<String>();
        namesDest.add("Any");
        namesDest.add("Gujarat");
        namesDest.add("Himachal Pradesh");
        namesDest.add("Leh Ladakh");
        namesDest.add("Maharashtra");
        namesDest.add("Rajasthan");
        namesDest.add("Sikkim");
        namesDest.add("Uttarakhand");


        namesSport=new ArrayList<String>();
        namesSport.add("Any");
        namesSport.add("Bike Trip");
        namesSport.add("Campfire");
        namesSport.add("Horse Riding");
        namesSport.add("Paragliding");
        namesSport.add("Photography");
        namesSport.add("Rappelling");
        namesSport.add("River Rafting");
        namesSport.add("Rock Climbing");
        namesSport.add("Scuba Diving");
        namesSport.add("Sightseeing");
        namesSport.add("Skiing");
        namesSport.add("Trekking");
        namesSport.add("Wildlife Watching");
        namesSport.add("Zip Lining");

        ArrayAdapter<String> dest=new ArrayAdapter<String>(SearchHomePage.this,R.layout.item_destination,namesDest);
        ArrayAdapter<String> sports=new ArrayAdapter<String>(SearchHomePage.this,R.layout.item_destination,namesSport);
        dest.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sports.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        destination.setAdapter(dest);
        sport.setAdapter(sports);


    }
}