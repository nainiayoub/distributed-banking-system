# distributed-banking-system
A distributed banking system that consists of two parts: one for the client and another for the server.<br/>
Check out __More info__ for french ressources and project presentation :point_down: 
# RMI architecture
The remote method invocation goes through a `STUB` on the client side and a so called `SKELETON` on the server side.
### STUB 
A stub for a remote object acts as a client's local representative for the remote object. In RMI, a stub for a remote object implements the same set of remote interfaces that a remote object implements. 
```
    .
    ├── ...
    ├── ClientRMI
    |   ├── src                    
    |   │   └── ClientRMI.java         
    |   └── ...      
    └── ...
```
### SKELETON
When a skeleton receives an incoming method invocation it does the following:
* Unmarshals (reads) the parameters for the remote method,
* Invokes the method on the actual remote object implementation, and
* Marshals (writes and transmits) the result (return value or exception) to the caller.
```
    .
    ├── ...
    ├── RMISERVER
    |   ├── src                    
    |   │   └── ServeurRMI.java         
    |   └── ...      
    └── ...
```
# RMI registry
I have started the RMI Registry within the server JVM, via the `LocateRegistry.createRegistry()` API.<br/>
(Default port: 1099) 
* Remote objects can be listed in the `RMI Registry`.
* Clients can get a reference to the `remote object` by querying the Registry. 
* After that, the client can call methods on the remote objects. <br/>   

# Establishing connection with Telnet
From the client machine
1. Activate Telnet protocol.
2. Find out the ip address of the server.
3. Type `Telnet <IP Address> <port number>`
__Note:__ Do not include the <> when entering the IP Address and the Port Number.

# More Info
Feel free to check out these ressources (in french)
* :point_right: [PPT project presentation](https://www.slideshare.net/AyoubNAINIA/rmi-remote-method-invocation-en-java)
