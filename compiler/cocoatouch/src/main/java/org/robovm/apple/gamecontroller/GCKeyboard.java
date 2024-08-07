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
package org.robovm.apple.gamecontroller;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.corehaptic.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCKeyboard/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GCDevice/*</implements>*/ {

    /*<ptr>*/public static class GCKeyboardPtr extends Ptr<GCKeyboard, GCKeyboardPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCKeyboard.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCKeyboard() {}
    protected GCKeyboard(Handle h, long handle) { super(h, handle); }
    protected GCKeyboard(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "keyboardInput")
    public native GCKeyboardInput getKeyboardInput();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "coalescedKeyboard")
    public static native GCKeyboard getCoalescedKeyboard();
    @Property(selector = "handlerQueue")
    public native DispatchQueue getHandlerQueue();
    @Property(selector = "setHandlerQueue:")
    public native void setHandlerQueue(DispatchQueue v);
    @Property(selector = "vendorName")
    public native String getVendorName();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "productCategory")
    public native String getProductCategory();
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use the physicalInputProfile property on GCController instead.  For GCKeyboard, use the keyboardInput property.  For GCMouse, use the mouseInput property.
     */
    @Deprecated
    @Property(selector = "physicalInputProfile")
    public native GCPhysicalInputProfile getPhysicalInputProfile();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
