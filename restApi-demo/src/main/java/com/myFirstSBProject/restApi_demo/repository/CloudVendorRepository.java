package com.myFirstSBProject.restApi_demo.repository;

import com.myFirstSBProject.restApi_demo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
    //JpaRepository<model class where tables are there, data type of id filed in model class>
}
