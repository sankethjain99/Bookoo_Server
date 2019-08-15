package com.example.bookooserver.Common;

import com.example.bookooserver.Model.Request;
import com.example.bookooserver.Model.User;
import com.example.bookooserver.Remote.APIService;
import com.example.bookooserver.Remote.FCMRetroFitClient;
import com.example.bookooserver.Remote.RetrofitClient;

public class Common {
    public static User currebtUser;
    public static Request currentRequest;
    public static String PHONE_TEXT = "userPhone";

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";
    public static final String convertCodeToStatus(String code)
    {
        if (code.equals("0"))
            return "placed";
        else if (code.equals("1"))
            return "will be given today";
        else
            return "Happy reading 8-)";

    }
    public static final String fcmUrl = "https://fcm.googleapis.com/";

    public static APIService getFCMService()
    {
        return FCMRetroFitClient.getClient(fcmUrl).create(APIService.class);
    }




}
