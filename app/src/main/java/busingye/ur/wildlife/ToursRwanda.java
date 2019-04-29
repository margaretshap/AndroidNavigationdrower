package busingye.ur.wildlife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ToursRwanda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tours_rwanda);

        ArrayList<String> words = new ArrayList<String>();
        words.add("MealType: Chicken");
        words.add("MealTime: 2Hours");
        words.add("Ingredients: Meat");


        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView) ;
        TextView wordview = new TextView(this);
        wordview.setText(words.get(0));
        rootView.addView(wordview);

        TextView wordview2 = new TextView(this);
        wordview2.setText(words.get(2));
        rootView.addView(wordview2);
    }
}
