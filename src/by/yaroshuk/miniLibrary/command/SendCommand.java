package by.yaroshuk.miniLibrary.command;

import by.yaroshuk.miniLibrary.Library;

import java.util.List;

public class SendCommand implements UserCommand {

    @Override
    public void execute(Library library) {
        List<Long> longs = library.sendOnSave();
        System.out.println("Following book were sent:" + longs);
    }
}
