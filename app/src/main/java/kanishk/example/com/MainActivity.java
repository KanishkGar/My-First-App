package kanishk.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button btn;
    boolean display = false;
    String text1 = "This is a basic app";
    String text2 = "Subscribe to this channel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        btn = findViewById(R.id.btn);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeToast("Button clicked");

                if(display){
                    text.setText(text2);
                    btn.setBackgroundColor(Color.parseColor("#F00000"));
                    display = false;
                }else{
                    text.setText(text1);
                    btn.setBackgroundColor(Color.parseColor("#0000f0"));
                    display = true;
                }
            }
        });

    }

    private void makeToast(String s){
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
    }

}