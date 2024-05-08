package com.crud_apiexample.restdemo.controller;

import com.crud_apiexample.restdemo.Model.CLoudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CLoudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CLoudVendor getCloudVendorDetails(String vendorId)
    {
        return cloudVendor;
//        return new CLoudVendor("C1","Vendor 1",
//                " Address 1","xxxxx");
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CLoudVendor cloudVendor)
    {
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor Created Successfully";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CLoudVendor cloudVendor)
    {
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping({"vendorId"})
    public String deleteCloudVendorDetails(String vendorId)
    {
        this.cloudVendor=null;
        return "Cloud Vendor Deleted Successfully";
    }
}

