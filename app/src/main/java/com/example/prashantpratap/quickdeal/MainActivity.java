package com.example.prashantpratap.quickdeal;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
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
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.items, menu);
            return super.onCreateOptionsMenu(menu);
        }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);

        switch(item.getItemId()){
            case R.id.add_items:
                Toast.makeText(getBaseContext(), "You selected Phone", Toast.LENGTH_SHORT).show();
                break;

            case R.id.submit:
                Toast.makeText(getBaseContext(), "You selected Computer", Toast.LENGTH_SHORT).show();
                break;



        }
        return true;



    }
}
