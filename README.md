# GymTracker_Backend
Use this to call API's for information on how crowded the gym is

# How To Run
Requirements: Java 12, not tested with Java 8, check Java version with `Java -version`

Clone project and `cd GymTracker_Backend`

`mvn clean install` - This will delete the target folder and do a fresh install of dependencies & build

`java -jar target/backend-0.0.1-SNAPSHOT.jar` to run project on localhost:8080


# API Calls
Days = M,T,W,Th,F

Status = Empty, Less Than Normal, Busy, Full (Can standardize these later)

Pings = # of signals the Raspberry Pi picked up

Time = hhmmss (Should add some formaters later)


## localhost:8080/traffic
Will return all traffic data

[{"id":1,"day":"M","status":"Less Than Normal","pings":1,"time":26112,"active":true},{"id":2,"day":"M","status":"Empty","pings":1,"time":120000,"active":true},{"id":3,"day":"M","status":"Full","pings":49,"time":18000,"active":true}

## localhost:8080/traffic/{id}
Will return JSON for a particular ID, see bottom for id examples, will try to make this better later

{"id":2,"day":"M","status":"Empty","pings":1,"time":120000,"active":true}

## ids
At the moment the plan is to just do chunks of time split by day of week (m,t,w,th,f) & time of day (6:30am, 12pm, 6pm)
example:

id = 1 {Monday, 6:30am}

id = 3 {Monday, 6pm}

id = 6 {Tuesday, 6pm}

id = 7 {Wednesday, 6:30am}

id = 8 {Wednesday, 12pm}


# TO DO
Will figure out best way to get info from raspberry pi. I'm thinking since we can't store the device anywhere we just take
averages, put into a txt file and have java pull info from that when called by the front end.

Make it so you can request info by time & day & crowdedness

