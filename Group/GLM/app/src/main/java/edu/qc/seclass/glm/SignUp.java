package edu.qc.seclass.glm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.grocerylistmanager.R;

public class SignUp extends AppCompatActivity {
    Context mContext = this;
    EditText etSignUpUsername;
    EditText etSignUpPassword;
    EditText etEmail;
    EditText etFirstName;
    EditText etLastName;
    Button btnSignUpSubmit;
    Button btnSignUpBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        etSignUpUsername = findViewById(R.id.etSignUpUsername);
        etSignUpPassword = findViewById(R.id.etSignUpPassword);
        etEmail = findViewById(R.id.etEmail);
        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName);
        btnSignUpSubmit = findViewById(R.id.btnSignUp);
        btnSignUpBack = findViewById(R.id.btnSignUpBack);
    }

    public void backToLogin(View view) {
        Intent i = new Intent(mContext, LoginActivity.class);
        startActivity(i);
    }
}