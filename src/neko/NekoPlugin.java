package neko;

import neko.anc.contracts.abstracts.GamemodeHandler;

public class NekoPlugin extends GamemodeHandler {

    public NekoPlugin() {
        super("sandbox");
    }

    @Override
    public String getCommandDescription() {
        return "Sandbox comamnd handler";
    }

    @Override
    public String getCommandKeyword() {
        return "sandbox, sbx";
    }
}
