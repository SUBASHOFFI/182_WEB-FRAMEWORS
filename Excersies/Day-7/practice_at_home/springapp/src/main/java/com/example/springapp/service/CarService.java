package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Car;
import com.example.springapp.repository.CarRepo;

@Service
public class CarService {
    @Autowired
    private CarRepo carRepo;

    public boolean post(Car car)
    {
        try
        {
            carRepo.save(car);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<Car> getAll()
    {
        return carRepo.findAll();
    }

    public Car getByDetails(String currentOwnerName, String address)
    {
        try{
        return carRepo.findDistinctBycurrentOwnerNameAndAddress(currentOwnerName, address);
        }
        catch(IncorrectResultSizeDataAccessException i)
        {
            System.out.println("\n\n"+i+"\n\nUse List if needed");
            return null;
        }
        catch(Exception e)
        {
            System.out.println("\n\n"+e);
            return null;
        }
    }
    
}
