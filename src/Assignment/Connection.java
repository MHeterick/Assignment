package Assignment;

public class Connection {
	
	String start;
	String end;
	Integer propDelay;
	Integer maxConnections;
	Integer currentConnections;
	
	public Connection(String args){
		
		String[] temp = args.split(" ");
		start = temp[0];
		end = temp[1];
		propDelay = Integer.parseInt(temp[2]);
		maxConnections = Integer.parseInt(temp[3]);
		currentConnections = 0;
		
	}
	
	public String toString() {
		
		return (start+" "+end+" "+Integer.toString(propDelay)+" "+Integer.toString(maxConnections));
	}
	
}
