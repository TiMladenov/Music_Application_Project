package io.github.timladenov.musicapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView toHome, toAlbums, toArtists, toPlaylists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        toHome = (TextView) findViewById(R.id.backToHome);
        toAlbums = (TextView) findViewById(R.id.goToAlbums);
        toArtists = (TextView) findViewById(R.id.goToArtists);
        toPlaylists = (TextView) findViewById(R.id.goToPlaylists);
        toHome.setOnClickListener(this);
        toAlbums.setOnClickListener(this);
        toArtists.setOnClickListener(this);
        toPlaylists.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int _id = v.getId();

        switch (_id) {
            case R.id.backToHome:
                toHome.setBackgroundColor(Color.parseColor("#ffffff"));
                toHome.setTextColor(Color.parseColor("#000000"));
                Intent intent = new Intent(SongsActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.goToAlbums:
                toAlbums.setBackgroundColor(Color.parseColor("#ffffff"));
                toAlbums.setTextColor(Color.parseColor("#000000"));
                Intent intent_2 = new Intent(SongsActivity.this, AlbumsActivity.class);
                startActivity(intent_2);
                finish();
                break;
            case R.id.goToArtists:
                toArtists.setBackgroundColor(Color.parseColor("#ffffff"));
                toArtists.setTextColor(Color.parseColor("#000000"));
                Intent intent_3 = new Intent(SongsActivity.this, ArtistsActivity.class);
                startActivity(intent_3);
                finish();
                break;
            case R.id.goToPlaylists:
                toPlaylists.setBackgroundColor(Color.parseColor("#ffffff"));
                toPlaylists.setTextColor(Color.parseColor("#000000"));
                Intent intent_4 = new Intent(SongsActivity.this, PlaylistsActivity.class);
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
