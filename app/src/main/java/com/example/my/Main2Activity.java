package com.example.my;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.security.SecurityPermission;

public class Main2Activity extends AppCompatActivity {
    private EditText e_1;
    private TextView text_1;
    private  boolean j_8 = false;
    private  boolean j_2 = false;
    private  boolean j_10 = false;
    private  boolean j_16 = false;
    private  boolean c_km = true;
    private  boolean c_m = true;
    private  boolean c_dm = true;
    private  boolean c_cm = true;
    private  boolean c_mm = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();

        /*final Spinner sp_1 = (Spinner)findViewById(R.id.Spinner_1);
        final TextView text_1 = (TextView)findViewById(R.id.text_1);
        final TextView text_2 = (TextView)findViewById(R.id.text_2);
        final EditText e_1 = (EditText)findViewById(R.id.result_1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.items,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        sp_1.setAdapter(adapter);
        sp_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //text_1.setText((String) sp_1.getItemAtPosition(i));
                switch (text_2.getText().toString()){
                    case "二":
                        switch ((String)sp_1.getItemAtPosition(i)){
                            case "二":
                                text_1.setText(e_1.getText().toString());
                                break;
                            case "八":
                                int temp = Integer.valueOf(e_1.getText().toString(),2);
                                text_1.setText(Integer.toOctalString(temp));
                                break;
                            case "十":
                                int temp1 = Integer.valueOf(e_1.getText().toString(),2);
                                text_1.setText(String.valueOf(temp1));
                                break;
                            case "十六":
                                int temp2 = Integer.valueOf(e_1.getText().toString(),2);
                                text_1.setText(Integer.toHexString(temp2));
                                break;
                        }
                        break;
                    case "八":
                        switch ((String)sp_1.getItemAtPosition(i)){
                            case "二":
                                int temp = Integer.valueOf(e_1.getText().toString(),8);
                                text_1.setText(Integer.toBinaryString(temp));
                                break;
                            case "八":
                                text_1.setText(e_1.getText().toString());
                                break;
                            case "十":
                                int temp1 = Integer.valueOf(e_1.getText().toString(),8);
                                text_1.setText(String.valueOf(temp1));
                                break;
                            case "十六":
                                int temp2 = Integer.valueOf(e_1.getText().toString(),8);
                                text_1.setText(Integer.toHexString(temp2));
                                break;
                        }
                        break;
                    case "十":
                        switch ((String)sp_1.getItemAtPosition(i)){
                            case "二":
                                int temp = Integer.valueOf(e_1.getText().toString());
                                text_1.setText(Integer.toBinaryString(temp));
                                break;
                            case "八":
                                int temp1 = Integer.valueOf(e_1.getText().toString());
                                text_1.setText(Integer.toOctalString(temp1));
                                break;
                            case "十":
                                text_1.setText(e_1.getText().toString());
                                break;
                            case "十六":
                                int temp2 = Integer.valueOf(e_1.getText().toString());
                                text_1.setText(Integer.toHexString(temp2));
                                break;
                        }
                        break;
                    case "十六":
                        switch ((String)sp_1.getItemAtPosition(i)){
                            case "二":
                                int temp = Integer.valueOf(e_1.getText().toString(),16);
                                text_1.setText(Integer.toBinaryString(temp));
                                break;
                            case "八":
                                int temp1 = Integer.valueOf(e_1.getText().toString(),16);
                                text_1.setText(Integer.toOctalString(temp1));
                                break;
                            case "十":
                                int temp2 = Integer.valueOf(e_1.getText().toString(),16);
                                text_1.setText(String.valueOf(temp2));
                                break;
                            case "十六":

                                text_1.setText(e_1.getText().toString());
                                break;
                        }
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });*/
        final Spinner sp_1 = (Spinner)findViewById(R.id.Spinner_1);
        final TextView text_1 = (TextView)findViewById(R.id.text_1);
        final TextView text_2 = (TextView)findViewById(R.id.text_2);
        final EditText e_1 = (EditText)findViewById(R.id.result_1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.items,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        sp_1.setAdapter(adapter);

        final Spinner sp_2 = (Spinner)findViewById(R.id.Spinner_2);
        final TextView text_3 = (TextView)findViewById(R.id.text_3);
        final TextView text_4 = (TextView)findViewById(R.id.text_4);
        final EditText e_2 = (EditText)findViewById(R.id.result_2);
        ArrayAdapter<CharSequence> adapter_1 = ArrayAdapter.createFromResource(this,R.array.items_1,android.R.layout.simple_spinner_item);
        adapter_1.setDropDownViewResource(android.R.layout.simple_spinner_item);
        sp_2.setAdapter(adapter_1);

        sp_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                text_2.setText((String) sp_1.getItemAtPosition(i));
                switch (text_2.getText().toString()){
                   // case "二":
                       // switch ((String)sp_1.getItemAtPosition(i)){
                            case "二":
                                j_2 = true;
                                j_16=false;
                                j_10=false;
                                j_8=false;
                                break;
                            case "八":
                               j_8 = true;
                                j_16=false;
                                j_10=false;
                                j_2=false;
                                break;
                            case "十":
                                j_10 = true;
                                j_16=false;
                                j_2=false;
                                j_8=false;
                                break;
                            case "十六":
                                j_16 = true;
                                j_2=false;
                                j_10=false;
                                j_8=false;
                                break;
                        //}
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Button bt_二进制 = (Button) findViewById(R.id.bt_二进制转换);
       /* e_1 = (EditText) findViewById(R.id.result_1);
        text_1 = (TextView)findViewById(R.id.text_1);*/
        bt_二进制.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(j_2);
                if(j_10) {
                    String input = e_1.getText().toString();
                    String ten = Integer.toBinaryString(Integer.parseInt(input));
                    System.out.println(ten);
                    text_1.setText(ten);
                }
                else if(j_8){
                    String input = e_1.getText().toString();
                    String ten = String.valueOf(Integer.valueOf(input,8));
                    String ten1 = Integer.toBinaryString(Integer.parseInt(ten));
                    System.out.println(ten1);
                    text_1.setText(ten1);
                }else  if(j_2){
                    String input = e_1.getText().toString();
                    String ten = e_1.getText().toString();
                    System.out.println(ten);
                    text_1.setText(ten);
                }else if(j_16){
                    String input = e_1.getText().toString();
                    String ten = String.valueOf(Integer.valueOf(input,16));
                    String ten1 = Integer.toBinaryString(Integer.parseInt(ten));
                    System.out.println(ten1);
                    text_1.setText(ten1);
                }
            }
        });
        Button bt_八进制 = (Button)findViewById(R.id.bt_八进制转换);
        bt_八进制.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(j_2);
                if(j_2){
                    String input = e_1.getText().toString();
                    String ten = Integer.valueOf(input,2).toString();
                    String ten1 = Integer.toOctalString(Integer.parseInt(ten));
                    System.out.println(ten1);
                    text_1.setText(ten1);
                }
                else if(j_8){
                    String input = e_1.getText().toString();
                    String ten = Integer.valueOf(input,8).toString();
                    String ten1 = Integer.toOctalString(Integer.parseInt(ten));
                    System.out.println(ten1);
                    text_1.setText(ten1);
                }
                else if(j_10){
                    String input = e_1.getText().toString();
                    String ten = Integer.valueOf(input,10).toString();
                    String ten1 = Integer.toOctalString(Integer.parseInt(ten));
                    System.out.println(ten1);
                    text_1.setText(ten1);
                }
                else if(j_16){
                    String input = e_1.getText().toString();
                    String ten = Integer.valueOf(input,16).toString();
                    String ten1 = Integer.toOctalString(Integer.parseInt(ten));
                    System.out.println(ten1);
                    text_1.setText(ten1);
                }

            }
        });
        Button bt_十进制 = (Button)findViewById(R.id.bt_十进制转换);
        bt_十进制.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(j_2){
                    String input = e_1.getText().toString();
                    String ten = Integer.valueOf(input,2).toString();
                    String ten1 = String.valueOf(Integer.parseInt(ten));
                    System.out.println(ten1);
                    text_1.setText(ten1);
                }
                else if(j_8){
                    String input = e_1.getText().toString();
                    String ten = Integer.valueOf(input,8).toString();
                    String ten1 = String.valueOf(Integer.parseInt(ten));
                    System.out.println(ten1);
                    text_1.setText(ten1);
                }
                else if(j_10){
                    String input = e_1.getText().toString();
                    String ten = Integer.valueOf(input,10).toString();
                    String ten1 = String.valueOf(Integer.parseInt(ten));
                    System.out.println(ten1);
                    text_1.setText(ten1);
                }
                else if(j_16){
                    String input = e_1.getText().toString();
                    String ten = Integer.valueOf(input,16).toString();
                    String ten1 = String.valueOf(Integer.parseInt(ten));
                    System.out.println(ten1);
                    text_1.setText(ten1);
                }
            }
        });
        Button bt_十六进制 = (Button)findViewById(R.id.bt_十六进制转换);
        bt_十六进制.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(j_2){
                    String input = e_1.getText().toString();
                    String ten = Integer.valueOf(input,2).toString();
                    String ten1 = Integer.toHexString(Integer.parseInt(ten));
                    System.out.println(ten1);
                    text_1.setText(ten1);
                }
                else if(j_8){
                    String input = e_1.getText().toString();
                    String ten = Integer.valueOf(input,8).toString();
                    String ten1 = Integer.toHexString(Integer.parseInt(ten));
                    System.out.println(ten1);
                    text_1.setText(ten1);
                }
                else if(j_10){
                    String input = e_1.getText().toString();
                    String ten = Integer.valueOf(input,10).toString();
                    String ten1 = Integer.toHexString(Integer.parseInt(ten));
                    System.out.println(ten1);
                    text_1.setText(ten1);
                }
                else if(j_16){
                    String input = e_1.getText().toString();
                    String ten = Integer.valueOf(input,16).toString();
                    String ten1 = Integer.toHexString(Integer.parseInt(ten));
                    System.out.println(ten1);
                    text_1.setText(ten1);
                }
            }
        });
        sp_2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                text_3.setText((String) sp_2.getItemAtPosition(position));
                switch (text_3.getText().toString()){
                    case "km":
                        c_km = true;
                        c_m = false;
                        c_dm = false;
                        c_cm =false;
                        c_mm = false;
                        break;
                    case "m":
                        c_m = true;
                        c_km = false;
                        c_dm = false;
                        c_cm = false;
                        c_mm = false;
                        break;
                    case "dm":
                        c_dm = true;
                        c_m = false;
                        c_km = false;
                        c_cm =false;
                        c_mm = false;
                        break;
                    case "cm":
                        c_cm = true;
                        c_m = false;
                        c_dm = false;
                        c_km =false;
                        c_mm = false;
                        break;
                    case "mm":
                        c_mm = true;
                        c_m = false;
                        c_dm = false;
                        c_cm =false;
                        c_km = false;
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        Button bt_km = (Button)findViewById(R.id.bt_km);
        bt_km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c_km){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten);
                    text_4.setText(String.valueOf(ten)+"km");
                }
                else if(c_m){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten/1000);
                    text_4.setText(String.valueOf(ten/1000)+"km");
                }
                else if(c_dm){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten/10000);
                    text_4.setText(String.valueOf(ten/10000)+"km");
                }
                else if(c_cm){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten/100000);
                    text_4.setText(String.valueOf(ten/100000)+"km");
                }
                else if(c_mm){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten/1000000);
                    text_4.setText(String.valueOf(ten/1000000)+"km");
                }
            }
        });
        Button bt_m = (Button)findViewById(R.id.bt_m);
        bt_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c_km){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten*1000);
                    text_4.setText(String.valueOf(ten*1000)+"m");
                }
                else if(c_m){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten);
                    text_4.setText(String.valueOf(ten)+"m");
                }
                else if(c_dm){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten/10);
                    text_4.setText(String.valueOf(ten/10)+"m");
                }
                else if(c_cm){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten/100);
                    text_4.setText(String.valueOf(ten/100)+"m");
                }
                else if(c_mm){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten/1000);
                    text_4.setText(String.valueOf(ten/1000)+"m");
                }
            }
        });
        Button bt_dm = (Button)findViewById(R.id.bt_dm);
        bt_dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c_km){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten*10000);
                    text_4.setText(String.valueOf(ten*10000)+"dm");
                }
                else if(c_m){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten*10);
                    text_4.setText(String.valueOf(ten*10)+"dm");
                }
                else if(c_dm){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten);
                    text_4.setText(String.valueOf(ten)+"dm");
                }
                else if(c_cm){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten/10);
                    text_4.setText(String.valueOf(ten/10)+"dm");
                }
                else if(c_mm){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten/100);
                    text_4.setText(String.valueOf(ten/100)+"dm");
                }
            }
        });
        Button bt_cm = (Button)findViewById(R.id.bt_cm);
        bt_cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c_km){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten*100000);
                    text_4.setText(String.valueOf(ten*100000)+"cm");
                }
                else if(c_m){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten*100);
                    text_4.setText(String.valueOf(ten*100)+"cm");
                }
                else if(c_dm){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten*10);
                    text_4.setText(String.valueOf(ten*10)+"cm");
                }
                else if(c_cm){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten);
                    text_4.setText(String.valueOf(ten)+"cm");
                }
                else if(c_mm){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten/10);
                    text_4.setText(String.valueOf(ten/10)+"cm");
                }
            }
        });
        Button bt_mm = (Button)findViewById(R.id.bt_mm);
        bt_mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c_km){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten*1000000);
                    text_4.setText(String.valueOf(ten*1000000)+"mm");
                }
                else if(c_m){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten*1000);
                    text_4.setText(String.valueOf(ten*1000)+"mm");
                }
                else if(c_dm){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten*100);
                    text_4.setText(String.valueOf(ten*100)+"mm");
                }
                else if(c_cm){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten*10);
                    text_4.setText(String.valueOf(ten*10)+"mm");
                }
                else if(c_mm){
                    String input = e_2.getText().toString();
                    double ten = Double.valueOf(input);
                    System.out.println(ten);
                    text_4.setText(String.valueOf(ten)+"mm");
                }
            }
        });
    }
}
