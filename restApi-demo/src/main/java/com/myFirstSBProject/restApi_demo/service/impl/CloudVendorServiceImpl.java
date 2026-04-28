package com.myFirstSBProject.restApi_demo.service.impl;

import com.myFirstSBProject.restApi_demo.model.CloudVendor;
import com.myFirstSBProject.restApi_demo.repository.CloudVendorRepository;
import com.myFirstSBProject.restApi_demo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    //we need to get the intsnace of repository layers which is actually talking to the database
    CloudVendorRepository cloudVendorRepository;

    //by this repo layer will interact with service layer by instanciating
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        //whatever cmg from this CloudVendor cloudVendor need to saved in repository layer: cloudVendor is an entity
        //data via repo layer will be saved in db by tis below line
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
