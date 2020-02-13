import com.example.daggersample.component.DaggerCoffeeShop

fun main(){
    val coffeeShop = DaggerCoffeeShop.create().maker

    //I am just checking the object is created or not
    println(coffeeShop.toString())
    coffeeShop.brew()
}