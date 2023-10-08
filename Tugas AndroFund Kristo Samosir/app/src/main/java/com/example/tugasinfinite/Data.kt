package com.example.tugasinfinite

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(
    var nama: String,
    var umur:String,
    var berat:String
):Parcelable
