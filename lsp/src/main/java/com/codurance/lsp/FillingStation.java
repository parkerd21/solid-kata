package com.codurance.lsp;

public class FillingStation {

    public void refuel(IPetrolPowered vehicle) {
      vehicle.fillUpWithFuel(); 
    }

    public void charge(IBatteryPowered vehicle) {
      vehicle.chargeBattery();
    }
}
