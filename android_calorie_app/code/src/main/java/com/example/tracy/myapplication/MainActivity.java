package com.example.tracy.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

//import static com.example.tracy.myapplication.R.id.radioButton;
//import static com.example.tracy.myapplication.R.id.radioGroup;

public class MainActivity extends AppCompatActivity {

    Button   mButton;
    EditText mEdit;
    private RadioGroup rg;
    private RadioButton radioButton;
    Text rb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.exercise_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

//        RadioGroup rg = (RadioGroup) findViewById(R.id.radio);
//        addListenerOnButton();

        mEdit = (EditText) findViewById(R.id.editText);
        mButton = (Button) findViewById(R.id.button);


        mButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {

//                        RadioGroup rg = (RadioGroup) findViewById(R.id.radio);
//                        String radiovalue = ((RadioButton)findViewById(rg.getCheckedRadioButtonId())).getText().toString();


                        Spinner spinner = (Spinner) findViewById(R.id.spinner);
                        Integer inputval = Integer.valueOf(mEdit.getText().toString());
                        String text = spinner.getSelectedItem().toString();

                        TextView t1 = (TextView)findViewById(R.id.textView2);
//                        t1.setText(text);


                        if(text.equals("Push-Up (reps)")) {
                            float calburned = (float) (inputval * (100/350.0));
                            t1.setText(String.valueOf(inputval * (100/350.0)) + " calories burned" +
                            "\n Sit-Up equivalent: " + String.valueOf(calburned * 2) + " Reps" +
                            "\n Jumping Jacks equivalent: " + String.valueOf(calburned * .1) + " Minutes" +
                            "\n Running equivalent: " + String.valueOf(calburned * .12) + " Minutes"
                            );

                        }
                        else if (text.equals("Sit-Up (reps)")) {
                            float calburned = (float) (inputval * 100/200.0);
                            t1.setText(String.valueOf(calburned) + " calories burned" +
                                    "\n Push-Up equivalent: " + String.valueOf(calburned * 3.5) + " Reps" +
                                    "\n Jumping Jacks equivalent: " + String.valueOf(calburned * .1) + " Minutes" +
                                    "\n Running equivalent: " + String.valueOf(calburned * .12) + " Minutes");

                        }
                        else if (text.equals("Jumping Jacks (minutes)")) {
                            float calburned = (float) (inputval * 10);
                            t1.setText(String.valueOf(calburned) + " calories burned" +
                                    "\n Push-Up equivalent: " + String.valueOf(calburned * 3.5) + " Reps" +
                                    "\n Sit-Up equivalent: " + String.valueOf(calburned * 2) + " Reps" +
                                    "\n Running equivalent: " + String.valueOf(calburned * .12) + " Minutes");
                        }
                        else if (text.equals("Jogging (minutes)")) {
                            float calburned = (float) (inputval * (100/12.0));
                            t1.setText(String.valueOf(calburned) + " calories burned" +
                                    "\n Push-Up equivalent: " + String.valueOf(calburned * 3.5) + "Reps" +
                                    "\n Sit-Up equivalent" + String.valueOf(calburned * 2) + "Reps" +
                                    "\n Jumping Jacks equivalent" + String.valueOf(calburned * .1) + "Minutes");

                        }




//                        if(text == "Push Up" && radiovalue == "Reps"){
//
//                        }

//                        boolean checked = ((RadioButton) view).isChecked();
//                        boolean checked = radioButton.isChecked();
//                        switch(view.getId()) {
//                            case R.id.radio_reps:
//                                if (checked && text == "Push Up") {
//                                    Integer one_rep = 100 / 350;
//                                    t1.setText(inputval * one_rep);
//                                }
//
//                            case R.id.radio_minutes:
//                                if (checked)
//                                    break;
//                        }
                    }


                });




    }

//    private void addListenerOnButton() {
//        rg = (RadioGroup) findViewById(R.id.radioGroup);
//        int selectedID = rg.getCheckedRadioButtonId();
//        radioButton = (RadioButton) findViewById(selectedID);
//    }


}
