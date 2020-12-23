package com.example.pbb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.transition.Hold;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.PersonViewHolder> {

    private List<persons> personList;

    public recyclerAdapter(List<persons> personList){
        this.personList = personList;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);

        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position)
    {

        persons person = personList.get(position);
        holder.txt.setText(person.getTxt());
        holder.img.setImageResource(person.getImg());
        holder.days.setText(person.getDays());
        holder.duration.setText(person.getMonthstart());
        holder.takeoff.setText(person.getTakeoff());
        holder.land.setText(person.getLand());

    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder
    {
        public TextView txt;
        public ImageView img;
        public TextView days;
        public TextView duration;
        public TextView takeoff;
        public TextView land;
        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.tour_text);
            img = itemView.findViewById(R.id.pic);
            days = itemView.findViewById(R.id.daysnights1);
            duration=itemView.findViewById(R.id.duration1);
            takeoff=itemView.findViewById(R.id.takeoff1);
            land=itemView.findViewById(R.id.land1);

        }
    }
}
