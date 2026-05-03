🧠 What is Encapsulation?

Encapsulation means:

Wrapping data (variables) and code (methods) together into a single unit and restricting direct access to some parts of that unit.

Designing a class so that its internal state cannot be corrupted and its behavior is controlled through well-defined methods.

🧠 What is Encapsulation?

Encapsulation means:

Wrapping data (variables) and code (methods) together into a single unit and restricting direct access to some parts of that unit.

Use Cases

1. Data Hiding
account.balance = -1000; ❌ not allowed
You prevent direct modification:This protects your object from invalid states.
2. Control over data
if (amount > 0)
You decide how data is modified:👉 This ensures rules are enforced.
3. Flexibility (internal changes won’t break code)

You can change internal logic without affecting users:

public double getBalance() {
    return balance * 1.1; // interest added later
}

User code still works the same.

4. Security

You prevent unauthorized access or misuse of data.

5. Maintainability

Encapsulated code is:

easier to debug
easier to modify
easier to scale


⚖️ Encapsulation vs Data Hiding
Concept	                            Meaning
Encapsulation	      =              Wrapping data + methods together
Data Hiding	          =              Restricting direct access to data

👉 Encapsulation includes data hiding, but also behavior organization.

Key rule (VERY IMPORTANT)

❌ A private method or variable can NEVER be accessed directly outside its class
✔ Encapsulation does NOT mean exposing private methods
✔ It means controlling access through public methods

“How can we access private method using encapsulation?”

👉 You CANNOT access a private method directly

But you can access its functionality indirectly through a public method in the same class like Account Class.