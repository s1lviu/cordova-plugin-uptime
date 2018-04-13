
# cordova-plugin-uptime

This plugin provides the time spent in milliseconds since boot (uptime).

## Installation

```
$ ionic cordova plugin add cordova-plugin-uptime
$ npm install --save @ionic-native/uptime

```

## Supported Platforms

-   Android
-   iOS

## Usage

**Ionic Framework 2+ - TypeScript**

```
 import { Uptime } from '@ionic-native/uptime';  
  
 constructor(private uptime: Uptime) { }  
 
 ...  
  
 this.uptime.getUptime(includeDeepSleep)  
   .then((uptime) => console.log(uptime))  
   .catch((error) => console.log(error));  

```

**ES5 usage:**

```
Uptime.getUptime(includeDeepSleep,
    function(uptime) { 
        console.log('Uptime (ms): ', uptime);
    },
    function(err) {  
        console.log(err);
    }
);

```
The `includeDeepSleep` is a boolean parameter. If it's set to true, the returned uptime will include the total uptime (including device sleeping time), otherwise, will be the up time, considering clock stops when system enters [deep sleep](https://developer.android.com/reference/android/os/SystemClock.html#uptimeMillis%28%29) (CPU off, display dark, device waiting for external input), but is not affected by clock scaling, idle, or other power saving mechanisms.

## Author

This plugin is made with :heart: by  [Silviu Stroe](https://silviu-s.com/)
