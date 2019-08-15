package com.example.bookooserver.Remote;



import com.example.bookooserver.Model.MyResponse;
import com.example.bookooserver.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(

            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAO0_aXmc:APA91bFSE5YxPp5A4oXP_Na2Q1OgCxZCCsZZ3M7neQUGcXwaPGe95z1TmodtenXbADtGixaoymaHKoutjctkgYdBDiSsQszgZK4PNIfbW3A_lc-YnDTiO3TH2d9jjYq77QkOGhW9Oiu0"
            }

    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);

}

