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
 * Structure describing whether cluster culling shader is enabled.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link HUAWEIClusterCullingShader#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_FEATURES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_FEATURES_HUAWEI}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #clustercullingShader};
 *     VkBool32 {@link #multiviewClusterCullingShader};
 * }</code></pre>
 */
public class VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CLUSTERCULLINGSHADER,
        MULTIVIEWCLUSTERCULLINGSHADER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CLUSTERCULLINGSHADER = layout.offsetof(2);
        MULTIVIEWCLUSTERCULLINGSHADER = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(ByteBuffer container) {
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
    /** specifies whether cluster culling shader is supported. */
    @NativeType("VkBool32")
    public boolean clustercullingShader() { return nclustercullingShader(address()) != 0; }
    /** specifies whether multiview is supported. */
    @NativeType("VkBool32")
    public boolean multiviewClusterCullingShader() { return nmultiviewClusterCullingShader(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link HUAWEIClusterCullingShader#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_FEATURES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_FEATURES_HUAWEI} value to the {@link #sType} field. */
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI sType$Default() { return sType(HUAWEIClusterCullingShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_FEATURES_HUAWEI); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #clustercullingShader} field. */
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI clustercullingShader(@NativeType("VkBool32") boolean value) { nclustercullingShader(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #multiviewClusterCullingShader} field. */
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI multiviewClusterCullingShader(@NativeType("VkBool32") boolean value) { nmultiviewClusterCullingShader(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI set(
        int sType,
        long pNext,
        boolean clustercullingShader,
        boolean multiviewClusterCullingShader
    ) {
        sType(sType);
        pNext(pNext);
        clustercullingShader(clustercullingShader);
        multiviewClusterCullingShader(multiviewClusterCullingShader);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI set(VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI malloc() {
        return wrap(VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI calloc() {
        return wrap(VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI} instance for the specified memory address. */
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI create(long address) {
        return wrap(VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.PNEXT); }
    /** Unsafe version of {@link #clustercullingShader}. */
    public static int nclustercullingShader(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.CLUSTERCULLINGSHADER); }
    /** Unsafe version of {@link #multiviewClusterCullingShader}. */
    public static int nmultiviewClusterCullingShader(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.MULTIVIEWCLUSTERCULLINGSHADER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.PNEXT, value); }
    /** Unsafe version of {@link #clustercullingShader(boolean) clustercullingShader}. */
    public static void nclustercullingShader(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.CLUSTERCULLINGSHADER, value); }
    /** Unsafe version of {@link #multiviewClusterCullingShader(boolean) multiviewClusterCullingShader}. */
    public static void nmultiviewClusterCullingShader(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.MULTIVIEWCLUSTERCULLINGSHADER, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI ELEMENT_FACTORY = VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI#clustercullingShader} field. */
        @NativeType("VkBool32")
        public boolean clustercullingShader() { return VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.nclustercullingShader(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI#multiviewClusterCullingShader} field. */
        @NativeType("VkBool32")
        public boolean multiviewClusterCullingShader() { return VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.nmultiviewClusterCullingShader(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI#sType} field. */
        public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.nsType(address(), value); return this; }
        /** Sets the {@link HUAWEIClusterCullingShader#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_FEATURES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_FEATURES_HUAWEI} value to the {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI#sType} field. */
        public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.Buffer sType$Default() { return sType(HUAWEIClusterCullingShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_FEATURES_HUAWEI); }
        /** Sets the specified value to the {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI#pNext} field. */
        public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI#clustercullingShader} field. */
        public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.Buffer clustercullingShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.nclustercullingShader(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI#multiviewClusterCullingShader} field. */
        public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.Buffer multiviewClusterCullingShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.nmultiviewClusterCullingShader(address(), value ? 1 : 0); return this; }

    }

}