


DEPARTMENT OF COMPUTER SCIENCE & ENGINEERING

      A Project Report on
Bus Tracking and Fuel Monitoring System
Submitted by


		         RAJATH M              1MS16CS053	        
         RAVIKUMAR          1MS16CS076
         PRATHEEK S.N      1MS16CS067
         VIPUL                       1MS16CS143

Bachelor of Engineering in Computer Science & Engineering 
Under the guidance of 

                                           DR. DIVAKAR HAREKAL 	
	       ASSISTANT PROFESSOR , Dept. of CSE , RIT , Bangalore	

				



RAMAIAH INSTITUTE OF TECHNOLOGY
(Autonomous Institute, Affiliated to VTU)
BANGALORE-560054
2018-2019, www.msrit.edu, 






DEPARTMENT OF COMPUTER SCIENCE & ENGINEERING

A Project Report on
          Bus Tracking and Fuel Monitoring System 
Submitted by

                               RAJATH M              1MS16CS053	        
         RAVIKUMAR         1MS16CS076
         PRATHEEK S.N     1MS16CS067
         VIPUL                      1MS16CS143



Bachelor of Engineering in Computer Science & Engineering 
Under the guidance of 

	 			DR. DIVAKAR  HAREKAL 	
	       ASSISTANT PROFESSOR , Dept. of CSE , RIT , Bangalore	


					  
				
				


RAMAIAH INSTITUTE OF TECHNOLOGY
(Autonomous Institute, Affiliated to VTU)
BANGALORE-560054
2018-2019, www.msrit.edu, 



 	 Ramaiah Institute of Technology
(Autonomous Institute, Affiliated to VTU)
BANGALORE-560054
Department of Computer Science & Engineering



CERTIFICATE


This is to certify that the project work titled Bus Tracking and Fuel Monitoring System is a bonafide work carried out by 1MS16CS053-RAJATH M , 1MS16CS076-RAVIKUMAR , 1MS16CS067-PRATHEEK S.N & 1MS16CS143-VIPUL  in partial fulfillment for the course of Bachelor of Engineering in Computer Science and Engineering during the year 2018. The Project report has been approved as it satisfies the academic requirements with respect to the project work. To the best of our understanding the work submitted in this report has not been submitted anywhere.

 

Signature of the Guide				            Signature of the HOD    
Name of Internal Guide  				            Name of HOD  	



External Examiners      

Name of the Examiners:						Signature
1.

2.







DECLARATION

We Student of sixth semester BE, Dept. of Computer Science and Engineering, Ramaiah Institute of Technology, Bangalore, hereby declare that the project entitled “Bus Tracking and Fuel Monitoring System ”,  work completed and written by me under the guidance of Dr.Divakar Harekal, Dept. of CSE, Bangalore.
 






Place: Bangalore 
Date: 12-05-2019
(1MS16CS053   RAJATH M) 
(1MS16CS076   RAVIKUMAR)
(1MS16CS067   PRATHEEK S.N)
(1MS16CS143   VIPUL)



ACKNOWLEDGEMENT
First and foremost, my utmost gratitude to Dr Divakar Harekal Department of CSE, MSRIT whose sincerity and encouragement we will never forget. He/She has been our inspiration as we overcame all the obstacles in the completion of this project work.

Dr. Anita Kanavalli, Head of the Department of Computer Science and Engineering, had kind concern and consideration regarding project work and we would like to thank her for continuous support.

We would like to thank our beloved principal Dr. N.V.R Naidu for his support and encouragement.

This work would not have been possible without the guidance and help of several individuals who in one way or another contributed their valuable assistance in preparation and completion of this study.

We would like to express sincere thanks to all the teaching and non-teaching faculty of CSE Department and my dear friends who helped in all the ways while preparing the Report. 

























Abstract
  	In today’s world, actual record for fuel monitoring such as consumption , and tracking of vehicle with their exact locations with time stamp both in one could not maintain correctly! To overcome this problem we are implementing the solution for handling both fuel monitoring and the tracking of the vehicle with their exact location such  as latitude and longitude; to achieve this we have used GPS Module-NEO-6M, and Fuel devices which are capable to get the exact data from the vehicle and send to the real time database system for the further actions; BTFMS , system will store the more number of vehicles and their data with unique vehicle id which will be provided by the Managements. To achieve the good interface foe the user we have developed the android app which  can handle both the monitoring of fuel and the location of the vehicle; along with this we have implemented the unique feature called the Messaging –user can chat or message in the public for any help he/she might need. This feature not included anywhere; this will work for their any critical conditions. at any condition they can get the solution or help. And the android app also include the history of the vehicle – means that it can collect all the previous movement with the time stamps so user can get the exact information of their vehicle.




























