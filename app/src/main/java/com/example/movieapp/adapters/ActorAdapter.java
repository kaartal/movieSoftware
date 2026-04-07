package com.example.movieapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.movieapp.R;
import com.example.movieapp.models.Actor;

import java.util.ArrayList;
import java.util.List;

public class ActorAdapter extends RecyclerView.Adapter<ActorAdapter.ActorViewHolder> {

    public interface OnActorClickListener {
        void onActorClick(Actor actor);
    }

    private final Context context;
    private List<Actor> actors = new ArrayList<>();
    private final OnActorClickListener listener;

    public ActorAdapter(Context context, OnActorClickListener listener) {
        this.context = context;
        this.listener = listener;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ActorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_actor, parent, false);
        return new ActorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActorViewHolder holder, int position) {
        Actor actor = actors.get(position);

        holder.tvName.setText(actor.getName());
        holder.tvRole.setText(actor.getRole());
        holder.tvNationality.setText(actor.getNationality() != null ? actor.getNationality() : "");

        // Učitaj pravu fotografiju glumca s TMDB URL-a — circleCrop za krug
        Glide.with(context)
                .load(actor.getPhotoUrl())
                .circleCrop()
                .placeholder(R.drawable.ic_actor_placeholder)
                .error(R.drawable.ic_actor_placeholder)
                .into(holder.ivActorPhoto);

        holder.itemView.setOnClickListener(v -> listener.onActorClick(actor));
    }

    @Override
    public int getItemCount() { return actors.size(); }

    static class ActorViewHolder extends RecyclerView.ViewHolder {
        ImageView ivActorPhoto;
        TextView tvName, tvRole, tvNationality;

        ActorViewHolder(@NonNull View itemView) {
            super(itemView);
            ivActorPhoto = itemView.findViewById(R.id.ivActorPhoto);
            tvName = itemView.findViewById(R.id.tvName);
            tvRole = itemView.findViewById(R.id.tvRole);
            tvNationality = itemView.findViewById(R.id.tvNationality);
        }
    }
}
