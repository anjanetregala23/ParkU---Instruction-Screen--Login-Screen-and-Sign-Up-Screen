package parku.com.au.parku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private String strUsername, strPassword;
    private String errorUsername, errorPassword;
    private TextView tvUsername, tvPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.editText_username);
        etPassword = (EditText) findViewById(R.id.editText_password);

        tvUsername = (TextView) findViewById(R.id.textView_username);
        tvPassword = (TextView) findViewById(R.id.textView_password);

        errorUsername = tvUsername.getText().toString();
        errorPassword = tvPassword.getText().toString();

    }

    public void onClickLoginButton(View view) {

        strUsername = etUsername.getText().toString();
        strPassword = etPassword.getText().toString();

        if (strUsername.isEmpty()) {
            Toast.makeText(LoginActivity.this, "Registraion Failed. Check above information", Toast.LENGTH_LONG).show();
            tvUsername.setText(errorUsername + "Enter username");

            if (strPassword.isEmpty()) {
                Toast.makeText(LoginActivity.this, "Registraion Failed. Check above information", Toast.LENGTH_LONG).show();
                tvPassword.setText(errorPassword + "Enter password");
            }

        } else if (strPassword.isEmpty()) {
            Toast.makeText(LoginActivity.this, "Registraion Failed. Check above information", Toast.LENGTH_LONG).show();
            tvPassword.setText(errorPassword + "Enter password");
        }
    }

    public void onClickSignupButton(View view) {
        Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
        startActivity(intent);
    }
}
