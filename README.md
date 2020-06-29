# distributed-banking-system
A distributed banking system that consists of two parts: one for the client and another for the server.
# RMI Server
# RMI Client
# RMI registry
* Remote objects can be listed in the RMI Registry.
* Clients can get a reference to the remote object by querying the Registry. 
* After that, the client can call methods on the remote objects. <br/>   
I have started the RMI Registry within the server JVM, via the LocateRegistry.createRegistry() API (default port: 1099). 


    .
    ├── ...
    ├── docs                    # Documentation files (alternatively `doc`)
    │   ├── TOC.md              # Table of contents
    │   ├── faq.md              # Frequently asked questions
    │   ├── misc.md             # Miscellaneous information
    │   ├── usage.md            # Getting started guide
    │   └── ...                 # etc.
    └── ...


    .
    ├── ...
    ├── RMISERVER
    |   ├── src                    
    |   │   └── ServeurRMI.java         
    |   └── ...      
    └── ...
