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
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_scene_capture">XR_FB_scene_capture</a> extension.
 * 
 * <p>This extension allows an application to request that the system begin capturing information about what is in the environment around the user.</p>
 * 
 * <p>In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} parameter as indicated in the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#extensions">extensions</a> section.</p>
 */
public class FBSceneCapture {

    /** The extension specification version. */
    public static final int XR_FB_scene_capture_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_SCENE_CAPTURE_EXTENSION_NAME = "XR_FB_scene_capture";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB}</li>
     * <li>{@link #XR_TYPE_SCENE_CAPTURE_REQUEST_INFO_FB TYPE_SCENE_CAPTURE_REQUEST_INFO_FB}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB = 1000198001,
        XR_TYPE_SCENE_CAPTURE_REQUEST_INFO_FB        = 1000198050;

    protected FBSceneCapture() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrRequestSceneCaptureFB ] ---

    /** Unsafe version of: {@link #xrRequestSceneCaptureFB RequestSceneCaptureFB} */
    public static int nxrRequestSceneCaptureFB(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrRequestSceneCaptureFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /**
     * Begins a scene capture using the specified parameters.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrRequestSceneCaptureFB RequestSceneCaptureFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrRequestSceneCaptureFB(
     *     XrSession                                   session,
     *     const XrSceneCaptureRequestInfoFB*          info,
     *     XrAsyncRequestIdFB*                         requestId);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrRequestSceneCaptureFB RequestSceneCaptureFB} function is used by an application to begin capturing the scene around the user. This is an asynchronous operation.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBSceneCapture XR_FB_scene_capture} extension <b>must</b> be enabled prior to calling {@link #xrRequestSceneCaptureFB RequestSceneCaptureFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code info} <b>must</b> be a pointer to a valid {@link XrSceneCaptureRequestInfoFB} structure</li>
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
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSceneCaptureRequestInfoFB}</p>
     *
     * @param session   a handle to an {@code XrSession}.
     * @param info      an {@link XrSceneCaptureRequestInfoFB} which specifies how the scene capture should occur.
     * @param requestId the output parameter that points to the ID of this asynchronous request.
     */
    @NativeType("XrResult")
    public static int xrRequestSceneCaptureFB(XrSession session, @NativeType("XrSceneCaptureRequestInfoFB const *") XrSceneCaptureRequestInfoFB info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrRequestSceneCaptureFB(session, info.address(), memAddress(requestId));
    }

}