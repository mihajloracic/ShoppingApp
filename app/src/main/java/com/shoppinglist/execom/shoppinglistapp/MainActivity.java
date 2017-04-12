package com.shoppinglist.execom.shoppinglistapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.shoppinglist.execom.shoppinglistapp.Adapter.ShoppingListAdapter;
import com.shoppinglist.execom.shoppinglistapp.Model.ShoppingItem;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @ViewById(R.id.shoppingList)
    ListView shoppingList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @AfterViews
    void setAdapter(){

        ArrayList<ShoppingItem> shoppingItemsList = new ArrayList<ShoppingItem>();
        for (int i = 0;i < 50;i++){
            shoppingItemsList.add(new ShoppingItem("Rucak","50"));
        }
        ShoppingListAdapter shoppingListAdapter = new ShoppingListAdapter(this);
        shoppingListAdapter.setItems(shoppingItemsList);
        shoppingList.setAdapter(shoppingListAdapter);
    }
}
