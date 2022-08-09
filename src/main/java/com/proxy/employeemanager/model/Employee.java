package com.proxy.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(nullable = false, updatable = false)
     public Long id;
     public String name;
     public String email;
     public String jobTitle;
     public String phone;
     public String imageUrl;
     @Column(nullable = false, updatable = false)
     public String employeeCode;

     public Employee() {}

     public Employee(String name, String email, String jobTitle, String phone, String imageUrl, String employeeCode) {
          this.name = name;
          this.email = email;
          this.jobTitle = jobTitle;
          this.phone = phone;
          this.imageUrl = imageUrl;
          this.employeeCode = employeeCode;
     }

     public Long getId() {
          return id;
     }

     public Employee setId(Long id) {
          this.id = id;
          return this;
     }

     public String getName() {
          return name;
     }

     public Employee setName(String name) {
          this.name = name;
          return this;
     }

     public String getEmail() {
          return email;
     }

     public Employee setEmail(String email) {
          this.email = email;
          return this;
     }

     public String getJobTitle() {
          return jobTitle;
     }

     public Employee setJobTitle(String jobTitle) {
          this.jobTitle = jobTitle;
          return this;
     }

     public String getPhone() {
          return phone;
     }

     public Employee setPhone(String phone) {
          this.phone = phone;
          return this;
     }

     public String getImageUrl() {
          return imageUrl;
     }

     public Employee setImageUrl(String imageUrl) {
          this.imageUrl = imageUrl;
          return this;
     }

     public String getEmployeeCode() {
          return employeeCode;
     }

     public Employee setEmployeeCode(String employeeCode) {
          this.employeeCode = employeeCode;
          return this;
     }
}
