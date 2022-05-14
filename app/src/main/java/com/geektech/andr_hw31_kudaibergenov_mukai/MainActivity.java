package com.geektech.andr_hw31_kudaibergenov_mukai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("001");
        numbers.add("002");
        numbers.add("003");
        numbers.add("004");
        numbers.add("005");
        numbers.add("006");
        numbers.add("007");
        numbers.add("008");
        numbers.add("009");
        numbers.add("010");
        numbers.add("011");
        numbers.add("012");
        numbers.add("013");
        numbers.add("014");
        numbers.add("015");
        numbers.add("016");
        numbers.add("017");
        numbers.add("018");
        numbers.add("019");
        numbers.add("020");
        numbers.add("021");
        numbers.add("022");

        NumberAdapter adapter = new NumberAdapter(numbers);
        recyclerView.setAdapter(adapter);
    }
}