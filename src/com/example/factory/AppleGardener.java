package com.example.factory;

import com.example.factory.myinterface.Fruit;
import com.example.factory.myinterface.FruitGardener;

public class AppleGardener implements FruitGardener {

	@Override
	public Fruit factory() {
		return new Apple();
	}

}
