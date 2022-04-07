package repository;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import exceptions.JsonFileNotFoundException;
import models.Driver;

import java.io.FileNotFoundException;
import java.io.FileReader;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DriverRepository {
    private static Map<Integer, Driver> driverHashMap = new HashMap<>();

    public static Map<Integer, Driver> getDriverHashMap() {
        return driverHashMap;
    }

    static {
        Gson gson = new Gson();
        JsonReader jsonReader1 = null;
        JsonReader jsonReader = null;
        try {
            jsonReader = new JsonReader(
                    new FileReader("src/driver.json"));
        } catch (FileNotFoundException e) {
            throw new JsonFileNotFoundException("drivers.json doesn't not exists!");
        }

        Driver[] drivers = gson.fromJson(jsonReader, Driver[].class);
        for (Driver driver : drivers) {
            driverHashMap.put(driver.getId(), driver);
        }
    }
    public List<Driver> getAllDrivers(){
        return 
    }
}
