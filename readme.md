

# cordova-plugin-uptime

Plugin provides the elapsed time in milliseconds since system boot up aka uptime.

## Installation

    $ ionic cordova plugin add cordova-plugin-uptime
    $ npm install --save @ionic-native/uptime

## Supported Platforms

  - Android
  - iOS

## Usage

**Ionic Framework 2+ - TypeScript**

     import { Uptime } from '@ionic-native/uptime';  
      
     constructor(private uptime: Uptime) { }  
     
     ...  
      
     this.uptime.getUptime()  
       .then((uptime: string) => console.log(uptime))  
       .catch((error) => console.log(error));  
**ES5 usage:**

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
