package com.example.khalid.sharektest.tour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.khalid.sharektest.R;

/**
 * Created by Abdelrahman on 6/10/2017.
 */

public class tour_welcome extends AppCompatActivity implements View.OnClickListener {

    TextView textView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_tourview_welcome);
        textView = (TextView) findViewById(R.id.Tour_welcome_Next);
        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), tour_share.class);
        startActivity(intent);
    }


    @Override
    public void onBackPressed() {


    }
}
