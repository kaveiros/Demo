#Demo app

This application demonstrates a simple messaging processing application.

All sales are recorder
All messages are processed
After every 10th message received, the application logs a report detailing the number
of sales of each product and their total value.
After 50 messages your application logs that it is pausing, stop accepting new
messages and log a report of the adjustments that have been made to each sale type while
the application was running.

##Getting Started-Running the application.
This is a Maven project built through Eclipse IDE and also includes J-Unit test cases.
In order to build the application use the command:

```
mvn install

```
Navigate to target folder. You can run the jar that has been created.
java -jar Demo-jar-with-dependencies.jar 

To clean everything:

```
mvn clean

```

To run Junit tests use command:

```
mvn test

```

Remember to change the 
```
<property name="DEV_HOME" value="/home/nikos" />
```

property at logbackfile in order to have the log file created at the desired path.


## Author
* **Nikolaos Chantzopoulos** 

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

