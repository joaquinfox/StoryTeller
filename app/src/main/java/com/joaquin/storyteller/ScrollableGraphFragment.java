package com.joaquin.storyteller;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;


public class ScrollableGraphFragment extends Fragment {
    private GridLayout mPictureGrid;


    public ScrollableGraphFragment() {
        // Required empty public constructor
    }

    public static ScrollableGraphFragment newInstance(String param1, String param2) {
        ScrollableGraphFragment fragment = new ScrollableGraphFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View parentView = inflater.inflate(R.layout.fragment_scrollable_graph, container, false);
        mPictureGrid = parentView.findViewById(R.id.picture_grid);
        for(int i =0; i <mPictureGrid.getChildCount();i++){
            TextView pictureView = (TextView) mPictureGrid.getChildAt(i);
            pictureView.setOnClickListener(this::onPictureClick);
        }

        return parentView;
    }

    private void onPictureClick(View view) {
        Toast.makeText(this.getActivity(), "BUILDME: Selecting images then clicking a \"done\" button groups them together and " +
                "navigates to a BuildSlideshowActivity.", Toast.LENGTH_LONG).show();
    }
}