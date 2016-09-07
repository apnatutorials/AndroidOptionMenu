package com.apnatutorials.androidoptionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.my_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getGroupId()) {
            case R.id.mnuGroupTechnology:
                switch (item.getItemId()) {
                    case R.id.mnuAndroid:
                        Toast.makeText(MainActivity.this, "Group : Technology" + " Item: " + item.getTitle(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mnuJava:
                        Toast.makeText(MainActivity.this, "Group : Technology" + " Item: " + item.getTitle(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mnuJ2ee:
                        Toast.makeText(MainActivity.this, "Group : Technology" + " Item: " + item.getTitle(), Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            default:
                // Those menu items will come here which are not grouped
                switch (item.getItemId()) {
                    case R.id.mnuSearch:
                        Toast.makeText(MainActivity.this, "Menu Item with clicked: " + item.getTitle(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mnuAboutUs:
                        Toast.makeText(MainActivity.this, "Menu Item with clicked: " + item.getTitle(), Toast.LENGTH_SHORT).show();
                        break;
                }

        }
        return true;
    }
}
