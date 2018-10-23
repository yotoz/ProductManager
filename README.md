# ProductList

## Required but excluded features. (you must check it.)

* Password Encryption
* Firebase Authentication
* Android Responsive Design
* This project only considered the Android version 7.0. 
* Security Issues ( ex: Injection Attack... )

## Requirements

* Firebase Project (Google)
* AndroidStudio Project (Connected a realtime and a cloud storage)
* Use recently firebase version (You can check it here https://developers.google.com/android/guides/releases )
* Use recently google-services version. ( ex: classpath 'com.google.gms:google-services:4.1.0' )

## Realtime Of Firebase Structure

1. User

Collection Name : User ID

|Field Name|Type|Detail|
|---|---|---|
|PassWord|String|User's password|
|Type|String|admin or user|


2. Product

Collection Name : Product Name

|Field Name|Type|Detail|
|---|---|---|
|explanation|String||
|image|String|Storage Path|
|exist|String|yes or no|

