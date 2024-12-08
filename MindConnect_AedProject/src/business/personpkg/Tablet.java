/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.personpkg;

/**
 *
 * @author sameersdeshpande
 */
public class Tablet extends Person {
    private String tabletName;
    private String tabletContent;
    private String tabletDosage;
    private int quantity;
private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    Tablet(String name, String contents, String dosage, int price) {
        this.tabletName=name;
        this.tabletContent=contents;
        this.tabletDosage=dosage;
        this.price = price;
        
    }
 Tablet(String name, String contents, String dosage, int quant,int price) {
        this.tabletName=name;
        this.tabletContent=contents;
        this.tabletDosage=dosage;
        this.quantity = quant;
        this.price = price;
        
    }
    public String getTabletName() {
        return tabletName;
    }

    public void setTabletName(String tabletName) {
        this.tabletName = tabletName;
    }

    public String getTabletContent() {
        return tabletContent;
    }

    public void setTabletContent(String tabletContent) {
        this.tabletContent = tabletContent;
    }

    public String getTabletDosage() {
        return tabletDosage;
    }

    public void setTabletDosage(String tabletDosage) {
        this.tabletDosage = tabletDosage;
    }
}
