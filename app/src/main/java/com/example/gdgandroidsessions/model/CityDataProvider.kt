package com.example.gdgandroidsessions.model

import com.example.gdgandroidsessions.R

class CityDataProvider {
    private val cities = arrayListOf<City>()

    init {
        cities.add(City("Nairobi", R.drawable.nairobi, 1_500_000))
        cities.add(City("Kiambu", R.drawable.kiambu, 1_100_000))
        cities.add(City("Kisumu", R.drawable.kisumu, 1_900_000))
        cities.add(City("Kwale", R.drawable.kwale, 400_000))
        cities.add(City("Makueni", R.drawable.makueni, 2_100_000))
        cities.add(City("Mombasa", R.drawable.mombasa, 3_700_000))
        cities.add(City("Nakuru", R.drawable.nakuru, 1_800_000))
        cities.add(City("Turkana", R.drawable.turkana, 700_000))

    }

    fun getCities() = cities
}