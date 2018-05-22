package com.example.android.userprofile;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView profileImage = (ImageView) findViewById(R.id.profile_picture);
        profileImage.setImageResource(R.drawable.avatar);

        TextView nameTextView = (TextView) findViewById(R.id.name);
        nameTextView.setText(R.string.name);
        nameTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 32);
        nameTextView.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        TextView birthdayTextView = (TextView) findViewById(R.id.birthday);
        birthdayTextView.setText(R.string.bday);
        birthdayTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);

        TextView countryTextView = (TextView) findViewById(R.id.country);
        countryTextView.setText(R.string.country);
        countryTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
    }
}
