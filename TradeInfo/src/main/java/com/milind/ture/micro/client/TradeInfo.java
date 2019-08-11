package com.milind.ture.micro.client;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class TradeInfo {
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
	public String greeting(@RequestParam() String name) {
		String data = counter.incrementAndGet() + " Trade information";
		return data;
	}
}
