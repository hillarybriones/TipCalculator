package com.example.hillarybriones.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText totalBillAmount;
    private EditText NumberOfPeople;
    private SeekBar tipPercent;
    private TextView totalAmountToBePaid;
    private TextView tipsPerPerson;
    private int tipPercentValue = 0;
    private TextView tipPercentage;
    double bill,people,total,tip;
    double rate=0.00f;
    int value;
    int progress=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalBillAmount = (EditText)findViewById(R.id.editTextTotalBill);
        totalBillAmount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


                try {
                    tipPercentage.setText(String.valueOf(progress) + "%");

                    int value = tipPercent.getProgress();
                    String a = Integer.toString(value);
                    tipPercentage.setText(a);


                    bill = Double.parseDouble(totalBillAmount.getText().toString());
                    people = Double.parseDouble(NumberOfPeople.getText().toString());
                    rate = Double.parseDouble(tipPercentage.getText().toString());
                    if (bill == 0 || people == 0) {
                        Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_LONG).show();
                    } else {
                        total = bill / people + rate;
                        totalAmountToBePaid.setText(Double.toString(total));
                        tip = bill / people * (rate / 100);
                        tipsPerPerson.setText(Double.toString(tip));
                    }
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_LONG).show();
                }
            }
            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        tipPercent = (SeekBar)findViewById(R.id.seekBarTipPerPercent);

        totalAmountToBePaid = (TextView)findViewById(R.id.txtviewTotalPerPerson);
        tipsPerPerson = (TextView)findViewById(R.id.txtviewTipPerPerson);
        tipPercentage = (TextView)findViewById(R.id.txtviewTipPercentage);
        NumberOfPeople=(EditText) findViewById(R.id.editTextNumOfPeople);
        NumberOfPeople.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


                try {
                    tipPercentage.setText(String.valueOf(progress) + "%");

                    int value = tipPercent.getProgress();
                    String a = Integer.toString(value);
                    tipPercentage.setText(a);


                    bill = Double.parseDouble(totalBillAmount.getText().toString());
                    people = Double.parseDouble(NumberOfPeople.getText().toString());
                    rate = Double.parseDouble(tipPercentage.getText().toString());
                    if (bill == 0 || people == 0) {
                        Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_LONG).show();
                    } else {
                        total = bill / people + rate;
                        totalAmountToBePaid.setText(Double.toString(total));
                        tip = bill / people * (rate / 100);
                        tipsPerPerson.setText(Double.toString(tip));
                    }
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_LONG).show();
                }
            }
            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        tipPercent.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                try {
                    tipPercentage.setText(String.valueOf(progress) + "%");

                    int value = tipPercent.getProgress();
                    String a = Integer.toString(value);
                    tipPercentage.setText(a);


                    bill = Double.parseDouble(totalBillAmount.getText().toString());
                    people = Double.parseDouble(NumberOfPeople.getText().toString());
                    rate = Double.parseDouble(tipPercentage.getText().toString());
                    if (bill == 0 || people == 0) {
                        Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_LONG).show();
                    } else {
                        total = bill / people + rate;
                        totalAmountToBePaid.setText(Double.toString(total));
                        tip = bill / people * (rate / 100);
                        tipsPerPerson.setText(Double.toString(tip));
                    }
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_LONG).show();
                }
            }


                @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });





    }
    }

