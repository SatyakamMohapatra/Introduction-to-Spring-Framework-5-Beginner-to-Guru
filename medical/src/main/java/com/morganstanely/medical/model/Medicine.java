package com.morganstanely.medical.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    private String name;
    private Double price;
    private String Manufacturer;
    private String cataegory;
    private String genericName;
    private long quantity;
    private Date expiryDate;
    private long stock;


    public Medicine() {
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    public Medicine(Long ID, String name, Double price, String manufacturer, String cataegory, String genericName, long quantity, Date expiryDate) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        Manufacturer = manufacturer;
        this.cataegory = cataegory;
        this.genericName = genericName;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getCataegory() {
        return cataegory;
    }

    public void setCataegory(String cataegory) {
        this.cataegory = cataegory;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Medicine medicine = (Medicine) o;

        return ID != null ? ID.equals(medicine.ID) : medicine.ID == null;
    }

    @Override
    public int hashCode() {
        return ID != null ? ID.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", cataegory='" + cataegory + '\'' +
                ", genericName='" + genericName + '\'' +
                ", quantity=" + quantity +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
