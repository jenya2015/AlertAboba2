package com.example.alertaboba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showAlertDialog1(View v) {
        FragmentManager manager = getSupportFragmentManager();
        MyDialogFragment myDialogFragment = new MyDialogFragment();
        myDialogFragment.show(manager, "myDialog");
    }

    public void showAlertDialog2(View v) {
        FragmentManager manager = getSupportFragmentManager();
        MyDialogFragment2 myDialogFragment2 = new MyDialogFragment2();
        myDialogFragment2.show(manager, "myDialog");
    }

    public void showAlertDialog3(View v) {
        FragmentManager manager = getSupportFragmentManager();
        MyDialogFragment3 myDialogFragment3 = new MyDialogFragment3();
        myDialogFragment3.show(manager, "myDialog");
    }

}