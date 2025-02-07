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
 * Structure specifying support for result status query.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is included in the {@code pNext} chain of the {@link VkQueueFamilyProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceQueueFamilyProperties2 GetPhysicalDeviceQueueFamilyProperties2}, then it is filled with information about whether <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#queries-result-status-only">result status queries</a> are supported by the specified queue family.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkQueueFamilyQueryResultStatusPropertiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #queryResultStatusSupport};
 * }</code></pre>
 */
public class VkQueueFamilyQueryResultStatusPropertiesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        QUERYRESULTSTATUSSUPPORT;

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
        QUERYRESULTSTATUSSUPPORT = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkQueueFamilyQueryResultStatusPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueueFamilyQueryResultStatusPropertiesKHR(ByteBuffer container) {
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
    /** reports {@link VK10#VK_TRUE TRUE} if query type {@link KHRVideoQueue#VK_QUERY_TYPE_RESULT_STATUS_ONLY_KHR QUERY_TYPE_RESULT_STATUS_ONLY_KHR} and use of {@link KHRVideoQueue#VK_QUERY_RESULT_WITH_STATUS_BIT_KHR QUERY_RESULT_WITH_STATUS_BIT_KHR} are supported. */
    @NativeType("VkBool32")
    public boolean queryResultStatusSupport() { return nqueryResultStatusSupport(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkQueueFamilyQueryResultStatusPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR} value to the {@link #sType} field. */
    public VkQueueFamilyQueryResultStatusPropertiesKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkQueueFamilyQueryResultStatusPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkQueueFamilyQueryResultStatusPropertiesKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkQueueFamilyQueryResultStatusPropertiesKHR set(VkQueueFamilyQueryResultStatusPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkQueueFamilyQueryResultStatusPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyQueryResultStatusPropertiesKHR malloc() {
        return wrap(VkQueueFamilyQueryResultStatusPropertiesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkQueueFamilyQueryResultStatusPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyQueryResultStatusPropertiesKHR calloc() {
        return wrap(VkQueueFamilyQueryResultStatusPropertiesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkQueueFamilyQueryResultStatusPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkQueueFamilyQueryResultStatusPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkQueueFamilyQueryResultStatusPropertiesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkQueueFamilyQueryResultStatusPropertiesKHR} instance for the specified memory address. */
    public static VkQueueFamilyQueryResultStatusPropertiesKHR create(long address) {
        return wrap(VkQueueFamilyQueryResultStatusPropertiesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueueFamilyQueryResultStatusPropertiesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkQueueFamilyQueryResultStatusPropertiesKHR.class, address);
    }

    /**
     * Returns a new {@link VkQueueFamilyQueryResultStatusPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyQueryResultStatusPropertiesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyQueryResultStatusPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyQueryResultStatusPropertiesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyQueryResultStatusPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyQueryResultStatusPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkQueueFamilyQueryResultStatusPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyQueryResultStatusPropertiesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueueFamilyQueryResultStatusPropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkQueueFamilyQueryResultStatusPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyQueryResultStatusPropertiesKHR malloc(MemoryStack stack) {
        return wrap(VkQueueFamilyQueryResultStatusPropertiesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkQueueFamilyQueryResultStatusPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyQueryResultStatusPropertiesKHR calloc(MemoryStack stack) {
        return wrap(VkQueueFamilyQueryResultStatusPropertiesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkQueueFamilyQueryResultStatusPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyQueryResultStatusPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyQueryResultStatusPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyQueryResultStatusPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkQueueFamilyQueryResultStatusPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkQueueFamilyQueryResultStatusPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #queryResultStatusSupport}. */
    public static int nqueryResultStatusSupport(long struct) { return UNSAFE.getInt(null, struct + VkQueueFamilyQueryResultStatusPropertiesKHR.QUERYRESULTSTATUSSUPPORT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkQueueFamilyQueryResultStatusPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkQueueFamilyQueryResultStatusPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkQueueFamilyQueryResultStatusPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkQueueFamilyQueryResultStatusPropertiesKHR, Buffer> implements NativeResource {

        private static final VkQueueFamilyQueryResultStatusPropertiesKHR ELEMENT_FACTORY = VkQueueFamilyQueryResultStatusPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkQueueFamilyQueryResultStatusPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueueFamilyQueryResultStatusPropertiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkQueueFamilyQueryResultStatusPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkQueueFamilyQueryResultStatusPropertiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkQueueFamilyQueryResultStatusPropertiesKHR.nsType(address()); }
        /** @return the value of the {@link VkQueueFamilyQueryResultStatusPropertiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkQueueFamilyQueryResultStatusPropertiesKHR.npNext(address()); }
        /** @return the value of the {@link VkQueueFamilyQueryResultStatusPropertiesKHR#queryResultStatusSupport} field. */
        @NativeType("VkBool32")
        public boolean queryResultStatusSupport() { return VkQueueFamilyQueryResultStatusPropertiesKHR.nqueryResultStatusSupport(address()) != 0; }

        /** Sets the specified value to the {@link VkQueueFamilyQueryResultStatusPropertiesKHR#sType} field. */
        public VkQueueFamilyQueryResultStatusPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkQueueFamilyQueryResultStatusPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR} value to the {@link VkQueueFamilyQueryResultStatusPropertiesKHR#sType} field. */
        public VkQueueFamilyQueryResultStatusPropertiesKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR); }
        /** Sets the specified value to the {@link VkQueueFamilyQueryResultStatusPropertiesKHR#pNext} field. */
        public VkQueueFamilyQueryResultStatusPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkQueueFamilyQueryResultStatusPropertiesKHR.npNext(address(), value); return this; }

    }

}