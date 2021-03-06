package com.nanioi.shoppingapplication.data.entity.product

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


/**
{
"id": "1",
"createdAt": "2021-04-23T19:44:11.102Z",
"product_name": "Handcrafted Fresh Keyboard",
"product_price": "263.00",
"product_image": "http://lorempixel.com/640/480/technics",
"product": "Bike"
"product_introduction_image" : ""
},
 */

@Entity
data class ProductEntity(
    val createdAt: Date,
    val productName: String,
    val productPrice: Int,
    val productType: String,
    val productImage: String,
    val productIntroductionImage: String,
    @PrimaryKey val id: Long
)

