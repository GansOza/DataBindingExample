package com.example.admin_pc.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.admin_pc.databindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.
                setContentView(this,R.layout.activity_main);

        User mod = new User(
                "Ganesh",
                "Oza",
                "ganeshoza04@gmail.com",
                "8888688637");

        binding.setUser(mod);


    }

}
