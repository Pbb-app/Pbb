package com.riseinsteps.packbagbuddy_leisuretravelandtourism;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.riseinsteps.packbagbuddy_leisuretravelandtourism.adapter.AdventureTripAdapter;
import com.riseinsteps.packbagbuddy_leisuretravelandtourism.adapter.CategoryAdapter;
import com.riseinsteps.packbagbuddy_leisuretravelandtourism.adapter.DealsoftheDayAdapter;
import com.riseinsteps.packbagbuddy_leisuretravelandtourism.adapter.PopularSportsAdapter;
import com.riseinsteps.packbagbuddy_leisuretravelandtourism.model.AdventureTripModel;
import com.riseinsteps.packbagbuddy_leisuretravelandtourism.model.CategoryModel;
import com.riseinsteps.packbagbuddy_leisuretravelandtourism.model.DealsoftheDayModel;
import com.riseinsteps.packbagbuddy_leisuretravelandtourism.model.PopularSportsModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;

    private RecyclerView categoryRecyclerView;
    private List<CategoryModel> categoryModelList;
    private CategoryAdapter categoryAdapter;

    private ViewPager dealsViewPager;
    private List<DealsoftheDayModel> dealsoftheDayModelList;
    private DealsoftheDayAdapter dealsoftheDayAdapter;

    private ViewPager adventureTripViewPager;
    private List<AdventureTripModel> adventureTripModelList;
    private AdventureTripAdapter adventureTripAdapter;

    private RecyclerView popularSportsRecyclerView;
    private List<PopularSportsModel> popularSportsModelList;
    private PopularSportsAdapter popularSportsAdapter;

    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("PackBagBuddy");

        categoryModelList = new ArrayList<>();
        categoryModelList.add(new CategoryModel("Popular Sports"));
        categoryModelList.add(new CategoryModel("Adventure Trips"));
        categoryModelList.add(new CategoryModel("Winter Special"));
        categoryModelList.add(new CategoryModel("Kedarnath Trip"));
        categoryModelList.add(new CategoryModel("Popular Sports"));
        categoryModelList.add(new CategoryModel("Adventure Trips"));
        categoryModelList.add(new CategoryModel("Winter Special"));
        categoryModelList.add(new CategoryModel("Kedarnath Trip"));
        categoryModelList.add(new CategoryModel("Popular Sports"));
        categoryModelList.add(new CategoryModel("Adventure Trips"));
        categoryModelList.add(new CategoryModel("Winter Special"));
        categoryModelList.add(new CategoryModel("Kedarnath Trip"));


        dealsoftheDayModelList = new ArrayList<>();
        dealsoftheDayModelList.add(new DealsoftheDayModel("https://bit.ly/38ikrBw"));
        dealsoftheDayModelList.add(new DealsoftheDayModel("https://bit.ly/38ncuuZ"));
        dealsoftheDayModelList.add(new DealsoftheDayModel("https://bit.ly/38ikrBw"));
        dealsoftheDayModelList.add(new DealsoftheDayModel("https://bit.ly/38ncuuZ"));
        dealsoftheDayModelList.add(new DealsoftheDayModel("https://bit.ly/38ikrBw"));
        dealsoftheDayModelList.add(new DealsoftheDayModel("https://bit.ly/38ncuuZ"));

        adventureTripModelList = new ArrayList<>();
        adventureTripModelList.add(new AdventureTripModel("https://www.packbagbuddy.com/wp-content/uploads/2020/10/Kedarnath-Dham-Yatra-700x411.jpg"));
        adventureTripModelList.add(new AdventureTripModel("https://www.packbagbuddy.com/wp-content/uploads/2019/06/hamta-700x450.jpg"));
        adventureTripModelList.add(new AdventureTripModel("https://www.packbagbuddy.com/wp-content/uploads/2018/10/1-1-700x450.jpg"));
        adventureTripModelList.add(new AdventureTripModel("https://www.packbagbuddy.com/wp-content/uploads/2018/07/lon-1.jpg"));
        adventureTripModelList.add(new AdventureTripModel("https://www.packbagbuddy.com/wp-content/uploads/2019/09/11-3-700x450.jpg"));
        adventureTripModelList.add(new AdventureTripModel("https://www.packbagbuddy.com/wp-content/uploads/2019/09/16-1.jpg"));
        adventureTripModelList.add(new AdventureTripModel("https://www.packbagbuddy.com/wp-content/uploads/2019/09/11-1-700x450.jpg"));
        adventureTripModelList.add(new AdventureTripModel("https://www.packbagbuddy.com/wp-content/uploads/2019/09/19-700x450.jpg"));


        popularSportsModelList = new ArrayList<>();
        popularSportsModelList.add(new PopularSportsModel("https://bit.ly/3ayHTgJ"));
        popularSportsModelList.add(new PopularSportsModel("https://bit.ly/37xzBU8"));
        popularSportsModelList.add(new PopularSportsModel("https://bit.ly/38gs63c"));
        popularSportsModelList.add(new PopularSportsModel("https://bit.ly/3nAxzID"));


        setCategoryRecyclerView(categoryModelList);
        setDealsViewPager(dealsoftheDayModelList);
        setAdventureTripRecyclerView(adventureTripModelList);
        setPopularSportsRecyclerView(popularSportsModelList);


    }

    private void setPopularSportsRecyclerView(List<PopularSportsModel> popularSportsModelList) {
        popularSportsRecyclerView = findViewById(R.id.popularSportsRecyclerView);
        popularSportsRecyclerView.setHasFixedSize(true);
        popularSportsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        popularSportsAdapter = new PopularSportsAdapter(this, popularSportsModelList);
        popularSportsRecyclerView.setAdapter(popularSportsAdapter);
    }

    private void setAdventureTripRecyclerView(List<AdventureTripModel> adventureTripModelList) {
        adventureTripViewPager = findViewById(R.id.adventure_viewPager);
        adventureTripAdapter = new AdventureTripAdapter(adventureTripModelList);
        adventureTripViewPager.setAdapter(adventureTripAdapter);

    }

    private void setDealsViewPager(List<DealsoftheDayModel> dealsoftheDayModelList) {
        tabLayout = findViewById(R.id.tabLayout);
        dealsViewPager = findViewById(R.id.viewpager);
        dealsoftheDayAdapter = new DealsoftheDayAdapter(dealsoftheDayModelList);
        dealsViewPager.setAdapter(dealsoftheDayAdapter);
        tabLayout.setupWithViewPager(dealsViewPager);
    }

    private void setCategoryRecyclerView(List<CategoryModel> categoryModelList) {
        categoryRecyclerView = findViewById(R.id.categories_recyclerview);
        categoryRecyclerView.setHasFixedSize(true);
        categoryRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        categoryAdapter = new CategoryAdapter(categoryModelList);
        categoryRecyclerView.setAdapter(categoryAdapter);
    }
}