package com.wangxuhui.navigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class DetailsOfLegislator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_of_legislator);
        getSupportActionBar().setTitle("Legislator Info");
//        getActionBar().setTitle("Legislator Info");
//        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
