package main.commands.specific;

import main.commands.Command;
import main.entity.RouteSet;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;

public class ExitCommand extends Command {
    String filePath;
    public ExitCommand(RouteSet routeSet, String name) {
        super(routeSet, name);
        this.filePath = filePath;
    }

    @Override
    public String execute(String user, String... args) throws IOException, XMLStreamException {
        new SaveCommand(filePath, routeSet, "").execute(user);
        System.out.println("Работа завершена.");
        System.exit(0);
        return  null;

    }

    @Override
    public String getDescription() {
        return "Завершить работу программы без сохранения в файл.";
    }
}
