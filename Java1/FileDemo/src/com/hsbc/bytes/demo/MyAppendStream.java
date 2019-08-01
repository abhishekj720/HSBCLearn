package com.hsbc.bytes.demo;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyAppendStream extends ObjectOutputStream {
	
	public MyAppendStream(OutputStream out) throws IOException{
		super(out);
	}

	@Override
	protected void writeStreamHeader() throws IOException {
		reset();
	}

	
}
