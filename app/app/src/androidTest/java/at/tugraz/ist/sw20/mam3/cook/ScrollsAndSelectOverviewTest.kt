package at.tugraz.ist.sw20.mam3.cook


import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import at.tugraz.ist.sw20.mam3.cook.model.dao.RecipeDAO
import at.tugraz.ist.sw20.mam3.cook.model.database.CookDB
import at.tugraz.ist.sw20.mam3.cook.model.entities.Recipe
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException


@RunWith(AndroidJUnit4::class)

class ScrollsAndSelectOverviewTest {
    private lateinit var recipeDao: RecipeDAO
    private var db: CookDB = CookDB.getTestDB(ApplicationProvider.getApplicationContext<Context>())!!

    @get:Rule
    val intentsTestRule = IntentsTestRule(MainActivity::class.java)


    @Before
    fun setup() {
        //val context = ApplicationProvider.getApplicationContext<Context>()
        //db = CookDB.getTestDB(context)!!
        recipeDao = db.recipeDao()

        addTestRecipes()
    }

    fun addTestRecipes() {
        var recipe = Recipe(0, "Burger", "...", "...","...",
            10, 5,true)
        recipeDao.insertRecipe(recipe)

        recipe = Recipe(0, "Pizza", "...", "...","...",
            30, 10,true)
        recipeDao.insertRecipe(recipe)

        recipe = Recipe(0, "Pasta", "...", "...","...",
            1, 15,false)
        recipeDao.insertRecipe(recipe)

        recipe = Recipe(0, "Knödel", "...", "...","...",
            20, 10,false)
        recipeDao.insertRecipe(recipe)

        recipe = Recipe(0, "Schnitzel", "...", "...","...",
            15, 5,false)
        recipeDao.insertRecipe(recipe)

        recipe = Recipe(0, "Salami Pizza", "...", "...","...",
            40, 10,true)
        recipeDao.insertRecipe(recipe)
    }

    @After
    @Throws(IOException::class)
    fun cleanup() {
        db.close()
        CookDB.destroyDataBase()
    }

    @Test
    fun behaviorTest() {
        //onData(allOf(`is`(instanceOf(String::class.java)), `is`("Schnitzel"))).inAdapterView(withId(R.id.list_recipes)).perform(click())
        //onData(anything()).inAdapterView(withId(R.id.list_recipes)).atPosition(5).perform(click())
        //onData(anything()).inAdapterView(withId(R.id.list_recipes)).atPosition(5).perform(swipeUp())
    }

}