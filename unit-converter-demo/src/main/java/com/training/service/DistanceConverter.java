package com.training.service;

public class DistanceConverter {

    public double convertKilometersToNauticalMiles(double distanceInKm){
        return distanceInKm * 1.852;
    }

    public double convertInchToCm(double value){
        throw new RuntimeException("not implemented");
    }

}
