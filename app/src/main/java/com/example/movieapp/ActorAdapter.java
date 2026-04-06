package com.example.movieapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ActorAdapter extends RecyclerView.Adapter<ActorAdapter.ActorViewHolder> {

    private List<Actor> actors;
    private Context context;

    public ActorAdapter(Context context, List<Actor> actors) {
        this.context = context;
        this.actors = actors;
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
        holder.tvActorName.setText(actor.getName());
        holder.imgActor.setImageResource(actor.getPhotoResId());
    }

    @Override
    public int getItemCount() {
        return actors.size();
    }

    static class ActorViewHolder extends RecyclerView.ViewHolder {
        ImageView imgActor;
        TextView tvActorName;

        public ActorViewHolder(@NonNull View itemView) {
            super(itemView);
            imgActor = itemView.findViewById(R.id.imgPoster);
            tvActorName = itemView.findViewById(R.id.tvActorName);
        }
    }
}
