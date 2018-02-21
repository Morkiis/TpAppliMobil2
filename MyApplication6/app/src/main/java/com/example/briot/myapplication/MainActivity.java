package com.example.briot.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private String[] liste = new String[]{
            "Football", "Basketball", "Snowboard", "Rugby", "Course à pied",
            "Handball", "Natation", "Tir à l'arc", "Saut à la perche", "Escalade"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listView);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, liste);
        mListView.setAdapter(adapter);
    }
}