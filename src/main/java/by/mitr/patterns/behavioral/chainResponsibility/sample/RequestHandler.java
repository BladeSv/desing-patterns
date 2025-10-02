package by.mitr.patterns.behavioral.chainResponsibility.sample;

public class RequestHandler extends AbstractHandler {
    @Override
    public void handle(Request request) {
        System.out.println("Request was successfully processed");
    }
}
