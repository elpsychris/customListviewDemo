package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import day16.nguyenntt.customlistviewdemo.R;
import model.Dish;

/**
 * Created by elpsychris on 03/12/2018.
 */

public class CustomAdapter extends ArrayAdapter<Dish>{
    public CustomAdapter(Context context, ArrayList<Dish> dishes) {
        super(context, 0, dishes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Get dish in this position
        Dish dish = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_dish, parent, false);
        }

        // Populate data to view
        TextView tvDishName = convertView.findViewById(R.id.tv_dish_name);
        TextView tvDishQuan = convertView.findViewById(R.id.tv_dish_quan);

        tvDishName.setText(dish.getName());
        tvDishQuan.setText("x" + dish.getQuan());

        return convertView;
    }
}
