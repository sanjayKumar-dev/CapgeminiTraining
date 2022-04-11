package com.sanjay.reciver;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

@Component
public class JMSReceiver implements ChannelAwareMessageListener
{

	@Override
	public void onMessage(Message message, com.rabbitmq.client.Channel channel) throws Exception
	{
		System.out.println("Received <" + message + ">");
		channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
	}

	
}
