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

public class TrekkingFragment extends Fragment {
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        recyclerView = v.findViewById(R.id.rv_places);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        setTrekkingList();
        return v;
    }

    /**
     * setting data of Trekking Places
     */
    private void setTrekkingList() {
        ArrayList<PlaceModel> trekkingList = new ArrayList<>();
        trekkingList.add(new PlaceModel(getString(R.string.name_lohagad), "",
                getString(R.string.location_lohagad), R.drawable.lohagad));
        trekkingList.add(new PlaceModel(getString(R.string.name_purandar), "",
                getString(R.string.location_purandar), R.drawable.purandar));
        trekkingList.add(new PlaceModel(getString(R.string.name_tikona), "",
                getString(R.string.location_tikona), R.drawable.tikona));
        trekkingList.add(new PlaceModel(getString(R.string.name_rajmachi), "",
                getString(R.string.location_rajmachi), R.drawable.rajmachi));
        trekkingList.add(new PlaceModel(getString(R.string.name_korigad), "",
                getString(R.string.location_korigad), R.drawable.korigad));
        PlacesAdapter placesAdapter = new PlacesAdapter(getContext(), trekkingList);
        recyclerView.setAdapter(placesAdapter);
    }
}
