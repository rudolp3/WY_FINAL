package com.example.wy_final.finedust;

import com.example.wy_final.model.dust_material.FineDust;

public class FineDustContract {
    public interface View {
        void showFineDustResult(FineDust fineDust);
        void showLoadError(String message);
        void loadingStart();
        void loadingEnd();
        void reload(double lat, double lng);
    }
    interface UserActionsListener {
        void loadFineDustData();
    }
}
