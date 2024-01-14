package com.java;

import java.io.IOException;
import java.util.Arrays;

public class TestRunner {
	
	public static void main(String[] args) throws InterruptedException {
        try {
            // Specify the path to your runnable JAR file
            String jarPath = "C:\\Users\\satya\\OneDrive\\Desktop\\Main.jar";

            // Specify command-line arguments (replace with your actual arguments)
            String[] jarArguments = {"arg1"};

            // Use ProcessBuilder to run the JAR file with arguments
            ProcessBuilder processBuilder = new ProcessBuilder("java", "-jar", jarPath);
            processBuilder.command().addAll(Arrays.asList(jarArguments));

            Process process = processBuilder.start();
            
            int s = process.waitFor();

            System.out.println(s);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}
