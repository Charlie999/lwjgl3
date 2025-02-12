/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_KERNEL_NODE_PARAMS_v2 {
 *     CUfunction func;
 *     unsigned int gridDimX;
 *     unsigned int gridDimY;
 *     unsigned int gridDimZ;
 *     unsigned int blockDimX;
 *     unsigned int blockDimY;
 *     unsigned int blockDimZ;
 *     unsigned int sharedMemBytes;
 *     void ** kernelParams;
 *     void ** extra;
 *     CUkernel kern;
 *     CUcontext ctx;
 * }</code></pre>
 */
public class CUDA_KERNEL_NODE_PARAMS_v2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FUNC,
        GRIDDIMX,
        GRIDDIMY,
        GRIDDIMZ,
        BLOCKDIMX,
        BLOCKDIMY,
        BLOCKDIMZ,
        SHAREDMEMBYTES,
        KERNELPARAMS,
        EXTRA,
        KERN,
        CTX;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FUNC = layout.offsetof(0);
        GRIDDIMX = layout.offsetof(1);
        GRIDDIMY = layout.offsetof(2);
        GRIDDIMZ = layout.offsetof(3);
        BLOCKDIMX = layout.offsetof(4);
        BLOCKDIMY = layout.offsetof(5);
        BLOCKDIMZ = layout.offsetof(6);
        SHAREDMEMBYTES = layout.offsetof(7);
        KERNELPARAMS = layout.offsetof(8);
        EXTRA = layout.offsetof(9);
        KERN = layout.offsetof(10);
        CTX = layout.offsetof(11);
    }

    /**
     * Creates a {@code CUDA_KERNEL_NODE_PARAMS_v2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_KERNEL_NODE_PARAMS_v2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code func} field. */
    @NativeType("CUfunction")
    public long func() { return nfunc(address()); }
    /** @return the value of the {@code gridDimX} field. */
    @NativeType("unsigned int")
    public int gridDimX() { return ngridDimX(address()); }
    /** @return the value of the {@code gridDimY} field. */
    @NativeType("unsigned int")
    public int gridDimY() { return ngridDimY(address()); }
    /** @return the value of the {@code gridDimZ} field. */
    @NativeType("unsigned int")
    public int gridDimZ() { return ngridDimZ(address()); }
    /** @return the value of the {@code blockDimX} field. */
    @NativeType("unsigned int")
    public int blockDimX() { return nblockDimX(address()); }
    /** @return the value of the {@code blockDimY} field. */
    @NativeType("unsigned int")
    public int blockDimY() { return nblockDimY(address()); }
    /** @return the value of the {@code blockDimZ} field. */
    @NativeType("unsigned int")
    public int blockDimZ() { return nblockDimZ(address()); }
    /** @return the value of the {@code sharedMemBytes} field. */
    @NativeType("unsigned int")
    public int sharedMemBytes() { return nsharedMemBytes(address()); }
    /**
     * @return a {@link PointerBuffer} view of the data pointed to by the {@code kernelParams} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @Nullable
    @NativeType("void **")
    public PointerBuffer kernelParams(int capacity) { return nkernelParams(address(), capacity); }
    /**
     * @return a {@link PointerBuffer} view of the data pointed to by the {@code extra} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @Nullable
    @NativeType("void **")
    public PointerBuffer extra(int capacity) { return nextra(address(), capacity); }
    /** @return the value of the {@code kern} field. */
    @NativeType("CUkernel")
    public long kern() { return nkern(address()); }
    /** @return the value of the {@code ctx} field. */
    @NativeType("CUcontext")
    public long ctx() { return nctx(address()); }

    /** Sets the specified value to the {@code func} field. */
    public CUDA_KERNEL_NODE_PARAMS_v2 func(@NativeType("CUfunction") long value) { nfunc(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimX} field. */
    public CUDA_KERNEL_NODE_PARAMS_v2 gridDimX(@NativeType("unsigned int") int value) { ngridDimX(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimY} field. */
    public CUDA_KERNEL_NODE_PARAMS_v2 gridDimY(@NativeType("unsigned int") int value) { ngridDimY(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimZ} field. */
    public CUDA_KERNEL_NODE_PARAMS_v2 gridDimZ(@NativeType("unsigned int") int value) { ngridDimZ(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimX} field. */
    public CUDA_KERNEL_NODE_PARAMS_v2 blockDimX(@NativeType("unsigned int") int value) { nblockDimX(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimY} field. */
    public CUDA_KERNEL_NODE_PARAMS_v2 blockDimY(@NativeType("unsigned int") int value) { nblockDimY(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimZ} field. */
    public CUDA_KERNEL_NODE_PARAMS_v2 blockDimZ(@NativeType("unsigned int") int value) { nblockDimZ(address(), value); return this; }
    /** Sets the specified value to the {@code sharedMemBytes} field. */
    public CUDA_KERNEL_NODE_PARAMS_v2 sharedMemBytes(@NativeType("unsigned int") int value) { nsharedMemBytes(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code kernelParams} field. */
    public CUDA_KERNEL_NODE_PARAMS_v2 kernelParams(@Nullable @NativeType("void **") PointerBuffer value) { nkernelParams(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code extra} field. */
    public CUDA_KERNEL_NODE_PARAMS_v2 extra(@Nullable @NativeType("void **") PointerBuffer value) { nextra(address(), value); return this; }
    /** Sets the specified value to the {@code kern} field. */
    public CUDA_KERNEL_NODE_PARAMS_v2 kern(@NativeType("CUkernel") long value) { nkern(address(), value); return this; }
    /** Sets the specified value to the {@code ctx} field. */
    public CUDA_KERNEL_NODE_PARAMS_v2 ctx(@NativeType("CUcontext") long value) { nctx(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_KERNEL_NODE_PARAMS_v2 set(
        long func,
        int gridDimX,
        int gridDimY,
        int gridDimZ,
        int blockDimX,
        int blockDimY,
        int blockDimZ,
        int sharedMemBytes,
        @Nullable PointerBuffer kernelParams,
        @Nullable PointerBuffer extra,
        long kern,
        long ctx
    ) {
        func(func);
        gridDimX(gridDimX);
        gridDimY(gridDimY);
        gridDimZ(gridDimZ);
        blockDimX(blockDimX);
        blockDimY(blockDimY);
        blockDimZ(blockDimZ);
        sharedMemBytes(sharedMemBytes);
        kernelParams(kernelParams);
        extra(extra);
        kern(kern);
        ctx(ctx);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_KERNEL_NODE_PARAMS_v2 set(CUDA_KERNEL_NODE_PARAMS_v2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_KERNEL_NODE_PARAMS_v2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_KERNEL_NODE_PARAMS_v2 malloc() {
        return wrap(CUDA_KERNEL_NODE_PARAMS_v2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUDA_KERNEL_NODE_PARAMS_v2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_KERNEL_NODE_PARAMS_v2 calloc() {
        return wrap(CUDA_KERNEL_NODE_PARAMS_v2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUDA_KERNEL_NODE_PARAMS_v2} instance allocated with {@link BufferUtils}. */
    public static CUDA_KERNEL_NODE_PARAMS_v2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUDA_KERNEL_NODE_PARAMS_v2.class, memAddress(container), container);
    }

    /** Returns a new {@code CUDA_KERNEL_NODE_PARAMS_v2} instance for the specified memory address. */
    public static CUDA_KERNEL_NODE_PARAMS_v2 create(long address) {
        return wrap(CUDA_KERNEL_NODE_PARAMS_v2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_KERNEL_NODE_PARAMS_v2 createSafe(long address) {
        return address == NULL ? null : wrap(CUDA_KERNEL_NODE_PARAMS_v2.class, address);
    }

    /**
     * Returns a new {@link CUDA_KERNEL_NODE_PARAMS_v2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_KERNEL_NODE_PARAMS_v2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_KERNEL_NODE_PARAMS_v2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_KERNEL_NODE_PARAMS_v2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_KERNEL_NODE_PARAMS_v2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_KERNEL_NODE_PARAMS_v2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUDA_KERNEL_NODE_PARAMS_v2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_KERNEL_NODE_PARAMS_v2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_KERNEL_NODE_PARAMS_v2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code CUDA_KERNEL_NODE_PARAMS_v2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_KERNEL_NODE_PARAMS_v2 malloc(MemoryStack stack) {
        return wrap(CUDA_KERNEL_NODE_PARAMS_v2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUDA_KERNEL_NODE_PARAMS_v2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_KERNEL_NODE_PARAMS_v2 calloc(MemoryStack stack) {
        return wrap(CUDA_KERNEL_NODE_PARAMS_v2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUDA_KERNEL_NODE_PARAMS_v2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_KERNEL_NODE_PARAMS_v2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_KERNEL_NODE_PARAMS_v2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_KERNEL_NODE_PARAMS_v2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #func}. */
    public static long nfunc(long struct) { return memGetAddress(struct + CUDA_KERNEL_NODE_PARAMS_v2.FUNC); }
    /** Unsafe version of {@link #gridDimX}. */
    public static int ngridDimX(long struct) { return UNSAFE.getInt(null, struct + CUDA_KERNEL_NODE_PARAMS_v2.GRIDDIMX); }
    /** Unsafe version of {@link #gridDimY}. */
    public static int ngridDimY(long struct) { return UNSAFE.getInt(null, struct + CUDA_KERNEL_NODE_PARAMS_v2.GRIDDIMY); }
    /** Unsafe version of {@link #gridDimZ}. */
    public static int ngridDimZ(long struct) { return UNSAFE.getInt(null, struct + CUDA_KERNEL_NODE_PARAMS_v2.GRIDDIMZ); }
    /** Unsafe version of {@link #blockDimX}. */
    public static int nblockDimX(long struct) { return UNSAFE.getInt(null, struct + CUDA_KERNEL_NODE_PARAMS_v2.BLOCKDIMX); }
    /** Unsafe version of {@link #blockDimY}. */
    public static int nblockDimY(long struct) { return UNSAFE.getInt(null, struct + CUDA_KERNEL_NODE_PARAMS_v2.BLOCKDIMY); }
    /** Unsafe version of {@link #blockDimZ}. */
    public static int nblockDimZ(long struct) { return UNSAFE.getInt(null, struct + CUDA_KERNEL_NODE_PARAMS_v2.BLOCKDIMZ); }
    /** Unsafe version of {@link #sharedMemBytes}. */
    public static int nsharedMemBytes(long struct) { return UNSAFE.getInt(null, struct + CUDA_KERNEL_NODE_PARAMS_v2.SHAREDMEMBYTES); }
    /** Unsafe version of {@link #kernelParams(int) kernelParams}. */
    @Nullable public static PointerBuffer nkernelParams(long struct, int capacity) { return memPointerBufferSafe(memGetAddress(struct + CUDA_KERNEL_NODE_PARAMS_v2.KERNELPARAMS), capacity); }
    /** Unsafe version of {@link #extra(int) extra}. */
    @Nullable public static PointerBuffer nextra(long struct, int capacity) { return memPointerBufferSafe(memGetAddress(struct + CUDA_KERNEL_NODE_PARAMS_v2.EXTRA), capacity); }
    /** Unsafe version of {@link #kern}. */
    public static long nkern(long struct) { return memGetAddress(struct + CUDA_KERNEL_NODE_PARAMS_v2.KERN); }
    /** Unsafe version of {@link #ctx}. */
    public static long nctx(long struct) { return memGetAddress(struct + CUDA_KERNEL_NODE_PARAMS_v2.CTX); }

    /** Unsafe version of {@link #func(long) func}. */
    public static void nfunc(long struct, long value) { memPutAddress(struct + CUDA_KERNEL_NODE_PARAMS_v2.FUNC, value); }
    /** Unsafe version of {@link #gridDimX(int) gridDimX}. */
    public static void ngridDimX(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_KERNEL_NODE_PARAMS_v2.GRIDDIMX, value); }
    /** Unsafe version of {@link #gridDimY(int) gridDimY}. */
    public static void ngridDimY(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_KERNEL_NODE_PARAMS_v2.GRIDDIMY, value); }
    /** Unsafe version of {@link #gridDimZ(int) gridDimZ}. */
    public static void ngridDimZ(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_KERNEL_NODE_PARAMS_v2.GRIDDIMZ, value); }
    /** Unsafe version of {@link #blockDimX(int) blockDimX}. */
    public static void nblockDimX(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_KERNEL_NODE_PARAMS_v2.BLOCKDIMX, value); }
    /** Unsafe version of {@link #blockDimY(int) blockDimY}. */
    public static void nblockDimY(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_KERNEL_NODE_PARAMS_v2.BLOCKDIMY, value); }
    /** Unsafe version of {@link #blockDimZ(int) blockDimZ}. */
    public static void nblockDimZ(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_KERNEL_NODE_PARAMS_v2.BLOCKDIMZ, value); }
    /** Unsafe version of {@link #sharedMemBytes(int) sharedMemBytes}. */
    public static void nsharedMemBytes(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_KERNEL_NODE_PARAMS_v2.SHAREDMEMBYTES, value); }
    /** Unsafe version of {@link #kernelParams(PointerBuffer) kernelParams}. */
    public static void nkernelParams(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + CUDA_KERNEL_NODE_PARAMS_v2.KERNELPARAMS, memAddressSafe(value)); }
    /** Unsafe version of {@link #extra(PointerBuffer) extra}. */
    public static void nextra(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + CUDA_KERNEL_NODE_PARAMS_v2.EXTRA, memAddressSafe(value)); }
    /** Unsafe version of {@link #kern(long) kern}. */
    public static void nkern(long struct, long value) { memPutAddress(struct + CUDA_KERNEL_NODE_PARAMS_v2.KERN, value); }
    /** Unsafe version of {@link #ctx(long) ctx}. */
    public static void nctx(long struct, long value) { memPutAddress(struct + CUDA_KERNEL_NODE_PARAMS_v2.CTX, value); }

    // -----------------------------------

    /** An array of {@link CUDA_KERNEL_NODE_PARAMS_v2} structs. */
    public static class Buffer extends StructBuffer<CUDA_KERNEL_NODE_PARAMS_v2, Buffer> implements NativeResource {

        private static final CUDA_KERNEL_NODE_PARAMS_v2 ELEMENT_FACTORY = CUDA_KERNEL_NODE_PARAMS_v2.create(-1L);

        /**
         * Creates a new {@code CUDA_KERNEL_NODE_PARAMS_v2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_KERNEL_NODE_PARAMS_v2#SIZEOF}, and its mark will be undefined.
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
        protected CUDA_KERNEL_NODE_PARAMS_v2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code func} field. */
        @NativeType("CUfunction")
        public long func() { return CUDA_KERNEL_NODE_PARAMS_v2.nfunc(address()); }
        /** @return the value of the {@code gridDimX} field. */
        @NativeType("unsigned int")
        public int gridDimX() { return CUDA_KERNEL_NODE_PARAMS_v2.ngridDimX(address()); }
        /** @return the value of the {@code gridDimY} field. */
        @NativeType("unsigned int")
        public int gridDimY() { return CUDA_KERNEL_NODE_PARAMS_v2.ngridDimY(address()); }
        /** @return the value of the {@code gridDimZ} field. */
        @NativeType("unsigned int")
        public int gridDimZ() { return CUDA_KERNEL_NODE_PARAMS_v2.ngridDimZ(address()); }
        /** @return the value of the {@code blockDimX} field. */
        @NativeType("unsigned int")
        public int blockDimX() { return CUDA_KERNEL_NODE_PARAMS_v2.nblockDimX(address()); }
        /** @return the value of the {@code blockDimY} field. */
        @NativeType("unsigned int")
        public int blockDimY() { return CUDA_KERNEL_NODE_PARAMS_v2.nblockDimY(address()); }
        /** @return the value of the {@code blockDimZ} field. */
        @NativeType("unsigned int")
        public int blockDimZ() { return CUDA_KERNEL_NODE_PARAMS_v2.nblockDimZ(address()); }
        /** @return the value of the {@code sharedMemBytes} field. */
        @NativeType("unsigned int")
        public int sharedMemBytes() { return CUDA_KERNEL_NODE_PARAMS_v2.nsharedMemBytes(address()); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@code kernelParams} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("void **")
        public PointerBuffer kernelParams(int capacity) { return CUDA_KERNEL_NODE_PARAMS_v2.nkernelParams(address(), capacity); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@code extra} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("void **")
        public PointerBuffer extra(int capacity) { return CUDA_KERNEL_NODE_PARAMS_v2.nextra(address(), capacity); }
        /** @return the value of the {@code kern} field. */
        @NativeType("CUkernel")
        public long kern() { return CUDA_KERNEL_NODE_PARAMS_v2.nkern(address()); }
        /** @return the value of the {@code ctx} field. */
        @NativeType("CUcontext")
        public long ctx() { return CUDA_KERNEL_NODE_PARAMS_v2.nctx(address()); }

        /** Sets the specified value to the {@code func} field. */
        public CUDA_KERNEL_NODE_PARAMS_v2.Buffer func(@NativeType("CUfunction") long value) { CUDA_KERNEL_NODE_PARAMS_v2.nfunc(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimX} field. */
        public CUDA_KERNEL_NODE_PARAMS_v2.Buffer gridDimX(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS_v2.ngridDimX(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimY} field. */
        public CUDA_KERNEL_NODE_PARAMS_v2.Buffer gridDimY(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS_v2.ngridDimY(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimZ} field. */
        public CUDA_KERNEL_NODE_PARAMS_v2.Buffer gridDimZ(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS_v2.ngridDimZ(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimX} field. */
        public CUDA_KERNEL_NODE_PARAMS_v2.Buffer blockDimX(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS_v2.nblockDimX(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimY} field. */
        public CUDA_KERNEL_NODE_PARAMS_v2.Buffer blockDimY(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS_v2.nblockDimY(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimZ} field. */
        public CUDA_KERNEL_NODE_PARAMS_v2.Buffer blockDimZ(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS_v2.nblockDimZ(address(), value); return this; }
        /** Sets the specified value to the {@code sharedMemBytes} field. */
        public CUDA_KERNEL_NODE_PARAMS_v2.Buffer sharedMemBytes(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS_v2.nsharedMemBytes(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code kernelParams} field. */
        public CUDA_KERNEL_NODE_PARAMS_v2.Buffer kernelParams(@Nullable @NativeType("void **") PointerBuffer value) { CUDA_KERNEL_NODE_PARAMS_v2.nkernelParams(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code extra} field. */
        public CUDA_KERNEL_NODE_PARAMS_v2.Buffer extra(@Nullable @NativeType("void **") PointerBuffer value) { CUDA_KERNEL_NODE_PARAMS_v2.nextra(address(), value); return this; }
        /** Sets the specified value to the {@code kern} field. */
        public CUDA_KERNEL_NODE_PARAMS_v2.Buffer kern(@NativeType("CUkernel") long value) { CUDA_KERNEL_NODE_PARAMS_v2.nkern(address(), value); return this; }
        /** Sets the specified value to the {@code ctx} field. */
        public CUDA_KERNEL_NODE_PARAMS_v2.Buffer ctx(@NativeType("CUcontext") long value) { CUDA_KERNEL_NODE_PARAMS_v2.nctx(address(), value); return this; }

    }

}