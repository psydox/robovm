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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Foundation")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FoundationVersionNumber/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(FoundationVersionNumber.class); }/*</bind>*/
    /*<constants>*/
    public static final double Version10_0 = 397.40;
    public static final double Version10_1 = 425.00;
    public static final double Version10_1_1 = 425.00;
    public static final double Version10_1_2 = 425.00;
    public static final double Version10_1_3 = 425.00;
    public static final double Version10_1_4 = 425.00;
    public static final double Version10_2 = 462.00;
    public static final double Version10_2_1 = 462.00;
    public static final double Version10_2_2 = 462.00;
    public static final double Version10_2_3 = 462.00;
    public static final double Version10_2_4 = 462.00;
    public static final double Version10_2_5 = 462.00;
    public static final double Version10_2_6 = 462.00;
    public static final double Version10_2_7 = 462.70;
    public static final double Version10_2_8 = 462.70;
    public static final double Version10_3 = 500.00;
    public static final double Version10_3_1 = 500.00;
    public static final double Version10_3_2 = 500.30;
    public static final double Version10_3_3 = 500.54;
    public static final double Version10_3_4 = 500.56;
    public static final double Version10_3_5 = 500.56;
    public static final double Version10_3_6 = 500.56;
    public static final double Version10_3_7 = 500.56;
    public static final double Version10_3_8 = 500.56;
    public static final double Version10_3_9 = 500.58;
    public static final double Version10_4 = 567.00;
    public static final double Version10_4_1 = 567.00;
    public static final double Version10_4_2 = 567.12;
    public static final double Version10_4_3 = 567.21;
    public static final double Version10_4_4_Intel = 567.23;
    public static final double Version10_4_4_PowerPC = 567.21;
    public static final double Version10_4_5 = 567.25;
    public static final double Version10_4_6 = 567.26;
    public static final double Version10_4_7 = 567.27;
    public static final double Version10_4_8 = 567.28;
    public static final double Version10_4_9 = 567.29;
    public static final double Version10_4_10 = 567.29;
    public static final double Version10_4_11 = 567.36;
    public static final double Version10_5 = 677.00;
    public static final double Version10_5_1 = 677.10;
    public static final double Version10_5_2 = 677.15;
    public static final double Version10_5_3 = 677.19;
    public static final double Version10_5_4 = 677.19;
    public static final double Version10_5_5 = 677.21;
    public static final double Version10_5_6 = 677.22;
    public static final double Version10_5_7 = 677.24;
    public static final double Version10_5_8 = 677.26;
    public static final double Version10_6 = 751.00;
    public static final double Version10_6_1 = 751.00;
    public static final double Version10_6_2 = 751.14;
    public static final double Version10_6_3 = 751.21;
    public static final double Version10_6_4 = 751.29;
    public static final double Version10_6_5 = 751.42;
    public static final double Version10_6_6 = 751.53;
    public static final double Version10_6_7 = 751.53;
    public static final double Version10_6_8 = 751.62;
    public static final double Version10_7 = 833.10;
    public static final double Version10_7_1 = 833.10;
    public static final double Version10_7_2 = 833.20;
    public static final double Version10_7_3 = 833.24;
    public static final double Version10_7_4 = 833.25;
    public static final double Version10_8 = 945.00;
    public static final double Version10_8_1 = 945.00;
    public static final double Version10_8_2 = 945.11;
    public static final double Version10_8_3 = 945.16;
    public static final double Version10_8_4 = 945.18;
    public static final int Version10_9 = 1056;
    public static final int Version10_9_1 = 1056;
    public static final double Version10_9_2 = 1056.13;
    public static final double Version10_10 = 1151.16;
    public static final double Version10_10_1 = 1151.16;
    public static final double Version10_10_2 = 1152.14;
    public static final double Version10_10_3 = 1153.20;
    public static final double Version10_10_4 = 1153.20;
    public static final int Version10_10_5 = 1154;
    public static final int Version10_10_Max = 1199;
    public static final int Version10_11 = 1252;
    public static final double Version10_11_1 = 1255.1;
    public static final double Version10_11_2 = 1256.1;
    public static final double Version10_11_3 = 1256.1;
    public static final int Version10_11_4 = 1258;
    public static final int Version10_11_Max = 1299;
    public static final double Version_iPhoneOS_2_0 = 678.24;
    public static final double Version_iPhoneOS_2_1 = 678.26;
    public static final double Version_iPhoneOS_2_2 = 678.29;
    public static final double Version_iPhoneOS_3_0 = 678.47;
    public static final double Version_iPhoneOS_3_1 = 678.51;
    public static final double Version_iPhoneOS_3_2 = 678.60;
    public static final double Version_iOS_4_0 = 751.32;
    public static final double Version_iOS_4_1 = 751.37;
    public static final double Version_iOS_4_2 = 751.49;
    public static final double Version_iOS_4_3 = 751.49;
    public static final double Version_iOS_5_0 = 881.00;
    public static final double Version_iOS_5_1 = 890.10;
    public static final double Version_iOS_6_0 = 992.00;
    public static final double Version_iOS_6_1 = 993.00;
    public static final double Version_iOS_7_0 = 1047.20;
    public static final double Version_iOS_7_1 = 1047.25;
    public static final double Version_iOS_8_0 = 1140.11;
    public static final double Version_iOS_8_1 = 1141.1;
    public static final double Version_iOS_8_2 = 1142.14;
    public static final double Version_iOS_8_3 = 1144.17;
    public static final double Version_iOS_8_4 = 1144.17;
    public static final int Version_iOS_8_x_Max = 1199;
    public static final double Version_iOS_9_0 = 1240.1;
    public static final double Version_iOS_9_1 = 1241.14;
    public static final double Version_iOS_9_2 = 1242.12;
    public static final double Version_iOS_9_3 = 1242.12;
    public static final double Version_iOS_9_4 = 1280.25;
    public static final int Version_iOS_9_x_Max = 1299;
    public static final int VersionWithFileManagerResourceForkSupport = 412;
    /*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="NSFoundationVersionNumber", optional=true)
    public static native double getVersion();
    /*</methods>*/
}
