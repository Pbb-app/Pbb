package com.example.packbagbuddy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class SliderAdapter extends
        SliderViewAdapter<SliderAdapter.SliderAdapterVH>{
    private Context context;
    private List<Slider> mSliderItems ;

    public SliderAdapter(Context context,List<Slider> mSliderItems) {
        this.context = context;
        this.mSliderItems=mSliderItems;
    }


    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_layout, null);
        return new SliderAdapterVH(inflate);

    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {
        viewHolder.city.setImageResource(mSliderItems.get(position).getId());
        viewHolder.descp.setText(mSliderItems.get(position).getDescp());

    }

    @Override
    public int getCount() {
        return mSliderItems.size();
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {


        ImageView city;

        TextView descp;

        public SliderAdapterVH(View itemView) {
            super(itemView);
            city = itemView.findViewById(R.id.city);

           descp = itemView.findViewById(R.id.descp);

        }
    }
}
