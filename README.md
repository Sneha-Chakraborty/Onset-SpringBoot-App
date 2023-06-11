## :: SpringBoot Application Insights ::
  
![FlowersAestheticGIF](https://github.com/Sneha-Chakraborty/Onset-SpringBoot-App/assets/127219393/81f03cdc-7967-4e0c-930c-a34623ddb5d6)



💚 This is a v1 of a SpringBoot Application and here how it works when we execute this springboot application :-
  
1. It starts the SpringBoot application named SpringBootExampleApplication on 'PC Service Tag' name with a certain Process ID (PID).  Means the app gets a core of CPU where it is starting to execute. Also, it logs the location of the app's compiled class files and the username.  <br>
  
  
  
2. Then it states the profile that is active and if no profile is active, then it simply uses the default profile. Profiles are used to configure the application for different environments or scenarios. To activate a profile other than 'default', do this in application.properties file :-  


 ```spring.profiles.active = development | test | staging | production | integration | integration-crm | caching | logging | multi-tenant | messaging | cloud | docker```

  
    (Select any one at a time or use the default profile)
<br>
  

3. Then, tomcat server is initialized with the port number mentioned in application.properties file like this :- server.port=9090
  Tomcat is Java-based web server and servlet container.  
  <br>

4. It then logs that the tomcat server is starting now.
   o.apache.catalina.core.StandardService   : Starting service [Tomcat].
<br>
  

5. It is logged : Starting Servlet engine: [Apache Tomcat/9.0.29]. Means that it is confirming that the Tomcat Service of the specified version is being started.
 <br>
   

6. It logs :- o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext. WebApplicationContext is a part of the Spring Framework responsible for managing & configuring web components.
<br>
  

7. WebApplicationContext initialization gets completed in 'x' seconds indicating the main application context has been initiated successfully.
<br>
  

8. Initialization of an ExecutorService named 'applicationTaskExecutor' takes place. ExecutorService is a concurrent utility class in Java that provides an abstraction for managing and executing tasks asynchronously.
 <br>
   

9. Tomcat gets started successfully and it starts listening to the HTTP requests on the port specified.
<br>  

10. Finally our springboot application is started in 'y' seconds and now our app is successfully operational. It also states that along with this, JVM (Java Virtual Machine) has also been running for 'z' seconds since the launch of our app.
 <br>
   
- When we stop the service by ctrl+F2 (windows-intelliJ) or cmd+F2 (mac) or ctrl+c (Linux/Unix), it displays : Process finished with exit code 130. This means the process was terminated by a signal.
In Unix-like systems, signals are used to communicate with processes. They can be sent by the OS, other processes, or by user actions.
  
- Signal 130 corresponds to the signal number SIGINT (interrupt signal) + 128. The SIGINT signal is typically generated when a user presses Ctrl+C on the keyboard to send an interrupt signal to a running process.   


- Overall, this is the procedural flow of what happens after we execute our springboot application using Maven as build-tool and Tomcat as the embedded web-server.

--------------
