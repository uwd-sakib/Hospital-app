package com.example.sakib1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class sing_in extends AppCompatActivity {
    EditText edyouremailadress, edenteryourpassword;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sing_in);

        // Initialize views
        edenteryourpassword = findViewById(R.id.editTextsing_inEnteryourpassword);
        edyouremailadress = findViewById(R.id.editTextsing_inYouremailaddress);
        btn = findViewById(R.id.buttonLogIn);
        tv = findViewById(R.id.TextviewSingUP);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String youremailadress = edyouremailadress.getText().toString();
                String enteryourpassword = edenteryourpassword.getText().toString();

                // Validate input fields
                if (youremailadress.length() == 0 || enteryourpassword.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Please fill all details", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv.setOnClickListener(new View.OnClickListenero(){
        @Override
        public void onClick(View view){
            startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
        }
    });




    // Handle window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}