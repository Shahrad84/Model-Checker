# Model-Checker---Theory-of-Languages-Machines

That is a projct of Teory of Languages and Machines developed via Shahrad Langari

## run these three commands to run ANTLR and compile has file and output.pml :

java -jar antlr-4.8-complete.jar -visitor Hash.g4
javac -cp ".;antlr-4.8-complete.jar" *.java
java -cp ".;antlr-4.8-complete.jar" Main test.hash output.pml
