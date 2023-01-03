package edu.kh.network.model.run;

import edu.kh.network.model.service.TCPClient;

public class Run {

	public static void main(String[] args) {

		TCPClient client = new TCPClient();
		client.clientStart();
			
	}

}
