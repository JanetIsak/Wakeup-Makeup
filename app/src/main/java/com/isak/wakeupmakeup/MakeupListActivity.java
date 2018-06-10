package com.isak.wakeupmakeup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MakeupListActivity extends AppCompatActivity {
    @BindView(R.id.makeupTextView) TextView mMakeupTextView;
    @BindView(R.id.listView) ListView mListView;
    private String[] brands = new String[] {"Mac","Wet n Wild","Maybeline", "NYX", "l'Oreal",
            "essie", "Clinique", "Revlon", "Annabelle", "Milani"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makeup_list);
        ButterKnife.bind(this);


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, brands);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String brand = ((TextView)view).getText().toString();
                Toast.makeText(MakeupListActivity.this, brand, Toast.LENGTH_LONG).show();
            }
        });
        Intent intent = getIntent();
        String makeup = intent.getStringExtra("makeup");
        mMakeupTextView.setText("List of brands with your choice of : " + makeup);

    }
}
