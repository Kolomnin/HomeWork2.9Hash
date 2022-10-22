package hw1plusHW2Task1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ProductList {
    private final Set<Product> productList;

    public ProductList() {
        productList = new HashSet<>();
    }

    public void addProduct(Product product)  {
        if (productList.equals(product)) {
            throw new RuntimeException("Этот продукту уже есть в сумке - " + product.getProductName());

        } else {
            productList.add(product);
        }
    }

    public void delProduct(Product product) {
        productList.remove(product);
    }
    public Double sumPriceProduct(){
        double sum = 0;
        for (Product product : productList) {
            sum += (product.getPrice() * product.getWeight());
        }

        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductList that = (ProductList) o;
        return Objects.equals(productList, that.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productList);
    }

    @Override
    public String toString() {
        return "\nСписок продуктов: " +
                productList + "\n";
    }
}