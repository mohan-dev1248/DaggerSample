package com.example.daggersample.data

import javax.inject.Inject

class CoffeeMaker {
    var heater: Heater
    var pump: Pump

    @Inject
    constructor(heater: Heater, pump: Pump){
        this.heater = heater
        this.pump = pump
    }

    fun brew(){
        println("Brewing Coffee!!!")
    }
}