# 📚 Inheritance – Complete Question Bank (Java)

---

# 🟢 Basic Questions

1. What is inheritance in Java?
2. Why do we use inheritance?
3. What is the difference between parent class and child class?
4. What keyword is used for inheritance in Java?
5. What is an IS-A relationship?
6. Can a class inherit from multiple classes?
7. What are the advantages of inheritance?
8. What are the disadvantages of inheritance?
9. What is code reusability?
10. What is the default superclass of every Java class?

---

# 🟡 Intermediate Questions

11. What are the types of inheritance in Java?
12. Explain single inheritance with example.
13. Explain multilevel inheritance.
14. Explain hierarchical inheritance.
15. Why Java does not support multiple inheritance using classes?
16. What is the diamond problem?
17. How does Java solve multiple inheritance using interfaces?
18. What is method overriding?
19. Difference between method overloading and overriding?
20. What is dynamic method dispatch?

---

# 🔵 Access & Behavior Questions

21. Can private members be inherited?
22. What is the role of protected keyword in inheritance?
23. Can constructors be inherited?
24. Can static methods be overridden?
25. What happens when parent and child have same method?
26. What is super keyword?
27. Difference between super() and this()?
28. Can we access parent class constructor from child?
29. What happens if parent constructor has parameters?
30. Can we override final method?

---

# 🔴 Advanced Questions

31. What is runtime polymorphism?
32. How inheritance supports polymorphism?
33. What is covariant return type?
34. Can we override main method?
35. What is abstract class in inheritance?
36. Difference between abstract class and interface?
37. What happens if both parent and interface have same method?
38. What is constructor chaining?
39. Can we inherit from interface?
40. What is multiple inheritance via interfaces?

---

# ⚫ Tricky / Conceptual Questions

41. What happens if child class does not call parent constructor?
42. What is the order of constructor execution?
43. Can we reduce visibility while overriding?
44. What is the difference between HAS-A and IS-A?
45. When should you avoid inheritance?
46. What is tight coupling in inheritance?
47. What is composition and how is it better?
48. Can a class extend itself?
49. What happens if parent class is final?
50. What is object slicing (conceptual)?

---

# 💻 Coding Questions

### 1. Basic Inheritance

Create a class `Animal` and extend it with `Dog`.

---

### 2. Multilevel Inheritance

```java id="ml1"
class A {}
class B extends A {}
class C extends B {}
```

👉 Add methods and demonstrate access.

---

### 3. Method Overriding

Override a method in child class and show runtime behavior.

---

### 4. Constructor Chaining

```java id="cc1"
class A {
    A() { System.out.println("A"); }
}
class B extends A {
    B() { System.out.println("B"); }
}
```

👉 What is output?

---

### 5. super Keyword Usage

Create parent and child with same method and call parent method using `super`.

---

### 6. Polymorphism Example

```java id="poly1"
Animal a = new Dog();
a.sound();
```

👉 Explain output.

---

### 7. Abstract Class Example

Create abstract class `Shape` and implement `Circle`.

---

### 8. Interface Inheritance

```java id="int1"
interface A {}
interface B {}
class C implements A, B {}
```

---

### 9. Access Modifier Test

Test which members are accessible in child class.

---

### 10. Real-world Problem

Create:

* `Vehicle → Car → ElectricCar`
* Add fields and methods

---

# 🧪 Output-Based Questions

### Q1:

```java id="o1"
class A {
    A() { System.out.println("A"); }
}
class B extends A {
    B() { System.out.println("B"); }
}
public class Test {
    public static void main(String[] args) {
        new B();
    }
}
```

👉 Output?

---

### Q2:

```java id="o2"
class A {
    void show() { System.out.println("A"); }
}
class B extends A {
    void show() { System.out.println("B"); }
}
public class Test {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
```

👉 Output?

---

# 💼 Interview-Level Questions

1. Explain inheritance with real-world example.
2. Why multiple inheritance is not supported?
3. Difference between inheritance and composition?
4. When would you choose composition over inheritance?
5. How does inheritance affect performance?
6. What is Liskov Substitution Principle?
7. What is method hiding?
8. What are best practices for inheritance?
9. Can we override private methods?
10. Explain real-time use of inheritance in frameworks.


