package org.experis.inheritance;

public class Smartphone extends Product {
    //Attirbuti
    private String code_imei;
    private int memory;

    //Costruttore
    public Smartphone(int code, String name, String brand, double price, double iva, String code_imei, int memory){
        super(code, name, brand, price, iva);
        this.code_imei = code_imei;
        this.memory = memory;
    }

    // Metodi Getter e Setter specifici per Smarphone
    public String getImei() {
        return code_imei;
    }

    public void setImei(String code_imei) {
        this.code_imei = code_imei;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}


