package com.myFirstSBProject.restApi_demo.service;

import com.myFirstSBProject.restApi_demo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    //all methods that we want in business layer or service layer will be there here
    //we generally create a cv by giving the model and return String saying cv created
    public String createCloudVendor(CloudVendor cloudVendor);

    public String updateCloudVendor(CloudVendor cloudVendor);

    public String deleteCloudVendor(String cloudVendorId);

    //to get cv we can get by giving some specific vendor id
    public CloudVendor getCloudVendor(String cloudVendorId);

    //for getting all list of cloud vendors
    public List<CloudVendor> getAllCloudVendors();
}
