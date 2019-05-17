package com.example.baitap4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Place> places = null;
    ListView list_places;
    ArrayAdapter<String> apdater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RawData data = new RawData();
        places = data.getPlaces();
        CreateList();
    }

    private void CreateList(){
        list_places = (ListView)findViewById(R.id.list_places);
        List<String> place_name = new ArrayList<String>();
        for (int i = 0; i < places.size(); i++)
            place_name.add(places.get(i).getPlaceName());
        apdater =  new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,place_name);
        list_places.setAdapter(apdater);

        list_places.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, PlaceButtonActivity.class);
                i.putExtra("place_id",String.valueOf(position));
                startActivity(i);
            }
        });
    }
}
