package com.example.movieapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.movieapp.R;
import com.example.movieapp.adapters.ActorAdapter;
import com.example.movieapp.database.DataRepository;
import com.example.movieapp.models.Actor;
import com.example.movieapp.models.Movie;

public class MovieDetailActivity extends AppCompatActivity implements ActorAdapter.OnActorClickListener {

    public static final String EXTRA_MOVIE_ID = "movie_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        setSupportActionBar(findViewById(R.id.toolbar));
        if (getSupportActionBar() != null) getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int movieId = getIntent().getIntExtra(EXTRA_MOVIE_ID, -1);
        Movie movie = DataRepository.getInstance().getMovieById(movieId);
        if (movie == null) { finish(); return; }

        if (getSupportActionBar() != null) getSupportActionBar().setTitle(movie.getTitle());

        // Poster filma - puna URL slika s TMDB
        ImageView ivPoster = findViewById(R.id.ivMovieImage);
        Glide.with(this)
                .load(movie.getPosterUrl())
                .centerCrop()
                .placeholder(R.drawable.ic_movie_placeholder)
                .error(R.drawable.ic_movie_placeholder)
                .into(ivPoster);

        ((TextView) findViewById(R.id.tvTitle)).setText(movie.getTitle());
        ((TextView) findViewById(R.id.tvGenre)).setText(movie.getGenre());
        ((TextView) findViewById(R.id.tvYear)).setText(String.valueOf(movie.getYear()));
        ((TextView) findViewById(R.id.tvDescription)).setText(movie.getDescription());
        ((RatingBar) findViewById(R.id.ratingBar)).setRating(movie.getRating());

        RecyclerView recyclerActors = findViewById(R.id.recyclerActors);
        recyclerActors.setLayoutManager(new LinearLayoutManager(this));
        ActorAdapter adapter = new ActorAdapter(this, this);
        adapter.setActors(movie.getActors());
        recyclerActors.setAdapter(adapter);
        recyclerActors.setNestedScrollingEnabled(false);
    }

    @Override
    public void onActorClick(Actor actor) {
        Intent intent = new Intent(this, ActorDetailActivity.class);
        intent.putExtra(ActorDetailActivity.EXTRA_ACTOR_NAME, actor.getName());
        intent.putExtra(ActorDetailActivity.EXTRA_ACTOR_ROLE, actor.getRole());
        intent.putExtra(ActorDetailActivity.EXTRA_ACTOR_NATIONALITY, actor.getNationality());
        intent.putExtra(ActorDetailActivity.EXTRA_ACTOR_BIRTH_YEAR, actor.getBirthYear());
        intent.putExtra(ActorDetailActivity.EXTRA_ACTOR_BIO, actor.getBiography());
        intent.putExtra(ActorDetailActivity.EXTRA_ACTOR_PHOTO, actor.getPhotoUrl());
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) { finish(); return true; }
        return super.onOptionsItemSelected(item);
    }
}