List of diagrams:
Figure: 1.1 showing the project planning and sequence of activity
Figure 1.2 shows the communication and architecture design of the system;
Figure 1.3  showing Fuel Monitoring with the Android Graphical interface
Figure 1.4 class diagram showing the various class and the methods;
Figuer 1.5 showing the Registered user Sequence Diagram:
Figure 1.6 New user Sequence diagrams
Figure 1.7 flow chart of the system and the data flow from one activity to other


List of Tables
Table 1.1 test case 































Contents									page No

Declaration										4

Acknowledgements									5

Abstract 										6

List of Figures 									7		
List of Tables										7

S.No 		Agenda							     Page No

1	INTRODUCTION								10
1.1General Introduction……………….		 
1.2Problem Statement…………..
1.3Objectives of the project……………
1.4Project deliverables……………
1.5Current Scope………………………
1.6Future Scope……………………….

2PROJECT ORGANIZATION				 		12
2.1Software Process Models
2.2Roles and Responsibilities

3LITERATURE SURVEY					                       12
3.1….Introduction
3.2…Related Works with the citation of the References
3.3 Conclusion of Survey

4PROJECT MANAGEMENT PLAN	                                               15
4.1Schedule of the Project (Represent it using Gantt Chart)
4.2Risk Identification

5SOFTWARE REQUIREMENT SPECIFICATIONS 		              16
5.1 Product Overview
5.2 External Interface Requirements
 	5.2.1 User Interfaces
 	5.2.2 Hardware Interfaces
 	5.2.3 Software Interfaces
     	5.3 Functional Requirements
    


6DESIGN									   17
6.1Introduction
6.2Architecture Design
6.3Graphical User Interface
6.4Class Diagram and Classes (represent Inheritance, Aggregation and  Association)
6.5Sequence Diagram
6.6Data flow diagram
6.7Conclusion

7IMPLEMENTATION							      24
7.1Tools Introduction
7.2Technology Introduction
7.3Overall view of the project in terms of implementation
7.4Explanation of Algorithm and how it is been implemented
7.5Information about the implementation of Modules
7.6Conclusion

8TESTING									        27
8.1Introduction
8.2Test cases


9CONCLUSION & SCOPE FOR FUTURE WORK    			        28   

10REFERENCES 								        28


11Appendix 									      30
1Screen snapshots (Results)
















1.INTRODUCTION 
1.1GENERAL INTRODUCTION 

Among all public transportation services, bus service is the major transportation used by public. Especially in a busy town or city, bus is the most easy, convenient and cheaper transportation. Various reasons that people take bus instead of driving own vehicle such as traffic jam, heavy parking fee and lack of parking slot in destination. in order to solve these problems and enhance current bus service system, real time bus tracking system has to develop and implement. With real time bus tracking system, bus position data is connected real time and transmitted to a central server for processing and extracting transit information. The main technology used to develop this system is Global Positioning System (GPS)  Basically it consist of GPS device and maintaining android applications nothing but android app which support mobile device. When the bus starts it’s journey having GPS with GSM features and connected to the server. Every 5mins interval the GPS coordinates of the bus is capable of connecting to the server. By the help of GPS we can access the information with secure through android app and also fuel monitoring system is also taken with the sensor and hardware components. The frontend of the system makes uses of android studio IDE  with java and script while SQL server as Backend. 
1.2PROBLEM STATEMENT 
Tracking and monitoring  of bus/vehicle  and fuel theft nowadays is also a big problem. Actual location determination  of the vehicle using GPS technique  having GSM  cellular network and connection to server. Fuel theft prevention .
Lack of real time platform is the serious communication problem between bus user and bus management team. Without a real time platform, bus management side unable to update latest bus traffic information for people. people also cannot check on the updated bus schedule if there is a bus delay happens. People could not actual location of the bus and management team so there could a serious problem occurs due to inconveniences between the people and bus. Another major issue in the bus management team is monitoring fuel. It’s also a big issue. Because some time the driver couldn’t know about the fuel information and no physical or indicator is there for fuel monitoring the there will obviously some critical situations may occur. Fuel detection and reminding to the driver is also a issue in nowadays bus management system.   

