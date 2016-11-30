package com.example.hamby.actionbarexperiment;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

public class MainActivity extends Activity {
    private static final String TAB_KEY_INDEX = "tab_key";
    private Fragment appetizerFrag;
    private Fragment entreeFrag;
    private Fragment dessertFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setDisplayShowTitleEnabled(false);
        
    }
}
