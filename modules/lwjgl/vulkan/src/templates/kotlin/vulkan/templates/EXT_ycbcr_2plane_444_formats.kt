/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_ycbcr_2plane_444_formats = "EXTYcbcr2plane444Formats".nativeClassVK("EXT_ycbcr_2plane_444_formats", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension adds some Y′C<sub>B</sub>C<sub>R</sub> formats that are in common use for video encode and decode, but were not part of the {@link KHRSamplerYcbcrConversion VK_KHR_sampler_ycbcr_conversion} extension.

        <h5>Promotion to Vulkan 1.3</h5>
        This extension has been partially promoted. The format enumerants introduced by the extension are included in core Vulkan 1.3, with the EXT suffix omitted. However, runtime support for these formats is optional in core Vulkan 1.3, while if this extension is supported, runtime support is mandatory. The feature structure is not promoted. The original enum names are still available as aliases of the core functionality.

        <h5>VK_EXT_ycbcr_2plane_444_formats</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_ycbcr_2plane_444_formats}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>331</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRSamplerYcbcrConversion VK_KHR_sampler_ycbcr_conversion} or <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1">Version 1.1</a></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.3-promotions">Vulkan 1.3</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tony Zlatinski <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_ycbcr_2plane_444_formats]%20@tzlatinski%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_ycbcr_2plane_444_formats%20extension*">tzlatinski</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-07-28</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.3 Core</li>
            </ul></dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Piers Daniell, NVIDIA</li>
                <li>Ping Liu, Intel</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_YCBCR_2PLANE_444_FORMATS_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_YCBCR_2PLANE_444_FORMATS_EXTENSION_NAME".."VK_EXT_ycbcr_2plane_444_formats"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT".."1000330000"
    )

    EnumConstant(
        "Extends {@code VkFormat}.",

        "FORMAT_G8_B8R8_2PLANE_444_UNORM_EXT".."1000330000",
        "FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16_EXT".."1000330001",
        "FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16_EXT".."1000330002",
        "FORMAT_G16_B16R16_2PLANE_444_UNORM_EXT".."1000330003"
    )
}