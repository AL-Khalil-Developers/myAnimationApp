package com.alkhalildevelopers.myanimationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView titleTxt;
    Button showAnimBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        titleTxt = findViewById(R.id.my_text);
        showAnimBtn = findViewById(R.id.showAnimationBtn);

        titleTxt.setAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.my_anim));

        showAnimBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation myAnimP = AnimationUtils.loadAnimation(MainActivity.this,R.anim.my_anim);
                titleTxt.startAnimation(myAnimP);
            }
        });




    }
}
