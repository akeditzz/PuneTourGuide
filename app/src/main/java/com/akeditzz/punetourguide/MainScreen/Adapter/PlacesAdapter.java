package com.akeditzz.punetourguide.MainScreen.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.akeditzz.punetourguide.MainScreen.Model.PlaceModel;
import com.akeditzz.punetourguide.R;

import java.util.ArrayList;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.ViewHolder> {

    //declaration
    private Context context;
    private ArrayList<PlaceModel> placeModellist;

    public PlacesAdapter(Context context, ArrayList<PlaceModel> placeModellist) {
        this.context = context;
        this.placeModellist = placeModellist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //setting data from list
        holder.place_image.setImageResource(placeModellist.get(position).getPlace_image());
        holder.place_name.setText(placeModellist.get(position).getPlace_name());
        holder.place_location.setText(placeModellist.get(position).getPlace_location());

        if (TextUtils.isEmpty(placeModellist.get(position).getPlace_contact())) {
            holder.place_contact.setVisibility(View.GONE);
        } else {
            holder.place_contact.setVisibility(View.VISIBLE);
            holder.place_contact.setText(placeModellist.get(position).getPlace_contact());
        }
    }

    @Override
    public int getItemCount() {
        return placeModellist.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        //declaration of views for the item_list
        private ImageView place_image;
        private TextView place_name;
        private TextView place_contact;
        private TextView place_location;

        ViewHolder(View itemView) {
            super(itemView);
            place_image = itemView.findViewById(R.id.iv_place_image);
            place_name = itemView.findViewById(R.id.tv_name);
            place_contact = itemView.findViewById(R.id.tv_contact);
            place_location = itemView.findViewById(R.id.tv_location);

        }
    }
}
