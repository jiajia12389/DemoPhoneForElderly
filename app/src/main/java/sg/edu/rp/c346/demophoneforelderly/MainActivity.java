package sg.edu.rp.c346.demophoneforelderly;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnS,btnD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnS = findViewById(R.id.btnCallSon);
        btnD = findViewById(R.id.btnCallDaughter);

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +12345678));
                startActivity(intentCall);

//                Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("http://www.amazon.com"));
//                startActivity(intent);

            }
        });

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +12345678));
                startActivity(intentCall);

            }
        });
    }
}
