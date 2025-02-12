/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Completion of request to share one or more spatial entities.
 * 
 * <h5>Description</h5>
 * 
 * <p>It indicates that the request to share one or more spatial entities has completed. The application <b>can</b> use {@code result} to check if the request was successful or if an error occurred.</p>
 * 
 * <h5>Result Codes</h5>
 * 
 * <dl>
 * <dt>On success, the value of this parameter is</dt>
 * <dd><ul>
 * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
 * </ul></dd>
 * <dt>On failure, the value of this parameter is</dt>
 * <dd><ul>
 * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
 * <li>{@link FBSpatialEntitySharing#XR_ERROR_SPACE_MAPPING_INSUFFICIENT_FB ERROR_SPACE_MAPPING_INSUFFICIENT_FB}</li>
 * <li>{@link FBSpatialEntitySharing#XR_ERROR_SPACE_LOCALIZATION_FAILED_FB ERROR_SPACE_LOCALIZATION_FAILED_FB}</li>
 * <li>{@link FBSpatialEntitySharing#XR_ERROR_SPACE_NETWORK_TIMEOUT_FB ERROR_SPACE_NETWORK_TIMEOUT_FB}</li>
 * <li>{@link FBSpatialEntitySharing#XR_ERROR_SPACE_NETWORK_REQUEST_FAILED_FB ERROR_SPACE_NETWORK_REQUEST_FAILED_FB}</li>
 * <li>{@link FBSpatialEntitySharing#XR_ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB}</li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSpatialEntitySharing XR_FB_spatial_entity_sharing} extension <b>must</b> be enabled prior to using {@link XrEventDataSpaceShareCompleteFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBSpatialEntitySharing#XR_TYPE_EVENT_DATA_SPACE_SHARE_COMPLETE_FB TYPE_EVENT_DATA_SPACE_SHARE_COMPLETE_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataSpaceShareCompleteFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrAsyncRequestIdFB {@link #requestId};
 *     XrResult {@link #result};
 * }</code></pre>
 */
public class XrEventDataSpaceShareCompleteFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        REQUESTID,
        RESULT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        REQUESTID = layout.offsetof(2);
        RESULT = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrEventDataSpaceShareCompleteFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataSpaceShareCompleteFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the ID of the asynchronous request used to share the spatial entities. */
    @NativeType("XrAsyncRequestIdFB")
    public long requestId() { return nrequestId(address()); }
    /** an {@code XrResult} that describes whether the request succeeded or if an error occurred. */
    @NativeType("XrResult")
    public int result() { return nresult(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataSpaceShareCompleteFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntitySharing#XR_TYPE_EVENT_DATA_SPACE_SHARE_COMPLETE_FB TYPE_EVENT_DATA_SPACE_SHARE_COMPLETE_FB} value to the {@link #type} field. */
    public XrEventDataSpaceShareCompleteFB type$Default() { return type(FBSpatialEntitySharing.XR_TYPE_EVENT_DATA_SPACE_SHARE_COMPLETE_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataSpaceShareCompleteFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataSpaceShareCompleteFB set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataSpaceShareCompleteFB set(XrEventDataSpaceShareCompleteFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataSpaceShareCompleteFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataSpaceShareCompleteFB malloc() {
        return wrap(XrEventDataSpaceShareCompleteFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrEventDataSpaceShareCompleteFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataSpaceShareCompleteFB calloc() {
        return wrap(XrEventDataSpaceShareCompleteFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrEventDataSpaceShareCompleteFB} instance allocated with {@link BufferUtils}. */
    public static XrEventDataSpaceShareCompleteFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrEventDataSpaceShareCompleteFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataSpaceShareCompleteFB} instance for the specified memory address. */
    public static XrEventDataSpaceShareCompleteFB create(long address) {
        return wrap(XrEventDataSpaceShareCompleteFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataSpaceShareCompleteFB createSafe(long address) {
        return address == NULL ? null : wrap(XrEventDataSpaceShareCompleteFB.class, address);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataSpaceShareCompleteFB}. */
    public static XrEventDataSpaceShareCompleteFB create(XrEventDataBaseHeader value) {
        return wrap(XrEventDataSpaceShareCompleteFB.class, value);
    }

    /**
     * Returns a new {@link XrEventDataSpaceShareCompleteFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceShareCompleteFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceShareCompleteFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceShareCompleteFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceShareCompleteFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceShareCompleteFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrEventDataSpaceShareCompleteFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceShareCompleteFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataSpaceShareCompleteFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataSpaceShareCompleteFB.Buffer}. */
    public static XrEventDataSpaceShareCompleteFB.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrEventDataSpaceShareCompleteFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSpaceShareCompleteFB malloc(MemoryStack stack) {
        return wrap(XrEventDataSpaceShareCompleteFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrEventDataSpaceShareCompleteFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSpaceShareCompleteFB calloc(MemoryStack stack) {
        return wrap(XrEventDataSpaceShareCompleteFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrEventDataSpaceShareCompleteFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceShareCompleteFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceShareCompleteFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceShareCompleteFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEventDataSpaceShareCompleteFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataSpaceShareCompleteFB.NEXT); }
    /** Unsafe version of {@link #requestId}. */
    public static long nrequestId(long struct) { return UNSAFE.getLong(null, struct + XrEventDataSpaceShareCompleteFB.REQUESTID); }
    /** Unsafe version of {@link #result}. */
    public static int nresult(long struct) { return UNSAFE.getInt(null, struct + XrEventDataSpaceShareCompleteFB.RESULT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataSpaceShareCompleteFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataSpaceShareCompleteFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataSpaceShareCompleteFB} structs. */
    public static class Buffer extends StructBuffer<XrEventDataSpaceShareCompleteFB, Buffer> implements NativeResource {

        private static final XrEventDataSpaceShareCompleteFB ELEMENT_FACTORY = XrEventDataSpaceShareCompleteFB.create(-1L);

        /**
         * Creates a new {@code XrEventDataSpaceShareCompleteFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataSpaceShareCompleteFB#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected XrEventDataSpaceShareCompleteFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataSpaceShareCompleteFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataSpaceShareCompleteFB.ntype(address()); }
        /** @return the value of the {@link XrEventDataSpaceShareCompleteFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataSpaceShareCompleteFB.nnext(address()); }
        /** @return the value of the {@link XrEventDataSpaceShareCompleteFB#requestId} field. */
        @NativeType("XrAsyncRequestIdFB")
        public long requestId() { return XrEventDataSpaceShareCompleteFB.nrequestId(address()); }
        /** @return the value of the {@link XrEventDataSpaceShareCompleteFB#result} field. */
        @NativeType("XrResult")
        public int result() { return XrEventDataSpaceShareCompleteFB.nresult(address()); }

        /** Sets the specified value to the {@link XrEventDataSpaceShareCompleteFB#type} field. */
        public XrEventDataSpaceShareCompleteFB.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataSpaceShareCompleteFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntitySharing#XR_TYPE_EVENT_DATA_SPACE_SHARE_COMPLETE_FB TYPE_EVENT_DATA_SPACE_SHARE_COMPLETE_FB} value to the {@link XrEventDataSpaceShareCompleteFB#type} field. */
        public XrEventDataSpaceShareCompleteFB.Buffer type$Default() { return type(FBSpatialEntitySharing.XR_TYPE_EVENT_DATA_SPACE_SHARE_COMPLETE_FB); }
        /** Sets the specified value to the {@link XrEventDataSpaceShareCompleteFB#next} field. */
        public XrEventDataSpaceShareCompleteFB.Buffer next(@NativeType("void const *") long value) { XrEventDataSpaceShareCompleteFB.nnext(address(), value); return this; }

    }

}