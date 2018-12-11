package com.example.beverly.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    //data container
    ArrayList<Person> list=new ArrayList<Person>();
    //adapter
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiate
        lv=(ListView) this.findViewById(R.id.listview1);
        adapter=new CustomAdapter(this,list);
        //populate the list
        list.add(new Person(R.drawable.andrea,"DURANO, Andrea","BSIT-3"));
        list.add(new Person(R.drawable.anne,"DURANO, Anne","BSIT-4"));
        list.add(new Person(R.drawable.barbie,"DURANO, Barbie","BSIT-2"));
        list.add(new Person(R.drawable.ella,"DURANO, Ella","BSIT-4"));
        list.add(new Person(R.drawable.janella,"DURANO, Janella","BSIT-3"));
        list.add(new Person(R.drawable.loisa,"DURANO, Loisa","BSIT-3"));
        list.add(new Person(R.drawable.maris,"DURANO, Maris","BSIT-3"));

        //delegate the adapter
        lv.setAdapter(adapter);
    }
}
