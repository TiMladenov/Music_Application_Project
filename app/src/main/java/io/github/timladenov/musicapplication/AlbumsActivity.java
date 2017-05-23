package io.github.timladenov.musicapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView toHome, toArtists, toPlaylists, toSongs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        toHome = (TextView) findViewById(R.id.backToHome);
        toArtists = (TextView) findViewById(R.id.goToArtists);
        toPlaylists = (TextView) findViewById(R.id.goToPlaylists);
        toSongs = (TextView) findViewById(R.id.goToSongs);
        toHome.setOnClickListener(this);
        toArtists.setOnClickListener(this);
        toPlaylists.setOnClickListener(this);
        toSongs.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int _id = v.getId();

        switch (_id) {
            case R.id.backToHome:
                toHome.setBackgroundColor(Color.parseColor("#ffffff"));
                toHome.setTextColor(Color.parseColor("#000000"));
                Intent intent = new Intent(AlbumsActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.goToArtists:
                toArtists.setBackgroundColor(Color.parseColor("#ffffff"));
                toArtists.setTextColor(Color.parseColor("#000000"));
                Intent intent_2 = new Intent(AlbumsActivity.this, ArtistsActivity.class);
                startActivity(intent_2);
                finish();
                break;
            case R.id.goToPlaylists:
                toPlaylists.setBackgroundColor(Color.parseColor("#ffffff"));
                toPlaylists.setTextColor(Color.parseColor("#000000"));
                Intent intent_3 = new Intent(AlbumsActivity.this, PlaylistsActivity.class);
                startActivity(intent_3);
                finish();
                break;
            case R.id.goToSongs:
                toSongs.setBackgroundColor(Color.parseColor("#ffffff"));
                toSongs.setTextColor(Color.parseColor("#000000"));
                Intent intent_4 = new Intent(AlbumsActivity.this, SongsActivity.class);
                startActivity(intent_4);
                finish();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        ;
    }
}
