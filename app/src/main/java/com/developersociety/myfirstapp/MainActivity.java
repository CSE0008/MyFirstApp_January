package com.developersociety.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textView;
    Button btnDial,btnToast,btnshowlocation,btnOpenWebpage,btnViewintent,btnGetpro;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btnDial = (Button) findViewById(R.id.dialNumber);
         btnToast = (Button) findViewById(R.id.toast);
         btnshowlocation = (Button) findViewById(R.id.showLocation);
         btnOpenWebpage = (Button) findViewById(R.id.openWebPage);
         btnViewintent = (Button) findViewById(R.id.viewIntent);
         btnGetpro = (Button) findViewById(R.id.LetsGetPro);


        textView =(TextView) findViewById(R.id.textView);

        btnDial.setOnClickListener(this);
        btnToast.setOnClickListener(this);
        btnshowlocation.setOnClickListener(this);
        btnOpenWebpage.setOnClickListener(this);
        btnViewintent.setOnClickListener(this);
        btnGetpro.setOnClickListener(this);

        //Event Listner.....

//        pushme.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("abc","Somebody pushed the button LOGCAT");
//                textView.setText("Somebody bushed the button TEXTVIEW");
//            }
//        });


    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.dialNumber:
                //Dial happen to be component...
                //Can we create our own component?...

                Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+91"));
                startActivity(intent1);
                break;

            case R.id.toast:
                Intent intent2= new Intent(MainActivity.this, OtherActivity.class);
                Toast.makeText(this, "Going to next page", Toast.LENGTH_SHORT).show();
                startActivity(intent2);

                break;

            case R.id.showLocation:
                Intent intent3 = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:22.6548889,88.357528,19z18"));
                startActivity(intent3);
                break;

            case R.id.openWebPage:
                Intent intent4 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://com.developers.android.com"));
                startActivity(intent4);
                break;

            case R.id.viewIntent:

                break;

            case R.id.LetsGetPro:

                break;
        }
    }
}
