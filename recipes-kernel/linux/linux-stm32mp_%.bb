SUMMARY = "Linux STM32MP Kernel (SL77 extra setup)"
SECTION = "kernel"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

LINUX_VERSION = "5.15"

FILESEXTRAPATHS:prepend := "${THISDIR}/linux-stm32mp:"


# Prevent the use of in-tree defconfig
#### unset KBUILD_DEFCONFIG

#### CUSTOM_DEVICETREE = "my-custom-devicetree-file.dts"

#### KERNEL_CONFIG_FRAGMENTS += "${WORKDIR}/fragments/${LINUX_VERSION}/fragment-10-can.config"

#### SRC_URI += "file://${LINUX_VERSION}/fragment-10-can.config"

# Don't forget to add/del for devupstream
#### SRC_URI:class-devupstream += "file://${LINUX_VERSION}/fragment-10-can.config;subdir=fragments"

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

SRC_URI += "file://sl77_dk2_defconfig"
#### KERNEL_DEFCONFIG_var-som-mx6 = "${WORKDIR}/sl77_dk2_defconfig"
KERNEL_DEFCONFIG        = "sl77_dk2_defconfig"
