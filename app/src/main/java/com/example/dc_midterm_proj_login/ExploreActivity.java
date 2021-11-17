package com.example.dc_midterm_proj_login;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class ExploreActivity extends AppCompatActivity {

    public Toolbar myToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        myToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });

        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();


        slideModels.add(new SlideModel("https://i.insider.com/5e21c57cab49fd40043ae7f5?width=1300&format=jpeg&auto=webp"));
        slideModels.add(new SlideModel("https://i.insider.com/5d38929736e03c2138374645?width=1300&format=jpeg&auto=webp"));
        slideModels.add(new SlideModel("https://i.insider.com/5d38b30636e03c59cb0063c2?width=1300&format=jpeg&auto=webp"));
        slideModels.add(new SlideModel("https://i.insider.com/5d377bf436e03c29e93eed13?width=1300&format=jpeg&auto=webp"));

        imageSlider.setImageList(slideModels, true);

    }

    private void openHome() {
         Intent intent = new Intent(ExploreActivity.this, HomeActivity.class);
         startActivity(intent);
    }
}