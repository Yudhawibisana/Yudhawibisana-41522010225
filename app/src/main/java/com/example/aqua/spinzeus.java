package com.example.aqua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.content.Intent;
import android.view.View;

import java.util.Random;

public class spinzeus extends AppCompatActivity {

    ImageView wheelBg; // Mengubah nama variabel untuk sesuai dengan yang baru
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinzeus);

        wheelBg = findViewById(R.id.wheel_bg); // Menggunakan ID yang baru untuk wheel_bg
        random = new Random();

        wheelBg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // disabling the ImageView so that user
                // should not click on it
                // while the wheel is spinning
                wheelBg.setEnabled(false);

                // generating a random degree for spinning
                int spinDegrees = random.nextInt(3600) + 360; // between 360 and 3960 degrees

                // setting up the animation for rotation
                RotateAnimation rotateAnimation = new RotateAnimation(
                        0,
                        spinDegrees,
                        RotateAnimation.RELATIVE_TO_SELF,
                        0.5f,
                        RotateAnimation.RELATIVE_TO_SELF,
                        0.5f
                );

                rotateAnimation.setDuration(3000); // setting the duration to 3 seconds
                rotateAnimation.setFillAfter(true); // to keep the wheel at the last position
                rotateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());

                rotateAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(android.view.animation.Animation animation) {
                        // nothing to do here
                    }

                    @Override
                    public void onAnimationEnd(android.view.animation.Animation animation) {
                        // enabling the ImageView again after the animation ends
                        wheelBg.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(android.view.animation.Animation animation) {
                        // nothing to do here
                    }
                });

                wheelBg.startAnimation(rotateAnimation);
            }
        });
    }

    public void spin1(View view) {
        Intent spin1 = new Intent(spinzeus.this, scanktp.class);
        startActivity(spin1);
    }
}