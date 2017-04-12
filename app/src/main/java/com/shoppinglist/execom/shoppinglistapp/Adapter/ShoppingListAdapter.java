package com.shoppinglist.execom.shoppinglistapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.shoppinglist.execom.shoppinglistapp.MainActivity;
import com.shoppinglist.execom.shoppinglistapp.Model.ShoppingItem;
import com.shoppinglist.execom.shoppinglistapp.R;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mihajlo on 4/11/2017.
 */
@EBean
public class ShoppingListAdapter extends BaseAdapter {

    private ArrayList<ShoppingItem> items;

    private Context context;

    public ShoppingListAdapter(Context context){
        this.context = context;
    }

    public ArrayList<ShoppingItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<ShoppingItem> items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ShoppingItem shoppingItem = (ShoppingItem) getItem(position);

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.shopping_item, parent, false);
        }

        TextView itemName = (TextView) view.findViewById(R.id.textShoppingItem);
        TextView itemPrice = (TextView) view.findViewById(R.id.price);

        itemName.setText(shoppingItem.getName());
        itemPrice.setText(shoppingItem.getPrice());

        return view;
    }
}
