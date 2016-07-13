package edu.desu.unicef;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void email (View view){
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:"));
        if (emailIntent.resolveActivity(getPackageManager())!=null){
        startActivity(emailIntent);
        }

    }
    public void Call(View view){
        String phone = "+3022682484";
        Intent intent = new Intent(Intent.ACTION_DIAL,Uri.fromParts("tel",phone,null));
        startActivity(intent);

    }
}

