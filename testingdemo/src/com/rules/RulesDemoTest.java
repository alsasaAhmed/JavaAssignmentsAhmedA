package com.rules;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.jupiter.api.Test;

import org.junit.rules.TemporaryFolder;
import org.junit.rules.Timeout;

public class RulesDemoTest {
	
	@Rule
	public TemporaryFolder temporaryfolder = new TemporaryFolder();
	
	//public Timeout timeout = new Timeout(2, TimeUnit.SECONDS);
	@Rule
	public Timeout timeout = new Timeout(2, TimeUnit.SECONDS);
	
	@Test
	public void testFile() throws IOException {
		File file = temporaryfolder.newFolder("testfolder");
		File file2 = temporaryfolder.newFile("abc.txt");
		assertTrue(file.exists());
		assertTrue(file2.exists());
	}
	
	@Test
	public void testTime() throws InterruptedException{
		Thread.sleep(1000);
	}
	
	@Test
	public void testTime2() throws InterruptedException{
		Thread.sleep(3000);
	}
}
