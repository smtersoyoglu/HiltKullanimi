package com.sametersoyoglu.hiltkullanimi

import android.util.Log
import javax.inject.Inject

class Internet  @Inject constructor(var adres : Adres) {
    //val adres = Adres("Kadıköy / İSTANBUL") - bunu Dependecy Injection ile hilt ile yapıcaz. yukarda

    fun basvuruYap() {
        Log.e("Sonuç", "Internet başvurusu ${adres.adresBilgisi} adresine yapıldı.")
    }

}