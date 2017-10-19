package edu.upc.eseiaat.pma.shoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

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

        edit_item.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                addItem();
                return true;
            }
        });
    }

    public void add_item(View view) {
        addItem();
    }

    private void addItem() {
        String item_text = edit_item.getText().toString();
        if(!item_text.isEmpty()){
            itemList.add(item_text);
            adapter.notifyDataSetChanged();
            edit_item.setText("");
        }
    }
}
