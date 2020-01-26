package com.lewisgreaves.mynews;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static android.content.ContentValues.TAG;

/*
 * Created by @Mayakovsky28 on 26 01 2020.
 */
public class MyHttpURLConnection {

    public static String startHttpRequest(String urlString) {

        StringBuilder stringBuilder = new StringBuilder();

        try {

            URL url = new URL(urlString);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.connect();

            InputStream inputStream = connection.getInputStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }

        } catch (IOException exception) {
            Log.wtf(TAG, "startHttpRequest: Something is wrong!");
        }

            return stringBuilder.toString();
        }
}
