package com.example.assignmentdialogseekbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnFilter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initListener();
    }

    private void initViews() {
        btnFilter = findViewById(R.id.btnFilter);
    }

    private void initListener() {
        btnFilter.setOnClickListener(new BtnLoginClickListener());
    }

    class BtnLoginClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            PriceRangeDialog priceRangeDialog = new PriceRangeDialog(MainActivity.this);
            priceRangeDialog.show();


        }
    }
}
