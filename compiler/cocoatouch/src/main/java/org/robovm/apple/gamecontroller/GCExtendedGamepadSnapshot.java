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
 * @since Available in iOS 9.0 and later.
 * @deprecated Deprecated in iOS 13.0. GCExtendedGamepadSnapshot has been deprecated, use [GCController controllerWithExtendedGamepad] instead
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameController") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCExtendedGamepadSnapshot/*</name>*/ 
    extends /*<extends>*/GCExtendedGamepad/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GCExtendedGamepadSnapshotPtr extends Ptr<GCExtendedGamepadSnapshot, GCExtendedGamepadSnapshotPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCExtendedGamepadSnapshot.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCExtendedGamepadSnapshot() {}
    protected GCExtendedGamepadSnapshot(Handle h, long handle) { super(h, handle); }
    protected GCExtendedGamepadSnapshot(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSnapshotData:")
    public GCExtendedGamepadSnapshot(NSData data) { super((SkipInit) null); initObject(init(data)); }
    @Method(selector = "initWithController:snapshotData:")
    public GCExtendedGamepadSnapshot(GCController controller, NSData data) { super((SkipInit) null); initObject(init(controller, data)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "snapshotData")
    public native NSData getSnapshotData();
    @Property(selector = "setSnapshotData:")
    public native void setSnapshotData(NSData v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 13.0. GCExtendedGamepadSnapshot has been deprecated, use [GCController controllerWithExtendedGamepad] instead
     */
    @Deprecated
    @GlobalValue(symbol="GCCurrentExtendedGamepadSnapshotDataVersion", optional=true)
    public static native GCExtendedGamepadSnapshotDataVersion getDataVersion();
    
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 13.0. GCExtendedGamepadSnapshot has been deprecated, use [GCController controllerWithExtendedGamepad] instead
     */
    @Deprecated
    @Bridge(symbol="GCExtendedGamepadSnapshotDataFromNSData", optional=true)
    public static native boolean getDataFromNSData(GCExtendedGamepadSnapshotData snapshotData, NSData data);
    
    @Method(selector = "initWithSnapshotData:")
    protected native @Pointer long init(NSData data);
    @Method(selector = "initWithController:snapshotData:")
    protected native @Pointer long init(GCController controller, NSData data);
    /*</methods>*/
}
