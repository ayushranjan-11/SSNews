package com.example.ssnews;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Objects;

public class comment_page extends AppCompatActivity {
    private ImageButton Postcommentbutton;
    private EditText Commentinputtext;
    private RecyclerView Commentslist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment_page);
        Commentslist = (RecyclerView) findViewById(R.id.comments_list);
        Commentslist.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setReverseLayout(true);
        linearLayoutManager.setStackFromEnd(true);
        Commentslist.setLayoutManager(linearLayoutManager);
        Commentinputtext = (EditText) findViewById(R.id.comment_box);
        Postcommentbutton = (ImageButton) findViewById(R.id.comment_submit_button);

    }
}
