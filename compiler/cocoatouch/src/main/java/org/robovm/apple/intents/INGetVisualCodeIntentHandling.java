/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.intents;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 * @deprecated Deprecated in iOS 15.0. INGetVisualCodeIntentHandling is deprecated. There is no replacement.
 */
/*</javadoc>*/
/*<annotations>*/@Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/INGetVisualCodeIntentHandling/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "handleGetVisualCode:completion:")
    void handleGetVisualCode(INGetVisualCodeIntent intent, @Block VoidBlock1<INGetVisualCodeIntentResponse> completion);
    @Method(selector = "confirmGetVisualCode:completion:")
    void confirmGetVisualCode(INGetVisualCodeIntent intent, @Block VoidBlock1<INGetVisualCodeIntentResponse> completion);
    @Method(selector = "resolveVisualCodeTypeForGetVisualCode:withCompletion:")
    void resolveVisualCodeTypeForGetVisualCode(INGetVisualCodeIntent intent, @Block VoidBlock1<INVisualCodeTypeResolutionResult> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
