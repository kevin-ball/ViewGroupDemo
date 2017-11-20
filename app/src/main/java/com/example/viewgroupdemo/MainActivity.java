package com.example.viewgroupdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Button btn = (Button) view;
        LinearLayout innerGroup = findViewById(R.id.innerViewGroup);
        if (innerGroup.getVisibility() == View.VISIBLE) {
            innerGroup.setVisibility(View.INVISIBLE);
            btn.setText("Show View");
        } else {
            innerGroup.setVisibility(View.VISIBLE);
            btn.setText("Hide View");
        }
        /*
        CheckBox ckbAdmin = (CheckBox) findViewById(R.id.ckbAdmin);
        TextView tvUser = (TextView) findViewById(R.id.tvUser);
        TextView tvAdmin = (TextView) findViewById(R.id.tvAdmin);

        if (ckbAdmin.isChecked()) {
            tvAdmin.setVisibility(View.VISIBLE);
            tvUser.setVisibility(View.GONE);
        } else {
            tvAdmin.setVisibility(View.GONE);
            tvUser.setVisibility(View.VISIBLE);
        }
        */

        CheckBox ckbAdmin = (CheckBox) findViewById(R.id.ckbAdmin);
        TextView tvAdmin = (TextView) innerGroup.getChildAt(0);
        TextView tvUser = (TextView) innerGroup.getChildAt(1);

        if (ckbAdmin.isChecked()) {
            tvAdmin.setVisibility(View.VISIBLE);
            tvUser.setVisibility(View.GONE);
        } else {
            tvAdmin.setVisibility(View.GONE);
            tvUser.setVisibility(View.VISIBLE);
        }

    }



}
