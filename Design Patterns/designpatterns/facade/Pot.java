package designpatterns.facade;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ohad Klein
 */
public class Pot {
    private boolean isFilledWithWater = false;
    private boolean isHeated = false;
    private Map<Ingredient, Boolean> ingredientMap = new HashMap<>(); // value - is the ingredient mixed

    public void fillWithWater() {
        isFilledWithWater = true;
    }

    public void heat() {
        this.isHeated = true;
    }

    public void cool() {
        this.isHeated = false;
    }

    public void insert(Ingredient ingredient) {
        ingredientMap.put(ingredient, false);
    }

    public void mix() {
        if (isHeated) {
            for (Ingredient ingredient : ingredientMap.keySet()) {
                ingredientMap.put(ingredient, true);
            }
        }
    }

    public void extract(Ingredient ingredient) {
        if (ingredientMap.get(ingredient) && !isHeated) {
            ingredient.makeReady();
            ingredientMap.remove(ingredient);
        }
    }
}
