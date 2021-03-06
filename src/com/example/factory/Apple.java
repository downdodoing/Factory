package com.example.factory;

import android.util.Log;

import com.example.factory.myinterface.Fruit;

public class Apple implements Fruit {

	@Override
	public void group() {
		Log.i("Apple", "正在成长");
	}

	@Override
	public void harvest() {
		Log.i("Apple", "收获苹果");
	}

	@Override
	public void plant() {
		Log.i("Apple", "栽种苹果");
	}

}
