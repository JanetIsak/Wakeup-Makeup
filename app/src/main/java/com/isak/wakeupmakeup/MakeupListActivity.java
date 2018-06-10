package com.isak.wakeupmakeup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView;
import android.view.View;

public class MakeupListActivity extends AppCompatActivity {
    private ListView mListView;
    private String[] brands = new String[] {"Mac","Wet n Wild","Maybeline", "NYX", "l'Oreal",
            "essie", "Clinique", "Revlon", "Annabelle", "Milani"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makeup_list);

        mListView = (ListView) findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, brands);
        mListView.setAdapter(adapter);


    }
}
