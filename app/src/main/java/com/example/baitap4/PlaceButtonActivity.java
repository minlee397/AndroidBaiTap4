package com.example.baitap4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class PlaceButtonActivity extends AppCompatActivity {

    int ID;
    Button btn_map, btn_more;
    TextView place_name;
    List<Place> places;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_button);

        Intent intent = getIntent();
        ID = Integer.parseInt(intent.getExtras().getString("place_id"));

        RawData data = new RawData();
        places = data.getPlaces();
        btn_map = (Button)findViewById(R.id.btn_map);
        btn_more = (Button)findViewById(R.id.btn_more);
        place_name = (TextView)findViewById(R.id.place_name);

        place_name.setText(places.get(ID).getPlaceName());

        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlaceButtonActivity.this, MapsActivity.class);
                i.putExtra("place_lat",String.valueOf(places.get(ID).getPlaceLat()));
                i.putExtra("place_lng",String.valueOf(places.get(ID).getPlaceLng()));
                i.putExtra("place_name",places.get(ID).getPlaceName());
                startActivity(i);
            }
        });

        btn_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String LinkPlace = places.get(ID).getPlaceLink();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(LinkPlace));
                startActivity(i);
            }
        });
    }
}
