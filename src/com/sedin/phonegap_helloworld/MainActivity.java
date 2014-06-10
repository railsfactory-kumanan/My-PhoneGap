package com.sedin.phonegap_helloworld;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

public class MainActivity extends DroidGap {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.activity_main);
		super.loadUrl("file:///android_asset/www/basic.html");
	}
}
