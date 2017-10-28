package com.backBenchers.twitter;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.backBenchers.twitter.service.TwitterAPIService;


@RunWith(MockitoJUnitRunner.class)
public class TwitterAPIDirectMessageBeanTest {
	
	@Mock
	TwitterAPIService twitterAPIServiceMock;
	
	@InjectMocks
	TwitterAPIDirectMessageBean twitterAPIDirectMessageBean;
	
	@Test
	public void test() {
		
		when(twitterAPIServiceMock.directMessage(anyString())).thenReturn("message sent");
		
		assertEquals("message sent",twitterAPIDirectMessageBean.directMessage("test"));
	}

}

