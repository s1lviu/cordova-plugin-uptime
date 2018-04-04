

# cordova-plugin-uptime

Plugin provides the elapsed time since system boot up aka uptime.

## Installation

    cordova plugin add cordova-plugin-uptime

## Supported Platforms

  - Android

## Usage

**Ionic Framework 2+ - TypeScript**

     import { Uptime } from '@ionic-native/uptime';  
      
     constructor(private uptime: Uptime) { }  
     
     ...  
      
     this.uptime.getUptime()  
       .then((uptime: any) => console.log(uptime))  
       .catch((error: any) => console.log(error));  
**ES5 based platforms:**

    Uptime.getUptime(
        function(uptime) { 
            console.log('Uptime (ms): ', uptime);
        },
        function(err) {  
            console.log(err);
        }
    );

## Author
This plugin is made with :heart: by [Silviu Stroe](https://silviu-s.com/)
