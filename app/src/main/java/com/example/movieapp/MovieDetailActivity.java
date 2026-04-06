package com.example.movieapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        int position = getIntent().getIntExtra("position", 0);
        List<Movie> movies = DataProvider.getMovies();
        Movie movie = movies.get(position);

        ImageView imgPoster = findViewById(R.id.imgDetailPoster);
        TextView tvTitle = findViewById(R.id.tvDetailTitle);
        TextView tvGenre = findViewById(R.id.tvDetailGenre);
        TextView tvRating = findViewById(R.id.tvDetailRating);
        TextView tvDescription = findViewById(R.id.tvDetailDescription);
        RatingBar ratingBar = findViewById(R.id.detailRatingBar);
        RecyclerView recyclerActors = findViewById(R.id.recyclerActors);

        imgPoster.setImageResource(movie.getPosterResId());
        tvTitle.setText(movie.getTitle());
        tvGenre.setText("Genre: " + movie.getGenre());
        tvRating.setText("Rating: " + movie.getRating() + "/10");
        tvDescription.setText(movie.getDescription());
        ratingBar.setRating(movie.getRating() / 2f);

        recyclerActors.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerActors.setAdapter(new ActorAdapter(this, movie.getActors()));

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(movie.getTitle());
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
