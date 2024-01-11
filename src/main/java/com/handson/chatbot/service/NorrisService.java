package com.handson.chatbot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class NorrisService {

    OkHttpClient client = new OkHttpClient().newBuilder()
            .build();

    @Autowired
    ObjectMapper om = new ObjectMapper();

    public Integer getRes() throws IOException{
        Request request = new Request.Builder()
                .url("https://api.chucknorris.io/jokes/search?query=big")
                .method("GET", null)
                .addHeader("authority", "www.amazon.com")
                .addHeader("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
                .addHeader("accept-language", "en-US,en;q=0.9")
                .addHeader("cookie", "aws-ubid-main=960-5506072-2027073; aws-account-alias=995553441267; remember-account=true; regStatus=registered; aws-target-data=%7B%22support%22%3A%221%22%7D; aws-target-visitor-id=1703158220040-739550.44_0; session-id-time=2082787201l; i18n-prefs=USD; ubid-main=131-1280579-1003447; aws-userInfo=%7B%22arn%22%3A%22arn%3Aaws%3Aiam%3A%3A995553441267%3Auser%2Froeet%22%2C%22alias%22%3A%22995553441267%22%2C%22username%22%3A%22roeet%22%2C%22keybase%22%3A%221FGaVcFhhaP6XeDrMe33OC7acpgePZgK93jrJQXljAE%5Cu003d%22%2C%22issuer%22%3A%22http%3A%2F%2Fsignin.aws.amazon.com%2Fsignin%22%2C%22signinType%22%3A%22PUBLIC%22%7D; aws-userInfo-signed=eyJ0eXAiOiJKV1MiLCJrZXlSZWdpb24iOiJ1cy1lYXN0LTIiLCJhbGciOiJFUzM4NCIsImtpZCI6IjIzMjI3NDlhLTM1MWQtNDc4NS1hOGUzLTMwMTMwNWQ3NmMzMCJ9.eyJzdWIiOiI5OTU1NTM0NDEyNjciLCJzaWduaW5UeXBlIjoiUFVCTElDIiwiaXNzIjoiaHR0cDpcL1wvc2lnbmluLmF3cy5hbWF6b24uY29tXC9zaWduaW4iLCJrZXliYXNlIjoiMUZHYVZjRmhoYVA2WGVEck1lMzNPQzdhY3BnZVBaZ0s5M2pySlFYbGpBRT0iLCJhcm4iOiJhcm46YXdzOmlhbTo6OTk1NTUzNDQxMjY3OnVzZXJcL3JvZWV0IiwidXNlcm5hbWUiOiJyb2VldCJ9.87UPPMNsK282J0a-XNot8B0pHvb7cqLdBb12THNa-BLi2E_7-ypdzkeMWQZI42yvdlstz1uC3Hs8TMGLlFiAz-EAM40oGvwgpCcN8G67TKuF30Sq6KfrcACcyE_9vQlb; noflush_awsccs_sid=a2d89fc02c0cf4a802cbee401ebec77f44bca202ceb7b6c2a97959c2c1c2d524; AMCV_7742037254C95E840A4C98A6%40AdobeOrg=1585540135%7CMCIDTS%7C19732%7CMCMID%7C02951782621594055451960720052115370779%7CMCAAMLH-1705425266%7C7%7CMCAAMB-1705425266%7CRKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y%7CMCOPTOUT-1704827666s%7CNONE%7CMCAID%7CNONE%7CMCSYNCSOP%7C411-19739%7CvVersion%7C4.4.0; skin=noskin; session-id=144-5665395-9202330; session-token=FyAVIWdGB53iXIJXdem2EZFyJlis9Br8pg2ntKUHdJz67sXFe3A4pkEExbqVFWxJ0liTaF0WVrIqfGErwwzcqfeCsJa9rGXr2uBqR7T7mhth7NqpRmqo94Y4LV4wrc/1HOgiFZ+IIp3nvSGChPsY0j523km8oI9EidPkld8vDoE4uwHfbJwXTCED+X6sLeLLEMSscbyE9Rad/39HS3idvEfhLTavh0C/cjqB1gyoBUIr98HY4hTQmgk3H+OX2Yzho3sAff+lDf66smIVf2fNlRPTtdfMIsUMkgW5FRse2DBivWdTeh/pPPSq7a4ZvJq4IbVgi635SqGUyMGNliRFfYbJ6esD9b64; csm-hit=tb:A4V7QZK951K0E811VHA4+s-C8E57V18N53ZSES65JVD|1704974764357&t:1704974764357&adb:adblk_no")
                .addHeader("device-memory", "8")
                .addHeader("downlink", "10")
                .addHeader("dpr", "1")
                .addHeader("ect", "4g")
                .addHeader("referer", "https://www.amazon.com/s?k=ipod&crid=S5AEJGMUSCJ8&sprefix=ipod%2Caps%2C227&ref=nb_sb_noss_1")
                .addHeader("rtt", "50")
                .addHeader("sec-ch-device-memory", "8")
                .addHeader("sec-ch-dpr", "1")
                .addHeader("sec-ch-ua", "\"Not_A Brand\";v=\"99\", \"Google Chrome\";v=\"109\", \"Chromium\";v=\"109\"")
                .addHeader("sec-ch-ua-mobile", "?0")
                .addHeader("sec-ch-ua-platform", "\"Linux\"")
                .addHeader("sec-ch-viewport-width", "725")
                .addHeader("sec-fetch-dest", "document")
                .addHeader("sec-fetch-mode", "navigate")
                .addHeader("sec-fetch-site", "same-origin")
                .addHeader("sec-fetch-user", "?1")
                .addHeader("upgrade-insecure-requests", "1")
                .addHeader("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36")
                .addHeader("viewport-width", "725")
                .build();
        Response response = client.newCall(request).execute();
        String res = response.body().string();
        NorrisRes res2 = om.readValue(res,NorrisRes.class);
        return res2.getTotal();
    }

    static class NorrisRes {
        Integer total;

        public Integer getTotal() {
            return total;
        }
    }
}
