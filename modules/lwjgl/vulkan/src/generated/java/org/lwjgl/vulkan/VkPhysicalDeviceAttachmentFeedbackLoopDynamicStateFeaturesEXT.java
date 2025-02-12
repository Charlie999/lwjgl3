/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing if dynamic feedback loops can be used.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTAttachmentFeedbackLoopDynamicState#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #attachmentFeedbackLoopDynamicState};
 * }</code></pre>
 */
public class VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ATTACHMENTFEEDBACKLOOPDYNAMICSTATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ATTACHMENTFEEDBACKLOOPDYNAMICSTATE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** specifies whether dynamic feedback loops are supported. */
    @NativeType("VkBool32")
    public boolean attachmentFeedbackLoopDynamicState() { return nattachmentFeedbackLoopDynamicState(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTAttachmentFeedbackLoopDynamicState#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT sType$Default() { return sType(EXTAttachmentFeedbackLoopDynamicState.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #attachmentFeedbackLoopDynamicState} field. */
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT attachmentFeedbackLoopDynamicState(@NativeType("VkBool32") boolean value) { nattachmentFeedbackLoopDynamicState(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT set(
        int sType,
        long pNext,
        boolean attachmentFeedbackLoopDynamicState
    ) {
        sType(sType);
        pNext(pNext);
        attachmentFeedbackLoopDynamicState(attachmentFeedbackLoopDynamicState);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT set(VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #attachmentFeedbackLoopDynamicState}. */
    public static int nattachmentFeedbackLoopDynamicState(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.ATTACHMENTFEEDBACKLOOPDYNAMICSTATE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #attachmentFeedbackLoopDynamicState(boolean) attachmentFeedbackLoopDynamicState}. */
    public static void nattachmentFeedbackLoopDynamicState(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.ATTACHMENTFEEDBACKLOOPDYNAMICSTATE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT#attachmentFeedbackLoopDynamicState} field. */
        @NativeType("VkBool32")
        public boolean attachmentFeedbackLoopDynamicState() { return VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.nattachmentFeedbackLoopDynamicState(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT#sType} field. */
        public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTAttachmentFeedbackLoopDynamicState#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT} value to the {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT#sType} field. */
        public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer sType$Default() { return sType(EXTAttachmentFeedbackLoopDynamicState.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT#attachmentFeedbackLoopDynamicState} field. */
        public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.Buffer attachmentFeedbackLoopDynamicState(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT.nattachmentFeedbackLoopDynamicState(address(), value ? 1 : 0); return this; }

    }

}