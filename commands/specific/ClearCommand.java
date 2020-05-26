package main.commands.specific;

import main.commands.Command;
import main.entity.RouteSet;

public class ClearCommand extends Command {

    public ClearCommand(RouteSet routeSet, String name) {
        super(routeSet, name);
    }

    @Override
    public String  execute(String... args) {
        routeSet.clear();
        return  "Коллекция очищена.";
    }

    @Override
    public String getDescription() {
        return "Очистить коллекцию.";
    }
}
