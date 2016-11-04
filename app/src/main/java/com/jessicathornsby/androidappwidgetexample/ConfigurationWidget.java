package com.jessicathornsby.androidappwidgetexample;

import android.os.Bundle;
import android.appwidget.AppWidgetManager;
import android.content.Intent;

/**
 * Created by jessicathornsby on 03/11/16.
 */
public class ConfigurationWidget {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setResult(RESULT_CANCELED);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            mAppWidgetId = extras.getInt(
                    AppWidgetManager.EXTRA_APPWIDGET_ID,
                    AppWidgetManager.INVALID_APPWIDGET_ID);
        }

        if (mAppWidgetId == AppWidgetManager.INVALID_APPWIDGET_ID) {


            finish();
        }

    }

    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);



    Intent resultValue = new Intent();
    resultValue.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, mAppWidgetId);
    setResult(RESULT_OK, resultValue);
    finish();
  }




