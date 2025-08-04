package com.springboot.rest_demo.controller;

import com.springboot.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    private CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable String vendorId) {
        return cloudVendor;
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {
        this.cloudVendor = cloudvendor;
        return "Cloud Vendor Created";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {
        this.cloudVendor = cloudvendor;
        return "Cloud Vendor Updated";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable String vendorId) {
        this.cloudVendor = null;
        return "Cloud Vendor Deleted";
    }
}
