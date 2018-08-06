package com.akeditzz.punetourguide.MainScreen.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.akeditzz.punetourguide.MainScreen.Adapter.PlacesAdapter;
import com.akeditzz.punetourguide.MainScreen.Model.PlaceModel;
import com.akeditzz.punetourguide.R;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        recyclerView = v.findViewById(R.id.rv_places);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        setRestaurantsList();
        return v;
    }

    /**
     * setting data of Restaurants
     */
    private void setRestaurantsList() {
        ArrayList<PlaceModel> restaurantsList = new ArrayList<>();
        restaurantsList.add(new PlaceModel(getString(R.string.name_urban), getString(R.string.contact_urban),
                getString(R.string.location_urban), R.drawable.urban));
        restaurantsList.add(new PlaceModel(getString(R.string.name_aurther), getString(R.string.contact_aurther),
                getString(R.string.locatin_aurther), R.drawable.aurther));
        restaurantsList.add(new PlaceModel(getString(R.string.name_copa), getString(R.string.contact_copa),
                getString(R.string.location_copa), R.drawable.copa));
        restaurantsList.add(new PlaceModel(getString(R.string.name_alto), getString(R.string.contact_alto),
                getString(R.string.location_alto), R.drawable.alto));
        restaurantsList.add(new PlaceModel(getString(R.string.name_incognito), getString(R.string.contact_incognito),
                getString(R.string.location_incognito), R.drawable.incognito));
        PlacesAdapter placesAdapter = new PlacesAdapter(getContext(), restaurantsList);
        recyclerView.setAdapter(placesAdapter);
    }
}
