package com.bl.birdsanctuary;

public class BirdNotFoundException extends Exception {
String message;
BirdNotFoundException(String message){
	this.message=message;
}
}
