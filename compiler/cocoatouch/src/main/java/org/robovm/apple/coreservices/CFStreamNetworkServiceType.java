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
package org.robovm.apple.coreservices;

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
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CFNetwork") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CFStreamNetworkServiceType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFStreamNetworkServiceType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CFStreamNetworkServiceType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CFStreamNetworkServiceType toObject(Class<CFStreamNetworkServiceType> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CFStreamNetworkServiceType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CFStreamNetworkServiceType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CFStreamNetworkServiceType> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CFStreamNetworkServiceType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CFStreamNetworkServiceType.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CFStreamNetworkServiceType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CFStreamNetworkServiceType o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CFStreamNetworkServiceType Video = new CFStreamNetworkServiceType("Video");
    public static final CFStreamNetworkServiceType Voice = new CFStreamNetworkServiceType("Voice");
    public static final CFStreamNetworkServiceType Background = new CFStreamNetworkServiceType("Background");
    public static final CFStreamNetworkServiceType ResponsiveData = new CFStreamNetworkServiceType("ResponsiveData");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFStreamNetworkServiceType CallSignaling = new CFStreamNetworkServiceType("CallSignaling");
    public static final CFStreamNetworkServiceType AVStreaming = new CFStreamNetworkServiceType("AVStreaming");
    public static final CFStreamNetworkServiceType ResponsiveAV = new CFStreamNetworkServiceType("ResponsiveAV");
    /**
     * @deprecated Deprecated in iOS 9.0. use PushKit for VoIP control purposes
     */
    @Deprecated
    public static final CFStreamNetworkServiceType VoIP = new CFStreamNetworkServiceType("VoIP");
    /*</constants>*/
    
    private static /*<name>*/CFStreamNetworkServiceType/*</name>*/[] values = new /*<name>*/CFStreamNetworkServiceType/*</name>*/[] {/*<value_list>*/Video, Voice, Background, ResponsiveData, CallSignaling, AVStreaming, ResponsiveAV, VoIP/*</value_list>*/};
    
    /*<name>*/CFStreamNetworkServiceType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CFStreamNetworkServiceType/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CFStreamNetworkServiceType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CFStreamNetworkServiceType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CFNetwork") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCFStreamNetworkServiceTypeVideo", optional=true)
        public static native CFString Video();
        @GlobalValue(symbol="kCFStreamNetworkServiceTypeVoice", optional=true)
        public static native CFString Voice();
        @GlobalValue(symbol="kCFStreamNetworkServiceTypeBackground", optional=true)
        public static native CFString Background();
        @GlobalValue(symbol="kCFStreamNetworkServiceTypeResponsiveData", optional=true)
        public static native CFString ResponsiveData();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCFStreamNetworkServiceTypeCallSignaling", optional=true)
        public static native CFString CallSignaling();
        @GlobalValue(symbol="kCFStreamNetworkServiceTypeAVStreaming", optional=true)
        public static native CFString AVStreaming();
        @GlobalValue(symbol="kCFStreamNetworkServiceTypeResponsiveAV", optional=true)
        public static native CFString ResponsiveAV();
        /**
         * @deprecated Deprecated in iOS 9.0. use PushKit for VoIP control purposes
         */
        @Deprecated
        @GlobalValue(symbol="kCFStreamNetworkServiceTypeVoIP", optional=true)
        public static native CFString VoIP();
        /*</values>*/
    }
}
