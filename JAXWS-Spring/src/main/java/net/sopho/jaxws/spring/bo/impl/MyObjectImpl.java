package net.sopho.jaxws.spring.bo.impl;

import net.sopho.jaxws.spring.bo.MyObject;

public class MyObjectImpl implements MyObject {

    @Override
    public String printMessage() {
	return "Hello from Java Code Geeks JAXWS with Spring Tutorial";
    }
}
