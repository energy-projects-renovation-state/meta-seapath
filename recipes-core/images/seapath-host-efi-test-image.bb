# Copyright (C) 2020, RTE (http://www.rte-france.com)
# SPDX-License-Identifier: Apache-2.0

DESCRIPTION = "A test image for Seapath"
require seapath-host-common.inc

# Real time Tools
IMAGE_INSTALL += "rt-tests"

# KVM unit tests
IMAGE_INSTALL += "kvm-unit-tests"

# Add ptests
EXTRA_IMAGE_FEATURES += "ptest-pkgs"
IMAGE_INSTALL += "ptest-runner"

# Active Directory tools
IMAGE_INSTALL += " \
    adcli \
    krb5-user \
    sssd \
"

# Add extra space for testing
IMAGE_ROOTFS_EXTRA_SPACE = "2465792"