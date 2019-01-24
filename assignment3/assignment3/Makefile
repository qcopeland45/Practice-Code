newShape: main.o functions.o
	clang++ -o newShape main.o functions.o

main.o: main.cpp
	clang++ -c main.cpp

functions.o: functions.cpp
	clang++ -c functions.cpp


clean:
	rm -f newShape
	rm -f main.o
	rm -f functions.o