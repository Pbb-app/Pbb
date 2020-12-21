package com.riseinsteps.packbagbuddy_leisuretravelandtourism.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.riseinsteps.packbagbuddy_leisuretravelandtourism.R;
import com.riseinsteps.packbagbuddy_leisuretravelandtourism.model.DealsoftheDayModel;

import java.util.List;

public class DealsoftheDayAdapter extends PagerAdapter {
    private List<DealsoftheDayModel> dealsoftheDayModelList;

    public DealsoftheDayAdapter(List<DealsoftheDayModel> list) {

        this.dealsoftheDayModelList = list;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.deals_of_the_day_row, container, false);
        ImageView bannerImage = view.findViewById(R.id.bannerImage);
        Glide.with(container.getContext()).load(dealsoftheDayModelList.get(position).getImageURL()).into(bannerImage);
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) container);
    }

    @Override
    public int getCount() {
        return dealsoftheDayModelList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
}
