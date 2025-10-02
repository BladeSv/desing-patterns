package by.mitr.patterns.behavioral.chainResponsibility.sample;

public class RoleValidator extends AbstractHandler {
    @Override
    public void handle(Request request) {
        if (validateRequest(request)) {
            System.out.println("Role is valid");
            doNext(request);
        } else {
            System.out.println("Role is not valid");
        }
    }

    private boolean validateRequest(Request request) {
        return request.role().equals("admin") || request.role().equals("user");
    }
}
