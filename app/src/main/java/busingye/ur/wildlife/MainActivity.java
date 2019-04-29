package busingye.ur.wildlife;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etusername;
    TextView info;
    EditText etpassword = this.<EditText>findViewById(R.id.etPassword);
    Button btnlogin;
    public String username;
    public String password;
    public int counter = 5;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar) findViewById(R.id.progressbar) ;
        progressBar.setVisibility(View.VISIBLE);

        etusername = (EditText)findViewById(R.id.etUsername);
        info = (TextView) findViewById(R.id.tvinfo);
        info.setText("no of attemps remaining: 5");
        btnlogin = (Button)findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = etusername.getText().toString();
                password = etpassword.getText().toString();
                validate(username,password);
            }
        });

    }
    @SuppressLint("SetTextI18n")
    public void validate(String userName, String userPassword){
        if((userName=="admin") && (userPassword=="1234")){
            Intent intent = new Intent(MainActivity.this, LifeTours.class);
            intent.putExtra("Value", username);
            startActivity(intent);
            finish();
        }
        else{

            counter--;
            info.setText("No of attempts remaining:" + String.valueOf(counter) );

            if (counter==0) {
                btnlogin.setEnabled(false);
            }
        }
    }
}
