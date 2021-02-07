# KWIC
This project implements KWIC using Pipes and FIleters architecure. It consists of four filters including Input, CircularShifter, Alphabetizer and Output. Each filter processes the data and sends it to the next filter through Pipes.

# compile the project
$ mvn clean install
# run the jar
$ java -jar target/Kwic-1.0-SNAPSHOT.jar
A prompt message: Enter file path. 
After input the file path, output will be generate in the console.

