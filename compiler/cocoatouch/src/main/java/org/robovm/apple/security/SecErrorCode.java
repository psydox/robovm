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
package org.robovm.apple.security;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Security")/*</annotations>*/
public enum /*<name>*/SecErrorCode/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Success(0L),
    Unimplemented(-4L),
    DiskFull(-34L),
    /**
     * @deprecated use errSecDiskFull
     */
    @Deprecated
    DskFull(-34L),
    IO(-36L),
    OpWr(-49L),
    Param(-50L),
    WrPerm(-61L),
    Allocate(-108L),
    UserCanceled(-128L),
    BadReq(-909L),
    InternalComponent(-2070L),
    CoreFoundationUnknown(-4960L),
    MissingEntitlement(-34018L),
    RestrictedAPI(-34020L),
    NotAvailable(-25291L),
    ReadOnly(-25292L),
    AuthFailed(-25293L),
    NoSuchKeychain(-25294L),
    InvalidKeychain(-25295L),
    DuplicateKeychain(-25296L),
    DuplicateCallback(-25297L),
    InvalidCallback(-25298L),
    DuplicateItem(-25299L),
    ItemNotFound(-25300L),
    BufferTooSmall(-25301L),
    DataTooLarge(-25302L),
    NoSuchAttr(-25303L),
    InvalidItemRef(-25304L),
    InvalidSearchRef(-25305L),
    NoSuchClass(-25306L),
    NoDefaultKeychain(-25307L),
    InteractionNotAllowed(-25308L),
    ReadOnlyAttr(-25309L),
    WrongSecVersion(-25310L),
    KeySizeNotAllowed(-25311L),
    NoStorageModule(-25312L),
    NoCertificateModule(-25313L),
    NoPolicyModule(-25314L),
    InteractionRequired(-25315L),
    DataNotAvailable(-25316L),
    DataNotModifiable(-25317L),
    CreateChainFailed(-25318L),
    InvalidPrefsDomain(-25319L),
    InDarkWake(-25320L),
    ACLNotSimple(-25240L),
    PolicyNotFound(-25241L),
    InvalidTrustSetting(-25242L),
    NoAccessForItem(-25243L),
    InvalidOwnerEdit(-25244L),
    TrustNotAvailable(-25245L),
    UnsupportedFormat(-25256L),
    UnknownFormat(-25257L),
    KeyIsSensitive(-25258L),
    MultiplePrivKeys(-25259L),
    PassphraseRequired(-25260L),
    InvalidPasswordRef(-25261L),
    InvalidTrustSettings(-25262L),
    NoTrustSettings(-25263L),
    Pkcs12VerifyFailure(-25264L),
    NotSigner(-26267L),
    Decode(-26275L),
    ServiceNotAvailable(-67585L),
    InsufficientClientID(-67586L),
    DeviceReset(-67587L),
    DeviceFailed(-67588L),
    AppleAddAppACLSubject(-67589L),
    ApplePublicKeyIncomplete(-67590L),
    AppleSignatureMismatch(-67591L),
    AppleInvalidKeyStartDate(-67592L),
    AppleInvalidKeyEndDate(-67593L),
    ConversionError(-67594L),
    AppleSSLv2Rollback(-67595L),
    QuotaExceeded(-67596L),
    FileTooBig(-67597L),
    InvalidDatabaseBlob(-67598L),
    InvalidKeyBlob(-67599L),
    IncompatibleDatabaseBlob(-67600L),
    IncompatibleKeyBlob(-67601L),
    HostNameMismatch(-67602L),
    UnknownCriticalExtensionFlag(-67603L),
    NoBasicConstraints(-67604L),
    NoBasicConstraintsCA(-67605L),
    InvalidAuthorityKeyID(-67606L),
    InvalidSubjectKeyID(-67607L),
    InvalidKeyUsageForPolicy(-67608L),
    InvalidExtendedKeyUsage(-67609L),
    InvalidIDLinkage(-67610L),
    PathLengthConstraintExceeded(-67611L),
    InvalidRoot(-67612L),
    CRLExpired(-67613L),
    CRLNotValidYet(-67614L),
    CRLNotFound(-67615L),
    CRLServerDown(-67616L),
    CRLBadURI(-67617L),
    UnknownCertExtension(-67618L),
    UnknownCRLExtension(-67619L),
    CRLNotTrusted(-67620L),
    CRLPolicyFailed(-67621L),
    IDPFailure(-67622L),
    SMIMEEmailAddressesNotFound(-67623L),
    SMIMEBadExtendedKeyUsage(-67624L),
    SMIMEBadKeyUsage(-67625L),
    SMIMEKeyUsageNotCritical(-67626L),
    SMIMENoEmailAddress(-67627L),
    SMIMESubjAltNameNotCritical(-67628L),
    SSLBadExtendedKeyUsage(-67629L),
    OCSPBadResponse(-67630L),
    OCSPBadRequest(-67631L),
    OCSPUnavailable(-67632L),
    OCSPStatusUnrecognized(-67633L),
    EndOfData(-67634L),
    IncompleteCertRevocationCheck(-67635L),
    NetworkFailure(-67636L),
    OCSPNotTrustedToAnchor(-67637L),
    RecordModified(-67638L),
    OCSPSignatureError(-67639L),
    OCSPNoSigner(-67640L),
    OCSPResponderMalformedReq(-67641L),
    OCSPResponderInternalError(-67642L),
    OCSPResponderTryLater(-67643L),
    OCSPResponderSignatureRequired(-67644L),
    OCSPResponderUnauthorized(-67645L),
    OCSPResponseNonceMismatch(-67646L),
    CodeSigningBadCertChainLength(-67647L),
    CodeSigningNoBasicConstraints(-67648L),
    CodeSigningBadPathLengthConstraint(-67649L),
    CodeSigningNoExtendedKeyUsage(-67650L),
    CodeSigningDevelopment(-67651L),
    ResourceSignBadCertChainLength(-67652L),
    ResourceSignBadExtKeyUsage(-67653L),
    TrustSettingDeny(-67654L),
    InvalidSubjectName(-67655L),
    UnknownQualifiedCertStatement(-67656L),
    MobileMeRequestQueued(-67657L),
    MobileMeRequestRedirected(-67658L),
    MobileMeServerError(-67659L),
    MobileMeServerNotAvailable(-67660L),
    MobileMeServerAlreadyExists(-67661L),
    MobileMeServerServiceErr(-67662L),
    MobileMeRequestAlreadyPending(-67663L),
    MobileMeNoRequestPending(-67664L),
    MobileMeCSRVerifyFailure(-67665L),
    MobileMeFailedConsistencyCheck(-67666L),
    NotInitialized(-67667L),
    InvalidHandleUsage(-67668L),
    PVCReferentNotFound(-67669L),
    FunctionIntegrityFail(-67670L),
    InternalError(-67671L),
    MemoryError(-67672L),
    InvalidData(-67673L),
    MDSError(-67674L),
    InvalidPointer(-67675L),
    SelfCheckFailed(-67676L),
    FunctionFailed(-67677L),
    ModuleManifestVerifyFailed(-67678L),
    InvalidGUID(-67679L),
    InvalidHandle(-67680L),
    InvalidDBList(-67681L),
    InvalidPassthroughID(-67682L),
    InvalidNetworkAddress(-67683L),
    CRLAlreadySigned(-67684L),
    InvalidNumberOfFields(-67685L),
    VerificationFailure(-67686L),
    UnknownTag(-67687L),
    InvalidSignature(-67688L),
    InvalidName(-67689L),
    InvalidCertificateRef(-67690L),
    InvalidCertificateGroup(-67691L),
    TagNotFound(-67692L),
    InvalidQuery(-67693L),
    InvalidValue(-67694L),
    CallbackFailed(-67695L),
    ACLDeleteFailed(-67696L),
    ACLReplaceFailed(-67697L),
    ACLAddFailed(-67698L),
    ACLChangeFailed(-67699L),
    InvalidAccessCredentials(-67700L),
    InvalidRecord(-67701L),
    InvalidACL(-67702L),
    InvalidSampleValue(-67703L),
    IncompatibleVersion(-67704L),
    PrivilegeNotGranted(-67705L),
    InvalidScope(-67706L),
    PVCAlreadyConfigured(-67707L),
    InvalidPVC(-67708L),
    EMMLoadFailed(-67709L),
    EMMUnloadFailed(-67710L),
    AddinLoadFailed(-67711L),
    InvalidKeyRef(-67712L),
    InvalidKeyHierarchy(-67713L),
    AddinUnloadFailed(-67714L),
    LibraryReferenceNotFound(-67715L),
    InvalidAddinFunctionTable(-67716L),
    InvalidServiceMask(-67717L),
    ModuleNotLoaded(-67718L),
    InvalidSubServiceID(-67719L),
    AttributeNotInContext(-67720L),
    ModuleManagerInitializeFailed(-67721L),
    ModuleManagerNotFound(-67722L),
    EventNotificationCallbackNotFound(-67723L),
    InputLengthError(-67724L),
    OutputLengthError(-67725L),
    PrivilegeNotSupported(-67726L),
    DeviceError(-67727L),
    AttachHandleBusy(-67728L),
    NotLoggedIn(-67729L),
    AlgorithmMismatch(-67730L),
    KeyUsageIncorrect(-67731L),
    KeyBlobTypeIncorrect(-67732L),
    KeyHeaderInconsistent(-67733L),
    UnsupportedKeyFormat(-67734L),
    UnsupportedKeySize(-67735L),
    InvalidKeyUsageMask(-67736L),
    UnsupportedKeyUsageMask(-67737L),
    InvalidKeyAttributeMask(-67738L),
    UnsupportedKeyAttributeMask(-67739L),
    InvalidKeyLabel(-67740L),
    UnsupportedKeyLabel(-67741L),
    InvalidKeyFormat(-67742L),
    UnsupportedVectorOfBuffers(-67743L),
    InvalidInputVector(-67744L),
    InvalidOutputVector(-67745L),
    InvalidContext(-67746L),
    InvalidAlgorithm(-67747L),
    InvalidAttributeKey(-67748L),
    MissingAttributeKey(-67749L),
    InvalidAttributeInitVector(-67750L),
    MissingAttributeInitVector(-67751L),
    InvalidAttributeSalt(-67752L),
    MissingAttributeSalt(-67753L),
    InvalidAttributePadding(-67754L),
    MissingAttributePadding(-67755L),
    InvalidAttributeRandom(-67756L),
    MissingAttributeRandom(-67757L),
    InvalidAttributeSeed(-67758L),
    MissingAttributeSeed(-67759L),
    InvalidAttributePassphrase(-67760L),
    MissingAttributePassphrase(-67761L),
    InvalidAttributeKeyLength(-67762L),
    MissingAttributeKeyLength(-67763L),
    InvalidAttributeBlockSize(-67764L),
    MissingAttributeBlockSize(-67765L),
    InvalidAttributeOutputSize(-67766L),
    MissingAttributeOutputSize(-67767L),
    InvalidAttributeRounds(-67768L),
    MissingAttributeRounds(-67769L),
    InvalidAlgorithmParms(-67770L),
    MissingAlgorithmParms(-67771L),
    InvalidAttributeLabel(-67772L),
    MissingAttributeLabel(-67773L),
    InvalidAttributeKeyType(-67774L),
    MissingAttributeKeyType(-67775L),
    InvalidAttributeMode(-67776L),
    MissingAttributeMode(-67777L),
    InvalidAttributeEffectiveBits(-67778L),
    MissingAttributeEffectiveBits(-67779L),
    InvalidAttributeStartDate(-67780L),
    MissingAttributeStartDate(-67781L),
    InvalidAttributeEndDate(-67782L),
    MissingAttributeEndDate(-67783L),
    InvalidAttributeVersion(-67784L),
    MissingAttributeVersion(-67785L),
    InvalidAttributePrime(-67786L),
    MissingAttributePrime(-67787L),
    InvalidAttributeBase(-67788L),
    MissingAttributeBase(-67789L),
    InvalidAttributeSubprime(-67790L),
    MissingAttributeSubprime(-67791L),
    InvalidAttributeIterationCount(-67792L),
    MissingAttributeIterationCount(-67793L),
    InvalidAttributeDLDBHandle(-67794L),
    MissingAttributeDLDBHandle(-67795L),
    InvalidAttributeAccessCredentials(-67796L),
    MissingAttributeAccessCredentials(-67797L),
    InvalidAttributePublicKeyFormat(-67798L),
    MissingAttributePublicKeyFormat(-67799L),
    InvalidAttributePrivateKeyFormat(-67800L),
    MissingAttributePrivateKeyFormat(-67801L),
    InvalidAttributeSymmetricKeyFormat(-67802L),
    MissingAttributeSymmetricKeyFormat(-67803L),
    InvalidAttributeWrappedKeyFormat(-67804L),
    MissingAttributeWrappedKeyFormat(-67805L),
    StagedOperationInProgress(-67806L),
    StagedOperationNotStarted(-67807L),
    VerifyFailed(-67808L),
    QuerySizeUnknown(-67809L),
    BlockSizeMismatch(-67810L),
    PublicKeyInconsistent(-67811L),
    DeviceVerifyFailed(-67812L),
    InvalidLoginName(-67813L),
    AlreadyLoggedIn(-67814L),
    InvalidDigestAlgorithm(-67815L),
    InvalidCRLGroup(-67816L),
    CertificateCannotOperate(-67817L),
    CertificateExpired(-67818L),
    CertificateNotValidYet(-67819L),
    CertificateRevoked(-67820L),
    CertificateSuspended(-67821L),
    InsufficientCredentials(-67822L),
    InvalidAction(-67823L),
    InvalidAuthority(-67824L),
    VerifyActionFailed(-67825L),
    InvalidCertAuthority(-67826L),
    InvalidCRLAuthority(-67827L),
    /**
     * @deprecated Deprecated in iOS 15.0. Use errSecInvalidCRLAuthority
     */
    @Deprecated
    InvaldCRLAuthority(-67827L),
    InvalidCRLEncoding(-67828L),
    InvalidCRLType(-67829L),
    InvalidCRL(-67830L),
    InvalidFormType(-67831L),
    InvalidID(-67832L),
    InvalidIdentifier(-67833L),
    InvalidIndex(-67834L),
    InvalidPolicyIdentifiers(-67835L),
    InvalidTimeString(-67836L),
    InvalidReason(-67837L),
    InvalidRequestInputs(-67838L),
    InvalidResponseVector(-67839L),
    InvalidStopOnPolicy(-67840L),
    InvalidTuple(-67841L),
    MultipleValuesUnsupported(-67842L),
    NotTrusted(-67843L),
    NoDefaultAuthority(-67844L),
    RejectedForm(-67845L),
    RequestLost(-67846L),
    RequestRejected(-67847L),
    UnsupportedAddressType(-67848L),
    UnsupportedService(-67849L),
    InvalidTupleGroup(-67850L),
    InvalidBaseACLs(-67851L),
    InvalidTupleCredentials(-67852L),
    /**
     * @deprecated Deprecated in iOS 15.0. Use errSecInvalidTupleCredentials
     */
    @Deprecated
    InvalidTupleCredendtials(-67852L),
    InvalidEncoding(-67853L),
    InvalidValidityPeriod(-67854L),
    InvalidRequestor(-67855L),
    RequestDescriptor(-67856L),
    InvalidBundleInfo(-67857L),
    InvalidCRLIndex(-67858L),
    NoFieldValues(-67859L),
    UnsupportedFieldFormat(-67860L),
    UnsupportedIndexInfo(-67861L),
    UnsupportedLocality(-67862L),
    UnsupportedNumAttributes(-67863L),
    UnsupportedNumIndexes(-67864L),
    UnsupportedNumRecordTypes(-67865L),
    FieldSpecifiedMultiple(-67866L),
    IncompatibleFieldFormat(-67867L),
    InvalidParsingModule(-67868L),
    DatabaseLocked(-67869L),
    DatastoreIsOpen(-67870L),
    MissingValue(-67871L),
    UnsupportedQueryLimits(-67872L),
    UnsupportedNumSelectionPreds(-67873L),
    UnsupportedOperator(-67874L),
    InvalidDBLocation(-67875L),
    InvalidAccessRequest(-67876L),
    InvalidIndexInfo(-67877L),
    InvalidNewOwner(-67878L),
    InvalidModifyMode(-67879L),
    MissingRequiredExtension(-67880L),
    ExtendedKeyUsageNotCritical(-67881L),
    TimestampMissing(-67882L),
    TimestampInvalid(-67883L),
    TimestampNotTrusted(-67884L),
    TimestampServiceNotAvailable(-67885L),
    TimestampBadAlg(-67886L),
    TimestampBadRequest(-67887L),
    TimestampBadDataFormat(-67888L),
    TimestampTimeNotAvailable(-67889L),
    TimestampUnacceptedPolicy(-67890L),
    TimestampUnacceptedExtension(-67891L),
    TimestampAddInfoNotAvailable(-67892L),
    TimestampSystemFailure(-67893L),
    SigningTimeMissing(-67894L),
    TimestampRejection(-67895L),
    TimestampWaiting(-67896L),
    TimestampRevocationWarning(-67897L),
    TimestampRevocationNotification(-67898L),
    CertificatePolicyNotAllowed(-67899L),
    CertificateNameNotAllowed(-67900L),
    CertificateValidityPeriodTooLong(-67901L),
    CertificateIsCA(-67902L),
    CertificateDuplicateExtension(-67903L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(SecErrorCode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Bridge(symbol="SecCopyErrorMessageString", optional=true)
    public static native String copyErrorMessageString(OSStatus status, VoidPtr reserved);
    /*</methods>*/

    private final long n;

    private /*<name>*/SecErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/SecErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/SecErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/SecErrorCode/*</name>*/.class.getName());
    }
}
