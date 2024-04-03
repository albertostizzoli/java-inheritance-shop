package org.experis.inheritance;

public class Television extends Product{
    //Attributi
    private String dimensions;
    private boolean smart;

    //Costruttore
    public Television(int code, String name, String brand, double price, double iva, String dimensions, boolean smart){
        super(code, name, brand, price, iva);
        this.dimensions = dimensions;
        this.smart = smart;
    }

    // Metodi Getter e Setter specifici per Television
    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String detailsProduct(){
        return super.detailsProduct() + " Dimensioni = " + dimensions + " Smart = " + (smart  ? "true" : "false");
    }
}


