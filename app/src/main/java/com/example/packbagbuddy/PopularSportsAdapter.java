package com.example.packbagbuddy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PopularSportsAdapter extends RecyclerView.Adapter<PopularSportsAdapter.ViewHolder>{

    List<PopularSportsData> my_list;

    public PopularSportsAdapter(List<PopularSportsData> my_list) {
        this.my_list=my_list;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.popular_sports, parent, false);
        PopularSportsAdapter.ViewHolder viewHolder = new PopularSportsAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PopularSportsAdapter.ViewHolder holder, int position) {
        final PopularSportsData popularSportsData= my_list.get(position);
        holder.location.setImageResource(popularSportsData.getImage_id());

        holder.title.setText(popularSportsData.getTitle());
        holder.tour.setText(popularSportsData.getTour());

    }


    @Override
    public int getItemCount() {
        return my_list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView location;

        public TextView title;
        public TextView tour;

        public ViewHolder(View itemView) {
            super(itemView);
            location = (ImageView) itemView.findViewById(R.id.location);

            title = (TextView) itemView.findViewById(R.id.title);
           tour = (TextView) itemView.findViewById(R.id.tours);

        }
    }





}
