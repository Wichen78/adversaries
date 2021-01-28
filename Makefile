src/Main.class: src/*.java
	javac src/*.java

run: src/Main.class
	java -cp src Main
	$(RM) src/*.class

clean:
	$(RM) src/*.class