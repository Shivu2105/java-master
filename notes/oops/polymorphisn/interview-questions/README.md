

## 🟢 Basic Concepts

### Q1. What is Polymorphism in OOP?

**Answer:**  
Polymorphism means *"many forms"* — the ability of an object to behave differently based on its actual type.

```java
Animal myAnimal = new Dog();
myAnimal.sound(); // Dog's sound() runs — polymorphism in action
```

---

### Q2. What are the two main types of polymorphism?

| Type | Also Known As | How Achieved |
|------|---------------|---------------|
| **Compile-time** | Static binding, early binding | Method overloading |
| **Runtime** | Dynamic binding, late binding | Method overriding |

---

### Q3. Compile-time vs Runtime Polymorphism

| Feature | Compile-time | Runtime |
|---------|--------------|---------|
| Resolution | At compilation | At execution |
| Speed | Faster | Slightly slower |
| Flexibility | Less flexible | More flexible |
| Needs inheritance? | ❌ No | ✅ Yes |

---

## 🔵 Compile-Time Polymorphism

### Q4. What is method overloading?

**Answer:**  
Multiple methods in the **same class** with the **same name** but **different parameters**.

```java
class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
}
```

---

### Q5. Rules for method overloading

1. Same method name
2. Different parameters (count, type, or order)
3. Return type alone is **not enough**
4. Access modifiers don't matter
5. Can be static or non-static

---

### Q6. Can we overload `main()`?

**Answer:** ✅ Yes, but JVM only calls the standard `public static void main(String[] args)`.

```java
public class Test {
    public static void main(String[] args) {
        System.out.println("Standard main");
        main(10); // calling overloaded version
    }
    public static void main(int x) {
        System.out.println("Overloaded main: " + x);
    }
}
```

---

### Q7. What is type promotion in overloading?

**Answer:**  
If no exact match is found, Java promotes the argument to the next possible type.

```java
void display(int x) { }
void display(long x) { }

display('a'); // char → int (promoted)
display(5L);  // long
```

---

### Q8. Can static methods be overloaded?

**Answer:** ✅ Yes.

```java
class Utility {
    static void print(String s) { }
    static void print(int i) { }
}
```

---

## 🔴 Runtime Polymorphism

### Q9. What is method overriding?

**Answer:**  
Redefining a parent class method in a child class with the **same signature**.

```java
class Vehicle {
    void start() { System.out.println("Vehicle starting"); }
}
class Car extends Vehicle {
    @Override
    void start() { System.out.println("Car engine starting"); }
}
```

---

### Q10. Rules for method overriding

1. Same method signature
2. Return type can be covariant (subclass of original)
3. Can't reduce access visibility
4. Can't override `final`, `static`, or `private` methods
5. Only instance methods
6. Requires inheritance

---

### Q11. What are covariant return types?

**Answer:**  
Overridden method returns a **subclass** of the original return type.

```java
class Vehicle {
    Vehicle get() { return new Vehicle(); }
}
class Car extends Vehicle {
    @Override
    Car get() { return new Car(); } // Car is subclass of Vehicle
}
```

---

### Q12. Why can't static methods be overridden?

**Answer:**  
Static methods belong to the **class**, not the object. They are resolved at **compile-time** based on reference type.

```java
Parent p = new Child();
p.show(); // Parent version runs (not polymorphic)
```

---

### Q13. What is dynamic method dispatch?

**Answer:**  
Java decides at **runtime** which overridden method to call based on the actual object type.

```java
Animal a;
a = new Dog(); a.sound(); // Dog's sound
a = new Cat(); a.sound(); // Cat's sound
```

---

## 🟡 Upcasting & Downcasting

### Q14. What is upcasting?

**Answer:**  
Assigning a child object to a parent reference — **always safe and implicit**.

```java
Dog dog = new Dog();
Animal animal = dog; // upcasting
```

---

### Q15. What is downcasting?

**Answer:**  
Converting a parent reference back to a child reference — **explicit and risky**.

```java
Animal animal = new Dog();
Dog dog = (Dog) animal; // explicit downcast

Animal a2 = new Cat();
Dog d2 = (Dog) a2; // ❌ ClassCastException at runtime
```

---

### Q16. How to downcast safely?

**Answer:** Use `instanceof`.

```java
if (animal instanceof Dog) {
    Dog dog = (Dog) animal;
    dog.bark();
}
```

---

### Q17. Which polymorphism uses upcasting?

**Answer:** **Runtime polymorphism** — upcasting is essential for it to work.

```java
Parent ref = new Child(); // upcasting
ref.overriddenMethod();   // Child's version runs
```

---

### Q18. Does compile-time polymorphism use upcasting?

**Answer:** ❌ No. Overloading is resolved at compile-time using argument types, not upcasting.

---

## 🟠 Overriding vs Hiding vs Shadowing

### Q19. Overriding vs Hiding

| Feature | Overriding | Hiding |
|---------|------------|--------|
| Method type | Instance | Static |
| Binding | Runtime | Compile-time |
| Polymorphic? | ✅ Yes | ❌ No |

```java
Parent p = new Child();
p.instanceMethod(); // Child's version (overridden)
p.staticMethod();   // Parent's version (hidden)
```

---

