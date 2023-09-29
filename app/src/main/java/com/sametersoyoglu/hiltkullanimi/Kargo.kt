package com.sametersoyoglu.hiltkullanimi

import android.util.Log
import javax.inject.Inject

class Kargo  @Inject constructor(var adres : Adres){
    //val adres = Adres("Kadıköy / İSTANBUL") -  @Inject constructor(var adres : Adres) ile Dependecy Injection'a uygun şekilde yaptık.

    fun gonder() {
        Log.e("Sonuç", "Kargo ${adres.adresBilgisi} adresine gönderildi")
    }
}