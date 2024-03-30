package com.cgm.mobile_k15pm06_ad_listview_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomListAdapter extends BaseAdapter {
    private List<Country> data;
    private LayoutInflater layoutInflater;

    private Context context;

    public CustomListAdapter(List<Country> data, Context context) {
        this.data = data;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = layoutInflater.inflate(R.layout.list_item_layout, null);
        TextView countryNameView = convertView.findViewById(R.id.textView_countryName);
        TextView populationView = convertView.findViewById(R.id.textView_population);

        Country country = this.data.get(position);
        countryNameView.setText(country.getCountryName());
        populationView.setText("Population: " + country.getPopulation());

        return convertView;
    }
}
