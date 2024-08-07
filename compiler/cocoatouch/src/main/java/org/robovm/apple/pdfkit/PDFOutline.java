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
package org.robovm.apple.pdfkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PDFKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PDFOutline/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PDFOutlinePtr extends Ptr<PDFOutline, PDFOutlinePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PDFOutline.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PDFOutline() {}
    protected PDFOutline(Handle h, long handle) { super(h, handle); }
    protected PDFOutline(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "document")
    public native PDFDocument getDocument();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "parent")
    public native PDFOutline getParent();
    @Property(selector = "numberOfChildren")
    public native @MachineSizedUInt long getNumberOfChildren();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "index")
    public native @MachineSizedUInt long getIndex();
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isOpen")
    public native boolean isOpen();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setIsOpen:")
    public native void setIsOpen(boolean v);
    @Property(selector = "destination")
    public native PDFDestination getDestination();
    @Property(selector = "setDestination:")
    public native void setDestination(PDFDestination v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "action")
    public native PDFAction getAction();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setAction:")
    public native void setAction(PDFAction v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "childAtIndex:")
    public native PDFOutline childAtIndex(@MachineSizedUInt long index);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "insertChild:atIndex:")
    public native void insertChild(PDFOutline child, @MachineSizedUInt long index);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "removeFromParent")
    public native void removeFromParent();
    /*</methods>*/
}
