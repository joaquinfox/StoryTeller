package com.joaquin.storyteller;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MenuObjectFragment extends Fragment {


    Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View parentView = inflater.inflate(R.layout.fragment_main_menu, container, false);
        context = parentView.getContext();

        Button slideshowButton = parentView.findViewById(R.id.slideshow_button);
        slideshowButton.setOnClickListener(v -> {
            Toast.makeText(getActivity(), "BUILDME: Call to SlideshowListView, which is a menu of slideshows", Toast.LENGTH_LONG).show();
            Intent intent= new Intent(context, SlideshowListActivity.class);
            startActivity(intent);
        });
        Button addButton = parentView.findViewById(R.id.add_button);
        addButton.setOnClickListener(v -> Toast.makeText(getActivity(), "BUILDME: Call to AddPicturesActivity, which is an interface to add pictures. ", Toast.LENGTH_LONG).show());

        return parentView;
    }
}