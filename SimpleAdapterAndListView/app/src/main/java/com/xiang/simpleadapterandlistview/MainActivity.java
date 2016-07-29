package com.xiang.simpleadapterandlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private String[] names=new String[]{"虎头","虎尾","虎手","虎牙"};
    private String[] desces=new  String[]{"这是虎牙","这是虎尾","这是虎手","这是虎牙"};
    private int[] image=new int[]{R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myListView= (ListView) findViewById(R.id.myListView);
        List<Map<String,Object>> lists=new ArrayList<Map<String, Object>>();
        for (int i = 0; i <names.length ; i++) {
            Map<String,Object> list=new HashMap<String, Object>();
            list.put("header",  image[i]);
            list.put("personName",  image[i]);
            list.put("desc",  image[i]);
            lists.add(list);
        }
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,lists, R.layout.list_item,new String[]{"header ","personName","desc"},new int[]{R.id.header,R.id.name,R.id.desc});
        myListView.setAdapter(simpleAdapter);
    }
}
