# Homework readme
 **General rules**
1.  Open MySQL Command line.
2.  Enter command:
```
create database [database_name];
```
3.  Enter command:
```
use [database_name];
```
4.  Enter command:
```
create table onliner_db (title varchar(200),url varchar(70),price decimal(10.0),created_at datetime, updated_at timestamp);
```
5.  Enter command:
```
alter table onliner_db modify updated_at timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;
```
6. Run java program -> Open Command line and go to the folder with the cloned project:
```
javac TableParsing.java
java TableParsing
```
7. Return to the MySQL Command line:
```
select * from onliner_db;
```


