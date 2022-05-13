package com.fitincontact;

import org.jetbrains.annotations.Nullable;

/**
 * Product Info
 */
public class ProductInfo {
    private final int version;
    @Nullable
    private String edition;

    public ProductInfo(int version, @Nullable String edition) {
        this.version = version;
        this.edition = edition;
    }

    public ProductInfo(int version) {
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    public @Nullable String getEdition() {
        return edition;
    }
}
