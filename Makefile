FILE = JavaProgram

all:
	javac $(FILE).java
	java $(FILE)

clean:
	rm *.class
