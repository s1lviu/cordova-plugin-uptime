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
/********* Uptime.m Cordova Plugin Implementation *******/

#import "Uptime.h"
#import <Cordova/CDVPlugin.h>
#include <sys/sysctl.h>

@implementation Uptime

- (void)getUptime:(CDVInvokedUrlCommand*)command
{
    CDVPluginResult* pluginResult = nil;
    
    
    struct timespec tp;
    long long uptime;

    if (clock_gettime(CLOCK_UPTIME_RAW, &tp) == 0) {
          uptime = (int64_t)tp.tv_sec * 1000;
    }


    NSString* uptime_string = [NSString stringWithFormat:@"%lld", uptime];
    
    pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:uptime_string];

    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
