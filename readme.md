
# cordova-plugin-uptime

Plugin provides the elapsed time since system boot up aka uptime.

## Installation

    cordova plugin add cordova-plugin-uptime

## Supported Platforms

  - Android

## Usage

     import { Uptime } from '@ionic-native/uptime';  
      
     constructor(private uptime: Uptime) { }  
     
     ...  
      
     this.uptime.getUptime()  
       .then((uptime: any) => console.log(uptime))  
       .catch((error: any) => console.log(error));  