1.3OBJECTIVES OF THE PROJECT
The main objective of the proposed system is to apply GPS tracking technology into bus transportation system currently operating in UTAR. The proposed system will install GPS receiver on buses to perform real time position tracking bus during operating hours. The bus position data will send to central server and process become bus traffic information which needed to provide for bus users. By this real time position tracking system, it will increase the accuracy of bus timetable scheduling.
In proposed system, a real time platform is developed between people and bus management team. With this platform, peoples able to check on real time bus arrival time for particular bus stop and latest or updated bus traffic information. Moreover, bus management team able to update latest bus traffic information on time to bus users through real time platform. And also the actual location of the bus. Compare to current bus system in UTAR which still posting bus timetable on notice board in paper form, the proposed system is more effectiveness. Besides, bus tracking system able to reduce major workload done by bus management team. First of all, real time bus position tracking system will automatically calculate the arrival time for next bus stop of particular bus. Second, this system provides a platform allow bus management team to update bus schedule through Internet. By reducing workload of bus management team, they can utilize the time in other matters in order to enhance quality of bus service.
 	Also Rising fuel costs constantly challenge fleet operators to maintain movement of vehicles and monitor driver behavior to avoid delaying traffic conditions by either, combining deliveries, reconfiguring routes or rescheduling timetables. This aims to maximize the number of deliveries while minimizing time and distance. Escalating oil prices are increasing costs for many businesses, particularly those with large vehicle fleets, adding a powerful financial impetus to the search for fuel efficiencies. Implementing real-time vehicle tracking as part of a commercial company’s mobile resource management policy is essential for comprehensive operational control, remote driver security and fuel savings.
1.4PROJECT DELIVERABLES
The end users can avail the bus tracking facility through an Android App which is basically an interface for the users access live location of the bus, messaging system and fuel details .All these features are displayed with the help of an android application which is compatible with all versions of android and the users can access them anywhere at any time conveniently through their mobile phones  
1.5CURRENT SCOPE
At Present there is a need for a Real Time Bus Tracking system to reduce the anxiety of passengers and to keep them informed about the availability of buses and their routes .Also there is a need for Transportation departments across the globe to monitor the driving habits of the drivers  and fuel consumption details of the buses so that they can keep a check on the fuel and come up with solutions to minimize fuel consumptions and to  analyze the drivers performance and rank them accordingly 
1.6FUTURE SCOPE
There is tremendous scope in our project for performance enhancement by implementing new features as per the administrator and customer requirements . Currently we have implemented a messaging service which enables the passengers to communicate with the administrators in case of any inconvenience or issues related to commuting , we can improve this feature by coming up with new innovative solutions . We can design and  develop prediction models to predict the fuel consumptions across various routes leading to a particular destination and figure out the optimal route that has to be taken to mitigate fuel consumption . There is a scope to make use of advanced computing techniques like Machine Learning and Computer Vision to achieve smart and innovative methodologies which can be implemented in our project and deployable to the customers in the market




2.PROJECT ORGANIZATION 
2.1Software Process Model
The model used in this project is spiral model. It is one of the more sophisticated process models. It reduces the initial risk the project has to bare. The major strong points of this process is highly reliant on proper observation and management of the project. It is suitable for complicated projects as it tremendously manages the risk with respect to the project. Its major flaw being the high cost required. This process also allows additional functionalities to be added in later with minimal risk.

2.2Roles And Responsibilities 

RAVI KUMAR – TEAM LEADER AND LEAD DEVELOPER – Responsible for design, coding , hardware and technical implementation
PRATHEEK S.N – TECHNICAL LEAD AND DEVELOPER  – Responsible for designing , coding and technical documentation
RAJATH M – EXECUTIVE AND PROJECT MANAGER - Responsible for Project Management , Planning , Testing and Scheduling 
VIPUL -ENGINEER AND DEBUGGER – Responsible for debugging 
 
3LITERATURE SURVEY 
3.1introduction
The main idea behind all related works is to monitor the real time movement of a bus using technologies like GPS and GSM which are cheap , hence are cost efficient The purpose of a fuel monitoring system is to Monitor the fuel levels of the Bus in real time and transmitting the data to the servers in real time , by monitoring the fuel data we can predict many parameters such as the condition of the bus , the driving habits of the driver and a route estimation concept by figuring out the best route to minimize fuel consumption.
 
3.2Related Work And References
1.Real Time Vehicle Tracking System using GSM and  GPS Technology 
The Idea behind this paper is to monitor the real time movement of a bus using technologies like GPS and GSM which are cheap , hence are cost efficient . We make use of the data and with the help of an android app deliver it to the users in real time . The key aspects of a good bus tracking system are -The service should be easily deployable as soon as possible without having to wait for long ,The deployment cost should be low for the service provider , Usage cost should be low for the customers using the service , Maintenance should be easy to perform , and there must be a scope for addition of extra features.

