/**
 * Alex McLure
 * 2019-03-25
 */
package com.example.owner.recipe;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import java.util.LinkedList;
import com.example.owner.recipe.Recipe;
import com.example.owner.recipe.DataProvider;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {


    private LinkedList<Recipe> mRecipies = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private RecipeListAdapter rAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.mainRecycle);
        mRecipies = Recipe.getRecipes();
        rAdapter = new RecipeListAdapter(this,mRecipies);
        rAdapter.setParent(this);
        mRecyclerView.setAdapter(rAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void seeRecipe(Recipe recipe)
    {
        Intent intent = new Intent(this,Recipe_Show.class);
        intent.putExtra(Recipe.NAME,recipe.name);
        intent.putExtra(Recipe.DESCRIPTION, recipe.description);
        intent.putExtra(Recipe.DIRECTIONS, recipe.directions);
        intent.putExtra(Recipe.IMAGE, recipe.image);
        intent.putExtra (Recipe.INGREDIENTS, recipe.ingredients);
        startActivity(intent);
    }
}
