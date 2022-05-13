package com.fitincontact;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.jetbrains.annotations.Nullable;

/**
 * Purchase Product Info
 */
public class PurchaseProductInfo {
    private final int version;
    @Nullable
    private String edition;
    private int quantity;

    public PurchaseProductInfo(int version) {
        this.version = version;
        addQuantity();
    }

    public PurchaseProductInfo(int version, @Nullable String edition) {
        this.version = version;
        this.edition = edition;
        addQuantity();
    }

    public int getVersion() {
        return version;
    }

    public @Nullable String getEdition() {
        return edition;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity() {
        this.quantity = this.quantity + 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        PurchaseProductInfo that = (PurchaseProductInfo) o;

        return new EqualsBuilder().append(version, that.version).append(quantity, that.quantity).append(edition, that.edition).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version).append(edition).append(quantity).toHashCode();
    }
}
