# Steps to run the code

## Step 1:

git clone https://github.com/rahullahoria/rtmp-android-streamer

## Step 2:

Open project in Android Studio

## Step 3:

Build the code

## Permissions:

```xml
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.RECORD_AUDIO" />
<uses-permission android:name="android.permission.CAMERA" />
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
<!--Optional for play store-->
<uses-feature android:name="android.hardware.camera" android:required="false" />
<uses-feature android:name="android.hardware.camera.autofocus" android:required="false" />
```


## Features:

- [x] Android min API 16.
- [x] Support [camera1](https://developer.android.com/reference/android/hardware/Camera.html) and [camera2](https://developer.android.com/reference/android/hardware/camera2/package-summary.html) API
- [x] Encoder type buffer to buffer.
- [x] Encoder type surface to buffer.
- [x] RTMP/RTSP auth.
- [x] Audio noise suppressor.
- [x] Audio echo cancellation.
- [x] Disable/Enable video and audio while streaming.
- [x] Switch camera while streaming.
- [x] Change video bitrate while streaming (API 19+).
- [X] Get upload bandwidth used.
- [X] Record MP4 file while streaming (API 18+).
- [x] H264, H265 and AAC hardware encoding.
- [x] Force H264 and AAC Codec hardware/software encoding (Not recommended).
- [x] RTSP TCP/UDP.
- [x] Stream from video files like mp4, webm, etc (Limited by device decoders).
- [x] Stream device display(API 21+).
- [X] Set Image, Gif or Text to stream on real time.
- [X] OpenGL real time filters. 
- [X] RTMPS and RTSPS
- [X] RTSP H265 support (Waiting FLV official packetization to add RTMP support).

