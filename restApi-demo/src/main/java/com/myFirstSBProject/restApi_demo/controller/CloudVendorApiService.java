package com.myFirstSBProject.restApi_demo.controller;

//com.myFirstSBProject.restApi_demo.model.CloudVendor
import com.myFirstSBProject.restApi_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorApiService {

    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getcloudVendorDetails(String vendorId){
        return cloudVendor;
        //return new CloudVendor("C1","Vendor 1","Add 1","xxx");


    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "Cloud vendor us created sucessufully";
    }

    @PutMapping
    public String updateCloudvendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "Cloud vendor updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudvendorDetails(String vendorId){
        //this.cloudVendor=null;
        return "Cloud vendor deleted Successfully";
    }

}

/*
Sample request:
get:
localhost:8080/cloudvendor/C1
output:
{
    "vendorId": "C1",
    "vendorname": "Vendor 1",
    "vendorAddress": "Add 1",
    "vendorPhoneNumber": "xxx"
}

post:
localhost:8080/cloudvendor
Input:
{
  "vendorId": "C2",
  "vendorname": "Vendor 2",
  "vendorAddress": "Add 2",
  "vendorPhoneNumber": "yyy"
}

output:
Cloud vendor us created sucessufully

put:
http://localhost:8080/cloudvendor
{
  "vendorId": "C2",
  "vendorname": "Vendor 23",
  "vendorAddress": "Add 23",
  "vendorPhoneNumber": "23456"
}

output:Cloud vendor updated Successfully
when we try to get this will be the output:
{
    "vendorId": "C2",
    "vendorname": "Vendor 23",
    "vendorAddress": "Add 23",
    "vendorPhoneNumber": "23456"
}
 */
