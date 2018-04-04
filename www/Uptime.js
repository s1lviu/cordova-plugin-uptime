var exec = require('cordova/exec');


var Uptime = {



  getUptime: function (success, failure) {
    exec(success, failure, "Uptime", "getUptime", []);
  }

};


module.exports = Uptime;
