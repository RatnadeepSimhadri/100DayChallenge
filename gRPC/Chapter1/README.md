# Introduction to gRPC 

Modern Software Sytems are built modular and rarely operate in isolation. Hence Inter process / Inter Service Communication over the network is necessary 

Unlike Conventional applications, in micro service architecture the number of network communication links proliferates because of the fine grained nature of micro services 

Inter-process communication systems are one of the most important aspects of modern distributed systems 

Inter-process communications are usually implemented using message passing with a synchronous request-response (REST) or async event-driven styles

In async event driven messaging, processes communicate with async message passing by using an intermediary known as an event broker 

In RESTFUL architecture of synchronous communication, we model the entire application or service as a collection of resources that can be accessed and have their state changed via network calls that take place over HTTP protocol 

REST is bulky  

gRPC uses sync request-response style of communication but can operate in fully async or streaming mode once the initial communication is established 


## What is gRPC ? 

g Stands for different things in every gRPC release. It is an inter-process communicationt tech