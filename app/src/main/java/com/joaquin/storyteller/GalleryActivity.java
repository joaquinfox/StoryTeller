package com.joaquin.storyteller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class GalleryActivity extends AppCompatActivity {
private static final String LOG = "LOG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        FloatingActionButton floatBtn = findViewById(R.id.floatingActionButton);
        floatBtn.setOnClickListener(v -> buildSlideshow());
    }

    public void buildSlideshow(){
        Log.i(LOG, "TEST");
        Toast.makeText(this, "BUILDME: Clicking will call BuildSlideShowActivity where" +
                "user defines slideshow settings.", Toast.LENGTH_LONG).show();
    }
}