package com.example.wy_final.data;

import com.example.wy_final.model.dust_material.FineDust;

import retrofit2.Callback;


public interface FineDustRepository {
    boolean isAvailable();
    void getFindDustData(Callback<FineDust> callback);


}
