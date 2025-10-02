# 📌 Chain of Responsibility Pattern

## 📖 Description
The **Chain of Responsibility** is a behavioral design pattern that allows a request to be passed along a chain of handlers, where each handler decides either to:
- process the request, or
- pass it to the next handler in the chain.

This avoids coupling the sender of a request to its receiver, giving multiple objects the opportunity to handle the request.

---

## 💡 Idea
Organize handlers into a chain where each handler receives a request and:
1. Processes it if it can.
2. Passes it to the next handler otherwise.

---

## 📊 Structure (UML)
```
┌──────────────────┐
│    Handler        │
├──────────────────┤
│ Handler next      │
├──────────────────┤
│ setNext(handler)  │
│ handle(request)   │
└──────────────────┘
▲
│
┌───────────────┐  ┌───────────────┐
│ConcreteHandler1│  │ConcreteHandler2│
└───────────────┘  └───────────────┘
```

✅ Advantages.
Loose coupling between sender and receiver.
Easily extendable — new handlers can be added without modifying existing code.
Flexible configuration of handler chains at runtime.

❌ Disadvantages.
No guarantee that the request will be handled.
Harder debugging for long chains.
Possible performance issues with very long chains.

📅 When to use.
A request could be handled in several different ways.
The handler is not known in advance.
You want to avoid multiple if / switch statements.

📌 Common Applications.
Logging systems with multiple levels (INFO, DEBUG, ERROR)
HTTP request filters / middleware
Event processing in UI systems
Sequential data validation