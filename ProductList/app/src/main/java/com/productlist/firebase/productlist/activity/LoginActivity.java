package com.productlist.firebase.productlist.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.productlist.firebase.helper.ProductListManager;
import com.productlist.firebase.helper.listener.OnCheckUserListener;
import com.productlist.firebase.model.User;
import com.productlist.firebase.productlist.R;

/**
 * Login Activity.
 * @author lico
 * @since 1.0
 * @version 2018.10.23
 */
public class LoginActivity extends AppCompatActivity {
    // objects
    private ProductListManager productListManager = null;

    // ui components
    private EditText etId;
    private EditText etPwd;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Set member variables about ui.
        etId = findViewById(R.id.etId);
        etPwd = findViewById(R.id.etPwd);
        btnLogin = findViewById(R.id.btnLogin);

        // Initialize member objects
        FirebaseApp.initializeApp(this);
        productListManager = new ProductListManager();
    }

    public void checkLogin(View v) {
        final String id = etId.getText().toString();
        final String pwd = etPwd.getText().toString();

        // Check user's account
        // User can't press the login button while checking.
        // After checking, button enable.
        btnLogin.setEnabled(false);

        productListManager.checkUser(id, pwd, new OnCheckUserListener() {
            @Override
            public void onSucceed(User user) {

                // check the password
                if (user.getPassword().equals(pwd)) {
                    Intent newActivity = null;

                    // check the type
                    switch(user.getType()) {
                        case User.ADMIN_TYPE:
                            newActivity = new Intent(LoginActivity.this, AdminActivity.class);
                            break;
                        case User.USER_TYPE:
                            Toast.makeText(LoginActivity.this, "This is not supported yet.", Toast.LENGTH_LONG).show();
                            break;
                    }

                    // Show an Activity
                    if (newActivity != null) {
                        startActivity(newActivity);
                    }
                } else {
                    Toast.makeText(LoginActivity.this, "Check your password.", Toast.LENGTH_LONG).show();
                }

                btnLogin.setEnabled(true);
            }

            @Override
            public void onFailed() {
                Toast.makeText(LoginActivity.this, "Check your account.", Toast.LENGTH_LONG).show();
                btnLogin.setEnabled(true);
            }
        });
    }
}
