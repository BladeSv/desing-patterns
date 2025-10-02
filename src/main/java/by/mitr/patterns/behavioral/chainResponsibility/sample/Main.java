package by.mitr.patterns.behavioral.chainResponsibility.sample;

class Main {

    public static void main(String[] args) {
        Request request = new Request("Mikhail", "token0001", "admin");

        Handler<Request> chain = getChain();

        chain.handle(request);
    }

    private static Handler<Request> getChain() {
        Handler<Request> requestFormatValidator = new RequestFormatValidator();
        Handler<Request> tokenValidator = new TokenValidator();
        Handler<Request> roleValidator = new RoleValidator();
        Handler<Request> requestHandler = new RequestHandler();

        requestFormatValidator.setNext(tokenValidator);
        tokenValidator.setNext(roleValidator);
        roleValidator.setNext(requestHandler);

        return requestFormatValidator;
    }
}