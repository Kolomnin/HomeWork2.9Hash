package hw1plusHW2Task1;


import java.util.Objects;

public class Product {
    private final String productsName;
    private double price;
    private Double weight;


    public Product(String productsName, Double price, Double weight) {
        if (productsName == null || productsName.isBlank()) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.productsName = productsName;}
        this.price = price;
        this.weight = weight;
    }
    public String getProductsName() {
        return productsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price == null || price < 0) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.price = price;
        }
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        if (weight == null || weight < 0) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.weight = weight;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(productsName, product.productsName) && Objects.equals(weight, product.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productsName, price, weight);
    }

    @Override
    public String toString() {
        return "{" + productsName +
                ", цена = " + price +
                ", вес = " + weight +
                '}' + "\n";
    }
}