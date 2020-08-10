package com.mogiio.rtsp.rtp.packets;

import com.mogiio.rtsp.rtsp.RtpFrame;

/**
 * Created by pedro on 7/11/18.
 */

public interface VideoPacketCallback {
  void onVideoFrameCreated(RtpFrame rtpFrame);
}
