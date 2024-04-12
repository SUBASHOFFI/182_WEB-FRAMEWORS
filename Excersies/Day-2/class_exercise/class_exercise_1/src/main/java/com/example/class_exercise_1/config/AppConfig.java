package com.example.class_exercise_1.config;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.Configuration;
// import class_exercise_1.src.main.resources.application.properties.model;



@Configuration
public class AppConfig {
     @Value("Apple")
     public String appName;

     @Value("${model}")
     public String model;

     @Value("1.0.0")
     public String appVersion;
    

     public String getAppName() {
          return appName;
     }

     public void setAppName(String appName) {
          this.appName = appName;
     }

     public String getAppVersion() {
          return appVersion;
     }

     public void setAppVersion(String appVersion) {
          this.appVersion = appVersion;
     }


     
     
}
