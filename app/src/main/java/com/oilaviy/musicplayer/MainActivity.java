package com.oilaviy.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private Button play;
    private ImageView playerImage;
    private TextView songTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.music);
        play = findViewById(R.id.playButton);
        //pause = findViewById(R.id.pauseButton);
        songTitle = findViewById(R.id.txt_songTitle);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                songTitle.setText("Louis Armstrong - What a wonderful world.mp3"); //setText();

                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    Toast.makeText(MainActivity.this, "Paused", Toast.LENGTH_SHORT).show();
                    play.setText("Play");

                } else {
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "Playing", Toast.LENGTH_SHORT).show();
                    play.setText("Pause");
                }
            }
        });

    }


}