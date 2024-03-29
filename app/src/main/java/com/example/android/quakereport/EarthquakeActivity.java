/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = QueryUtils.extractEarthquakes();
//        earthquakes.add(new Earthquake(7.2, "San Francisco", new Date(2016, 2, 2)));
//        earthquakes.add(new Earthquake(6.1, "London", new Date(2015, 7, 20)));
//        earthquakes.add(new Earthquake(3.9, "Tokyo", new Date(2014, 11, 10)));
//        earthquakes.add(new Earthquake(5.4, "Mexico City", new Date(2014, 5, 3)));
//        earthquakes.add(new Earthquake(2.8, "Moscow", new Date(2013, 1, 31)));
//        earthquakes.add(new Earthquake(4.9, "Rio de Janeiro", new Date(2012, 12, 19)));
//        earthquakes.add(new Earthquake(1.6, "Paris", new Date(2011, 11, 30)));

        EarthquakeAdapter adapter = new EarthquakeAdapter(
        this, earthquakes);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
