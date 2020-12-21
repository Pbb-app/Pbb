package com.riseinsteps.packbagbuddy_leisuretravelandtourism.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.riseinsteps.packbagbuddy_leisuretravelandtourism.R;
import com.riseinsteps.packbagbuddy_leisuretravelandtourism.model.PopularSportsModel;

import java.util.List;

public class PopularSportsAdapter extends RecyclerView.Adapter<PopularSportsAdapter.ViewHolder> {
    private Context context;
    private List<PopularSportsModel> popularSportsModelList;

    public PopularSportsAdapter(Context context, List<PopularSportsModel> popularSportsModelList) {
        this.context = context;
        this.popularSportsModelList = popularSportsModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.popular_sports_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(holder.popularSportsImage.getContext()).load(popularSportsModelList.get(position).getImageURL()).into(holder.popularSportsImage);
    }

    @Override
    public int getItemCount() {
        return popularSportsModelList.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView popularSportsImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            popularSportsImage = itemView.findViewById(R.id.popular_sports_imageView);
        }

    }
}
