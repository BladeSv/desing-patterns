package by.mitr.patterns.behavioral.chainResponsibility.sample;

public abstract class AbstractHandler implements Handler<Request> {

    private Handler<Request> nextRequests;

    @Override
    public void setNext(Handler<Request> handler) {
        this.nextRequests = handler;
    }

    void doNext(Request request) {
        if (nextRequests != null) {
            nextRequests.handle(request);
        }
    }
}
