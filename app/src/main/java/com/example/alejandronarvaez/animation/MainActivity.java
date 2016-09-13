package com.example.alejandronarvaez.animation;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // this method shows how to fade in and fade out
    public void fade(View view) {
        ImageView lobo = (ImageView) findViewById(R.id.lobo);
        ImageView Pajaro = (ImageView) findViewById(R.id.thePajaro);
        Button firstButton = (Button) findViewById(R.id.firstButton);
        Button secondButton = (Button) findViewById(R.id.secondButton);

        // Change alpha property of lobo and The Pajaro, so lobo disappears (alpha = 0)
        // and The Pajaro appear (alpha = 1).  Each transformation (animation) lasts 2 seconds.
        lobo.animate().alpha(0f).setDuration(2000);
        Pajaro.animate().alpha(1f).setDuration(2000);

        // We hide and disable the first button so it won't trouble us further
        firstButton.setEnabled(false);
        firstButton.setVisibility(View.INVISIBLE);

        // We show and enable the second button so we can go to the second animation
        secondButton.setEnabled(true);
        secondButton.setVisibility(View.VISIBLE);
    }

    // this method shows how to move an image programmatically
    public void movetigre(View view) {
        ImageView tigre = (ImageView) findViewById(R.id.tigre);
        ImageView Pajaro = (ImageView) findViewById(R.id.thePajaro);
        Button secondButton = (Button) findViewById(R.id.secondButton);
        Button resetButton = (Button) findViewById(R.id.resetButton);

        // Swipe The Pajaro to the right and show tigre falling from the top of the screen
        Pajaro.animate().translationXBy(1000f).setDuration(2000);
        tigre.setVisibility(View.VISIBLE);
        tigre.animate().translationYBy(3000f).setDuration(2000);

        // We hide and disable the second button so it won't trouble us further
        secondButton.setEnabled(false);
        secondButton.setVisibility(View.INVISIBLE);

        // We show and enable the reset button so we can restart out animations
        resetButton.setEnabled(true);
        resetButton.setVisibility(View.VISIBLE);
    }

    public void resetImages(View view) {
        Button firstButton = (Button) findViewById(R.id.firstButton);
        Button resetButton = (Button) findViewById(R.id.resetButton);
        ImageView lobo = (ImageView) findViewById(R.id.lobo);
        ImageView Pajaro = (ImageView) findViewById(R.id.thePajaro);
        ImageView tigre = (ImageView) findViewById(R.id.tigre);

        tigre.setVisibility(View.INVISIBLE);
        tigre.setTranslationY(-3000);
        Pajaro.setAlpha(0f);
        Pajaro.animate().translationX(0f).setDuration(0);
        lobo.setAlpha(1f);

        // We hide and disable the reset button so it won't troubles us further
        resetButton.setEnabled(false);
        resetButton.setVisibility(View.INVISIBLE);

        // We show and enable the first button so we can run our animations again
        firstButton.setEnabled(true);
        firstButton.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hide tigre before it all starts!
        ImageView tigre = (ImageView) findViewById(R.id.tigre);
        tigre.setTranslationY(-3000);
    }
}
