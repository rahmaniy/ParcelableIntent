package com.nr.excerciseintent

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    val nama: String?,
    val umur: Int,
    val email: String?,
    val domisili: String?,
    val statusMenikah: Boolean
    ): Parcelable {

}

