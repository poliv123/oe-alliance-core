SUMMARY = "Base packages require for image."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

ALLOW_EMPTY_${PN} = "1"
PACKAGES = "${PN}"

PV = "1.0"
PR = "r1"

inherit packagegroup

RDEPENDS_${PN} = "\
	oe-alliance-base \
	\
	egami-enigma2 \
	egami-bootlogo \
	egami-version-info \
	egami-base-files \
	\
	ntfs-3g \
	dosfstools \
"

RRECOMMENDS_${PN} = "\
	streamripper \
	hddtemp \
	hdparm \
	dvbsnoop \
	minidlna \
	djmount \
	python-imaging python-compression \
	kernel-module-ftdi-sio \
	kernel-module-pl2303 \
	${@bb.utils.contains("MACHINE_FEATURES", "boxmodel", "boxmodel", "", d)} \
	${@bb.utils.contains("MACHINE_FEATURES", "dreambox", "", "ofgwrite", d)} \
	${@bb.utils.contains("TUNE_FEATURES", "armv7a", "glibc-compat", "", d)} \
"
