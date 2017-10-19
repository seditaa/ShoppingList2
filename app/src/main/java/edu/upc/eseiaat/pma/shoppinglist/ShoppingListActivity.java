package edu.upc.eseiaat.pma.shoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingListActivity extends AppCompatActivity {

    private ArrayList <String> itemList;
    private ArrayAdapter <String> adapter;

    private ListView list;
    private EditText edit_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);

        list = (ListView) findViewById(R.id.list);
        edit_item = (EditText) findViewById(R.id.edit_item);

        itemList = new ArrayList<>();
        itemList.add("embotits");
        itemList.add("gelats");
        itemList.add("fruita");
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,itemList);
        list.setAdapter(adapter);
    }

    public void add_item(View view) {

    }
}
