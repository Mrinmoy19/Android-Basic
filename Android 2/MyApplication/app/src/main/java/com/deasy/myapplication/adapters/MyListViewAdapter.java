package com.deasy.myapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;

import com.deasy.myapplication.R;
import com.deasy.myapplication.models.ChatModel;

import java.util.List;

public class MyListViewAdapter extends ArrayAdapter {

    List<ChatModel> items;

    public MyListViewAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.items = objects;
    }

    @Nullable
    @Override
    public Object getItem(int position) {
//        return super.getItem(position);
        return items.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // We can access the mylistview layout after getting that in here
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.mylistview_layout,parent,false);

        TextView name =  convertView.findViewById(R.id.textView);
        TextView msg = convertView.findViewById(R.id.textView2);
        TextView time = convertView.findViewById(R.id.textView3);
        ImageView dp = convertView.findViewById(R.id.imageView);
        ImageView notificationImage = convertView.findViewById(R.id.imageView2);

        name.setText(items.get(position).name);
        msg.setText(items.get(position).message);
        time.setText(items.get(position).time);

//        dp.setImageResource("R.id.mrinmoy");

        if (!items.get(position).isNew)
        {
            notificationImage.setVisibility(View.GONE);
        }
//        return super.getView(position, convertView, parent);
        
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "You clicked on "+position, Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}
