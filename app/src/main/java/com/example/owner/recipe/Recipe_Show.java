/**
 * Alex McLure
 * 2019-03-25
 */
package com.example.owner.recipe;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.owner.recipe.Recipe;

public class Recipe_Show extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_show);
        Intent intent = getIntent();
        TextView txtName = findViewById(R.id.Recipe_Name);
        TextView txtIngredients = findViewById(R.id.txt_ingredients);
        TextView txtDirections = findViewById(R.id.txt_directions);
        String rawName = intent.getStringExtra(Recipe.NAME);
        String rawIngredients = intent.getStringExtra(Recipe.INGREDIENTS);
        String rawDirections = intent.getStringExtra(Recipe.DIRECTIONS);
        String rawImage = intent.getStringExtra(Recipe.IMAGE);
        txtName.setText(rawName);
        txtIngredients.setText(rawIngredients);
        txtDirections.setText(rawDirections);
    }
}
