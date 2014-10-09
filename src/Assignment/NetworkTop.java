package Assignment;

import java.io.*;
import java.util.*;
import java.nio.charset.Charset;
import java.nio.file.*;


public class NetworkTop {
	
	List<Connection> connections = new LinkedList<Connection>();

	public NetworkTop(File topology) throws Exception{
		
		List<String> inputs = Files.readAllLines(topology.toPath(),Charset.forName("UTF-8"));
		
		for(String line:inputs) {
			connections.add(new Connection(line));
		}
		
	}
	
	public void printNetwork() {
		for(Connection out:connections) {
			System.out.println(out.toString()+"\n");
		}
		System.out.println("Network Printed");
	}

}
