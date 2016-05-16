package ch1;


import javax.websocket.*;
import javax.websocket.server.*;
@ServerEndpoint("/echo")
public class EchoServer {
	
	
	@OnMessage
	public String echo(String incomingMessage1){
		return "I got this("+incomingMessage1+")"+"so I am sending it back";
	}

}
