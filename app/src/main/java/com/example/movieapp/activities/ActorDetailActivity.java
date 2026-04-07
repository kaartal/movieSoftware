package com.example.movieapp.activities;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.movieapp.R;

public class ActorDetailActivity extends AppCompatActivity {

    public static final String EXTRA_ACTOR_NAME = "actor_name";
    public static final String EXTRA_ACTOR_ROLE = "actor_role";
    public static final String EXTRA_ACTOR_NATIONALITY = "actor_nationality";
    public static final String EXTRA_ACTOR_BIRTH_YEAR = "actor_birth_year";
    public static final String EXTRA_ACTOR_BIO = "actor_bio";
    public static final String EXTRA_ACTOR_PHOTO = "actor_photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actor_detail);

        setSupportActionBar(findViewById(R.id.toolbar));
        if (getSupportActionBar() != null) getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String name = getIntent().getStringExtra(EXTRA_ACTOR_NAME);
        String role = getIntent().getStringExtra(EXTRA_ACTOR_ROLE);
        String nationality = getIntent().getStringExtra(EXTRA_ACTOR_NATIONALITY);
        int birthYear = getIntent().getIntExtra(EXTRA_ACTOR_BIRTH_YEAR, 0);
        String bio = getIntent().getStringExtra(EXTRA_ACTOR_BIO);
        String photoUrl = getIntent().getStringExtra(EXTRA_ACTOR_PHOTO);

        if (getSupportActionBar() != null) getSupportActionBar().setTitle(name);

        // Prava slika glumca sa TMDB-a
        ImageView ivPhoto = findViewById(R.id.ivActorPhoto);
        Glide.with(this)
                .load(photoUrl)
                .centerCrop()
                .placeholder(R.drawable.ic_actor_placeholder)
                .error(R.drawable.ic_actor_placeholder)
                .into(ivPhoto);

        ((TextView) findViewById(R.id.tvName)).setText(name);
        ((TextView) findViewById(R.id.tvRole)).setText(role);
        ((TextView) findViewById(R.id.tvNationality)).setText(nationality != null ? nationality : "—");
        ((TextView) findViewById(R.id.tvBirthYear)).setText(birthYear > 0 ? String.valueOf(birthYear) : "—");
        ((TextView) findViewById(R.id.tvBiography)).setText(bio != null && !bio.isEmpty() ? bio : "—");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) { finish(); return true; }
        return super.onOptionsItemSelected(item);
    }
}
