package com.example.pbb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private String[] tour={"Kedarnath Tour","The Rajgundha 360 Trek - BIR","The Kareri Lake Trek","Kasol - Grahan - Tosh"};
    private  int[] images={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.a};
    private String[] days={"1 Days ,1 Nights","2 Days , 2 Nights","3 Days , 3 Nights","4 Days , 4 Nights"};
    private String [] monthstart={"oct - nov","feb-dec","dec-feb","mar-apr"};
    private String[] takeoff={"Delhi","Mumbai","Kolkata","Chennai"};
    private String[] land={"Kedarnath","Rajgundha","Mcleodganj","Kasol"};

    private List<persons> personsList= new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rvw);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        prepareTheList();
        recyclerAdapter adapter= new recyclerAdapter(personsList);
        recyclerView.setAdapter(adapter);
    }
    private void prepareTheList()
    {
        int count =0;
        for(String tour :tour)
        {
            persons person =new persons(tour,images[count],days[count],monthstart[count],takeoff[count],land[count]);
            personsList.add(person);
            count++;
        }
//        for(int i =0;i<tour.length;i++)
//        {
//
//            persons person=new persons(tour[i],images[i],days[i],monthstart[i],takeoff[i],land[i]);
//            personsList.add(person);
//        }

    }

}