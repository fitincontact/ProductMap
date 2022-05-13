package com.fitincontact;

import org.junit.Test;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

public class PurchaseServiceTest {
    private final PurchaseService service = new PurchaseService();

    @Test
    public void tst_success_1() {
        var arguments = DataTest.get_1();
        var result = service.purchaseMap(arguments.productCodes(), arguments.productInfoMap());

        assertThat(result).hasSize(arguments.template().size());
        assertThat(new HashSet<>(result)).isEqualTo(arguments.template());
    }

    @Test
    public void tst_success_2() {
        var arguments = DataTest.get_2();
        var result = service.purchaseMap(arguments.productCodes(), arguments.productInfoMap());

        assertThat(result).hasSize(arguments.template().size());
        assertThat(new HashSet<>(result)).isEqualTo(arguments.template());
    }
}