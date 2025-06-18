import java.io.*;
import java.net.*;

public class App {
  public static void main(String[] args) throws Exception {
    var server = new ServerSocket(8080);
    while (true) {
      var s = server.accept();
      var out = new PrintWriter(s.getOutputStream(), true);
      out.println("HTTP/1.1 200 OK\r\n\r\nHola desde Java - " + InetAddress.getLocalHost().getHostName());
      s.close();
    }
  }
}
