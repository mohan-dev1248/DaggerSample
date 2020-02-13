package com.example.daggersample.component

import com.example.daggersample.data.CoffeeMaker
import dagger.Component
import com.example.daggersample.module.DripCoffeeModule
import com.example.daggersample.scope.CoffeeScope

@CoffeeScope
@Component( modules = [DripCoffeeModule::class])
interface CoffeeShop {
    var maker: CoffeeMaker
}