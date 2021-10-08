# Exercise 4

## One

Approach One is easy to implement. However, it is not easily extendable as the ``CashRegister`` class contains an instance variable for each View and depends on each individual View's operators. 

## Two.

The second approach allows the ``CashRegister`` to not depend on the operators of the View classes. However, ``CashRegister`` is still dependant on the pre-defined View classes (``Display`` and ``TicketPrinter``), as each one has its own instance variable.

## Three

This approach is easily extendable, as one can just create a new class that implements ``IRegisterObserver`` and register it as an observer without needing to modify ``CashRegister``'s code. It also allows the ``CashRegister`` to not depend on the operators of the individual observer classes. However, it is  more complicated to implement than the other approaches. There is also additional code that must be maintained.