package com.fitincontact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Purchase Service
 */
public class PurchaseService {

    /**
     * Map Product Codes to Product Info with count Product Codes
     * @param productCodes Product Codes
     * @param productInfoMap Product Info Map
     * @return Purchase Product Info List
     */
    public List<PurchaseProductInfo> purchaseMap(
            final List<ProductCode> productCodes,
            final Map<ProductCode, ProductInfo> productInfoMap
    ) {
        final var purchaseProductInfoMap = new HashMap<ProductCode, PurchaseProductInfo>();

        for (final var productCode : productCodes) {
            final var purchaseProductInfo = purchaseProductInfoMap.get(productCode);
            if (purchaseProductInfo != null) {
                purchaseProductInfo.addQuantity();
            } else {
                var productInfo = productInfoMap.get(productCode);
                if (productInfo.getEdition() == null) {
                    purchaseProductInfoMap.put(productCode, new PurchaseProductInfo(productInfo.getVersion()));
                } else {
                    purchaseProductInfoMap.put(productCode, new PurchaseProductInfo(productInfo.getVersion(), productInfo.getEdition()));
                }
            }
        }

        return new ArrayList<>(purchaseProductInfoMap.values());
    }

}