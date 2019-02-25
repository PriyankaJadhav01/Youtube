package java.tata.piyu.youtube;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity {
    //AIzaSyBNh90pYeeIWgR3ddDFj9yBlwZnINy8O-A
    public static final String YT_API_KEY = "AIzaSyBNh90pYeeIWgR3ddDFj9yBlwZnINy8O-A";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        YouTubePlayerView youTubePlayerView =  findViewById(R.id.player);

        youTubePlayerView.initialize(YT_API_KEY,
                new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider,
                                                        YouTubePlayer youTubePlayer, boolean b) {

                        // do any work here to cue video, play video, etc.
                       //  youTubePlayer.cueVideo("5xVh-7ywKpE");
                        youTubePlayer.cueVideo("1DLnIXlff2E");
                        //youTubePlayer.loadVideo("OsXUsTZRpZA");
                        // or to play immediately
                        // youTubePlayer.loadVideo("5xVh-7ywKpE");
                    }
                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider,
                                                        YouTubeInitializationResult youTubeInitializationResult) {
                        Toast.makeText(MainActivity.this , "Youtube Failed!", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
