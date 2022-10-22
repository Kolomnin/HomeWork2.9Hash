package hw1plusHW2Task1;

import java.util.Objects;

public class Product {
    private final String productName;
    private double price;
    private Double weight;

    public Product(String productName, Double price, Double weight) {
        if (productName == null || productName.isBlank()) {
            throw new RuntimeException("Укажите название продукта");
        } else {
            this.productName = productName;}
        this.price = price;
        this.weight = weight;
    }
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price == null || price < 0) {
            throw new RuntimeException("Укажите цену");
        } else {
            this.price = price;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        if (weight == null || weight < 0) {
            throw new RuntimeException("Укажите вес");
        } else {
            this.weight = weight;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(productName, product.productName) && Objects.equals(weight, product.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, price, weight);
    }

    @Override
    public String toString() {
        return "\n"+ productName +
                ", цена = " + price +
                ", вес = " + weight;
    }
}