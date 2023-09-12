package com.deasy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.deasy.myapplication.adapters.MyListViewAdapter;
import com.deasy.myapplication.models.ChatModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {


//    String[] arr =  {"Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8", "Item9", "Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8", "Item9"};
    private String[] names = {
            "Mrinmoy",
            "Puspal",
            "Deep",
            "Pranay",
            "Sankha",
            "Honey",
            "Sidhu",
            "Rajdip",
            "Mamu",
            "Nata",
            "Anindita",
            "Priyanka"
    };

    private String[] messages = {
            "This is test message 1",
            "This is test message 2",
            "This is test message 3",
            "This is test message 4",
            "This is test message 5",
            "This is test message 6",
            "This is test message 7",
            "This is test message 8",
            "This is test message 9",
            "This is test message 10",
            "This is test message 11",
            "This is test message 12",
    };

    private boolean[] newMessage = {
            true,
            true,
            true,
            true,
            false,
            true,
            true,
            true,
            false,
            false,
            false,
            false,
    };

    private String[] imagePaths = {
            "mrinmoy",
            "ic_launcher_foreground",
            "ic_launcher_foreground",
            "ic_launcher_foreground",
            "ic_launcher_foreground",
            "ic_launcher_foreground",
            "ic_launcher_foreground",
            "ic_launcher_foreground",
            "ic_launcher_foreground",
            "ic_launcher_foreground",
            "ic_launcher_foreground",
            "ic_launcher_foreground",
    };

    private List<ChatModel> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<ChatModel>();
        for(int i=0; i < names.length; i++)
        {
            items.add(new ChatModel(names[i],messages[i],newMessage[i],imagePaths[i]));
        }

        ListView listView = findViewById(R.id.listview);
//        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "You clicked on "+arr[position], Toast.LENGTH_SHORT).show();
//
//            }
//        });
//        listView.setAdapter(arrayAdapter);

        MyListViewAdapter myListViewAdapter = new MyListViewAdapter(this,R.layout.mylistview_layout,items);
        listView.setAdapter(myListViewAdapter);

    }
}