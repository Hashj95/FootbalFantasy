package com.example.administrator.footbalfantasy;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;


public class MainActivity extends Activity {


    EditText firstName;
    EditText lastName;
    EditText uniformNum;
    EditText teamName;


    Button addPlayer;
    Button findPlayer;
    Button deletePlayer;

    // spinner
    private ArrayList<String> teamVec; // array of teams
    ArrayAdapter<String> adapter; // spinner's adapter
    Spinner spinner; // spinner object

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = (EditText) findViewById(R.id.first_name_field);
        lastName = (EditText) findViewById(R.id.last_name_field);
        uniformNum = (EditText) findViewById(R.id.uniform_num_field);
        teamName = (EditText) findViewById(R.id.team_name_field);


        addPlayer = (Button) findViewById(R.id.add_player_button);
        deletePlayer = (Button) findViewById(R.id.delete_player_button);
        findPlayer = (Button) findViewById(R.id.find_player_button);

        spinner = (Spinner) findViewById(R.id.team_list);

        deletePlayer.setOnClickListener(new RemoveButtonListener());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private class RemoveButtonListener implements View.OnClickListener {
        /**
         * respond to the press of the "Remove" button
         *
         * @see android.view.View.OnClickListener#onClick(android.view.View)
         */
        @Override
        public void onClick(View view) {
            // get the relevant data from the text fields
            String first = firstName.getText().toString();
            String last = lastName.getText().toString();


        }
    }

}
