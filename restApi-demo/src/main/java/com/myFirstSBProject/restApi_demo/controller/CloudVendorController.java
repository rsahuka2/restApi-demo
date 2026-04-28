package com.myFirstSBProject.restApi_demo.controller;

import com.myFirstSBProject.restApi_demo.model.CloudVendor;
import com.myFirstSBProject.restApi_demo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    /* we done want this cloudVendor instance because we written the logic in service so we can in
    instantiate that
    CloudVendor cloudVendor;
     */
// this is service instance
    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    //read specific cloud vendor details
    @GetMapping("{vendorId}")
    public CloudVendor getcloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId);
        // what ever vendor if cmg fro this @GetMapping("{vendorId}") should be pasing here @PathVariable("vendorId") String vendorId) and using here getCloudVendor(vendorId);

        //return new CloudVendor("C1","Vendor 1","Add 1","xxx");

    }

    //read all cloud vendor details from db
    @GetMapping()
    public List<CloudVendor> getAllcloudVendorDetails(){
        return cloudVendorService.getAllCloudVendors();

    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud vendor us created sucessufully";
    }

    @PutMapping
    public String updateCloudvendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud vendor updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudvendorDetails(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
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
output:
Ameenpur	V1	9346916169	Reshma
America	    V2	8328532548	Karishma
Sondipeta	V4	9849767353_updated	Dharmarao
 */
