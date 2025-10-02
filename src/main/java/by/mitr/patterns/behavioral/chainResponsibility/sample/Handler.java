package by.mitr.patterns.behavioral.chainResponsibility.sample;

public interface Handler<T> {
   void setNext(Handler<T> handler);
   void handle(T request);
}
