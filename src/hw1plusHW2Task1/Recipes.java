package hw1plusHW2Task1;

import java.util.Objects;

public class Recipes {
    private final String recipesName;
    private final Double recipesPrice;
    private final ProductList productList;;

    public Recipes(String recipesName, ProductList productList) {
        if (recipesName == null || recipesName.isBlank()) {
            this.recipesName = "recipesName is incorrect";
        } else {
            this.recipesName = recipesName;
        }
        this.productList = productList;
        recipesPrice = productList.sumPriceProduct();
    }

    public String getRecipesName() {
        return recipesName;
    }

    public Double getRecipesPrice() {
        return recipesPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return Objects.equals(recipesName, recipes.recipesName) &&
               Objects.equals(recipesPrice, recipes.recipesPrice) &&
               Objects.equals(productList, recipes.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipesName, recipesPrice, productList);
    }

    @Override
    public String toString() {
        return "\nРецепт: " +
                "назввание - " + recipesName +
                ", стоимость - " + recipesPrice + productList;
    }
}