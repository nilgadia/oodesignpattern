<pre>

Visitor Pattern

Consists of "Visitees" or "Hosts" and "Visitors". 
Hosts are objects within an object tree, and Visitors 
contain operations to be performed on these Hosts.

Hosts expose an Accept() method, which takes a Visitor object, 
and Visitors expose a Visit() method which has an overload for 
each Host. When the Accept() method is called on the Host, and 
a Visitor passed, a Visit() method is called on the visitor.

Using this pattern, operations become Double Dispatch, meaning 
they are executed based on two classes; the Host and the Visitor.

Strategy Pattern

Consists of a "Context" and a "Strategy". 
Contexts are related classes, and a Strategy is a class containing 
a series of operations to be used by the Contexts.

Strategy provides an interface of which Context objects are aware. 
When a Context object is created, a Strategy is also created (if not static) 
and given to the Context. Operations can then be selected from the 
selected Strategy as desired.

The Difference

While both patterns improve separation of concerns, and are fairly similar at face value, 
there are some important differences:

The Strategy pattern is designed to have the Strategy operation decided at runtime. 
Concrete Strategy objects can be passed to each Context operation. According to the Gang of 
Four Design Patterns book, Visitor patterns have a Composite Association between the 
Host and the Visitor and therefore the Visitor containing the operations has the same 
life cycle as the Host.

The Visitor in the Visitor Pattern must be aware of all Hosts and provide operations 
for each. The Visitor controls the operations run by the Host. This means that if your 
object model changes regularly, it will involve additional maintenance if a Visitor 
Pattern is used.

The Strategy in the Strategy Pattern will provide only the required algorithms, and the 
decision over which operation is executed is handled by the Context. Therefore the Context 
in the Strategy Pattern must be aware of the operations on the Strategy. If a Context is added,
there is less maintenance (providing a new algorithm is not required).

Use the Visitor Pattern When:
An object structure will not change often, but operations across them will.
You have specific related functionality for each concrete class, and wish to encapsulate it.
Operation requires data that the Object shouldn't know about.
You wish to maintain state within operations across multiple objects.
Example:
An application may change its "Skin" which will alter the way controls are drawn. The code for deciding how controls are drawn could be encapsulated in Visitor implementations. Each control will require a separate operation.

Use the Strategy Pattern When:
A few algorithms will be used by many different classes.
Different algorithms may be used by a class at different times.
Operation requires data that the Object shouldn't know about.
Classes are using multiple conditional statements. These can be moved to an implementation of the Strategy class.
An object structure is likely to change often.
Example:
Different methods of calculating interest and fees will be used by clients of a bank. These algorithms can be encapsulated in Strategy implementations and associated with individual clients at runtime.

http://leedrickdotnet.blogspot.com/2007/01/strategy-pattern-vs-visitor-pattern.html

</pre>