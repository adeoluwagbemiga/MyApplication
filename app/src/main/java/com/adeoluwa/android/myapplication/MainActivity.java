package com.adeoluwa.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//Create Variables to hold the reference to the view elements in you activity_main layout
    TextView mMyTextView;
    EditText mMyEditText;
    Button mMyButton;
    int mynumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign the view element variables as you reference the views in the
        // layout using findViewById and casting it into the view element.
        mMyButton = (Button)findViewById(R.id.my_button);
        mMyEditText = (EditText)findViewById(R.id.my_edit_text);
        mMyTextView = (TextView)findViewById(R.id.my_textview_display);
        mynumber = 9;

        //implement setOnClickListener for the button view as shown below and call the
        // submitOrder method inside the onClick override method of the implementation
        mMyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //call the submitOrder method
                submitOrder();
            }
        });

    }

    //Create a method to setText for the TextView on the layout to the value of the EditText entered.
    void submitOrder(){
        //get value of edit text
        String valueOfEditText = mMyEditText.getText().toString();
        //setText for Display TextView
        mMyTextView.setText(valueOfEditText);
    }

}
