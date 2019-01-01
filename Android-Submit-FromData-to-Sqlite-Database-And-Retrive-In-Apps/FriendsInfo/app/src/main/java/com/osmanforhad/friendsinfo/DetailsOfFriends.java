package com.osmanforhad.friendsinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsOfFriends extends AppCompatActivity {
    //Create an object
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_of_friends);
        //Initial the XML Layout within tv object
         tv = (TextView) findViewById(R.id.show_data);
         //Create an object for calling DbFunctions class
        DbFunctions df = new DbFunctions(getApplicationContext());
        /*Declare an String array and call display_data
        for fetch data from display_data Method
        which is written within DbFunctions class*/
        String[] data = df.display_data();
        /*Print 1st data from database using array
        tv.setText(data[0]);*/

        //Operation for Display All data from sqlite Db
        String store = ""; //Declare String variable
        for(int info=0; info<data.length; info++){
            /*assign info into String variable
             through data which contain Db Query*/
            store = store+data[info]+"\n\n";
        }
        //Display all data form db table through the looping
        tv.setText(store);
    }
}
