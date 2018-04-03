var exec = require('cordova/exec');

exports.getSystemUptime = function (arg0, success, error) {
  exec(success, error, 'Uptime', 'getSystemUptime', []);
};
