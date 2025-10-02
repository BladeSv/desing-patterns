package by.mitr.patterns.behavioral.chainResponsibility.sample;

public class RequestFormatValidator extends AbstractHandler {

    @Override
    public void handle(Request request) {
        if (validateRequest(request)) {
            System.out.println("Request have valid format");
            doNext(request);
        } else {
            System.out.println("Request do not have valid format");
        }
    }

    private boolean validateRequest(Request request) {
        return !request.user().isBlank() && !request.role().isBlank() && !request.token().isBlank();
    }
}
