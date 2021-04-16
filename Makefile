JC = javac
.SUFFIXES: .java .class

BIN=bin
SRC=src

$(BIN)/%.class:$(SRC)/%.java
	$(JC) -d $(BIN)/ -cp $(BIN)/ $<


CLASSES=utils/User.class utils/Message.class client/Client.class server/Server.class GUI/MessageTracker.class GUI/Gui.class GUI/ChatRoomGUI.class main/startServer.class
CLASS_FILES = $(CLASSES:%.class=$(BIN)/%.class)

default: $(CLASS_FILES)

clean:
	rm -r $(BIN)/*/


start-server: 
	java -cp bin/ main/startServer

start-client:
	java -cp bin/ GUI/ChatRoomGUI



