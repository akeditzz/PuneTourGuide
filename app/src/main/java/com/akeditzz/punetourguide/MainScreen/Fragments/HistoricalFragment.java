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

public class HistoricalFragment extends Fragment {
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        recyclerView = v.findViewById(R.id.rv_places);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        setHistoricalList();
        return v;
    }

    /**
     * setting data of Historical Places
     */
    private void setHistoricalList() {
        ArrayList<PlaceModel> historicalList = new ArrayList<>();
        historicalList.add(new PlaceModel(getString(R.string.name_shaniwar), getString(R.string.contact_shaniwar),
                getString(R.string.location_shaniwar), R.drawable.shaniwar));
        historicalList.add(new PlaceModel(getString(R.string.name_lal), "",
                getString(R.string.location_lal), R.drawable.lal_mahal));
        historicalList.add(new PlaceModel(getString(R.string.name_nana), "",
                getString(R.string.location_nana), R.drawable.nanawada));
        historicalList.add(new PlaceModel(getString(R.string.name_mahatma), "",
                getString(R.string.location_mahatma), R.drawable.mahatma_phule_wada));
        historicalList.add(new PlaceModel(getString(R.string.name_laal), "",
                getString(R.string.location_laal), R.drawable.laal_mandir));
        PlacesAdapter placesAdapter = new PlacesAdapter(getContext(), historicalList);
        recyclerView.setAdapter(placesAdapter);
    }
}
