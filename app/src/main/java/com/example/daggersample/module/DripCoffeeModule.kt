package com.example.daggersample.module

import com.example.daggersample.data.ElectricHeater
import com.example.daggersample.data.Heater
import com.example.daggersample.data.Pump
import com.example.daggersample.data.Thermosiphon
import dagger.Module
import dagger.Provides

@Module
class DripCoffeeModule {

    @Provides fun providePump(pump: Thermosiphon): Pump {
        return pump
    }

    @Provides fun provideHeater(heater: ElectricHeater): Heater {
        return heater
    }
}