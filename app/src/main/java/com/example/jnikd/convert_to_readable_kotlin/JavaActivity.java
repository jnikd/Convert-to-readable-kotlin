package com.example.jnikd.convert_to_readable_kotlin;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class JavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle(this.getLocalClassName());

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(getString(R.string.main_text_java));
        textView.setTextSize(16);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextScreenIntent = new Intent(JavaActivity.this, KotlinActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("key1", "value1");
                bundle.putString("key2", "value2");
                nextScreenIntent.putExtra("bundle", bundle);
                startActivity(nextScreenIntent);
            }
        });
    }
}
