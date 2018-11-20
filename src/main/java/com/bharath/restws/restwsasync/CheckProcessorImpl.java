package com.bharath.restws.restwsasync;

import javax.ws.rs.container.AsyncResponse;

import org.springframework.stereotype.Service;

import com.bharath.restws.model.ChecksList;
import com.bharath.restws.restwsasync.CheckProcessor;
@Service
public class CheckProcessorImpl implements CheckProcessor{


	@Override
	public void processChecks(AsyncResponse response,ChecksList checksList) {
		System.out.println("there");
		new Thread() {
			public void run() {
				response.resume(true);
				
			}
		}.start();

	}

}