### Q20. What is variable shadowing?

**Answer:**  
Child class declares a variable with the **same name** as parent — resolved at compile-time by reference type.

```java
Parent p = new Child();
System.out.println(p.name); // "Parent" (not polymorphic!)
```

---

### Q21. Does variable shadowing use upcasting polymorphically?

**Answer:** ❌ No. Variables are always bound at compile-time based on reference type.

---

## 🟣 Advanced Concepts

### Q22. Is `@Override` required for overriding?

**Answer:** ❌ No, but **highly recommended** — it catches typos and signature mismatches at compile-time.

---

### Q23. Can we override `main()`?

**Answer:** ❌ No — `main` is static.

---

### Q24. Polymorphism vs Inheritance

| Concept | Purpose |
|---------|---------|
| Inheritance | Code reuse, IS-A relationship |
| Polymorphism | Many forms, dynamic behavior |

---

### Q25. Can we have polymorphism without inheritance?

- **Compile-time:** ✅ Yes (overloading within same class)
- **Runtime:** ❌ No (needs inheritance)

---

### Q26. What determines which method runs at runtime?

**Answer:** The **actual object type** (`new Child()`), not the reference type.

---

### Q27. Do constructors support polymorphism?

**Answer:** ❌ No — constructors can't be overridden.

---

### Q28. What is a vtable?

**Answer:** Virtual method table — mechanism JVM uses to achieve runtime polymorphism.

---

### Q29. Can parameters be polymorphic?

**Answer:** ✅ Yes — using parent type as parameter allows any child type.

```java
void process(Animal a) { a.sound(); }
process(new Dog()); // works
process(new Cat()); // works
```

---

## 🟤 Best Practices & Common Mistakes

### Q30. Common mistakes

| Mistake | Why Wrong | Fix |
|---------|-----------|-----|
| Expecting polymorphism with static methods | Static = class-level | Call with class name |
| Downcasting without `instanceof` | May crash | Always check first |
| Overriding without `@Override` | Typos go unnoticed | Always add `@Override` |

---

### Q31. When to use each type?

| Use compile-time when | Use runtime when |
|----------------------|------------------|
| Performance is critical | Flexibility needed |
| No inheritance | Working with hierarchies |
| Utility methods | Framework/plugin architecture |

---

### Q32. Best practices for overriding

1. ✅ Always use `@Override`
2. ✅ Don't change method's contract
3. ✅ Use `super.method()` when extending
4. ✅ Keep access level same or wider

---

### Q33. Overriding and checked exceptions

- ✅ Can throw same or subclass exception
- ✅ Can throw no exception
- ❌ Cannot throw broader exception

---

## 🔥 Interview Questions (Code Output)

### Q34. Multi-level inheritance

```java
A a = new C();
a.print(); // Output: C
```

---

### Q35. Upcasting + Downcasting

```java
Base b = new Derived();
Derived d = (Derived) b; // ✅ works
Base b2 = new Base();
Derived d2 = (Derived) b2; // ❌ ClassCastException
```

---

### Q36. Method resolution order

```java
A a = new B();
a.m1(); // A m1 → B m2 (because m2 overridden)
```

---

### Q37. Data members are not polymorphic

```java
Parent p = new Child();
System.out.println(p.x); // 10, not 20
```

---

### Q38. Overloaded vs overridden decision

Java resolves:
1. **Overloading** at compile-time (reference type + arguments)
2. **Overriding** at runtime (actual object type)

---

## 📋 Quick Reference Cards

### Polymorphism Types Summary

| Feature | Compile-time | Runtime |
|---------|--------------|---------|
| Binding | Early | Late |
| Via | Overloading | Overriding |
| Needs inheritance? | No | Yes |
| Changes with upcasting? | No | Yes |

### Overriding vs Overloading

| Method Overriding | Method Overloading |
|------------------|-------------------|
| Runtime | Compile-time |
| Different classes | Same class |
| Same parameters | Different parameters |
| Uses upcasting | No upcasting |

### Upcasting vs Downcasting

| Upcasting | Downcasting |
|-----------|-------------|
| Child → Parent | Parent → Child |
| Implicit, safe | Explicit, risky |
| For polymorphism | For child-specific methods |

---

## 🧪 Practice Problems

### Problem 1: Payment System

```java
abstract class Payment {
    abstract void process(double amount);
}
// Implement CreditCard, PayPal, Crypto
// Use polymorphic array to process all
```

### Problem 2: Predict Output

```java
A a = new B();
System.out.println(a.f()); // B
// a.g(); // ❌ won't compile
B b = (B) a;
System.out.println(b.g()); // G
```

---

## ✅ Key Takeaways

1. **Compile-time polymorphism** = overloading (fast, no inheritance needed)
2. **Runtime polymorphism** = overriding (flexible, needs upcasting + inheritance)
3. **Upcasting** is essential for runtime polymorphism
4. **Static methods & variables** are **not polymorphic**
5. `@Override` is optional but **strongly recommended**
6. Always use `instanceof` before downcasting
7. Only **instance methods** are polymorphic

---

## 📚 Resources

- Effective Java — Chapter on inheritance
- Java Language Specification §8.4.8
- Oracle Java Tutorials — Polymorphism
