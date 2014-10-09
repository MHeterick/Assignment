package Assignment;

import java.io.*;


public class Assignment {
	
	static String network_scheme;
	static String routing_scheme;
	static NetworkTop NetworkTopology;

	public static void main(String[] args) throws Exception{
		
		if (args.length!=5){
			System.out.println("Incorrect number of arguments");
			return;
		}
		
		network_scheme = args[0];
		routing_scheme = args[1];
		File topology = new File(args[2]);
		File workload = new File(args[3]);
		Integer packet_rate= Integer.parseInt(args[4]);
		
		NetworkTopology = new NetworkTop(topology);
		
		NetworkTopology.printNetwork();
		

	}

}
