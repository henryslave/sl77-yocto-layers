SUMMARY = "Linux STM32MP Kernel (SL77 extra setup)"
SECTION = "kernel"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

LINUX_VERSION = "5.15"

FILESEXTRAPATHS:prepend := "${THISDIR}/linux-stm32mp:"


# Prevent the use of in-tree defconfig
unset KBUILD_DEFCONFIG

# -------------------------------------------------------------
# Defconfig
#
KERNEL_CONFIG_FRAGMENTS += "${WORKDIR}/fragments/${LINUX_VERSION}/fragment-10-can.config"

SRC_URI += "file://${LINUX_VERSION}/fragment-10-can.config;subdir=fragments"

# Don't forget to add/del for devupstream
SRC_URI:class-devupstream += "file://${LINUX_VERSION}/fragment-10-can.config;subdir=fragments"

