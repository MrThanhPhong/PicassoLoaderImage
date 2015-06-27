package com.example.phong.picassoloaderimage;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView img = (ImageView)findViewById(R.id.imgshow);


        Picasso.with(this).load("https://s3-ap-southeast-1.amazonaws.com/bugisstreet/Image_Products/893425110698103_image1_22.jpg").resize(200,200).error(R.drawable.ic_launcher).into(img);
    }



}
