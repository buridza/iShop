package by.asrohau.iShop.controller.command;

import by.asrohau.iShop.controller.command.parser.ParserSax;
import by.asrohau.iShop.controller.exception.ControllerException;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.Map;

public class CommandFactory {
    private static final CommandFactory INSTANCE = new CommandFactory();
    private final ParserSax parserSax = new ParserSax();

    private Map<String, Command> commandMap;

    private CommandFactory() {
        try {
            this.commandMap = parserSax.CommandMap();
        } catch (SAXException e) {
            new ControllerException(e);
        } catch (IOException e) {
            new ControllerException(e);
        }
    }

    public static CommandFactory getInstance() {
        return INSTANCE;
    }

    public Map<String, Command> getCommandMap() {
        return commandMap;
    }

}
