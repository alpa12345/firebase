package com.example.firebase;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class TrackList extends ArrayAdapter<Track> {

    private Activity context;
    private List<Track> trackList;

    public TrackList(Activity context, List<Track> trackList) {
        super(context,R.layout.layout_track_list,trackList);

        this.context = context;
        this.trackList = trackList;
    }

    @androidx.annotation.NonNull
    @Override
    public View getView(int position, @androidx.annotation.Nullable View convertView, @androidx.annotation.NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listView = inflater.inflate(R.layout.layout_track_list,null,true);
        TextView textViewArtistName = listView.findViewById(R.id.textViewTrackName);
        TextView textViewRating = listView.findViewById(R.id.textViewRating);

        Track track = trackList.get(position);
        textViewArtistName.setText(track.getTrackName());
        textViewRating.setText(String.valueOf(track.getTrackRating()));

        return listView;
    }
}
