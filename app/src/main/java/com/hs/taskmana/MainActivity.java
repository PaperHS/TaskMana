package com.hs.taskmana;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.cengalabs.flatui.FlatUI;
import com.daimajia.swipe.SwipeLayout;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FlatUI.initDefaultValues(this);
        FlatUI.setDefaultTheme(FlatUI.GRASS);
        setContentView(R.layout.activity_main);
        getActionBar().setBackgroundDrawable(FlatUI.getActionBarDrawable(this,FlatUI.GRASS, false));
        SwipeLayout root = (SwipeLayout)findViewById(R.id.main_root_swipelayout);
        root.setShowMode(SwipeLayout.ShowMode.PullOut);
        root.setDragEdge(SwipeLayout.DragEdge.Bottom);
        root.close();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
