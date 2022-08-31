SUMMARY = "Linux STM32MP Kernel (SL77 extra setup)"
SECTION = "kernel"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

FILESEXTRAPATHS:prepend := "${THISDIR}/linux-stm32mp:"


# Prevent the use of in-tree defconfig
unset KBUILD_DEFCONFIG

#### CUSTOM_DEVICETREE = "my-custom-devicetree-file.dts"

#### SRC_URI += "\ 
####    file://${CUSTOM_DEVICETREE} \
####    file://custom-display.patch \
####    file://defconfig \
####    "

#### do_configure_append() {
####    # For arm32 bit devices
####    cp ${WORKDIR}/${CUSTOM_DEVICETREE} ${S}/arch/arm/boot/dts
####    # For arm64 bit freescale/NXP devices
####    # cp ${WORKDIR}/${CUSTOM_DEVICETREE} ${S}/arch/arm64/boot/dts/freescale
#### }


