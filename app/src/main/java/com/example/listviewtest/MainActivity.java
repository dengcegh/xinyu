package com.example.listviewtest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit>fruitList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();//初始化水果数据
        FruitAdapter adapter =new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        //按下list_view响应事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit =fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getNote(),Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+fruit.getName()));
                startActivity(intent);
                finish();
            }
        });
    }

    private void initFruits(){

        Fruit mshcc =new Fruit("马淑慧长春号","15948062729",R.drawable.msh_pic);
        fruitList.add(mshcc);
        Fruit mshtn =new Fruit("马淑慧洮南号","13843613565",R.drawable.msh_pic);
        fruitList.add(mshtn);
        Fruit dwtz =new Fruit("邓伟台州号","17079627060",R.drawable.dw_pic);
        fruitList.add(dwtz);
        Fruit dwtn =new Fruit("邓伟洮南号","15843611028",R.drawable.dw_pic);
        fruitList.add(dwtn);
        Fruit lf1 =new Fruit("李芳移动号","13943011381",R.drawable.lf_pic);
        fruitList.add(lf1);
        Fruit lf2 =new Fruit("李芳联通号","15504448454",R.drawable.lf_pic);
        fruitList.add(lf2);
        Fruit dc =new Fruit("邓策就这号","18844131547",R.drawable.dc_pic);
        fruitList.add(dc);

    }
}