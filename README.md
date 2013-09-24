# DroidStrap


This project aims to demonstrate a clean Javascript-Java Bridge for Android. The interface is built using [Twitter Bootstrap](https://github.com/twbs/bootstrap) for Responsive Web Design. By clicking on either of the two buttons inside of the Hello, World! banner, you will call a Javascript function. These functions are in the Javascipt file [android.js](https://github.com/GrayGwizdz/droidstrap/blob/master/assets/files/js/android.js), which interfaces with the [JavascriptHandler](https://github.com/GrayGwizdz/droidstrap/blob/master/src/com/gray/gwizdz/example/droidstrap/JavascriptHandler.java) class. The JavascriptHandler class responds to function calls, then calls methods on the [MainActivity](https://github.com/GrayGwizdz/droidstrap/blob/master/src/com/gray/gwizdz/example/droidstrap/MainActivity.java) class. These will either create a toast of a string grabbed from the WebView, or launch an Android [Preferences](https://github.com/GrayGwizdz/droidstrap/blob/master/src/com/gray/gwizdz/example/droidstrap/PreferenceExample.java) Activity. 

## License

    Copyright 2013 Gray Gwizdz

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

![Screenshot](https://github.com/GrayGwizdz/droidstrap/raw/master/screenshot.png)
