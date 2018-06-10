package com.example.wy_final.data;

import com.example.wy_final.model.dust_material.FineDust;
import com.example.wy_final.util.FineDustUtil;

import retrofit2.Callback;

public class LocationFineDustRepository implements FineDustRepository {

    private FineDustUtil mFineDustUtil;
    private double mLatitude;
    private double mLongitude;

    public LocationFineDustRepository() {
        mFineDustUtil = new FineDustUtil();

    }
    public LocationFineDustRepository(double lat, double lng) {
        this();
        this.mLatitude = lat;
        this.mLongitude = lng;
    }
    @Override
    public boolean isAvailable() {
        if (mLatitude != 0.0 && mLongitude != 0.0)
        {
            return true;
        }
        return false;
    }

    @Override
    public void getFindDustData(Callback<FineDust> callback) {
        mFineDustUtil.getApi().getFineDust(mLatitude, mLongitude)
                .enqueue(callback);

    }
}
