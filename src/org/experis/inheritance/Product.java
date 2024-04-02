package org.experis.inheritance;

public class Product {
    //Attributi
    private int code;
    private String name;
    private String brand;
    private double price;
    private double iva;

    //Costruttore
    public Product(int code, String name, String brand, double price, double iva) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = iva;
    }

    // Metodi Getter e Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    // Metodo per calcolare il prezzo comprensivo di IVA
    public double priceIva() {
        return price * (1 + iva);
    }

    // Metodo per ottenere una stringa formattata dei dettagli del prodotto
    public String detailsProduct() {
        return "Codice: " + code + ", Nome: " + name + ", Marca: " + brand + ", Prezzo: " + price + "€, IVA: " + iva * 100 + "%";
    }
}
