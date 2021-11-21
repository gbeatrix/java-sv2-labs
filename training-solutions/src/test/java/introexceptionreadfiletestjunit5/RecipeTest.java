package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {
    @Test
    void testAddIngredientsWithExistingFile(){
        Recipe recipe = new Recipe();
        recipe.addIngredients(Paths.get("src/test/resources/recipe.txt"));
        assertEquals(Arrays.asList("liszt", "margarin", "kristálycukor", "tojás", "citrom", "sütőpor", "vanillincukor", "tejföl", "alma", "fahéj"), recipe.getIngredients());
    }

    @Test
    void testAddIngredientsFileNotFound(){
        Recipe recipe = new Recipe();
        IllegalStateException err = assertThrows(IllegalStateException.class,
                () -> recipe.addIngredients(Paths.get("src/test/resources/testAddIngredientsFileNotFound.txt")));
        assertEquals("Hiba a fájl megnyitása során.", err.getMessage());
    }
}