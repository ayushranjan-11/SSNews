package com.example.ssnews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.action_feedback: {
                Intent feedback=new Intent(this,feedback.class);
                startActivity(feedback);
                break;
            }
            case R.id.action_notification:
            {
                Toast.makeText(getApplicationContext(),"No New Notification",Toast.LENGTH_SHORT).show();
             break;
            }
        }
        return super.onOptionsItemSelected(item);

    }

    public void articledetail(View view) {
        Intent intent=new Intent(this,articledetailpage.class);
        startActivity(intent);
    }
}
