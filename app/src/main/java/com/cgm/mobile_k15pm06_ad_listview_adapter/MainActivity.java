package com.cgm.mobile_k15pm06_ad_listview_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView countryListView = findViewById(R.id.countryListView);

        List<Country> list = new ArrayList<Country>();
        Country vietnam = new Country("Vietnam", "vn", 98000000);
        Country usa = new Country("United States", "us", 320000000);
        Country russia = new Country("Russia", "ru", 142000000);
        list.add(vietnam);
        list.add(usa);
        list.add(russia);

        //ArrayAdapter<Country> adapter = new ArrayAdapter<Country>(this,
             //   android.R.layout.simple_list_item_1, list);
        CustomListAdapter customListAdapter = new CustomListAdapter(list, this);

        countryListView.setAdapter(customListAdapter);
    }
}