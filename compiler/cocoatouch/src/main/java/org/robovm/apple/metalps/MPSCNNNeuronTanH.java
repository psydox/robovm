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
package org.robovm.apple.metalps;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNNeuronTanH/*</name>*/ 
    extends /*<extends>*/MPSCNNNeuron/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNNeuronTanHPtr extends Ptr<MPSCNNNeuronTanH, MPSCNNNeuronTanHPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNNeuronTanH.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNNeuronTanH() {}
    protected MPSCNNNeuronTanH(Handle h, long handle) { super(h, handle); }
    protected MPSCNNNeuronTanH(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0. Use Please use MPSCNNNeuron initWithDevice:neuronDescriptor.
     */
    @Deprecated
    @Method(selector = "initWithDevice:a:b:")
    public MPSCNNNeuronTanH(MTLDevice device, float a, float b) { super((SkipInit) null); initObject(init(device, a, b)); }
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "initWithDevice:neuronDescriptor:")
    public MPSCNNNeuronTanH(MTLDevice device, MPSNNNeuronDescriptor neuronDescriptor) { super(device, neuronDescriptor); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNNeuronTanH(NSCoder decoder, MTLDevice device) { super(decoder, device); }
    @Method(selector = "initWithCoder:")
    public MPSCNNNeuronTanH(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0. Use Please use MPSCNNNeuron initWithDevice:neuronDescriptor.
     */
    @Deprecated
    @Method(selector = "initWithDevice:a:b:")
    protected native @Pointer long init(MTLDevice device, float a, float b);
    /*</methods>*/
}
