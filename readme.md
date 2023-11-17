# cordova-plugin-uptime

This plugin provides the system uptime in milliseconds since boot, allowing developers to track how long a device has been running. This can be particularly useful for monitoring, diagnostics, or adding uptime information within an application.

## Installation

```bash
$ ionic cordova plugin add cordova-plugin-uptime
$ npm install --save @ionic-native/uptime
```

## Supported Platforms

- Android
- iOS

## Usage

**Ionic Framework 2+ - TypeScript**

```typescript
import { Uptime } from '@ionic-native/uptime';  

constructor(private uptime: Uptime) { }  

// ...

this.uptime.getUptime(includeDeepSleep)
  .then((uptime) => console.log('Uptime (ms): ', uptime))
  .catch((error) => console.log('Error: ', error));
```

**ES5 usage:**

```javascript
Uptime.getUptime(includeDeepSleep,
    function(uptime) { 
        console.log('Uptime (ms): ', uptime);
    },
    function(err) {  
        console.log('Error: ', err);
    }
);
```

The `includeDeepSleep` is a boolean parameter. If set to true, the returned uptime includes the total uptime (including device sleeping time). Otherwise, it will be the uptime considering clock stops when the system enters deep sleep (CPU off, display dark, device waiting for external input), but is not affected by clock scaling, idle, or other power-saving mechanisms.

## Contributing

If you would like to contribute to this plugin, please feel free to submit a pull request or open an issue on our [GitHub repository](https://github.com/s1lviu/cordova-plugin-uptime).

## Author

This plugin is made with :heart: by [Silviu Stroe](https://silviu-s.com/)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
