        package com.example.newclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

        public class MainActivity extends AppCompatActivity {
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      bt= findViewById(R.id.button11);
      bt.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
             Snackbar  snb= Snackbar.make(findViewById(R.id.myView),"Done snackbar",Snackbar.LENGTH_LONG);
        snb.show();
          /*    Snackbar snb =Snackbar.make(findViewById(R.id.myView),"Action!",Snackbar.LENGTH_INDEFINITE).setAction("Retry!", new View.OnClickListener() {
                          @Override
                          public void onClick(View v){
                              Toast.makeText(getApplicationContext(),"Snackbar is toasting :)",Toast.LENGTH_LONG).show();
                          }
                      }
              );
              snb.show();*/

          }
      });
    }
}
