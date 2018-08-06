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

public class MallFragment extends Fragment {
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        recyclerView = v.findViewById(R.id.rv_places);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        setMallList();
        return v;
    }

    /**
     * setting data of Shopping Malls
     */
    private void setMallList() {
        ArrayList<PlaceModel> mallList = new ArrayList<>();
        mallList.add(new PlaceModel(getString(R.string.name_pavillion), getString(R.string.contact_pavillion),
                getString(R.string.location_pavillion), R.drawable.pavillion));
        mallList.add(new PlaceModel(getString(R.string.name_westend), getString(R.string.contact_westend),
                getString(R.string.location_westend), R.drawable.westend));
        mallList.add(new PlaceModel(getString(R.string.name_pune), getString(R.string.contact_pune),
                getString(R.string.location_pune), R.drawable.pune));
        mallList.add(new PlaceModel(getString(R.string.name_xion), getString(R.string.contact_xion),
                getString(R.string.location_xion), R.drawable.xion));
        mallList.add(new PlaceModel(getString(R.string.name_spot), "",
                getString(R.string.location_spot), R.drawable.spot));
        PlacesAdapter placesAdapter = new PlacesAdapter(getContext(), mallList);
        recyclerView.setAdapter(placesAdapter);

    }
}
