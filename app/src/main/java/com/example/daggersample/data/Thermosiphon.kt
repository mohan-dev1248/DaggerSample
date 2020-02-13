package com.example.daggersample.data

import javax.inject.Inject

class Thermosiphon : Pump {
    private val heater: Heater

    @Inject
    constructor(heater: Heater){
        this.heater = heater
    }
}