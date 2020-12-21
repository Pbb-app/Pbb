package com.example.packbagbuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;

import com.google.android.material.navigation.NavigationView;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout drawer;
    NavigationView nav_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawer = findViewById(R.id.drawer);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        nav_view = findViewById(R.id.nav_view);
        nav_view.setNavigationItemSelectedListener(this);
        setting_slider();
        adventure_list_setup();
        popular_sports_list_setup();








    }


    public void setting_slider(){
        SliderView sliderView = findViewById(R.id.imageSlider);
        List<Slider> sliderList=slider_data();

        SliderAdapter adapter = new SliderAdapter(this,sliderList);

        sliderView.setSliderAdapter(adapter);


        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();



    }

    public void adventure_list_setup(){

        RecyclerView recyclerView=findViewById(R.id.adventure_recycle);
        List<Adventure_Data> adventure_dataList=adventure_data();
        MyAdventureAdapter myAdventureAdapter=new MyAdventureAdapter(adventure_dataList);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myAdventureAdapter);
//        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
//                layoutManager.getOrientation());
        recyclerView.addItemDecoration(new VerticalSpaceItemDecoration(20));

    }

    public void popular_sports_list_setup(){
        RecyclerView recyclerView=findViewById(R.id.sports_recycle);
        List<PopularSportsData> popularSportsData=popularSportsData();
        PopularSportsAdapter popularSportsAdapter=new PopularSportsAdapter(popularSportsData);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(popularSportsAdapter);
        recyclerView.addItemDecoration(new VerticalSpaceItemDecoration(20));
    }
    public List<Slider> slider_data(){
        List<Slider> sliderList=new ArrayList<>();
        sliderList.add(new Slider(R.drawable.jaipur,"best place in jaipur,India"));
        sliderList.add(new Slider(R.drawable.jammu_kashmir,"beautifull place in Jammu and Kashmir,India"));
        sliderList.add(new Slider(R.drawable.sports_uttarakhand,"sports activity in uttarakhand,India"));
        sliderList.add(new Slider(R.drawable.uttarakhand,"temples in uttarakhand,India"));
        return sliderList;
    }
    public List<Adventure_Data> adventure_data(){
        List<Adventure_Data> adventure_dataList=new ArrayList<>();
        adventure_dataList.add(new Adventure_Data("₹ 1,000 off",R.drawable.kasol,"Kasol Trek","5 Days, 3 Night","₹ 6000"));
        adventure_dataList.add(new Adventure_Data("₹ 1,500 off",R.drawable.kareri_lake_trek,"Kareri Lake Trek","4 Days, 3 Night","₹ 5000"));
        adventure_dataList.add(new Adventure_Data("₹ 1,000 off",R.drawable.kedarnath,"Kedarnath Tour","6 Days, 4 Night","₹ 9000"));
    return adventure_dataList;
    }
    public List<PopularSportsData> popularSportsData(){
        List<PopularSportsData> popularSportsData=new ArrayList<>();
        popularSportsData.add(new PopularSportsData("River Rafting","10 Tours",R.drawable.river_rafting));
        popularSportsData.add(new PopularSportsData("Zip Lining","5 Tours",R.drawable.zip_lining));
        popularSportsData.add(new PopularSportsData("Trekking","6 Tours",R.drawable.treking));
        popularSportsData.add(new PopularSportsData("Rock Climbing","8 Tours",R.drawable.rock_climbing));
        popularSportsData.add(new PopularSportsData("Rapelling","3 Tours",R.drawable.rapelling));
        return  popularSportsData;

    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.search_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.search) {
            //Toast.makeText(this, "setting is clicked", Toast.LENGTH_LONG).show();
            searchSetup(item);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void searchSetup(MenuItem item){
        SearchView search= (SearchView) item.getActionView();
        search.setSubmitButtonEnabled(true);
        search.setQueryHint("Destination");
    }



}