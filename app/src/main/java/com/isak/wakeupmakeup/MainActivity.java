package com.isak.wakeupmakeup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Typeface;
import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.searchButton) Button mSearchButton;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;
    @BindView(R.id.makeupEditText) EditText mMakeupEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        Typeface seasideFont = Typeface.createFromAsset(getAssets(), "fonts/SeasideResortNF/SEASRN__.ttf");
        mAppNameTextView.setTypeface(seasideFont);

        mSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String makeup = mMakeupEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, MakeupListActivity.class);
                intent.putExtra("makeup", makeup);
                startActivity(intent);
            }
        });
    }
}
