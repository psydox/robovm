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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UICollectionViewDataSource/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "collectionView:numberOfItemsInSection:")
    @MachineSizedSInt long getNumberOfItemsInSection(UICollectionView collectionView, @MachineSizedSInt long section);
    @Method(selector = "collectionView:cellForItemAtIndexPath:")
    UICollectionViewCell getCellForItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Method(selector = "numberOfSectionsInCollectionView:")
    @MachineSizedSInt long getNumberOfSections(UICollectionView collectionView);
    @Method(selector = "collectionView:viewForSupplementaryElementOfKind:atIndexPath:")
    UICollectionReusableView getViewForSupplementaryElement(UICollectionView collectionView, String kind, NSIndexPath indexPath);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "collectionView:canMoveItemAtIndexPath:")
    boolean canMoveItemAt(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "collectionView:moveItemAtIndexPath:toIndexPath:")
    void moveItemAt(UICollectionView collectionView, NSIndexPath sourceIndexPath, NSIndexPath destinationIndexPath);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "indexTitlesForCollectionView:")
    NSArray<NSString> indexTitlesForCollectionView(UICollectionView collectionView);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "collectionView:indexPathForIndexTitle:atIndex:")
    NSIndexPath indexPathForIndexTitle(UICollectionView collectionView, String title, @MachineSizedSInt long index);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