2.Fuel Monitoring System Through Android Application
The purpose of this system is to Monitor the fuel levels of the Bus in real time and transmitting the data to the servers in real time , by monitoring the fuel data we can predict many parameters such as the condition of the bus , the driving habits of the driver and a route estimation concept by figuring out the best route to minimize fuel consumption. 
Basic idea behind the fuel monitoring system is to make use of the data sent out by the fuel monitoring sensor to the server and then interpreting it with the help of an application program and deploying it to the users through an Android application. 

3.Tracking System using GPS and GSM along with fuel monitoring: Practical      approach.
In this paper the goal is to develop a tracking system using GPS and GSM Technologies an interesting feature discussed here is to automatically slow down the speed of the vehicle as it approaches schools and hospitals whose location is detected by the GPS module 
4.Real-Time Bus Tracking and Messaging System
In this paper the aim is to develop as real time bus tracking system to provide real time information about the location of the bus by implementing a messaging system through a web application which provides details on the arrival time and the current traffic details hence reducing the anxiety of the passengers 
5.Mobile Application for Tracking College Buses 
In this paper the idea is to develop an android application to track college buses in real time Android is used because it makes use of the open source development concept which is feasible and user friendly for the users to use . Another feature that can be used is - Location Based Services, which is used to track current location of the bus and provides an estimate of the time remaining for the tracked bus to reach the desired destination using the concept of client –server technology. 

6.Implementation of Real Time Bus Tracking and a Passenger Informative System

In this paper the goal is to implement a Public Bus Information System using GPS modules . The system displays the present location of the bus. The GPS devices will send the collected data to a centralized control unit and  display the details on a route map.
7.GPS and GSM Based Bus Tracking System 
This paper focusses on reducing the costs involved in developing an efficient bus tracking system which can be implemented in college buses as well as for public transport vehicles. The idea is to figure out the position of the bus using GPS and GSM Modules by sending a request message from the user’s phone which doesn’t require the use of any Internet since it makes use of an SMS to achieve this service 
8.Real-Time Bus Tracking System.
This paper focuses on implementing a Live Bus Tracking System making use of GPS devices to send the data to the receiver , the GPS Receiver will automatically save the data in a .txt file , after this the application collects data and puts it onto a web server using which the system displays the current details of the bus at any instant of time .

9.Deployment of an enhanced vehicle tracking system
The main aim of this paper is to provide hardware and software support for implementing various modules and deploying a web application at the client side using which we can develop a system that is easy to install on any vehicle for Tracking them accurately and also has scope for further performance enhancement by adding upon new features.
10.Efficient Bus Tracking and Management System Using IoT
This paper focusses on using IoT to design a Bus Tracking System which can be deployed for usage of the public through an android application , we run two applications one at the server side and the other at the client side . Buses have GPS devices to track their positions , using this data the servers are periodically updated. The Client application displays the location of the bus on a map

References 

