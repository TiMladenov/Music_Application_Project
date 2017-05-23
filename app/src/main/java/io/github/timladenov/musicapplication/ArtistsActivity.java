package io.github.timladenov.musicapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView toHome, toAlbums, toPlaylists, toSongs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        toHome = (TextView) findViewById(R.id.backToHome);
        toAlbums = (TextView) findViewById(R.id.goToAlbums);
        toPlaylists = (TextView) findViewById(R.id.goToPlaylists);
        toSongs = (TextView) findViewById(R.id.goToSongs);
        toHome.setOnClickListener(this);
        toAlbums.setOnClickListener(this);
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
                Intent intent = new Intent(ArtistsActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.goToAlbums:
                toAlbums.setBackgroundColor(Color.parseColor("#ffffff"));
                toAlbums.setTextColor(Color.parseColor("#000000"));
                Intent intent_2 = new Intent(ArtistsActivity.this, AlbumsActivity.class);
                startActivity(intent_2);
                finish();
                break;
            case R.id.goToPlaylists:
                toPlaylists.setBackgroundColor(Color.parseColor("#ffffff"));
                toPlaylists.setTextColor(Color.parseColor("#000000"));
                Intent intent_3 = new Intent(ArtistsActivity.this, PlaylistsActivity.class);
                startActivity(intent_3);
                finish();
                break;
            case R.id.goToSongs:
                toSongs.setBackgroundColor(Color.parseColor("#ffffff"));
                toSongs.setTextColor(Color.parseColor("#000000"));
                Intent intent_4 = new Intent(ArtistsActivity.this, SongsActivity.class);
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
