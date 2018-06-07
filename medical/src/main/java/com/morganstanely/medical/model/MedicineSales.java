package com.morganstanely.medical.model;

import javax.persistence.*;

@Entity
public class MedicineSales {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long invoice;
    private String buyerNmae;
    private Double amountPaid;
    @OneToMany
    private Medicine medicine;

    public MedicineSales() {
    }

    public MedicineSales(String buyerNmae, Double amountPaid, Medicine medicine) {
        this.buyerNmae = buyerNmae;
        this.amountPaid = amountPaid;
        this.medicine = medicine;
    }

    public Long getInvoice() {
        return invoice;
    }

    public void setInvoice(Long invoice) {
        this.invoice = invoice;
    }

    public String getBuyerNmae() {
        return buyerNmae;
    }

    public void setBuyerNmae(String buyerNmae) {
        this.buyerNmae = buyerNmae;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MedicineSales that = (MedicineSales) o;

        return invoice != null ? invoice.equals(that.invoice) : that.invoice == null;
    }

    @Override
    public int hashCode() {
        return invoice != null ? invoice.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "MedicineSales{" +
                "invoice=" + invoice +
                ", buyerNmae='" + buyerNmae + '\'' +
                ", amountPaid=" + amountPaid +
                ", medicine=" + medicine +
                '}';
    }
}