[1] Real Time Vehicle Tracking System using GSM and 
GPS Technology  (https://www.researchgate.net/publication/266412980_Real_Time_Vehicle_Tracking_System_using_GSM_and_GPS_Technology-An_Anti-theft_Tracking_System)
[2] REAL TIME TRACKING AND FUEL MONITORING USING IoT (https://acadpubl.eu/hub/2018-120-6/2/125.pdf)
[3] Tracking System using GPS and GSM and fuel monitoring: Practical Approach
(https://www.ijser.org/researchpaper/tracking-system-using-gps-and-gsm-practical-approach.pdf)
[4]Real-Time Bus Tracking System 
(https://www.irjet.net/archives/V4/i3/IRJET-V4I3195.pdf)

[5 ]Mobile Application for College Bus Tracking 
(https://ijcsmc.com/docs/papers/March2015/V4I3201599a50.pdf)
Implementation of Real Time Bus Monitoring and Passenger Information System
(http://www.ijsrp.org/research-paper-0513/ijsrp-p1716.pdf)

[6] GPS/GSM Based Bus Tracking System (BTS)
(https://www.ijser.org/researchpaper/GPS-GSM-Based-Bus-Tracking-System-BTS.pdf)

[7] Real-Time Bus Tracking System
(https://www.irjet.net/archives/V4/i3/IRJET-V4I3195.pdf)

 [8] DESIGN AND DEVELOPMENT OF GPS-GSM BASED TRACKING SYSTEM WITH GOOGLE MAP BASED MONITORING
(http://airccse.org/journal/ijcsea/papers/3313ijcsea04.pdf)

[9] Smart Bus Tracking and Management System Using IoT (https://papers.ssrn.com/sol3/papers.cfm?abstract_id=2941150)


3.3Conclusion Of Survey 
Through the literature survey we have come across various methodologies that have already been proposed for designing and developing a real time bus tracking and fuel monitoring system by others , looking at these related work we have developed some more features that can be added to the project to make it more advanced with respect to efficiency and performance parameters 

4PROJECT MANAGEMENT PLAN 
4.1schedule of the project


Figure: 1.1 showing the project planning and sequence of activity
In the figure 1.1 shown the project planning. This is helped us to divide the task and complete and it’s based on the cost also. Schedule and the cost here taken as two parameter so that the cost should not much more and the schedule maintain by before the plan made as shown in the diagrams;

4.2RISK IDENTIFICATION 
Risks are any unforeseen events that can occur at any point of time which affects the performance of the product/service as well has huge impacts on the cost and maintenance of the project. There are several classes into which we can classify risks : technical , business and project related risks. Our goal is to mitigate the impacts of these risks and try to reduce the risk factor as much as possible in order to deliver or deploy a more reliable service/product into the market hence we follow a risk management plan in order to meet this goal. 
In our project – Bus Tracking and Fuel Monitoring System we have identified many risks involved and have provided suggestions to mitigate their impact on various parameters like costing , maintenance etc.
Cost Implications : 
  	There are several cost implications involved with this project especially with the technical components if in case of failure then we need to replace the parts which results in delays hence we need to ensure that we take care by reducing the factors which result in the malfunctioning of the components so that we can reduce the time and cost incurred for maintenance 
Risks Involved In Safety Of The User 
      Safety of the user is of prime importance which has to be kept in mind before taking up and project . We need to safeguard the users from any malfunctioned components which may cause harm to the one using it hence we need to make sure that we jot down the possible risks involved in so that we can think of ideas to mitigate the risk , outcome of which improves the safety of the end users. 
   Solution : in our project we have provided insulation for all wirings , fuse to prevent electrocution of the individual and we have designed our exterior parts out of an insulating material to prevent the conduction of electricity externally . We have included a list of the necessary precautions that have to be taken for safe usage of the service 
Troubleshooting Guide
     We have provided a troubleshooting guide comprising the most probable problems or component failures that the customer may encounter during the course of the product usage by following these steps the customer can fix most of the problems himself without seeking for technical assistance form our maintenance personnel which reduces the cost and time for both the Manufacturer And The Customer.
Conclusion:
  Risks are a part and parcel of any software engineering project we put our best efforts to mitigate the risks involved but we can never completely eliminate the risks involved hence the goal of a risk management plan is to identify all the possible risks involved in a project and to come up with various suggestions ,solutions and ideas to mitigate and manage the risks involved in any project outcome of which enables us to deliver a reliable product/service to the customers and the end users .

5SOFTWARE REQUIREMENT SPECIFICATIONS
5.1Product Overview
The final product deployable is cheap , cost effective and efficient with respect to performance parameters  - our prototype was built by investing just 1,500 Indian rupees which just included the cost of GPS and GSM Modules rest of the tools and technologies made use of in our project were free of cost hence we were successful in designing and developing our product through efficient cost management , when it comes to deployment of our product in the market – money invested by the transport department and the government for procuring our product is very less . We deliver our service to everyone through an android application so that each and every person can avail the facilities of a real time informative bus tracking system with advanced features like messaging facility enabling communication with the concerned higher authorities.


5.2  EXTERNAL INTERFACE REQUIRMENTS
5.2.1 User Interface Requirements:
The system offers a form for registration with username password and number. The system allows for communication for the users between each other through the use of text chains. The user can see the location of the vehicle through gps interface  
5.2.2 Hardware interface Requirements:
	Device: Android Emulator/ Android Handset, GPS
	Minimum Required Space: 3MB
	Ram: 128MB or More
5.2.3 Software Interface Requirements
	Operating System: Android 2.3 or higher versions
	Environment: Android SDK, Java, MySQL
	Technologies used: Java, SQLite, Android
	Tools: Eclipse IDE, Java1.4 or higher

5.3 Functional Requirements
We have made use of several components for our project from hardware components like GPS to software components like firebase cloud , and Android applications. We deliver the service to our customers with the help of an android application which serves as a user interface. Firebase cloud for storing and retrieving the data for usage GPS device is used to track the location of the vehicle in real time hence it's very much essential for our project. GSM is used for communication  purposes. Raspberry pi an IoT Device is also made use of in our project. This functional Requirements includes the use case diagrams and the use case scenarios of our bus tracking and fuel Monitoring system;







6.DESIGN

6.1Introduction
Design is the process by which an agent creates a specification of a software artefact, intended to accomplish goals, using a set of primitive components and subject to constraints. Software design may refer to either all the activity involved in conceptualizing, framing, implementing, commissioning, and ultimately modifying complex systems or the activity following requirements specification and before programming, as a stylized software engineering process. Software design usually involves problem solving and planning a software solution. This includes both a low-level component and algorithm design and a high-level, architecture design. 





6.2.Architecture Design



Figure 1.2 shows the communication and architecture design of the system;


In the figure 1.2 shown the various components and the arrangement in their functionality view. Satellite, vehicle are communicating with the GPS device and showing the location to the user  in the Android app, the App could able to get the data from the database.










6.3 Graphical User Interface

Figure 1.3  showing Fuel Monitoring with the Android Graphical interface 
In the figure 1.3 shown the fuel monitoring with  the android app in the graphical user interface manner , here the fuel detection device has fixed with the vehicle and trying to get the fuel details from that and keep sending the data to the firebase so that the data can be retrieve by the android app and shown to the user;












6.4Class Diagram and Classes 




Figure 1.4 class diagram showing the various class and the methods;
In the figure 1.4 showing the various class diagrams and the methods we can create the methods to the class and objects also; here class user_login is the class inside that we can have the methods like User_email(), similarly for all the class diagrams and the methods;

















6.5Sequence Diagram
1.Registered User Sequence Diagram 
 

Figuer 1.5 showing the Registered user Sequence Diagram:
In the figure 1.5 showing the user sequence diagram of the registered user; here the objects are created fromm the user class  like if the class is user_login the the object will be like user_login:login like that all the objects are created and shown the lifecycle in the verticle direction ;
























2.New User Sequence Diagram

Figure 1.6 New user Sequence diagrams
In the figure 1.5 and 1.6 shown the new user and the registered user sequence diagram, the figure 1.6 the shows the new user sequence diagram, it’s similar in the object creation with the 1.5 diagram and it will also show the sequence of the activity happen; 












6.6Data flow diagram

Figure 1.7 flow chart of the system and the data flow from one activity to other
In the figure 1.7 shown the flow chart of the system at top- management team is there and it will provide the login details if the login details matches the database which is registered then it will allow the further activity else it show the guideline to the user to register before login.
6.7Conclusion
Software design documentation may be reviewed or presented to allow constraints, specifications and even requirements to be adjusted prior to computer programming. Redesign may occur after review of a programmed simulation or prototype. It is possible to design software in the process of programming, without a plan or requirement analysis, but for more complex projects this would not be considered feasible. A separate design prior to programming allows for multidisciplinary designers and Subject Matter Experts (SMEs) to collaborate with highly skilled programmers for software that is both useful and technically sound.






7IMPLEMENTATION

7.1Tools Introduction

Tools used are : Android Studio version 3.2 version latest, JDK 11.1, 

Android Studio : is the official integrated development environment (IDE) for Google's Android operating system, built on JetBrains' IntelliJ IDEA software and designed specifically for Android development. It is available for download on Windows, macOS and Linux based operating systems. It is a replacement for the Eclipse Android Development Tools (ADT) as the primary IDE for native Android application development.

Java Development Kit(JDK) : is a free and open-source implementation of the Java Platform, Standard Edition (Java SE). It is the result of an effort Sun Microsystems began in 2006. The implementation is licensed under the GNU General Public License (GNU GPL) version 2 with a linking exception. Were it not for the GPL linking exception, components that linked to the Java class library would be subject to the terms of the GPL license. OpenJDK is the official reference implementation of Java SE since version 7. 


7.2Technology Introduction
Operating system: Android  5.1 and higher Version , windows 10 used for the implementation 
Environment & database: Android SDK, JAVA, firebase, GitHub  for code storage.
Technologies used:  JAVA, Android

Android : a mobile operating system developed by Google. It is based on a modified version of the Linux kernel and other open source software, and is designed primarily for touchscreen mobile devices such as smartphones and tablets. In addition, Google has further developed Android TV for televisions, Android Auto for cars, and Wear OS for wrist watches, each with a specialized user interface. Variants of Android are also used on game consoles, digital cameras, PCs and other electronics
Firebase : a Realtime Database and a cloud platform which allows for nested documents and fields also used to store and retrieve data 
7.3Overall view of the project in terms of implementation
As we know Android studio is open source for the development of android applications which means that , it is royalty –free and not restricted  to the android Market and android user statistics increasing;
The Android SDK (software development kit) is a set of development tools used to develop applications for Android platform. The Android SDK includes the Required libraries. And SDK is the major advantage that allow developer to communicate with the community on future expansions of mobile app development; Android accounted for more than 80 percent of all smartphone sales to end users worldwide.
The statistic shows share of smartphone shipments worldwide by operating system from 2009 to 2017. In 2017, 85.9 percent of all smartphones sold had Android as its operating system. 
Development platform for the developer will be easy and user-friendly and google has provided all the material 

7.4Explanation of Algorithm and how it is been implemented

For new user
New user should click on the signup text view .
New user should be use valid and unique email id for first step registration, because 	app will show if the user previously or not ;
If user is already existed then, it can’t allow to register, it will guide to forgot 	password or user email not in correct format;
New user should use valid email id for password recovery.
Password should be greater than 6 characters it can be number/text/special  			character;
If these things are correct then the system will allow user to provide basic details 	like name, age, username, purpose of tracking and also ask new user to bus detail 	if he know.
After completing all the steps App will tell user to login as Registered User;
            it will show fair and easy interface to the user , he can read the instructions.

For Registered User
Already registered user can directly click on the login button.

It will take to the user to the selection of the bus id;
User can search the bus id in the search place and find the required id to fetch the 	details after clicking on the bus id ->click on the fetch button.
The fetch button will take the user to the menu interface , it cool and easy to the 	user to get the details as he wish.
In the menu options location, history, user details, fuel details, messaging, and 	feedback buttons are available ;
Whenever the user click on the appeared button it will take the actual activity, 	means that if the user click on the bus location then it will show the actual 	location of the user with latitude and longitude points  and shows the other details		 and 	that page is directly connected the google maps , so user feel to get the 	google maps for their location;
Same way the other features are implemented with user interest.
Messaging feature in introduced in this system, user can chat with other;

7.5Information about the implementation of Modules
Below is an information related to the implementation and usage of modules :-

1.Also the back end of this platform has upgraded and now the developer can easily 	connect their project to the firebase as one of the major database to the 	applications.
2.Developer can get the data from the database: read and write to the database 	backend is quite easy and regarding complete information has provided by 	Google
3.Overall it’s very easy in user friendly and tools are easy to identify and use it
4.They can use their prefer language for the development and it’s flexible to the 	SDK;
5.Android studio with version 3.2.0 quite easy and cool user interface.
6.Developer can easily find the tools and use it, and also the user statistics across 	the world is more and more in android.



7.6Conclusion

This Project has been implemented on Android platform. 
In this system we have included some new and important features like the Messaging and history , which means the whole content can be viewed. By using this Android application user can able to find the exact location for their vehicle and also manage the fuel. Fuel details included all the parameters and also the nearest fuel sources so when the user reaches that place it can be able to remind the user to take the fuel Also, different attributes have been added to the project which will prove to be advantageous to the system. Using the GPS system, the application will automatically display the maps and routes to the different locations. It uses basic measurements of distance between two locations and provides necessary details of each and every route for people to find the locations. Due to this the records can be easily manipulated on the device itself and the server burden gets reduced. 
























8TESTING
8.1Introduction
Testing is an investigation conducted to provide stakeholders with information about the quality of the software product or service under test. Software testing can also provide an objective, independent view of the software to allow the business to appreciate and understand the risks of software implementation. Test techniques include the process of executing a program or application with the intent of finding software bugs (errors or other defects), and verifying that the software product is fit for use.
   
8.2   Test cases

Id 	Test Scenario 	Test steps	Test Data 	Expected result
1	Android App  	1.User enters login details
2.If user is valid he is accepted 
3.Else he is rejected 	User Credentials 

Database fetched data 	User should be able to login into the system

Failure of login will allow the user to register
2	GPS module 	1.Location data is captured in real time
2.User is able to get the location data
3.Incorrect data	Locational coordinates are captured 

Incorrect and invalid input to the map	Able to access the location in real time 

The app will able to the error of fetching and display in the map
3	Fuel sensors	1.Sense the current fuel level  
2.Forward the data to the database  	Fuel level


Fuel related correct values in the calculator 	Sense and carry fuel related data 

Unable to calculate the result throw the exception of the data
4	Database storing data 	1.Stores the data of valid user 
2.Storing the fuel data
3.Location data	All the data related to the valid user are stored 
→fetching the data	Database stores the relevant data only 

Throw the exception 

Table 1.1 test case 
In the table 1.1 shown the some test cases and the input to the system and the expected valid results and also the expected exception handling 
9CONCLUSION & SCOPE FOR FUTURE WORK

      Conclusion : This Project has been implemented on Android platform. In this system we have included some new and important features like the Messaging  and history , which means the whole content can be viewed. By using this Android application, user can able to find the exact location for their vehicle and also manage the fuel. Fuel details included all the parameters and also the nearest fuel sources so when the user reaches that place it can be able to remind the user to take the fuel Also, different attributes have been added to the project which will prove to be advantageous to the system. Using the GPS system, the application will automatically display the maps and routes to the different locations. It uses basic measurements of distance between two locations and provides necessary details of each and every route for people to find the locations  Due to this the records can be easily manipulated on the device itself and the server burden gets reduced. 

Scope For Future Work : There is tremendous scope in our project for performance enhancement by implementing new features as per the administrator and customer requirements . Currently we have implemented a messaging service which enables the passengers to communicate with the administrators in case of any inconvenience or issues related to commuting , we can improve this feature by coming up with new innovative solutions . We can design and  develop prediction models to predict the fuel consumptions across various routes leading to a particular destination and figure out the optimal route that has to be taken to mitigate fuel consumption . There is a scope to make use of advanced computing techniques like Machine Learning and Computer Vision to achieve smart and innovative methodologies which can be implemented in our project and deployable to the customers in the market.
       
10. REFERENCES

[1] Real Time Vehicle Tracking System  using GSM and GPS Technology (https://www.researchgate.net/publication/266412980_Real_Ti
me_Vehicle_Tracking_System_using_GSM_and_GPS_Technology-An_Anti-theft_Tracking_System)
[2] guide is a quick start to adding a map to an Android app. Android Studio is the recommended, development environment for building an app with the Maps SDK for Android.   https://developers.google.com/maps/documentation/android-sdk/start
[3] REAL TIME TRACKING AND FUEL information from the google
[4] Tracking System using GPS and GSM and fuel monitoring: Practical Approach (https://www.ijser.org/researchpaper/tracking-system-using-gps-and-gsm-practical-approach.pdf)
[5]  https://developer.android.com/guide
[6]  Help from GitHub, we have seen various projects which are available on git and checked if our project has existed or not at present  http://github.org/
[7]  http://www.w3schools.com
[8]Real Time Vehicle Tracking System using GSM and 
GPS Technology  (https://www.researchgate.net/publication/266412980_Real_Time_Vehicle_Tracking_System_using_GSM_and_GPS_Technology-An_Anti-theft_Tracking_System)
[9] REAL TIME TRACKING AND FUEL MONITORING USING IoT (https://acadpubl.eu/hub/2018-120-6/2/125.pdf)
[10] Tracking System using GPS and GSM and fuel monitoring: Practical Approach
(https://www.ijser.org/researchpaper/tracking-system-using-gps-and-gsm-practical-approach.pdf)
[11] Real-Time Bus Tracking System 
(https://www.irjet.net/archives/V4/i3/IRJET-V4I3195.pdf)
[12]Mobile Application for College Bus Tracking 
(https://ijcsmc.com/docs/papers/March2015/V4I3201599a50.pdf)
[13]Implementation of Real Time Bus Monitoring and Passenger Information System (http://www.ijsrp.org/research-paper-0513/ijsrp-p1716.pdf)
[14] GPS/GSM Based Bus Tracking System (BTS)
(https://www.ijser.org/researchpaper/GPS-GSM-Based-Bus-Tracking-System-BTS.pdf)
[15]Real-Time Bus Tracking System
(https://www.irjet.net/archives/V4/i3/IRJET-V4I3195.pdf)
[16]DESIGN AND DEVELOPMENT OF GPS-GSM BASED TRACKING SYSTEM WITH GOOGLE MAP BASED MONITORING
(http://airccse.org/journal/ijcsea/papers/3313ijcsea04.pdf)
[17] Smart Bus Tracking and Management System Using IoT (https://papers.ssrn.com/sol3/papers.cfm?abstract_id=2941150
[18] project guide Dr.Divakar Harkekal , Assistant professor of department CSE, MSRIT
	Guided for the hardware connection and development of the android application;






















5.Appendix

		   	  







				

				 





				 


				






    	  






           

                             
             
