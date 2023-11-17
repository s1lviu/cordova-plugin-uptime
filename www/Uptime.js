/*
 *   Copyright (c) 2018 Silviu Stroe (https://silviu-s.com)
 *
 *   Permission is hereby granted, free of charge, to any person obtaining
 *   a copy of this software and associated documentation files (the
 *   "Software"), to deal in the Software without restriction, including
 *   without limitation the rights to use, copy, modify, merge, publish,
 *   distribute, sublicense, and/or sell copies of the Software, and to
 *   permit persons to whom the Software is furnished to do so, subject to
 *   the following conditions:
 *
 *   The above copyright notice and this permission notice shall be
 *   included in all copies or substantial portions of the Software.
 *
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 *   EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 *   MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *   NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 *   LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 *   OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 *   WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

var exec = require('cordova/exec');

var Uptime = {
    /**
     * Gets the system uptime.
     * @param {boolean} includeDeepSleep - Whether to include time spent in deep sleep.
     * @param {function} success - Success callback, receives uptime as a string.
     * @param {function} failure - Failure callback, receives error message.
     */
    getUptime: function (includeDeepSleep = false, success, failure) {
        if (typeof success !== 'function') {
            console.error('Success callback is not a function');
            return;
        }

        if (typeof failure !== 'function') {
            console.error('Failure callback is not a function');
            return;
        }

        exec(success, failure, "Uptime", "getUptime", [includeDeepSleep]);
    }
};

module.exports = Uptime;
