package com.firstapp.amazon1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void amazon(View view) {
        Toast.makeText(this, "Welcome to Amazon", Toast.LENGTH_SHORT).show();
    }

    public void notification(View view) {
        Toast.makeText(this, "see all the notifications", Toast.LENGTH_SHORT).show();
    }

    public void search(View view) {
        Toast.makeText(this, "search here", Toast.LENGTH_SHORT).show();

    }

    public void contact(View view) {
        Toast.makeText(this, "see profile", Toast.LENGTH_SHORT).show();

    }

    public void button1(View view) {
        Toast.makeText(this, "select your orders", Toast.LENGTH_SHORT).show();

    }

    public void button2(View view) {
        Toast.makeText(this, "Thank you visit again", Toast.LENGTH_SHORT).show();

    }

    public void button3(View view) {
        Toast.makeText(this, "see once your account", Toast.LENGTH_SHORT).show();

    }

    public void button4(View view) {
        Toast.makeText(this, "your collection list", Toast.LENGTH_SHORT).show();

    }

    public void yourorders(View view) {
        Toast.makeText(this, "select your orders", Toast.LENGTH_SHORT).show();

    }

    public void button5(View view) {
        Toast.makeText(this, "see Homepage", Toast.LENGTH_SHORT).show();
    }

    public void yourwishlist(View view) {
        Toast.makeText(this, "your collection list", Toast.LENGTH_SHORT).show();
    }

    public void button6(View view) {
        Toast.makeText(this, "create a new List", Toast.LENGTH_SHORT).show();
    }

    public void youraccount(View view) {
        Toast.makeText(this, "your account", Toast.LENGTH_SHORT).show();
    }

    public void seeall(View view) {
        Toast.makeText(this, "see all the list", Toast.LENGTH_SHORT).show();
    }

    public void b1(View view) {
        Toast.makeText(this, "your Orders", Toast.LENGTH_SHORT).show();
    }

    public void b2(View view) {
        Toast.makeText(this, "Your Adderss", Toast.LENGTH_SHORT).show();
    }

    public void b3(View view) {
        Toast.makeText(this, "Amazon Pay balance", Toast.LENGTH_SHORT).show();


    }

    public void b4(View view) {
        Toast.makeText(this, "Manage Your Profile", Toast.LENGTH_SHORT).show();

    }

    public void b5(View view) {
        Toast.makeText(this, "Amazon Pay UPI", Toast.LENGTH_SHORT).show();

    }

    public void b6(View view) {
        Toast.makeText(this, "View Amazon Pay Balance", Toast.LENGTH_SHORT).show();

    }

    public void Buyagain(View view) {
        Toast.makeText(this, "Buy Again", Toast.LENGTH_SHORT).show();

    }

    public void visit(View view) {
        Toast.makeText(this, "Thank You Visit Again", Toast.LENGTH_SHORT).show();

    }
}