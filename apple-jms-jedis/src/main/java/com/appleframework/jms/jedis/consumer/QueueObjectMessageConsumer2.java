package com.appleframework.jms.jedis.consumer;

import com.appleframework.jms.core.consumer.IMessageConusmer;
import com.appleframework.jms.core.utils.ByteUtils;

/**
 * @author Cruise.Xu
 * 
 */
public class QueueObjectMessageConsumer2 extends QueueBaseMessageConsumer {

	private IMessageConusmer<Object> messageConusmer;

	public void setMessageConusmer2(IMessageConusmer<Object> messageConusmer2) {
		this.messageConusmer = messageConusmer2;
	}

	@Override
	public void processByteMessage(byte[] message) {
		messageConusmer.processMessage(ByteUtils.toBytes(message));
	}

}
