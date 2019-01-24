assignment3/assignment3/newShape: main.o functions.o
	clang++ -o newShape main.o functions.o

assignment3/assignment3/main.o: main.cpp
	clang++ -c main.cpp

assignment3/assignment3/functions.o: functions.cpp
	clang++ -c functions.cpp

assignment3/assignment3/test: newShape
	./myTest.sh

/assignment3/assignment3/clean:
	rm -f newShape
	rm -f main.o
	rm -f functions.o
	rm -f testOutput.txt