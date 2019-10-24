package com.example.homeworktask2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class FoodDetailActivity extends AppCompatActivity {

    private Food currentFood;
    private TextView name;
    private TextView description;
    private TextView cost;
    private ImageView image;
    private EditText quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);

        name = findViewById(R.id.foodName);
        description = findViewById(R.id.foodDescrption);
        cost = findViewById(R.id.foodCost);
        image = findViewById(R.id.foodImage);
        quantity = findViewById(R.id.quantity);


        currentFood = FoodDatabase.getFoodById(getIntent().getIntExtra("FoodID", 0));
        name.setText(currentFood.getName());
        description.setText(currentFood.getDescription());
        cost.setText(currentFood.getCost());
        image.setImageResource(currentFood.getImageId());
        quantity.setText(R.string.defaultvalue);

    }

    public void goBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void addOne(View view) {
        //Change value within the EditText Field
        quantity = (EditText)findViewById(R.id.quantity);
        String currentNumber = quantity.getText().toString();
        int parseNumber = Integer.parseInt(currentNumber);
        int newNumber = parseNumber + 1;
        String newString = Integer.toString(newNumber);
        quantity.setText(newString);
    }

    public void minusOne(View view) {
        quantity = (EditText)findViewById(R.id.quantity);
        String currentNumber = quantity.getText().toString();
        int parseNumber = Integer.parseInt(currentNumber);
        int newNumber = parseNumber - 1;
        String newString = Integer.toString(newNumber);
        quantity.setText(newString);
    }

    public void addToOrder(View view) {
        Toast.makeText(getApplicationContext(),
                "Adding $" + String.format("%.2f", getTotal())  + " to your cart",
                Toast.LENGTH_SHORT).show();
    }

    public double getTotal() {
        String sCost = cost.getText().toString();
        double itemCost = Double.parseDouble(sCost);
        String sQuant = quantity.getText().toString();
        int itemQuant = Integer.parseInt(sQuant);
        double total = itemQuant * itemCost;
        return total;
    }

}
