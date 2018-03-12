package day16.nguyenntt.customlistviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import adapter.CustomAdapter;
import model.Dish;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Dish> dishList = new ArrayList<>();


        CustomAdapter adapter = new CustomAdapter(this, dishList);

        ListView listView = findViewById(R.id.list_dish);
        listView.setAdapter(adapter);

        dishList.add(new Dish("Cha ca", 3));
        dishList.add(new Dish("Cha gio", 2));
        dishList.add(new Dish("Cha chien", 1));

    }
}
