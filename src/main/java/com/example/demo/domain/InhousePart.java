package com.example.demo.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 *
 *
 *
 */
@Entity
@DiscriminatorValue("1")
public class InhousePart extends Part{
    int partId;

    public InhousePart() {
    }
    public InhousePart(String name, double price, int inv, int maxInventory, int minInventory) {
        super(name, price, inv, maxInventory, minInventory);
    }
    public InhousePart(String name, double price, int inv, int maxInventory, int minInventory, int partId) {
        super(name, price, inv, maxInventory, minInventory);
        this.partId = partId;
    }
    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }
}
