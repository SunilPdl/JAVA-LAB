# Java Networking:

The term network programming refers to writing programs that execute across multiple devices (computers), in which the devices are all connected to each other using a network.

The java.net package of the J2SE APIs contains a collection of classes and interfaces that provide the low-level communication details, allowing you to write programs that focus on solving the problem at hand.

The java.net package provides support for the two common network protocols:−

### TCP:
 TCP stands for Transmission Control Protocol, which allows for reliable communication between two applications. TCP is typically used over the Internet Protocol, which is referred to as TCP/IP.

### UDP:
 UDP stands for User Datagram Protocol, a connection-less protocol that allows for packets of data to be transmitted between applications.


### Socket Programming:

Sockets provide the communication mechanism between two computers using TCP. A client program creates a socket on its end of the communication and attempts to connect that socket to a server.

When the connection is made, the server creates a socket object on its end of the communication. The client and the server can now communicate by writing to and reading from the socket.

The java.net.Socket class represents a socket, and the java.net.ServerSocket class provides a mechanism for the server program to listen for clients and establish connections with them.

The following steps occur when establishing a TCP connection between two computers using sockets:

1. The server instantiates a ServerSocket object, denoting which port number communication is to occur on.

2. The server invokes the accept() method of the ServerSocket class. This method waits until a client connects to the server on the given port.

3. After the server is waiting, a client instantiates a Socket object, specifying the server name and the port number to connect to.

4. The constructor of the Socket class attempts to connect the client to the specified server and the port number. If communication is established, the client now has a Socket object capable of communicating with the server.

5. On the server side, the accept() method returns a reference to a new socket on the server that is connected to the client's socket.

After the connections are established, communication can occur using I/O streams. Each socket has both an OutputStream and an InputStream. The client's OutputStream is connected to the server's InputStream, and the client's InputStream is connected to the server's OutputStream.

TCP is a two-way communication protocol, hence data can be sent across both streams at the same time. Following are the useful classes providing complete set of methods to implement sockets.

## ServerSocket Class Methods

The java.net.ServerSocket class is used by server applications to obtain a port and listen for client requests.

The ServerSocket class has four constructors.

>Important methods

|Method	 | Description |
|--------|-------------|
|1)``` public Socket accept() ```| returns the socket and establish a connection between server and client. |
|2)``` public synchronized void close()``` |	closes the server socket. |

### Socket 

A socket is simply an endpoint for communications between the machines. The Socket class can be used to create a socket.

>Important methods

| Method	| Description |
|-----------|-------------|
|1)``` public InputStream getInputStream() ```|	returns the InputStream attached with this socket. |
|2)``` public OutputStream getOutputStream()``` |	returns the OutputStream attached with this socket. |
|3)``` public synchronized void close()``` |	closes this socket |

### URL Class

The URL class is the gateway to any of the resource available on the internet. A Class URL represents a Uniform Resource Locator, which is a pointer to a “resource” on the World Wide Web. A resource can point to a simple file or directory, or it can refer to a more complicated object, such as a query to a database or to a search engine

### URL
As many of you must be knowing that Uniform Resource Locator-URL is a string of text that identifies all the resources on Internet, telling us the address of the resource, how to communicate with it and retrieve something from it.

A Simple URL looks like:

![URL](https://media.geeksforgeeks.org/wp-content/uploads/URL-Class.png)

>Constructors of Java URL class

- URL(String spec)
	- Creates an instance of a URL from the String representation.

- URL(String protocol, String host, int port, String file)
	- Creates an instance of a URL from the given protocol, host, port number, and file.

- URL(String protocol, String host, int port, String file, URLStreamHandler handler)
	- Creates an instance of a URL from the given protocol, host, port number, file, and handler.

- URL(String protocol, String host, String file)
	- Creates an instance of a URL from the given protocol name, host name, and file name.

- URL(URL context, String spec)
	- Creates an instance of a URL by parsing the given spec within a specified context.

- URL(URL context, String spec, URLStreamHandler handler)
	- Creates an instance of a URL by parsing the given spec with the specified handler within a given context.

>Commonly used methods of Java URL class

The java.net.URL class provides many methods. The important methods of URL class are given below.

| Method |	Description |
|--------|--------------|
|```public String getProtocol()	```| it returns the protocol of the URL. |
|```public String getHost() ```|	it returns the host name of the URL. |
|```public String getPort() ```|	it returns the Port Number of the URL. |
|```public String getFile() ```|	it returns the file name of the URL. |
|```public String getAuthority()``` |	it returns the authority of the URL. |
|```public String toString()``` |	it returns the string representation of the URL. |
|```public String getQuery()``` |	it returns the query string of the URL. |
|```public String getDefaultPort()``` |	it returns the default port of the URL. |
|```public URLConnection openConnection()``` |	it returns the instance of URLConnection i.e. associated with this URL. |
|```public boolean equals(Object obj)``` |	it compares the URL with the given object. |
|```public Object getContent()``` |	it returns the content of the URL. |
|```public String getRef()``` |	it returns the anchor or reference of the URL. |
|```public URI toURI()``` |	it returns a URI of the URL. |
