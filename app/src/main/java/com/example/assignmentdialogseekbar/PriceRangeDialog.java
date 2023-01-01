package com.example.assignmentdialogseekbar;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class PriceRangeDialog extends Dialog {
    TextView txtView;
    SeekBar seekBar;
    CheckBox checkBox1, checkBox2, checkBox3;
    Button btnOk;

    public PriceRangeDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.dialog_price_range);
        seekBar = findViewById(R.id.seekBar);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        btnOk = findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new BtnOkClickListener());

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isPressed()) {
                    seekBar.setProgress(10);
                    checkBox2.setChecked(false);
                    checkBox3.setChecked(false);
                }

            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isPressed()) {
                    seekBar.setProgress(20);
                    checkBox1.setChecked(false);
                    checkBox3.setChecked(false);

                }
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isPressed()) {
                    seekBar.setProgress(30);
                    checkBox2.setChecked(false);
                    checkBox1.setChecked(false);

                }
            }
        });
    }


    class BtnOkClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            dismiss();

        }
    }
}
