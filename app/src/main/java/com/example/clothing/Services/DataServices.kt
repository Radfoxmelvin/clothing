package com.example.clothing.Services

import com.example.clothing.model.Product
import com.example.clothing.model.Category

object DataServices{

    val  category = listOf(
        Category("Red","dress01,dress06,dress09"),
        Category("Blue","dress07,dress02,dress09"),
        Category("Other Colors","dress03,dress04,dress05"),
        Category("Hats","hat05,hat09,hat02",)

    )

    val blueDress = listOf(
        Product("Blue1","R499.99","dress07"),
        Product("Blue2","R379,99","dress02"),
        Product("Blue","R289,99","dress09")

    )
    val otherColors= listOf(
        Product("Color01","R599.99","dress07"),
        Product("Color02","R479,99","dress02"),
        Product("Color3","R689,99","dress09")

    )
    val hats= listOf(
        Product("Unit","R150","hat05"),
        Product("Hat set 01","R340","hat09"),
        Product("Hat set 02","R289,99","hat02")

    )
}