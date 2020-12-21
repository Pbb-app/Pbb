package com.riseinsteps.packbagbuddy_leisuretravelandtourism.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.riseinsteps.packbagbuddy_leisuretravelandtourism.R;
import com.riseinsteps.packbagbuddy_leisuretravelandtourism.model.AdventureTripModel;

import java.util.List;


public class AdventureTripAdapter extends PagerAdapter {
    private List<AdventureTripModel> adventureTripModelList;

    public AdventureTripAdapter(List<AdventureTripModel> adventureTripModelList) {
        this.adventureTripModelList = adventureTripModelList;
    }

    @Override
    public int getCount() {
        return adventureTripModelList.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.adventure_trips_row, container, false);
        ImageView adventureTripImage = view.findViewById(R.id.adventure_trips_imageView);
        Glide.with(container.getContext()).load(adventureTripModelList.get(position).getImageURL()).into(adventureTripImage);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
}
