# Taxi-service
![taxi logo](taxi_logo.png)
Very simple taxi service application. 
You can adding, deleting and editing information 
about drivers, cars and cars manufacturers.
## Technologies
* Tomcat
* MySQL
* JDBC
* Servlet
* JSP
* JSTL
* HTML, CSS

## Setup
**-->** Clone this project

**-->** Configure Tomcat Server

**-->** Install MySQL RDBMS and MySQL Workbench on your computer

**-->** Use script from src/main/resources/init_db.sql to configure MySQL

**-->** Insert your own MySQL username and login in dbProperties in the ConnectionUtil class.
- USERNAME: "your username"
- PASSWORD: "your password"
- URL: jdbc:mysql://xxxx:yyyy/kkkk?serverTimezone=UTC , where:
    * xxxx - host name,
    * yyyy - port,
    * kkkk - database name
    
**-->** Run project
