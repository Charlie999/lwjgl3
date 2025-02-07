/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_spatial_entity_storage_batch">XR_FB_spatial_entity_storage_batch</a> extension.
 * 
 * <p>This extension enables multiple spatial entities at a time to be persisted across sessions. If the {@link FBSpatialEntity#XR_SPACE_COMPONENT_TYPE_STORABLE_FB SPACE_COMPONENT_TYPE_STORABLE_FB} component has been enabled on the spatial entity, application developers <b>may</b> save and erase {@code XrSpace} entities.</p>
 * 
 * <p>In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} parameter as indicated in the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#extensions">extensions</a> section.</p>
 */
public class FBSpatialEntityStorageBatch {

    /** The extension specification version. */
    public static final int XR_FB_spatial_entity_storage_batch_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_SPATIAL_ENTITY_STORAGE_BATCH_EXTENSION_NAME = "XR_FB_spatial_entity_storage_batch";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SPACE_LIST_SAVE_INFO_FB TYPE_SPACE_LIST_SAVE_INFO_FB}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_SPACE_LIST_SAVE_COMPLETE_FB TYPE_EVENT_DATA_SPACE_LIST_SAVE_COMPLETE_FB}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SPACE_LIST_SAVE_INFO_FB                = 1000238000,
        XR_TYPE_EVENT_DATA_SPACE_LIST_SAVE_COMPLETE_FB = 1000238001;

    protected FBSpatialEntityStorageBatch() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSaveSpaceListFB ] ---

    /** Unsafe version of: {@link #xrSaveSpaceListFB SaveSpaceListFB} */
    public static int nxrSaveSpaceListFB(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrSaveSpaceListFB;
        if (CHECKS) {
            check(__functionAddress);
            XrSpaceListSaveInfoFB.validate(info);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /**
     * Saves a list of spatial entities to persistent storage.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrSaveSpaceListFB SaveSpaceListFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrSaveSpaceListFB(
     *     XrSession                                   session,
     *     const XrSpaceListSaveInfoFB*                info,
     *     XrAsyncRequestIdFB*                         requestId);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrSaveSpaceListFB SaveSpaceListFB} function persists the specified spatial entities at the specified storage location. The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if {@link XrSpaceSaveInfoFB}{@code ::location} is invalid. This operation is asynchronous and the runtime <b>must</b> post an {@link XrEventDataSpaceListSaveCompleteFB} event when the operation completes successfully or encounters an error.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBSpatialEntityStorageBatch XR_FB_spatial_entity_storage_batch} extension <b>must</b> be enabled prior to calling {@link #xrSaveSpaceListFB SaveSpaceListFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code info} <b>must</b> be a pointer to a valid {@link XrSpaceListSaveInfoFB} structure</li>
     * <li>{@code requestId} <b>must</b> be a pointer to an {@code XrAsyncRequestIdFB} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link FBSpatialEntitySharing#XR_ERROR_SPACE_NETWORK_TIMEOUT_FB ERROR_SPACE_NETWORK_TIMEOUT_FB}</li>
     * <li>{@link FBSpatialEntitySharing#XR_ERROR_SPACE_NETWORK_REQUEST_FAILED_FB ERROR_SPACE_NETWORK_REQUEST_FAILED_FB}</li>
     * <li>{@link FBSpatialEntitySharing#XR_ERROR_SPACE_MAPPING_INSUFFICIENT_FB ERROR_SPACE_MAPPING_INSUFFICIENT_FB}</li>
     * <li>{@link FBSpatialEntitySharing#XR_ERROR_SPACE_LOCALIZATION_FAILED_FB ERROR_SPACE_LOCALIZATION_FAILED_FB}</li>
     * <li>{@link FBSpatialEntity#XR_ERROR_SPACE_COMPONENT_NOT_ENABLED_FB ERROR_SPACE_COMPONENT_NOT_ENABLED_FB}</li>
     * <li>{@link FBSpatialEntitySharing#XR_ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpaceListSaveInfoFB}</p>
     *
     * @param session   a handle to an {@code XrSession}.
     * @param info      contains the parameters for the save operation.
     * @param requestId an output parameter, and the variable it points to will be populated with the ID of this asynchronous request.
     */
    @NativeType("XrResult")
    public static int xrSaveSpaceListFB(XrSession session, @NativeType("XrSpaceListSaveInfoFB const *") XrSpaceListSaveInfoFB info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrSaveSpaceListFB(session, info.address(), memAddress(requestId));
    }

}