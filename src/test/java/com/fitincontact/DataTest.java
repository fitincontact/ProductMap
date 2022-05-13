package com.fitincontact;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Data for test
 */
public class DataTest {

    static Arguments get_1() {
        //Arguments
        List<ProductCode> productCodes = List.of(ProductCode.CVCD, ProductCode.SDFD, ProductCode.SDFD, ProductCode.DDDF);
        var productInfoMap = new HashMap<ProductCode, ProductInfo>();
        productInfoMap.put(ProductCode.CVCD, new ProductInfo(1, "X"));
        productInfoMap.put(ProductCode.SDFD, new ProductInfo(2, "Z"));
        productInfoMap.put(ProductCode.DDDF, new ProductInfo(1));

        //template
        var info3 = new PurchaseProductInfo(2, "Z");
        info3.addQuantity();
        var template = Set.of(new PurchaseProductInfo(1, "X"), new PurchaseProductInfo(1), info3);

        return new Arguments(productCodes, productInfoMap, template);
    }

    static Arguments get_2() {
        //Arguments
        List<ProductCode> productCodes = List.of(ProductCode.CVCD, ProductCode.SDFD, ProductCode.SDFD);
        var productInfoMap = new HashMap<ProductCode, ProductInfo>();
        productInfoMap.put(ProductCode.CVCD, new ProductInfo(1, "X"));
        productInfoMap.put(ProductCode.SDFD, new ProductInfo(2, "Z"));
        productInfoMap.put(ProductCode.DDDF, new ProductInfo(1));

        //template
        var info3 = new PurchaseProductInfo(2, "Z");
        info3.addQuantity();
        var template = Set.of(new PurchaseProductInfo(1, "X"), info3);

        return new Arguments(productCodes, productInfoMap, template);
    }

    record Arguments(List<ProductCode> productCodes, Map<ProductCode, ProductInfo> productInfoMap,
                     Set<PurchaseProductInfo> template) {
    }
}