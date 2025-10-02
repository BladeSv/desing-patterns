package by.mitr.patterns.behavioral.chainResponsibility.sample;

public class TokenValidator extends AbstractHandler {
    @Override
    public void handle(Request request) {
        if (validateRequest(request)) {
            System.out.println("Token is valid");
            doNext(request);
        } else {
            System.out.println("Token is not valid");
        }
    }

    private boolean validateRequest(Request request) {
        return request.token().matches("[a-z0-90]+");
    }
}
