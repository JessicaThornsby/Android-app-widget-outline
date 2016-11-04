package com.jessicathornsby.androidappwidgetexample;

import android.appwidget.AppWidgetProvider;
import android.widget.RemoteViews;
import android.appwidget.AppWidgetManager;
import android.content.Context;



/**
 * Created by jessicathornsby on 03/11/16.
 */
public class MyAppWidgetProvider extends AppWidgetProvider {


    RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.activity_main);



    appWidgetManager.updateAppWidget(currentWidgetId,views);



}
