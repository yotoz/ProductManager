package com.productlist.firebase.productlist.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.productlist.firebase.productlist.R;

/**
 * Admin Activity.
 * @author lico
 * @since 1.0
 * @version 2018.10.23
 */
public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
    }

    public void showAddProduct(View v) {
        Intent newActivity = new Intent(this, AddProductActivity.class);
        startActivity(newActivity);
    }

    public void showProductList(View v) {
        Toast.makeText(this, "This is not supported yet.", Toast.LENGTH_SHORT).show();
    }
}
