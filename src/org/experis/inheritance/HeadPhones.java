package org.experis.inheritance;

public class HeadPhones extends Product{
    //Attributi
    private String colour;
    private boolean wireless;

    //Costruttore
    public HeadPhones(int code, String name, String brand, double price, double iva, String colour, boolean wireless){
        super(code, name, brand, price, iva);
        this.colour = colour;
        this.wireless = wireless;
    }

    // Metodi Getter e Setter specifici per HeadPhones
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String detailsProduct(){
        return super.detailsProduct() + " Colore = " + colour + " Wireless = " + (wireless ? "true" : "false");
    }
}
