package com.bootcoding.project.utils;
import com.bootcoding.project.model.Vendor;

import java.util.Random;
public class VendorBuilder {
    private static final Random random = new Random();

    public static Vendor build() {
        Vendor vendor = new Vendor();
        // vendor.setVendorId(200 + random.nextInt(200));
        return vendor;
    }
}
