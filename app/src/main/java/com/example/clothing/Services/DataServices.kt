package com.example.clothing.Services

import com.example.clothing.model.Product
import com.example.clothing.model.Category

object DataServices{

    val  categories = listOf(
        Category("Red","reddress01"),
        Category("Blue","blu01"),
        Category("Other Colors","pinkdress"),
        Category("Hats","hatpng"),
        Category("Red01","reddress01"),
    Category("Blue01","blu01"),
    Category("Other Colors01","pinkdress"),
    Category("Hats01","hatpng")

    )

    val blueDress = listOf(
        Product("Blue traditional(African01)","R499.99","blue02"),
        Product("Sky blue stylish","R379,99","blue03"),
        Product("Blue and red stripe","R289,99","blu01")

    )
    val otherColors= listOf(
        Product("Purple","R599.99","pinkdress"),
        Product("Green","R479,99","greendress")

    )
    val hats= listOf(
        Product("Unit","R150","hatpng"),
        Product("Hat set 01","R340","hatcol01"),
        Product("Hat set 02","R289,99","hatcol02")

    )
    val  categories01 = listOf(
        Category("Red","reddress01"),
        Category("Blue","blu01"),
        Category("Other Colors","pinkdress"),
        Category("Hats","hatpng")

    )

    val blueDress01 = listOf(
        Product("Blue traditional(African01)","R499.99","blue02"),
        Product("Sky blue stylish","R379,99","blue03"),
        Product("Blue and red stripe","R289,99","blu01")

    )
    val otherColors01= listOf(
        Product("Purple","R599.99","pinkdress"),
        Product("Green","R479,99","greendress")

    )
    val hats01= listOf(
        Product("Unit","R150","hatpng"),
        Product("Hat set 01","R340","hatcol01"),
        Product("Hat set 02","R289,99","hatcol02")

    )
}