#
# Copyright (C) 2011 Intel Corporation
#

LICENSE = "MIT"
PR = "r38"

inherit packagegroup

PACKAGE_ARCH = "${MACHINE_ARCH}"

PACKAGES = "${PN}"

XSERVER ?= "xserver-xorg xf86-video-fbdev xf86-input-evdev"

SUMMARY_${PN} = "X11 display server"
RDEPENDS_${PN} = "\
    ${XSERVER} \
    "

# Allow replacing task-x11-server in meta-oe
RPROVIDES_${PN} = "task-x11-server task-xserver"
RREPLACES_${PN} = "task-x11-server task-xserver"
RCONFLICTS_${PN} = "task-x11-server task-xserver"