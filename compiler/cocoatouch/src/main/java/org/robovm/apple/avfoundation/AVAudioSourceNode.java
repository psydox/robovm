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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudioSourceNode/*</name>*/ 
    extends /*<extends>*/AVAudioNode/*</extends>*/ 
    /*<implements>*/implements AVAudioMixing/*</implements>*/ {

    /*<ptr>*/public static class AVAudioSourceNodePtr extends Ptr<AVAudioSourceNode, AVAudioSourceNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAudioSourceNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVAudioSourceNode() {}
    protected AVAudioSourceNode(Handle h, long handle) { super(h, handle); }
    protected AVAudioSourceNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRenderBlock:")
    public AVAudioSourceNode(@Block Block4<BooleanPtr, AudioTimeStamp, Integer, AudioBufferList, OSStatus> block) { super((SkipInit) null); initObject(init(block)); }
    @Method(selector = "initWithFormat:renderBlock:")
    public AVAudioSourceNode(AVAudioFormat format, @Block Block4<BooleanPtr, AudioTimeStamp, Integer, AudioBufferList, OSStatus> block) { super((SkipInit) null); initObject(init(format, block)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "volume")
    public native float getVolume();
    @Property(selector = "setVolume:")
    public native void setVolume(float v);
    @Property(selector = "pan")
    public native float getPan();
    @Property(selector = "setPan:")
    public native void setPan(float v);
    @Property(selector = "renderingAlgorithm")
    public native AVAudio3DMixingRenderingAlgorithm getRenderingAlgorithm();
    @Property(selector = "setRenderingAlgorithm:")
    public native void setRenderingAlgorithm(AVAudio3DMixingRenderingAlgorithm v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "sourceMode")
    public native AVAudio3DMixingSourceMode getSourceMode();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setSourceMode:")
    public native void setSourceMode(AVAudio3DMixingSourceMode v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "pointSourceInHeadMode")
    public native AVAudio3DMixingPointSourceInHeadMode getPointSourceInHeadMode();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setPointSourceInHeadMode:")
    public native void setPointSourceInHeadMode(AVAudio3DMixingPointSourceInHeadMode v);
    @Property(selector = "rate")
    public native float getRate();
    @Property(selector = "setRate:")
    public native void setRate(float v);
    @Property(selector = "reverbBlend")
    public native float getReverbBlend();
    @Property(selector = "setReverbBlend:")
    public native void setReverbBlend(float v);
    @Property(selector = "obstruction")
    public native float getObstruction();
    @Property(selector = "setObstruction:")
    public native void setObstruction(float v);
    @Property(selector = "occlusion")
    public native float getOcclusion();
    @Property(selector = "setOcclusion:")
    public native void setOcclusion(float v);
    @Property(selector = "position")
    public native @ByVal AVAudio3DPoint getPosition();
    @Property(selector = "setPosition:")
    public native void setPosition(@ByVal AVAudio3DPoint v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRenderBlock:")
    protected native @Pointer long init(@Block Block4<BooleanPtr, AudioTimeStamp, Integer, AudioBufferList, OSStatus> block);
    @Method(selector = "initWithFormat:renderBlock:")
    protected native @Pointer long init(AVAudioFormat format, @Block Block4<BooleanPtr, AudioTimeStamp, Integer, AudioBufferList, OSStatus> block);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "destinationForMixer:bus:")
    public native AVAudioMixingDestination getDestinationForMixer(AVAudioNode mixer, @MachineSizedUInt long bus);
    /*</methods>*/
}
