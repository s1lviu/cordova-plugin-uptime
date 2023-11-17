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
package com.silvius.cordova.uptime;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import android.os.SystemClock;

public class Uptime extends CordovaPlugin {

    private static final String ACTION_GET_UPTIME = "getUptime";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        try {
            if (ACTION_GET_UPTIME.equals(action)) {
                return getUptime(args, callbackContext);
            } else {
                callbackContext.error("Invalid action: " + action);
                return false;
            }
        } catch (JSONException e) {
            callbackContext.error("JSON error: " + e.getMessage());
            return false;
        }
    }

    private boolean getUptime(JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (args.length() == 0) {
            callbackContext.error("Missing argument for includeDeepSleep");
            return false;
        }

        boolean includeDeepSleep = args.getBoolean(0);
        long uptime = includeDeepSleep ? SystemClock.elapsedRealtime() : SystemClock.uptimeMillis();
        callbackContext.success(Long.toString(uptime));
        return true;
    }
}
